@file:OptIn(pbandk.PublicForGeneratedCode::class)

package org.cryptobiotic.protogen

@pbandk.Export
public data class ElectionConfig(
    val specVersion: String = "",
    val constants: org.cryptobiotic.protogen.ElectionConstants? = null,
    val numberOfGuardians: Int = 0,
    val quorum: Int = 0,
    val parameterBaseHash: org.cryptobiotic.protogen.UInt256? = null,
    val manifestHash: org.cryptobiotic.protogen.UInt256? = null,
    val electionBaseHash: org.cryptobiotic.protogen.UInt256? = null,
    val manifestBytes: pbandk.ByteArr = pbandk.ByteArr.empty,
    val chainConfirmationCodes: Boolean = false,
    val configBaux0: pbandk.ByteArr = pbandk.ByteArr.empty,
    val metadata: List<org.cryptobiotic.protogen.ElectionConfig.MetadataEntry> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.ElectionConfig = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ElectionConfig> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.ElectionConfig> {
        public val defaultInstance: org.cryptobiotic.protogen.ElectionConfig by lazy { org.cryptobiotic.protogen.ElectionConfig() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.ElectionConfig = org.cryptobiotic.protogen.ElectionConfig.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ElectionConfig> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.ElectionConfig, *>>(11)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "spec_version",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "specVersion",
                        value = org.cryptobiotic.protogen.ElectionConfig::specVersion
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "constants",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ElectionConstants.Companion),
                        jsonName = "constants",
                        value = org.cryptobiotic.protogen.ElectionConfig::constants
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "number_of_guardians",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "numberOfGuardians",
                        value = org.cryptobiotic.protogen.ElectionConfig::numberOfGuardians
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "quorum",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "quorum",
                        value = org.cryptobiotic.protogen.ElectionConfig::quorum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "parameter_base_hash",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.UInt256.Companion),
                        jsonName = "parameterBaseHash",
                        value = org.cryptobiotic.protogen.ElectionConfig::parameterBaseHash
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "manifest_hash",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.UInt256.Companion),
                        jsonName = "manifestHash",
                        value = org.cryptobiotic.protogen.ElectionConfig::manifestHash
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "election_base_hash",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.UInt256.Companion),
                        jsonName = "electionBaseHash",
                        value = org.cryptobiotic.protogen.ElectionConfig::electionBaseHash
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "manifest_bytes",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "manifestBytes",
                        value = org.cryptobiotic.protogen.ElectionConfig::manifestBytes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "chain_confirmation_codes",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "chainConfirmationCodes",
                        value = org.cryptobiotic.protogen.ElectionConfig::chainConfirmationCodes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "config_baux0",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "configBaux0",
                        value = org.cryptobiotic.protogen.ElectionConfig::configBaux0
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "metadata",
                        number = 20,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.ElectionConfig.MetadataEntry>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ElectionConfig.MetadataEntry.Companion)),
                        jsonName = "metadata",
                        value = org.cryptobiotic.protogen.ElectionConfig::metadata
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ElectionConfig",
                messageClass = org.cryptobiotic.protogen.ElectionConfig::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public data class MetadataEntry(
        override val key: String = "",
        override val value: String = "",
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, String> {
        override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.ElectionConfig.MetadataEntry = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ElectionConfig.MetadataEntry> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.ElectionConfig.MetadataEntry> {
            public val defaultInstance: org.cryptobiotic.protogen.ElectionConfig.MetadataEntry by lazy { org.cryptobiotic.protogen.ElectionConfig.MetadataEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.ElectionConfig.MetadataEntry = org.cryptobiotic.protogen.ElectionConfig.MetadataEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ElectionConfig.MetadataEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.ElectionConfig.MetadataEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = org.cryptobiotic.protogen.ElectionConfig.MetadataEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "value",
                            value = org.cryptobiotic.protogen.ElectionConfig.MetadataEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "ElectionConfig.MetadataEntry",
                    messageClass = org.cryptobiotic.protogen.ElectionConfig.MetadataEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

@pbandk.Export
public data class ElectionConstants(
    val name: String = "",
    val largePrime: pbandk.ByteArr = pbandk.ByteArr.empty,
    val smallPrime: pbandk.ByteArr = pbandk.ByteArr.empty,
    val cofactor: pbandk.ByteArr = pbandk.ByteArr.empty,
    val generator: pbandk.ByteArr = pbandk.ByteArr.empty,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.ElectionConstants = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ElectionConstants> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.ElectionConstants> {
        public val defaultInstance: org.cryptobiotic.protogen.ElectionConstants by lazy { org.cryptobiotic.protogen.ElectionConstants() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.ElectionConstants = org.cryptobiotic.protogen.ElectionConstants.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ElectionConstants> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.ElectionConstants, *>>(5)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "large_prime",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "largePrime",
                        value = org.cryptobiotic.protogen.ElectionConstants::largePrime
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "small_prime",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "smallPrime",
                        value = org.cryptobiotic.protogen.ElectionConstants::smallPrime
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "cofactor",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "cofactor",
                        value = org.cryptobiotic.protogen.ElectionConstants::cofactor
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "generator",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "generator",
                        value = org.cryptobiotic.protogen.ElectionConstants::generator
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = org.cryptobiotic.protogen.ElectionConstants::name
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ElectionConstants",
                messageClass = org.cryptobiotic.protogen.ElectionConstants::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class ElectionInitialized(
    val config: org.cryptobiotic.protogen.ElectionConfig? = null,
    val jointPublicKey: org.cryptobiotic.protogen.ElementModP? = null,
    val extendedBaseHash: org.cryptobiotic.protogen.UInt256? = null,
    val guardians: List<org.cryptobiotic.protogen.Guardian> = emptyList(),
    val metadata: List<org.cryptobiotic.protogen.ElectionInitialized.MetadataEntry> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.ElectionInitialized = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ElectionInitialized> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.ElectionInitialized> {
        public val defaultInstance: org.cryptobiotic.protogen.ElectionInitialized by lazy { org.cryptobiotic.protogen.ElectionInitialized() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.ElectionInitialized = org.cryptobiotic.protogen.ElectionInitialized.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ElectionInitialized> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.ElectionInitialized, *>>(5)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "config",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ElectionConfig.Companion),
                        jsonName = "config",
                        value = org.cryptobiotic.protogen.ElectionInitialized::config
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "joint_public_key",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ElementModP.Companion),
                        jsonName = "jointPublicKey",
                        value = org.cryptobiotic.protogen.ElectionInitialized::jointPublicKey
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "extended_base_hash",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.UInt256.Companion),
                        jsonName = "extendedBaseHash",
                        value = org.cryptobiotic.protogen.ElectionInitialized::extendedBaseHash
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "guardians",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.Guardian>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.Guardian.Companion)),
                        jsonName = "guardians",
                        value = org.cryptobiotic.protogen.ElectionInitialized::guardians
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "metadata",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.ElectionInitialized.MetadataEntry>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ElectionInitialized.MetadataEntry.Companion)),
                        jsonName = "metadata",
                        value = org.cryptobiotic.protogen.ElectionInitialized::metadata
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ElectionInitialized",
                messageClass = org.cryptobiotic.protogen.ElectionInitialized::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public data class MetadataEntry(
        override val key: String = "",
        override val value: String = "",
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, String> {
        override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.ElectionInitialized.MetadataEntry = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ElectionInitialized.MetadataEntry> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.ElectionInitialized.MetadataEntry> {
            public val defaultInstance: org.cryptobiotic.protogen.ElectionInitialized.MetadataEntry by lazy { org.cryptobiotic.protogen.ElectionInitialized.MetadataEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.ElectionInitialized.MetadataEntry = org.cryptobiotic.protogen.ElectionInitialized.MetadataEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ElectionInitialized.MetadataEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.ElectionInitialized.MetadataEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = org.cryptobiotic.protogen.ElectionInitialized.MetadataEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "value",
                            value = org.cryptobiotic.protogen.ElectionInitialized.MetadataEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "ElectionInitialized.MetadataEntry",
                    messageClass = org.cryptobiotic.protogen.ElectionInitialized.MetadataEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

@pbandk.Export
public data class Guardian(
    val guardianId: String = "",
    val xCoordinate: Int = 0,
    val coefficientProofs: List<org.cryptobiotic.protogen.SchnorrProof> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.Guardian = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.Guardian> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.Guardian> {
        public val defaultInstance: org.cryptobiotic.protogen.Guardian by lazy { org.cryptobiotic.protogen.Guardian() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.Guardian = org.cryptobiotic.protogen.Guardian.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.Guardian> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.Guardian, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "guardian_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "guardianId",
                        value = org.cryptobiotic.protogen.Guardian::guardianId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "x_coordinate",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "xCoordinate",
                        value = org.cryptobiotic.protogen.Guardian::xCoordinate
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "coefficient_proofs",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.SchnorrProof>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.SchnorrProof.Companion)),
                        jsonName = "coefficientProofs",
                        value = org.cryptobiotic.protogen.Guardian::coefficientProofs
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "Guardian",
                messageClass = org.cryptobiotic.protogen.Guardian::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class EncryptedBallotChain(
    val encryptingDevice: String = "",
    val baux0: pbandk.ByteArr = pbandk.ByteArr.empty,
    val ballotIds: List<String> = emptyList(),
    val lastConfirmationCode: org.cryptobiotic.protogen.UInt256? = null,
    val chaining: Boolean = false,
    val closingHash: org.cryptobiotic.protogen.UInt256? = null,
    val metadata: List<org.cryptobiotic.protogen.EncryptedBallotChain.MetadataEntry> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.EncryptedBallotChain = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.EncryptedBallotChain> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.EncryptedBallotChain> {
        public val defaultInstance: org.cryptobiotic.protogen.EncryptedBallotChain by lazy { org.cryptobiotic.protogen.EncryptedBallotChain() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.EncryptedBallotChain = org.cryptobiotic.protogen.EncryptedBallotChain.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.EncryptedBallotChain> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.EncryptedBallotChain, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "encrypting_device",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "encryptingDevice",
                        value = org.cryptobiotic.protogen.EncryptedBallotChain::encryptingDevice
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "baux0",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "baux0",
                        value = org.cryptobiotic.protogen.EncryptedBallotChain::baux0
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ballot_ids",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "ballotIds",
                        value = org.cryptobiotic.protogen.EncryptedBallotChain::ballotIds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_confirmation_code",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.UInt256.Companion),
                        jsonName = "lastConfirmationCode",
                        value = org.cryptobiotic.protogen.EncryptedBallotChain::lastConfirmationCode
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "chaining",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "chaining",
                        value = org.cryptobiotic.protogen.EncryptedBallotChain::chaining
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "closing_hash",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.UInt256.Companion),
                        jsonName = "closingHash",
                        value = org.cryptobiotic.protogen.EncryptedBallotChain::closingHash
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "metadata",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.EncryptedBallotChain.MetadataEntry>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.EncryptedBallotChain.MetadataEntry.Companion)),
                        jsonName = "metadata",
                        value = org.cryptobiotic.protogen.EncryptedBallotChain::metadata
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "EncryptedBallotChain",
                messageClass = org.cryptobiotic.protogen.EncryptedBallotChain::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public data class MetadataEntry(
        override val key: String = "",
        override val value: String = "",
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, String> {
        override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.EncryptedBallotChain.MetadataEntry = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.EncryptedBallotChain.MetadataEntry> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.EncryptedBallotChain.MetadataEntry> {
            public val defaultInstance: org.cryptobiotic.protogen.EncryptedBallotChain.MetadataEntry by lazy { org.cryptobiotic.protogen.EncryptedBallotChain.MetadataEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.EncryptedBallotChain.MetadataEntry = org.cryptobiotic.protogen.EncryptedBallotChain.MetadataEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.EncryptedBallotChain.MetadataEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.EncryptedBallotChain.MetadataEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = org.cryptobiotic.protogen.EncryptedBallotChain.MetadataEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "value",
                            value = org.cryptobiotic.protogen.EncryptedBallotChain.MetadataEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "EncryptedBallotChain.MetadataEntry",
                    messageClass = org.cryptobiotic.protogen.EncryptedBallotChain.MetadataEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

@pbandk.Export
public data class TallyResult(
    val electionInit: org.cryptobiotic.protogen.ElectionInitialized? = null,
    val encryptedTally: org.cryptobiotic.protogen.EncryptedTally? = null,
    val tallyIds: List<String> = emptyList(),
    val metadata: List<org.cryptobiotic.protogen.TallyResult.MetadataEntry> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.TallyResult = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.TallyResult> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.TallyResult> {
        public val defaultInstance: org.cryptobiotic.protogen.TallyResult by lazy { org.cryptobiotic.protogen.TallyResult() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.TallyResult = org.cryptobiotic.protogen.TallyResult.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.TallyResult> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.TallyResult, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "election_init",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ElectionInitialized.Companion),
                        jsonName = "electionInit",
                        value = org.cryptobiotic.protogen.TallyResult::electionInit
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "encrypted_tally",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.EncryptedTally.Companion),
                        jsonName = "encryptedTally",
                        value = org.cryptobiotic.protogen.TallyResult::encryptedTally
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tally_ids",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "tallyIds",
                        value = org.cryptobiotic.protogen.TallyResult::tallyIds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "metadata",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.TallyResult.MetadataEntry>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.TallyResult.MetadataEntry.Companion)),
                        jsonName = "metadata",
                        value = org.cryptobiotic.protogen.TallyResult::metadata
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "TallyResult",
                messageClass = org.cryptobiotic.protogen.TallyResult::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public data class MetadataEntry(
        override val key: String = "",
        override val value: String = "",
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, String> {
        override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.TallyResult.MetadataEntry = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.TallyResult.MetadataEntry> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.TallyResult.MetadataEntry> {
            public val defaultInstance: org.cryptobiotic.protogen.TallyResult.MetadataEntry by lazy { org.cryptobiotic.protogen.TallyResult.MetadataEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.TallyResult.MetadataEntry = org.cryptobiotic.protogen.TallyResult.MetadataEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.TallyResult.MetadataEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.TallyResult.MetadataEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = org.cryptobiotic.protogen.TallyResult.MetadataEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "value",
                            value = org.cryptobiotic.protogen.TallyResult.MetadataEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "TallyResult.MetadataEntry",
                    messageClass = org.cryptobiotic.protogen.TallyResult.MetadataEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

@pbandk.Export
public data class DecryptionResult(
    val tallyResult: org.cryptobiotic.protogen.TallyResult? = null,
    val decryptedTally: org.cryptobiotic.protogen.DecryptedTallyOrBallot? = null,
    val metadata: List<org.cryptobiotic.protogen.DecryptionResult.MetadataEntry> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.DecryptionResult = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.DecryptionResult> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.DecryptionResult> {
        public val defaultInstance: org.cryptobiotic.protogen.DecryptionResult by lazy { org.cryptobiotic.protogen.DecryptionResult() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.DecryptionResult = org.cryptobiotic.protogen.DecryptionResult.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.DecryptionResult> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.DecryptionResult, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tally_result",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.TallyResult.Companion),
                        jsonName = "tallyResult",
                        value = org.cryptobiotic.protogen.DecryptionResult::tallyResult
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "decrypted_tally",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.DecryptedTallyOrBallot.Companion),
                        jsonName = "decryptedTally",
                        value = org.cryptobiotic.protogen.DecryptionResult::decryptedTally
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "metadata",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.DecryptionResult.MetadataEntry>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.DecryptionResult.MetadataEntry.Companion)),
                        jsonName = "metadata",
                        value = org.cryptobiotic.protogen.DecryptionResult::metadata
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "DecryptionResult",
                messageClass = org.cryptobiotic.protogen.DecryptionResult::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public data class MetadataEntry(
        override val key: String = "",
        override val value: String = "",
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, String> {
        override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.DecryptionResult.MetadataEntry = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.DecryptionResult.MetadataEntry> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.DecryptionResult.MetadataEntry> {
            public val defaultInstance: org.cryptobiotic.protogen.DecryptionResult.MetadataEntry by lazy { org.cryptobiotic.protogen.DecryptionResult.MetadataEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.DecryptionResult.MetadataEntry = org.cryptobiotic.protogen.DecryptionResult.MetadataEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.DecryptionResult.MetadataEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.DecryptionResult.MetadataEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = org.cryptobiotic.protogen.DecryptionResult.MetadataEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "value",
                            value = org.cryptobiotic.protogen.DecryptionResult.MetadataEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "DecryptionResult.MetadataEntry",
                    messageClass = org.cryptobiotic.protogen.DecryptionResult.MetadataEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForElectionConfig")
public fun ElectionConfig?.orDefault(): org.cryptobiotic.protogen.ElectionConfig = this ?: ElectionConfig.defaultInstance

private fun ElectionConfig.protoMergeImpl(plus: pbandk.Message?): ElectionConfig = (plus as? ElectionConfig)?.let {
    it.copy(
        constants = constants?.plus(plus.constants) ?: plus.constants,
        parameterBaseHash = parameterBaseHash?.plus(plus.parameterBaseHash) ?: plus.parameterBaseHash,
        manifestHash = manifestHash?.plus(plus.manifestHash) ?: plus.manifestHash,
        electionBaseHash = electionBaseHash?.plus(plus.electionBaseHash) ?: plus.electionBaseHash,
        metadata = metadata + plus.metadata,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ElectionConfig.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ElectionConfig {
    var specVersion = ""
    var constants: org.cryptobiotic.protogen.ElectionConstants? = null
    var numberOfGuardians = 0
    var quorum = 0
    var parameterBaseHash: org.cryptobiotic.protogen.UInt256? = null
    var manifestHash: org.cryptobiotic.protogen.UInt256? = null
    var electionBaseHash: org.cryptobiotic.protogen.UInt256? = null
    var manifestBytes: pbandk.ByteArr = pbandk.ByteArr.empty
    var chainConfirmationCodes = false
    var configBaux0: pbandk.ByteArr = pbandk.ByteArr.empty
    var metadata: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.ElectionConfig.MetadataEntry>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> specVersion = _fieldValue as String
            2 -> constants = _fieldValue as org.cryptobiotic.protogen.ElectionConstants
            3 -> numberOfGuardians = _fieldValue as Int
            4 -> quorum = _fieldValue as Int
            7 -> parameterBaseHash = _fieldValue as org.cryptobiotic.protogen.UInt256
            8 -> manifestHash = _fieldValue as org.cryptobiotic.protogen.UInt256
            9 -> electionBaseHash = _fieldValue as org.cryptobiotic.protogen.UInt256
            10 -> manifestBytes = _fieldValue as pbandk.ByteArr
            11 -> chainConfirmationCodes = _fieldValue as Boolean
            12 -> configBaux0 = _fieldValue as pbandk.ByteArr
            20 -> metadata = (metadata ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.ElectionConfig.MetadataEntry> }
        }
    }

    return ElectionConfig(specVersion, constants, numberOfGuardians, quorum,
        parameterBaseHash, manifestHash, electionBaseHash, manifestBytes,
        chainConfirmationCodes, configBaux0, pbandk.ListWithSize.Builder.fixed(metadata), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForElectionConfigMetadataEntry")
public fun ElectionConfig.MetadataEntry?.orDefault(): org.cryptobiotic.protogen.ElectionConfig.MetadataEntry = this ?: ElectionConfig.MetadataEntry.defaultInstance

private fun ElectionConfig.MetadataEntry.protoMergeImpl(plus: pbandk.Message?): ElectionConfig.MetadataEntry = (plus as? ElectionConfig.MetadataEntry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ElectionConfig.MetadataEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ElectionConfig.MetadataEntry {
    var key = ""
    var value = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as String
        }
    }

    return ElectionConfig.MetadataEntry(key, value, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForElectionConstants")
public fun ElectionConstants?.orDefault(): org.cryptobiotic.protogen.ElectionConstants = this ?: ElectionConstants.defaultInstance

private fun ElectionConstants.protoMergeImpl(plus: pbandk.Message?): ElectionConstants = (plus as? ElectionConstants)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ElectionConstants.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ElectionConstants {
    var name = ""
    var largePrime: pbandk.ByteArr = pbandk.ByteArr.empty
    var smallPrime: pbandk.ByteArr = pbandk.ByteArr.empty
    var cofactor: pbandk.ByteArr = pbandk.ByteArr.empty
    var generator: pbandk.ByteArr = pbandk.ByteArr.empty

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> largePrime = _fieldValue as pbandk.ByteArr
            2 -> smallPrime = _fieldValue as pbandk.ByteArr
            3 -> cofactor = _fieldValue as pbandk.ByteArr
            4 -> generator = _fieldValue as pbandk.ByteArr
            5 -> name = _fieldValue as String
        }
    }

    return ElectionConstants(name, largePrime, smallPrime, cofactor,
        generator, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForElectionInitialized")
public fun ElectionInitialized?.orDefault(): org.cryptobiotic.protogen.ElectionInitialized = this ?: ElectionInitialized.defaultInstance

private fun ElectionInitialized.protoMergeImpl(plus: pbandk.Message?): ElectionInitialized = (plus as? ElectionInitialized)?.let {
    it.copy(
        config = config?.plus(plus.config) ?: plus.config,
        jointPublicKey = jointPublicKey?.plus(plus.jointPublicKey) ?: plus.jointPublicKey,
        extendedBaseHash = extendedBaseHash?.plus(plus.extendedBaseHash) ?: plus.extendedBaseHash,
        guardians = guardians + plus.guardians,
        metadata = metadata + plus.metadata,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ElectionInitialized.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ElectionInitialized {
    var config: org.cryptobiotic.protogen.ElectionConfig? = null
    var jointPublicKey: org.cryptobiotic.protogen.ElementModP? = null
    var extendedBaseHash: org.cryptobiotic.protogen.UInt256? = null
    var guardians: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.Guardian>? = null
    var metadata: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.ElectionInitialized.MetadataEntry>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> config = _fieldValue as org.cryptobiotic.protogen.ElectionConfig
            2 -> jointPublicKey = _fieldValue as org.cryptobiotic.protogen.ElementModP
            3 -> extendedBaseHash = _fieldValue as org.cryptobiotic.protogen.UInt256
            4 -> guardians = (guardians ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.Guardian> }
            5 -> metadata = (metadata ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.ElectionInitialized.MetadataEntry> }
        }
    }

    return ElectionInitialized(config, jointPublicKey, extendedBaseHash, pbandk.ListWithSize.Builder.fixed(guardians),
        pbandk.ListWithSize.Builder.fixed(metadata), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForElectionInitializedMetadataEntry")
public fun ElectionInitialized.MetadataEntry?.orDefault(): org.cryptobiotic.protogen.ElectionInitialized.MetadataEntry = this ?: ElectionInitialized.MetadataEntry.defaultInstance

private fun ElectionInitialized.MetadataEntry.protoMergeImpl(plus: pbandk.Message?): ElectionInitialized.MetadataEntry = (plus as? ElectionInitialized.MetadataEntry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ElectionInitialized.MetadataEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ElectionInitialized.MetadataEntry {
    var key = ""
    var value = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as String
        }
    }

    return ElectionInitialized.MetadataEntry(key, value, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGuardian")
public fun Guardian?.orDefault(): org.cryptobiotic.protogen.Guardian = this ?: Guardian.defaultInstance

private fun Guardian.protoMergeImpl(plus: pbandk.Message?): Guardian = (plus as? Guardian)?.let {
    it.copy(
        coefficientProofs = coefficientProofs + plus.coefficientProofs,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Guardian.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Guardian {
    var guardianId = ""
    var xCoordinate = 0
    var coefficientProofs: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.SchnorrProof>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> guardianId = _fieldValue as String
            2 -> xCoordinate = _fieldValue as Int
            3 -> coefficientProofs = (coefficientProofs ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.SchnorrProof> }
        }
    }

    return Guardian(guardianId, xCoordinate, pbandk.ListWithSize.Builder.fixed(coefficientProofs), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEncryptedBallotChain")
public fun EncryptedBallotChain?.orDefault(): org.cryptobiotic.protogen.EncryptedBallotChain = this ?: EncryptedBallotChain.defaultInstance

private fun EncryptedBallotChain.protoMergeImpl(plus: pbandk.Message?): EncryptedBallotChain = (plus as? EncryptedBallotChain)?.let {
    it.copy(
        ballotIds = ballotIds + plus.ballotIds,
        lastConfirmationCode = lastConfirmationCode?.plus(plus.lastConfirmationCode) ?: plus.lastConfirmationCode,
        closingHash = closingHash?.plus(plus.closingHash) ?: plus.closingHash,
        metadata = metadata + plus.metadata,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EncryptedBallotChain.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EncryptedBallotChain {
    var encryptingDevice = ""
    var baux0: pbandk.ByteArr = pbandk.ByteArr.empty
    var ballotIds: pbandk.ListWithSize.Builder<String>? = null
    var lastConfirmationCode: org.cryptobiotic.protogen.UInt256? = null
    var chaining = false
    var closingHash: org.cryptobiotic.protogen.UInt256? = null
    var metadata: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.EncryptedBallotChain.MetadataEntry>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> encryptingDevice = _fieldValue as String
            2 -> baux0 = _fieldValue as pbandk.ByteArr
            3 -> ballotIds = (ballotIds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            4 -> lastConfirmationCode = _fieldValue as org.cryptobiotic.protogen.UInt256
            5 -> chaining = _fieldValue as Boolean
            6 -> closingHash = _fieldValue as org.cryptobiotic.protogen.UInt256
            11 -> metadata = (metadata ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.EncryptedBallotChain.MetadataEntry> }
        }
    }

    return EncryptedBallotChain(encryptingDevice, baux0, pbandk.ListWithSize.Builder.fixed(ballotIds), lastConfirmationCode,
        chaining, closingHash, pbandk.ListWithSize.Builder.fixed(metadata), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEncryptedBallotChainMetadataEntry")
public fun EncryptedBallotChain.MetadataEntry?.orDefault(): org.cryptobiotic.protogen.EncryptedBallotChain.MetadataEntry = this ?: EncryptedBallotChain.MetadataEntry.defaultInstance

private fun EncryptedBallotChain.MetadataEntry.protoMergeImpl(plus: pbandk.Message?): EncryptedBallotChain.MetadataEntry = (plus as? EncryptedBallotChain.MetadataEntry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EncryptedBallotChain.MetadataEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EncryptedBallotChain.MetadataEntry {
    var key = ""
    var value = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as String
        }
    }

    return EncryptedBallotChain.MetadataEntry(key, value, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForTallyResult")
public fun TallyResult?.orDefault(): org.cryptobiotic.protogen.TallyResult = this ?: TallyResult.defaultInstance

private fun TallyResult.protoMergeImpl(plus: pbandk.Message?): TallyResult = (plus as? TallyResult)?.let {
    it.copy(
        electionInit = electionInit?.plus(plus.electionInit) ?: plus.electionInit,
        encryptedTally = encryptedTally?.plus(plus.encryptedTally) ?: plus.encryptedTally,
        tallyIds = tallyIds + plus.tallyIds,
        metadata = metadata + plus.metadata,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TallyResult.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TallyResult {
    var electionInit: org.cryptobiotic.protogen.ElectionInitialized? = null
    var encryptedTally: org.cryptobiotic.protogen.EncryptedTally? = null
    var tallyIds: pbandk.ListWithSize.Builder<String>? = null
    var metadata: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.TallyResult.MetadataEntry>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> electionInit = _fieldValue as org.cryptobiotic.protogen.ElectionInitialized
            2 -> encryptedTally = _fieldValue as org.cryptobiotic.protogen.EncryptedTally
            4 -> tallyIds = (tallyIds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            5 -> metadata = (metadata ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.TallyResult.MetadataEntry> }
        }
    }

    return TallyResult(electionInit, encryptedTally, pbandk.ListWithSize.Builder.fixed(tallyIds), pbandk.ListWithSize.Builder.fixed(metadata), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForTallyResultMetadataEntry")
public fun TallyResult.MetadataEntry?.orDefault(): org.cryptobiotic.protogen.TallyResult.MetadataEntry = this ?: TallyResult.MetadataEntry.defaultInstance

private fun TallyResult.MetadataEntry.protoMergeImpl(plus: pbandk.Message?): TallyResult.MetadataEntry = (plus as? TallyResult.MetadataEntry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TallyResult.MetadataEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TallyResult.MetadataEntry {
    var key = ""
    var value = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as String
        }
    }

    return TallyResult.MetadataEntry(key, value, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDecryptionResult")
public fun DecryptionResult?.orDefault(): org.cryptobiotic.protogen.DecryptionResult = this ?: DecryptionResult.defaultInstance

private fun DecryptionResult.protoMergeImpl(plus: pbandk.Message?): DecryptionResult = (plus as? DecryptionResult)?.let {
    it.copy(
        tallyResult = tallyResult?.plus(plus.tallyResult) ?: plus.tallyResult,
        decryptedTally = decryptedTally?.plus(plus.decryptedTally) ?: plus.decryptedTally,
        metadata = metadata + plus.metadata,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DecryptionResult.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DecryptionResult {
    var tallyResult: org.cryptobiotic.protogen.TallyResult? = null
    var decryptedTally: org.cryptobiotic.protogen.DecryptedTallyOrBallot? = null
    var metadata: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.DecryptionResult.MetadataEntry>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> tallyResult = _fieldValue as org.cryptobiotic.protogen.TallyResult
            2 -> decryptedTally = _fieldValue as org.cryptobiotic.protogen.DecryptedTallyOrBallot
            3 -> metadata = (metadata ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.DecryptionResult.MetadataEntry> }
        }
    }

    return DecryptionResult(tallyResult, decryptedTally, pbandk.ListWithSize.Builder.fixed(metadata), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDecryptionResultMetadataEntry")
public fun DecryptionResult.MetadataEntry?.orDefault(): org.cryptobiotic.protogen.DecryptionResult.MetadataEntry = this ?: DecryptionResult.MetadataEntry.defaultInstance

private fun DecryptionResult.MetadataEntry.protoMergeImpl(plus: pbandk.Message?): DecryptionResult.MetadataEntry = (plus as? DecryptionResult.MetadataEntry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DecryptionResult.MetadataEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DecryptionResult.MetadataEntry {
    var key = ""
    var value = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as String
        }
    }

    return DecryptionResult.MetadataEntry(key, value, unknownFields)
}
