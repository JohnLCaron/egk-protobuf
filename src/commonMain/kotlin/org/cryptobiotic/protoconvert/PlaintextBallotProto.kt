package org.cryptobiotic.protoconvert

import electionguard.ballot.PlaintextBallot

fun org.cryptobiotic.protogen.PlaintextBallot.import() =
    PlaintextBallot(
        this.ballotId,
        this.ballotStyleId,
        this.contests.map { it.import() },
        if (this.sn == 0L) null else this.sn,
        this.errors.ifEmpty { null },
    )

private fun org.cryptobiotic.protogen.PlaintextBallotContest.import() =
    PlaintextBallot.Contest(
        this.contestId,
        this.sequenceOrder,
        this.selections.map { it.import() },
        this.writeIns,
    )

private fun org.cryptobiotic.protogen.PlaintextBallotSelection.import() =
    PlaintextBallot.Selection(
        this.selectionId,
        this.sequenceOrder,
        this.vote,
    )

//////////////////////////////////////////////////////////////////////////////////////////////

fun PlaintextBallot.publishProto() =
    org.cryptobiotic.protogen.PlaintextBallot(
        this.ballotId,
        this.ballotStyle,
        this.contests.map { it.publishProto() },
        this.sn ?: 0L,
        this.errors ?: "",
    )

private fun PlaintextBallot.Contest.publishProto() =
    org.cryptobiotic.protogen.PlaintextBallotContest(
            this.contestId,
            this.sequenceOrder,
            this.selections.map { it.publishProto() },
            this.writeIns,
        )

private fun PlaintextBallot.Selection.publishProto() =
    org.cryptobiotic.protogen.PlaintextBallotSelection(
            this.selectionId,
            this.sequenceOrder,
            this.vote,
        )