package org.cryptobiotic.protoconvert

import electionguard.ballot.*
import electionguard.core.safeEnumValueOf
import io.github.oshai.kotlinlogging.KotlinLogging

private val logger = KotlinLogging.logger("ManifestFromProto")

fun org.cryptobiotic.protogen.Manifest.import() =
        Manifest(
            this.electionScopeId,
            this.specVersion,
            this.electionType.import() ?: Manifest.ElectionType.unknown,
            this.startDate,
            this.endDate,
            this.geopoliticalUnits.map { it.import() },
            this.parties.map { it.import() },
            this.candidates.map { it.import() },
            this.contests.map { it.import() },
            this.ballotStyles.map { it.import() },
            this.name.map { it.import() },
            this.contactInformation?.import(),
        )

private fun org.cryptobiotic.protogen.BallotStyle.import() =
    Manifest.BallotStyle(
        this.ballotStyleId,
        this.geopoliticalUnitIds,
        this.partyIds,
        this.imageUrl.ifEmpty { null },
    )

private fun org.cryptobiotic.protogen.Candidate.import() =
    Manifest.Candidate(
        this.candidateId,
        this.name.ifEmpty { null },
        this.partyId.ifEmpty { null },
        this.imageUrl.ifEmpty { null },
        this.isWriteIn
    )

private fun org.cryptobiotic.protogen.ContactInformation.import() =
    Manifest.ContactInformation(
        this.name.ifEmpty { null },
        this.addressLine,
        this.email.ifEmpty { null },
        this.phone.ifEmpty { null },
    )

private fun org.cryptobiotic.protogen.ContestDescription.import() =
    Manifest.ContestDescription(
        this.contestId,
        this.sequenceOrder,
        this.geopoliticalUnitId,
        this.voteVariation.import() ?: Manifest.VoteVariationType.other,
        this.numberElected,
        this.votesAllowed,
        this.name,
        this.selections.map { it.import() },
        this.ballotTitle.ifEmpty { null },
        this.ballotSubtitle.ifEmpty { null },
    )

private fun org.cryptobiotic.protogen.GeopoliticalUnit.import() =
    Manifest.GeopoliticalUnit(
        this.geopoliticalUnitId,
        this.name,
        this.type.import() ?: Manifest.ReportingUnitType.unknown,
        this.contactInformation.ifEmpty { null },
    )

private fun org.cryptobiotic.protogen.Language.import() =
    Manifest.Language(this.value, this.language)

private fun org.cryptobiotic.protogen.Party.import() =
    Manifest.Party(
        this.partyId,
        this.name,
        this.abbreviation.ifEmpty { null },
        this.color.ifEmpty { null },
        this.logoUri.ifEmpty { null },
    )

private fun org.cryptobiotic.protogen.SelectionDescription.import() =
    Manifest.SelectionDescription(
        this.selectionId,
        this.sequenceOrder,
        this.candidateId,
    )

//// enums

private fun org.cryptobiotic.protogen.Manifest.ElectionType.import():
        Manifest.ElectionType? {
    val result = safeEnumValueOf<Manifest.ElectionType>(this.name)
    if (result == null) {
        logger.error { "Manifest.ElectionType $this has missing or unknown name" }
    }
    return result
}

private fun org.cryptobiotic.protogen.GeopoliticalUnit.ReportingUnitType.import():
        Manifest.ReportingUnitType? {
    val result = safeEnumValueOf<Manifest.ReportingUnitType>(this.name)
    if (result == null) {
        logger.error { "Manifest.ReportingUnitType $this has missing or unknown name" }
    }
    return result
}

private fun org.cryptobiotic.protogen.ContestDescription.VoteVariationType.import():
        Manifest.VoteVariationType? {
    val result = safeEnumValueOf<Manifest.VoteVariationType>(this.name)
    if (result == null) {
        logger.error { "Manifest.VoteVariationType $this has missing or unknown name" }
    }
    return result
}