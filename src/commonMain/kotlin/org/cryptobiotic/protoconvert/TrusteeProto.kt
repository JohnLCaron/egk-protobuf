package org.cryptobiotic.protoconvert

import electionguard.core.*
import electionguard.decrypt.DecryptingTrusteeDoerre
import electionguard.keyceremony.KeyCeremonyTrustee
import electionguard.keyceremony.EncryptedKeyShare
import electionguard.util.ErrorMessages

fun org.cryptobiotic.protogen.DecryptingTrustee.import(group: GroupContext, errs : ErrorMessages): DecryptingTrusteeDoerre? {

    val publicKey = group.importElementModP(this.publicKey) ?: errs.addNull("malformed publicKey") as ElementModP?
    val keyShare = group.importElementModQ(this.keyShare) ?: errs.addNull("malformed keyShare" ) as ElementModQ?

    return if (errs.hasErrors()) null
    else DecryptingTrusteeDoerre(
        this.guardianId,
        this.guardianXCoordinate,
        publicKey!!,
        keyShare!!,
    )
}

private fun org.cryptobiotic.protogen.EncryptedKeyShare.import(id: String, group: GroupContext, errs : ErrorMessages): EncryptedKeyShare? {
    val encryptedCoordinate = group.importHashedCiphertext(this.encryptedCoordinate, errs.nested("EncryptedKeyShare"))

    return if (errs.hasErrors()) null
    else EncryptedKeyShare(
            this.ownerXcoord,
            this.polynomialOwner,
            this.secretShareFor,
            encryptedCoordinate!!,
        )
}

///////////////////////////////////////////////////////////////////////////////

fun KeyCeremonyTrustee.publishProto() =
    org.cryptobiotic.protogen.DecryptingTrustee(
        this.id(),
        this.xCoordinate(),
        this.guardianPublicKey().publishProto(),
        this.computeSecretKeyShare().publishProto(),
    )

private fun EncryptedKeyShare.publishProto() =
    org.cryptobiotic.protogen.EncryptedKeyShare(
        this.ownerXcoord,
        this.polynomialOwner,
        this.secretShareFor,
        this.encryptedCoordinate.publishProto(),
    )
