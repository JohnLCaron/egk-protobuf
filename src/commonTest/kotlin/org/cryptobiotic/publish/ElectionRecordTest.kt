package org.cryptobiotic.publish

import com.github.michaelbull.result.unwrap
import electionguard.ballot.*
import electionguard.cli.ManifestBuilder
import electionguard.cli.RunVerifier
import electionguard.core.*
import electionguard.publish.readElectionRecord
import io.github.oshai.kotlinlogging.KotlinLogging
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

private val logger = KotlinLogging.logger("ElectionRecordTest")

// Test election records that have been fully decrypted
class ElectionRecordTest {

    @Test
    fun testReadElectionRecord() {
        val topdir = "src/commonTest/data/workflow/someAvailableProto"

        val group = productionGroup()
        val consumerIn = ConsumerProto(group, topdir)

        val electionRecord = readElectionRecord(consumerIn)
            val manifest = electionRecord.manifest()
            println("electionRecord.manifest.specVersion = ${electionRecord.manifest().specVersion}")
            assertEquals(ManifestBuilder.electionScopeId, manifest.electionScopeId)
            assertEquals(protocolVersion, manifest.specVersion)
    }

    @Test
    fun allAvailableProto() {
        readElectionRecordAndValidate("src/commonTest/data/workflow/allAvailableProto")
    }

    @Test
    fun someAvailableProto() {
        readElectionRecordAndValidate("src/commonTest/data/workflow/someAvailableProto")
    }

    @Test
    fun chainedProto() {
        readElectionRecordAndValidate("src/commonTest/data/workflow/chainedProto")
    }

    fun readElectionRecordAndValidate(topdir: String) {
        val group = productionGroup()
        val consumerIn = ConsumerProto(group, topdir)
        assertNotNull(consumerIn)
        val decryption = consumerIn.readDecryptionResult().unwrap()
        readDecryption(decryption)
        validateTally(decryption.tallyResult.jointPublicKey(), decryption.decryptedTally)

        assertTrue(RunVerifier.runVerifier(group, consumerIn, 11, true))
    }

    fun readDecryption(decryption: DecryptionResult) {
        val tallyResult = decryption.tallyResult
        val init = tallyResult.electionInitialized
        val config = init.config

        assertEquals("production group, low memory use, 4096 bits", config.constants.name)
        // TODO assertEquals(specVersion, config.manifest.specVersion)
        assertNotNull(decryption.decryptedTally)
        val contests = decryption.decryptedTally.contests
        assertNotNull(contests)
        val contest = contests.find { it.contestId == "contest19" }
        assertNotNull(contest)

        assertEquals(init.guardians.size, config.numberOfGuardians)
        assertEquals(init.guardians.size, tallyResult.numberOfGuardians())

        assertEquals(init.guardians.size, config.numberOfGuardians)
    }

    fun validateTally(jointKey: ElGamalPublicKey, tally: DecryptedTallyOrBallot) {
        for (contest in tally.contests) {
            for (selection in contest.selections) {
                val actual: Int? = jointKey.dLog(selection.bOverM, 100)
                assertEquals(selection.tally, actual)
            }
        }
    }
}