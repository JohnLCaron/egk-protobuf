package org.cryptobiotic.protoconvert

import electionguard.ballot.*
import electionguard.core.*
import electionguard.publish.Publisher
import electionguard.publish.makePublisher
import electionguard.util.ErrorMessages
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class TallyResultConvertTest {
    val outputDir = "testOut/protoconvert/TallyResultConvertTest"
    val publisher = makePublisher(outputDir, true)

    @Test
    fun roundtripTallyResult() {
        val context = productionGroup()
        val electionRecord = generateTallyResult(publisher, context)
        val proto = electionRecord.publishProto()
        val roundtrip = proto.import(context, ErrorMessages(""))!!
        assertNotNull(roundtrip)

        assertEquals(roundtrip.electionInitialized, electionRecord.electionInitialized)
        assertEquals(roundtrip.encryptedTally, electionRecord.encryptedTally)
        assertEquals(roundtrip.tallyIds, electionRecord.tallyIds)
        assertEquals(roundtrip, electionRecord)
    }
}

fun generateTallyResult(publisher : Publisher, context: GroupContext): TallyResult {
    return TallyResult(
        generateElectionInitialized(publisher, context),
        EncryptedTallyConvertTest.generateFakeTally(context),
        listOf("precinct342342", "precinct3423333"),
    )
}