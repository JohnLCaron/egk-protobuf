package org.cryptobiotic.protoconvert

import com.github.michaelbull.result.*
import electionguard.ballot.*
import electionguard.util.ErrorMessages
import pbandk.ByteArr

fun org.cryptobiotic.protogen.ElectionConfig.import(errs: ErrorMessages): Result<ElectionConfig, ErrorMessages> {
    val electionConstants = this.constants?.import() ?: errs.add("missing ElectionConstants")
    val parameterHash = this.parameterBaseHash?.import() ?: errs.add("missing parameterBaseHash")
    val manifestHash = manifestHash?.import() ?: errs.add("missing manifestHash")
    val electionHash = this.electionBaseHash?.import() ?: errs.add("missing electionBaseHash")

    if (errs.hasErrors()) {
        return Err(errs)
    }

    return Ok(ElectionConfig(
        this.specVersion,
        electionConstants.unwrap(),
        this.numberOfGuardians,
        this.quorum,
        parameterHash.unwrap(),
        manifestHash.unwrap(),
        electionHash.unwrap(),
        this.manifestBytes.array,
        this.chainConfirmationCodes,
        this.configBaux0.array,
        this.metadata.associate { it.key to it.value },
    ))
}

private fun org.cryptobiotic.protogen.ElectionConstants.import(): Result<ElectionConstants, String> {
    return Ok(
        ElectionConstants(
            this.name,
            this.largePrime.array,
            this.smallPrime.array,
            this.cofactor.array,
            this.generator.array,
        )
    )
}

////////////////////////////////////////////////////////

fun ElectionConfig.publishProto() =
    org.cryptobiotic.protogen.ElectionConfig(
        protocolVersion,
        constants.publishProto(),
        this.numberOfGuardians,
        this.quorum,
        this.parameterBaseHash.publishProto(),
        this.manifestHash.publishProto(),
        this.electionBaseHash.publishProto(),
        ByteArr(this.manifestBytes),
        this.chainConfirmationCodes,
        ByteArr(this.configBaux0),
        this.metadata.entries.map { org.cryptobiotic.protogen.ElectionConfig.MetadataEntry(it.key, it.value) },
    )

private fun ElectionConstants.publishProto() =
    org.cryptobiotic.protogen.ElectionConstants(
        this.name,
        ByteArr(this.largePrime),
        ByteArr(this.smallPrime),
        ByteArr(this.cofactor),
        ByteArr(this.generator),
    )