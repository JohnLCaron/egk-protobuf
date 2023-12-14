package org.cryptobiotic.protoconvert

import com.github.michaelbull.result.Err
import com.github.michaelbull.result.Ok
import com.github.michaelbull.result.Result
import com.github.michaelbull.result.unwrap
import electionguard.ballot.*
import electionguard.core.*
import electionguard.util.ErrorMessages

fun org.cryptobiotic.protogen.DecryptedTallyOrBallot.import(group: GroupContext, errs : ErrorMessages): DecryptedTallyOrBallot? {

    if (this.contests.isEmpty()) {
        errs.add("No contests in DecryptedTallyOrBallot")
        return null
    }
    val electionId = importUInt256(this.electionId) ?: errs.addNull("malformed electionId") as UInt256?
    val contests = this.contests.map { it.import(group, errs.nested("DecryptedContest ${it.contestId}")) }

    return if (errs.hasErrors()) null
    else DecryptedTallyOrBallot(
        this.id,
        contests.filterNotNull(),
        electionId!!,
    )
}

private fun org.cryptobiotic.protogen.DecryptedContest.import(group: GroupContext, errs : ErrorMessages): DecryptedTallyOrBallot.Contest? {

    if (this.selections.isEmpty()) {
        errs.add("No selections")
        return null
    }
    val selections = this.selections.map { it.import(group, errs.nested("DecryptedSelection ${it.selectionId}")) }

    val decryptedContestData = if (this.decryptedContestData == null) null else {
        this.decryptedContestData.import(group, errs.nested("decryptedContestData"))
    }

    return if (errs.hasErrors()) null
    else DecryptedTallyOrBallot.Contest(
            this.contestId,
            selections.filterNotNull().sortedBy { it.selectionId },
            decryptedContestData,
        )
}

private fun org.cryptobiotic.protogen.DecryptedContestData.import(group: GroupContext, errs : ErrorMessages): DecryptedTallyOrBallot.DecryptedContestData? {
    val contestData = importContestData(this.contestData)
    if (contestData is Err) errs.add("malformed ContestData")
    val encryptedContestData = group.importHashedCiphertext(this.encryptedContestData, errs.nested("EncryptedContestData"))
    val proof = group.importChaumPedersenProof(this.proof, errs.nested("Proof"))
    val beta = group.importElementModP(this.beta) ?: errs.addNull("malformed beta") as ElementModP?

    return if (errs.hasErrors()) null
    else DecryptedTallyOrBallot.DecryptedContestData(
            contestData.unwrap(),
            encryptedContestData!!,
            proof!!,
            beta!!,
        )
}

private fun org.cryptobiotic.protogen.DecryptedSelection.import(group: GroupContext, errs : ErrorMessages): DecryptedTallyOrBallot.Selection? {
    val value = group.importElementModP(this.bOverM) ?: errs.addNull("malformed value") as ElementModP?
    val encryptedVote = group.importCiphertext(this.encryptedVote) ?: errs.addNull("malformed encryptedVote") as ElGamalCiphertext?
    val proof = group.importChaumPedersenProof(this.proof, errs.nested("Proof"))

    return if (errs.hasErrors()) null
    else DecryptedTallyOrBallot.Selection(
        this.selectionId,
        this.tally,
        value!!,
        encryptedVote!!,
        proof!!,
    )
}

//////////////////////////////////////////////////////////////////////////////////////////////

fun DecryptedTallyOrBallot.publishProto() =
    org.cryptobiotic.protogen.DecryptedTallyOrBallot(
        this.id,
        this.contests.map { it.publishProto() },
        this.electionId.publishProto(),
    )

private fun DecryptedTallyOrBallot.Contest.publishProto() =
    org.cryptobiotic.protogen.DecryptedContest(
        this.contestId,
        this.selections.map { it.publishProto() },
        this.decryptedContestData?.publishProto()
    )

private fun DecryptedTallyOrBallot.Selection.publishProto() =
    org.cryptobiotic.protogen.DecryptedSelection(
        this.selectionId,
        this.tally,
        this.bOverM.publishProto(),
        this.encryptedVote.publishProto(),
        this.proof.publishProto()
    )

private fun DecryptedTallyOrBallot.DecryptedContestData.publishProto() =
    org.cryptobiotic.protogen.DecryptedContestData(
        this.contestData.publish(),
        this.encryptedContestData.publishProto(),
        this.proof.publishProto(),
        this.beta.publishProto(),
    )

//////////////////////////////////////////////////////////////////

fun ContestData.publish(filler: String = ""): org.cryptobiotic.protogen.ContestData {
    return org.cryptobiotic.protogen.ContestData(
        status.publishContestDataStatus(),
        overvotes,
        writeIns,
        filler,
    )
}

fun importContestData(proto : org.cryptobiotic.protogen.ContestData?): Result<ContestData, String> {
    if (proto == null) return Err( "ContestData is missing")
    return Ok(ContestData(
        proto.overVotes,
        proto.writeIns,
        importContestDataStatus(proto.status)?: ContestDataStatus.normal,
    ))
}

private fun importContestDataStatus(proto: org.cryptobiotic.protogen.ContestData.Status): ContestDataStatus? {
    return safeEnumValueOf<ContestDataStatus>(proto.name)
}

private fun ContestDataStatus.publishContestDataStatus(): org.cryptobiotic.protogen.ContestData.Status {
    return try {
        org.cryptobiotic.protogen.ContestData.Status.fromName(this.name)
    }  catch (e: IllegalArgumentException) {
        org.cryptobiotic.protogen.ContestData.Status.NORMAL
    }
}