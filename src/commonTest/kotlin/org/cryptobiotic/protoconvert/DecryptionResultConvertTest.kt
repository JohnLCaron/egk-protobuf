package org.cryptobiotic.protoconvert

import electionguard.ballot.*
import electionguard.core.*
import electionguard.publish.Publisher
import electionguard.publish.makePublisher
import electionguard.util.ErrorMessages
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class DecryptionResultConvertTest {
    val outputDir = "testOut/protoconvert/DecryptionResultConvertTest"
    val publisher = makePublisher(outputDir, true)

    @Test
    fun roundtripDecryptionResult() {
        val context = productionGroup()
        val electionRecord = generateDecryptionResult(publisher, context)
        val proto = electionRecord.publishProto()
        val roundtrip = proto.import(context, ErrorMessages(""))!!
        assertNotNull(roundtrip)

        assertEquals(roundtrip.tallyResult, electionRecord.tallyResult)
        assertEquals(roundtrip.decryptedTally, electionRecord.decryptedTally)
        // assertEquals(roundtrip.lagrangeCoordinates, electionRecord.lagrangeCoordinates)
        assertEquals(roundtrip.metadata, electionRecord.metadata)

        assertTrue(roundtrip.equals(electionRecord))
        assertEquals(roundtrip, electionRecord)
    }
}

fun generateDecryptionResult(publisher : Publisher, context: GroupContext): DecryptionResult {
    return DecryptionResult(
        generateTallyResult(publisher, context),
        DecryptedTallyOrBallotConvertTest.generateFakeTally(0, context),
        // List(4) { generateDecryptingGuardian(context, it) },
    )
}