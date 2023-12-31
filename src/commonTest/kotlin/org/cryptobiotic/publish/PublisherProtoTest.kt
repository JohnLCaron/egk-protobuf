package org.cryptobiotic.publish

import com.github.michaelbull.result.*
import electionguard.ballot.ElectionInitialized
import electionguard.core.*
import electionguard.input.ManifestInputValidation
import org.cryptobiotic.protoconvert.generateElectionConfig
import org.cryptobiotic.protoconvert.generateGuardian
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue
import org.cryptobiotic.core.*

class PublisherProtoTest {
    private val input = "src/commonTest/data/workflow/someAvailableProto"
    private val output = "testOut/publish/PublisherProtoTest"

    val group = productionGroup()
    val consumerIn = ConsumerProto(group, input)

    @Test
    fun testRoundtripElectionConfig() {
        val publisher = PublisherProto("$output/1", true)
        val (manifest, config) = generateElectionConfig(publisher, 6, 4)

        // ManifestInputValidation
        val manifestValidator = ManifestInputValidation(manifest)
        val errors = manifestValidator.validate()
        if (errors.hasErrors()) {
            println("*** ManifestInputValidation error on generated electionConfig")
            println("$errors")
            return
        }

        publisher.writeElectionConfig(config)
        val consumerOut = ConsumerProto(group, "$output/1")

        val roundtripResult = consumerOut.readElectionConfig()
        assertNotNull(roundtripResult)
        if (roundtripResult is Err) {
            println("testRoundtripElectionConfig = $roundtripResult")
        }
        assertTrue(roundtripResult is Ok)

        val roundtrip = roundtripResult.unwrap()
        assertEquals(config.constants, roundtrip.constants)
        // assertEquals(manifest, roundtrip.manifest) TODO manifest
        assertEquals(config.numberOfGuardians, roundtrip.numberOfGuardians)
        assertEquals(config.quorum, roundtrip.quorum)
        assertEquals(config.metadata, roundtrip.metadata)

        assertEquals(config, roundtrip)
    }

    @Test
    fun testRoundtripElectionInit() {
        val publisher = PublisherProto("$output/2", true)
        val (_, config) = generateElectionConfig(publisher, 6, 4)
        publisher.writeElectionConfig(config)

        val init = ElectionInitialized(
            config,
            generateElementModP(group),
            generateUInt256(group),
            List(6) { generateGuardian(it, group) },
        )
        publisher.writeElectionInitialized(init)

        val consumerOut = ConsumerProto(group, "$output/2")
        val roundtripResult = consumerOut.readElectionInitialized()
        assertNotNull(roundtripResult)
        if (roundtripResult is Err) {
            println("readElectionInitialized = $roundtripResult")
        }
        assertTrue(roundtripResult is Ok)
        val roundtrip = roundtripResult.unwrap()

        assertEquals(init, roundtrip)
    }

    @Test
    fun testWriteEncryptions() {
        val publisher = PublisherProto("$output/3", true)
        runTest {
            val initResult = consumerIn.readElectionInitialized()
            assertTrue(initResult is Ok)
            val init = initResult.unwrap()

            publisher.writeElectionInitialized(init)
            val sink = publisher.encryptedBallotSink("testWriteEncryptions")
            consumerIn.iterateAllEncryptedBallots { true }.forEach{ sink.writeEncryptedBallot(it) }
            sink.close()

            val consumerOut = ConsumerProto(group, "$output/3")
            val rtResult = consumerOut.readElectionInitialized()
            if (rtResult is Err) {
                println("testWriteEncryptions = $rtResult")
            }
            assertTrue(rtResult is Ok)
            val rtInit = rtResult.unwrap()
            assertEquals(init, rtInit)

            val inBallots = consumerIn.iterateAllEncryptedBallots{ true }.associateBy { it.ballotId }
            consumerOut.iterateAllEncryptedBallots{ true }.forEach {
                val inBallot = inBallots[it.ballotId] ?: RuntimeException("Cant find ${it.ballotId}")
                assertEquals(it, inBallot)
                println(" Ballot ${it.ballotId} OK")
            }
        }
    }

    @Test
    fun testWriteSpoiledBallots() {
        val publisher = PublisherProto("$output/4", true)
        val sink = publisher.decryptedTallyOrBallotSink()
            consumerIn.iterateDecryptedBallots().forEach {
                sink.writeDecryptedTallyOrBallot(it)
            sink.close()
        }

        val inBallots = consumerIn.iterateDecryptedBallots().associateBy { it.id }
        val consumerOut = ConsumerProto(group, "$output/4")

        consumerOut.iterateDecryptedBallots().forEach {
            val inBallot = inBallots[it.id] ?: throw RuntimeException("Cant find ${it.id}")
            it.contests.forEach{
                val inContest = inBallot.contests.find { c -> it.contestId == c.contestId } ?:
                throw RuntimeException("Cant find ${it.contestId}")
                it.selections.forEach {
                    val inSelection = inContest.selections.find { s -> it.selectionId == s.selectionId } ?:
                    throw RuntimeException("Cant find ${it.selectionId}")
                    assertEquals(inSelection.selectionId, it.selectionId)
                    assertEquals(inSelection.tally, it.tally)
                    assertEquals(inSelection.bOverM, it.bOverM)
                    assertEquals(inSelection.encryptedVote, it.encryptedVote)
                    assertEquals(inSelection.proof, it.proof)
                    assertEquals(inSelection, it)
                }
                // TODO decryptedContestData not yet done
            }
            println(" Spoiled Ballot ${it.id} OK")
        }
    }

}