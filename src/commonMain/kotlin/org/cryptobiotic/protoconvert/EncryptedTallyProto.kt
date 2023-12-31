package org.cryptobiotic.protoconvert

import electionguard.ballot.EncryptedTally
import electionguard.core.ElGamalCiphertext
import electionguard.core.GroupContext
import electionguard.core.UInt256
import electionguard.util.ErrorMessages

fun org.cryptobiotic.protogen.EncryptedTally.import(group: GroupContext, errs : ErrorMessages): EncryptedTally? {
    val electionId = importUInt256(this.electionId) ?: errs.addNull("malformed electionId") as UInt256?
    val contests = this.contests.map { it.import(group, errs.nested("EncryptedTally.Contest '${it.contestId}'")) }

    return if (errs.hasErrors()) null
    else
        EncryptedTally(
            this.tallyId,
            contests.filterNotNull(),
            this.castBallotIds,
            electionId!!)
}

private fun org.cryptobiotic.protogen.EncryptedTallyContest.import(group: GroupContext, errs : ErrorMessages): EncryptedTally.Contest? {
    val selections = this.selections.map { it.import(group, errs.nested("EncryptedTally.Selection '${it.selectionId}'"))}

    return if (errs.hasErrors()) null
    else EncryptedTally.Contest(
        this.contestId,
        this.sequenceOrder,
        selections.filterNotNull(),
    )
}

private fun org.cryptobiotic.protogen.EncryptedTallySelection.import(group: GroupContext, errs : ErrorMessages): EncryptedTally.Selection? {
    val ciphertext = group.importCiphertext(this.encryptedVote) ?: errs.addNull("malformed ciphertext") as ElGamalCiphertext?

    return if (errs.hasErrors()) null
    else EncryptedTally.Selection(
            this.selectionId,
            this.sequenceOrder,
            ciphertext!!,
        )
}

/////////////////////////////////////////////////////////////////////////////////////////////////

fun EncryptedTally.publishProto() =
    org.cryptobiotic.protogen.EncryptedTally(
        this.tallyId,
        this.contests.map { it.publishProto() },
        this.castBallotIds,
        this.electionId.publishProto(),
    )

private fun EncryptedTally.Contest.publishProto() =
    org.cryptobiotic.protogen.EncryptedTallyContest(
        this.contestId,
        this.sequenceOrder,
        this.selections.map { it.publishProto() }
    )

private fun EncryptedTally.Selection.publishProto() =
    org.cryptobiotic.protogen.EncryptedTallySelection(
        this.selectionId,
        this.sequenceOrder,
        this.encryptedVote.publishProto()
    )