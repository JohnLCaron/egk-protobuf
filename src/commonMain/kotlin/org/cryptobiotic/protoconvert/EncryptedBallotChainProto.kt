package org.cryptobiotic.protoconvert

import electionguard.ballot.DecryptionResult
import electionguard.ballot.EncryptedBallotChain
import electionguard.ballot.TallyResult
import electionguard.core.UInt256
import electionguard.util.ErrorMessages
import pbandk.ByteArr

fun org.cryptobiotic.protogen.EncryptedBallotChain.import(errs : ErrorMessages): EncryptedBallotChain? {

    val lastConfirmationCode = importUInt256(this.lastConfirmationCode) ?: errs.addNull("malformed lastConfirmationCode") as UInt256?
    return if (errs.hasErrors()) null
    else EncryptedBallotChain(
        this.encryptingDevice,
        this.baux0.array,
        this.ballotIds,
        lastConfirmationCode!!,
        this.chaining,
        importUInt256(this.closingHash),
        this.metadata.associate { it.key to it.value }
    )
}

////////////////////////////////////////////////////////

fun EncryptedBallotChain.publishProto() =
    org.cryptobiotic.protogen.EncryptedBallotChain(
        this.encryptingDevice,
        ByteArr(this.baux0),
        this.ballotIds,
        this.lastConfirmationCode.publishProto(),
        this.chaining,
        this.closingHash?.publishProto(),
        this.metadata.entries.map { org.cryptobiotic.protogen.EncryptedBallotChain.MetadataEntry(it.key, it.value) }
    )

fun TallyResult.publishProto() =
    org.cryptobiotic.protogen.TallyResult(
        this.electionInitialized.publishProto(),
        this.encryptedTally.publishProto(),
        this.tallyIds,
        this.metadata.entries.map { org.cryptobiotic.protogen.TallyResult.MetadataEntry(it.key, it.value) }
    )

fun DecryptionResult.publishProto() =
    org.cryptobiotic.protogen.DecryptionResult(
        this.tallyResult.publishProto(),
        this.decryptedTally.publishProto(),
        this.metadata.entries.map { org.cryptobiotic.protogen.DecryptionResult.MetadataEntry(it.key, it.value) }
    )