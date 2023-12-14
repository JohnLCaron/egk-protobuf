package org.cryptobiotic.protoconvert

import electionguard.ballot.Manifest
import io.github.oshai.kotlinlogging.KotlinLogging

private val logger = KotlinLogging.logger("ManifestToProto")

fun Manifest.publishProto() =
    org.cryptobiotic.protogen.Manifest(
            this.electionScopeId,
            this.specVersion,
            this.electionType.publishProto(),
            this.startDate,
            this.endDate,
            this.geopoliticalUnits.map { it.publishProto() },
            this.parties.map { it.publishProto() },
            this.candidates.map { it.publishProto() },
            this.contests.map { it.publishProto() },
            this.ballotStyles.map { it.publishProto() },
            this.name.map { it.publishProto() },
            this.contactInformation?.let { this.contactInformation!!.publishProto() },
        )

private fun Manifest.BallotStyle.publishProto() =
    org.cryptobiotic.protogen.BallotStyle(
            this.ballotStyleId,
            this.geopoliticalUnitIds,
            this.partyIds,
            this.imageUri ?: ""
        )

private fun Manifest.Candidate.publishProto() =
    org.cryptobiotic.protogen.Candidate(
            this.candidateId,
            this.name ?: "",
            this.partyId ?: "",
            this.imageUri ?: "",
            this.isWriteIn
        )

private fun Manifest.ContactInformation.publishProto() =
    org.cryptobiotic.protogen.ContactInformation(
            this.name ?: "",
            this.addressLine,
            this.email ?: "",
            this.phone ?: "",
        )

private fun Manifest.ContestDescription.publishProto() =
    org.cryptobiotic.protogen.ContestDescription(
            this.contestId,
            this.sequenceOrder,
            this.geopoliticalUnitId,
            this.voteVariation.publishProto(),
            this.numberElected,
            this.votesAllowed,
            this.name,
            this.selections.map { it.publishProto() },
            this.ballotTitle?: "",
            this.ballotSubtitle?: "",
        )

private fun Manifest.GeopoliticalUnit.publishProto() =
    org.cryptobiotic.protogen.GeopoliticalUnit(
            this.geopoliticalUnitId,
            this.name,
            this.type.publishProto(),
            this.contactInformation ?: "",
        )

private fun Manifest.Language.publishProto() =
    org.cryptobiotic.protogen.Language(this.value, this.language)

private fun Manifest.Party.publishProto() =
    org.cryptobiotic.protogen.Party(
        this.partyId,
        this.name,
        this.abbreviation ?: "",
        this.color ?: "",
        this.logoUri ?: ""
    )

private fun Manifest.SelectionDescription.publishProto() =
    org.cryptobiotic.protogen.SelectionDescription(
            this.selectionId,
            this.sequenceOrder,
            this.candidateId,
        )

//// enums

private fun Manifest.ElectionType.publishProto() =
    try {
        org.cryptobiotic.protogen.Manifest.ElectionType.fromName(this.name)
    } catch (e: IllegalArgumentException) {
        logger.error { "Manifest.ElectionType $this has missing or unknown name" }
        org.cryptobiotic.protogen.Manifest.ElectionType.UNKNOWN
    }

private fun Manifest.ReportingUnitType.publishProto() =
    try {
        org.cryptobiotic.protogen.GeopoliticalUnit.ReportingUnitType.fromName(this.name)
    } catch (e: IllegalArgumentException) {
        logger.error { "Manifest.GeopoliticalUnit $this has missing or unknown name" }
        org.cryptobiotic.protogen.GeopoliticalUnit.ReportingUnitType.UNKNOWN
    }

private fun Manifest.VoteVariationType.publishProto() =
    try {
        org.cryptobiotic.protogen.ContestDescription.VoteVariationType.fromName(this.name)
    } catch (e: IllegalArgumentException) {
        logger.error { "Manifest.VoteVariationType $this has missing or unknown name" }
        org.cryptobiotic.protogen.ContestDescription.VoteVariationType.UNKNOWN
    }