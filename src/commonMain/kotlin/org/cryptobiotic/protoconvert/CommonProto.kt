package org.cryptobiotic.protoconvert

import com.github.michaelbull.result.Err
import com.github.michaelbull.result.Ok
import com.github.michaelbull.result.Result
import electionguard.core.*
import electionguard.util.ErrorMessages
import pbandk.ByteArr
import kotlin.reflect.KClass

// Note that importXXX(protogen.T?) return T?, while T.publishProto() return protogen.T
// Its up to the calling routines to turn that into Result<Boolean, String>

fun GroupContext.importElementModQ(modQ: org.cryptobiotic.protogen.ElementModQ?): ElementModQ? =
    modQ?.let { this.binaryToElementModQ(modQ.value.array) }

fun importUInt256(modQ: org.cryptobiotic.protogen.UInt256?): UInt256? =
    modQ?.value?.array?.toUInt256()

fun org.cryptobiotic.protogen.UInt256.import(): Result<UInt256, String> {
    val value = this.value.array.toUInt256()
    return if (value != null) Ok(value) else Err("malformed UInt256")
}

fun GroupContext.importElementModP(modP: org.cryptobiotic.protogen.ElementModP?): ElementModP? =
    modP?.let { this.binaryToElementModP(modP.value.array) }

fun GroupContext.importCiphertext(
    ciphertext: org.cryptobiotic.protogen.ElGamalCiphertext?,
): ElGamalCiphertext? {
    if (ciphertext == null) return null
    val pad = this.importElementModP(ciphertext.pad)
    val data = this.importElementModP(ciphertext.data)
    return if (pad == null || data == null) null else ElGamalCiphertext(pad, data)
}

fun GroupContext.importChaumPedersenProof(
    proof: org.cryptobiotic.protogen.ChaumPedersenProof?,
    errs: ErrorMessages = ErrorMessages("importChaumPedersenProof"),
): ChaumPedersenProof? {
    if (proof == null)  {
        errs.add("missing ChaumPedersenProof")
        return null
    }
    val challenge = this.importElementModQ(proof.challenge) ?: (errs.addNull("malformed challenge") as ElementModQ?)
    val response = this.importElementModQ(proof.response) ?: (errs.addNull("malformed response") as ElementModQ?)
    return if (challenge == null || response == null) null else ChaumPedersenProof(challenge, response)
}

fun GroupContext.importHashedCiphertext(
    ciphertext: org.cryptobiotic.protogen.HashedElGamalCiphertext?,
    errs: ErrorMessages = ErrorMessages("importHashedCiphertext"),
): HashedElGamalCiphertext? {
    if (ciphertext == null)  {
        errs.add("missing HashedCiphertext")
        return null
    }
    val c0 = this.importElementModP(ciphertext.c0) ?: (errs.addNull("malformed c0") as ElementModP?)
    val c2 = importUInt256(ciphertext.c2) ?: (errs.addNull("malformed c2") as UInt256?)

    return if (c0 == null || c2 == null) null else HashedElGamalCiphertext(
        c0,
        ciphertext.c1.array,
        c2,
        ciphertext.numBytes
    )
}

fun GroupContext.importSchnorrProof(proof: org.cryptobiotic.protogen.SchnorrProof?, errs: ErrorMessages = ErrorMessages("importSchnorrProof")): SchnorrProof? {
    if (proof == null) {
        errs.add("missing SchnorrProof")
        return null
    }
    val publicKey = this.importElementModP(proof.publicKey) ?: (errs.addNull("malformed publicKey") as ElementModP?)
    val challenge = this.importElementModQ(proof.challenge) ?: (errs.addNull("malformed challenge") as ElementModQ?)
    val response = this.importElementModQ(proof.response) ?: (errs.addNull("malformed response") as ElementModQ?)

    return if (publicKey == null || challenge == null || response == null) null
        else SchnorrProof(publicKey, challenge, response)
}

///////////////////////////////////////////////////////////////////////////////////////////////////////

fun ElementModQ.publishProto() = org.cryptobiotic.protogen.ElementModQ(ByteArr(this.byteArray()))

fun UInt256.publishProto() = org.cryptobiotic.protogen.UInt256(ByteArr(this.bytes))

fun ElementModP.publishProto() = org.cryptobiotic.protogen.ElementModP(ByteArr(this.byteArray()))

fun ElGamalCiphertext.publishProto() =
    org.cryptobiotic.protogen.ElGamalCiphertext(
        this.pad.publishProto(),
        this.data.publishProto(),
    )

fun ChaumPedersenProof.publishProto() =
    org.cryptobiotic.protogen.ChaumPedersenProof(
        this.c.publishProto(),
        this.r.publishProto(),
    )

fun HashedElGamalCiphertext.publishProto() =
    org.cryptobiotic.protogen.HashedElGamalCiphertext(
        this.c0.publishProto(),
        ByteArr(this.c1),
        this.c2.publishProto(),
        this.numBytes,
    )

fun SchnorrProof.publishProto() =
    org.cryptobiotic.protogen.SchnorrProof(
        this.publicKey.publishProto(),
        this.challenge.publishProto(),
        this.response.publishProto()
    )
