package org.cryptobiotic.publish

import electionguard.ballot.Manifest
import electionguard.core.GroupContext
import electionguard.core.isDirectory
import electionguard.core.productionGroup
import electionguard.input.ManifestInputValidation
import electionguard.publish.readElectionRecord
import io.github.oshai.kotlinlogging.KotlinLogging
import java.io.FileNotFoundException
import kotlin.test.*

private val logger = KotlinLogging.logger("ReadAndCheckManifestTest")

class ReadAndCheckManifestTest {
    val group = productionGroup()

    @Test
    fun readAndCheckManifestProtoTest() {
        val (isJsonOrg, manifest, manifestBytes) = readAndCheckManifest(group, "src/commonTest/data/startManifestProto/manifest.protobuf")
        assertFalse(isJsonOrg)
        assertNotNull(manifest)
        assertNotNull(manifestBytes)
        println("manifest = $manifest")
    }

    @Test
    fun readAndCheckManifestProtoDirTest() {
        val (isJsonOrg, manifest, manifestBytes) = readAndCheckManifest(group, "src/commonTest/data/startManifestProto")
        assertFalse(isJsonOrg)
        assertNotNull(manifest)
        assertNotNull(manifestBytes)
        println("manifest = $manifest")
    }

    @Test
    fun missingManifestTest() {
        val ex = assertFailsWith<FileNotFoundException>(
            block = { readAndCheckManifest(group, "src/commonTest/data/missing") }
        )
        assertContains(ex.message!!, "No such file or directory")
    }

    @Test
    fun badManifestProtoTest() {
        val ex = assertFailsWith<RuntimeException>(
            block = { readAndCheckManifest(group, "src/commonTest/data/startConfigProto/electionConfig.protobuf") }
        )
        assertContains(ex.message!!, "Unrecognized wire type")
    }

}

private fun readAndCheckManifest(group: GroupContext, manifestDirOrFile: String): Triple<Boolean, Manifest, ByteArray> {

    val consumer = if (isDirectory(manifestDirOrFile)) {
        ConsumerProto(group, manifestDirOrFile)
    } else {
        val manifestDir = manifestDirOrFile.substringBeforeLast("/")
        ConsumerProto(group, manifestDir)
    }
    val electionRecord = readElectionRecord(consumer)

    try {
        val manifestBytes = electionRecord.manifestBytes()
        // make sure it parses
        val manifest = consumer.makeManifest(manifestBytes)
        // make sure it validates
        val errors = ManifestInputValidation(manifest).validate()
        if (errors.hasErrors()) {
            logger.error { "*** ManifestInputValidation error on manifest file= $manifestDirOrFile \n $errors" }
            throw RuntimeException("*** ManifestInputValidation error on manifest file= $manifestDirOrFile \n $errors")
        }
        return Triple(false, manifest, manifestBytes)

    } catch (t: Throwable) {
        logger.error { "readAndCheckManifestBytes Exception= ${t.message} ${t.stackTraceToString()}" }
        throw t
    }
}
