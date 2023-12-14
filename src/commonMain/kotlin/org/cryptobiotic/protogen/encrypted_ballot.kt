@file:OptIn(pbandk.PublicForGeneratedCode::class)

package org.cryptobiotic.protogen

@pbandk.Export
public data class EncryptedBallot(
    val ballotId: String = "",
    val ballotStyleId: String = "",
    val encryptingDevice: String = "",
    val timestamp: Long = 0L,
    val codeBaux: pbandk.ByteArr = pbandk.ByteArr.empty,
    val confirmationCode: org.cryptobiotic.protogen.UInt256? = null,
    val electionId: org.cryptobiotic.protogen.UInt256? = null,
    val contests: List<org.cryptobiotic.protogen.EncryptedBallotContest> = emptyList(),
    val state: org.cryptobiotic.protogen.EncryptedBallot.BallotState = org.cryptobiotic.protogen.EncryptedBallot.BallotState.fromValue(0),
    val encryptedSn: org.cryptobiotic.protogen.ElGamalCiphertext? = null,
    val isPreencrypt: Boolean = false,
    val primaryNonce: org.cryptobiotic.protogen.UInt256? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.EncryptedBallot = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.EncryptedBallot> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.EncryptedBallot> {
        public val defaultInstance: org.cryptobiotic.protogen.EncryptedBallot by lazy { org.cryptobiotic.protogen.EncryptedBallot() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.EncryptedBallot = org.cryptobiotic.protogen.EncryptedBallot.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.EncryptedBallot> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.EncryptedBallot, *>>(12)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ballot_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "ballotId",
                        value = org.cryptobiotic.protogen.EncryptedBallot::ballotId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ballot_style_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "ballotStyleId",
                        value = org.cryptobiotic.protogen.EncryptedBallot::ballotStyleId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "encrypting_device",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "encryptingDevice",
                        value = org.cryptobiotic.protogen.EncryptedBallot::encryptingDevice
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "timestamp",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "timestamp",
                        value = org.cryptobiotic.protogen.EncryptedBallot::timestamp
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "code_baux",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "codeBaux",
                        value = org.cryptobiotic.protogen.EncryptedBallot::codeBaux
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "confirmation_code",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.UInt256.Companion),
                        jsonName = "confirmationCode",
                        value = org.cryptobiotic.protogen.EncryptedBallot::confirmationCode
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "contests",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.EncryptedBallotContest>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.EncryptedBallotContest.Companion)),
                        jsonName = "contests",
                        value = org.cryptobiotic.protogen.EncryptedBallot::contests
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "state",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = org.cryptobiotic.protogen.EncryptedBallot.BallotState.Companion),
                        jsonName = "state",
                        value = org.cryptobiotic.protogen.EncryptedBallot::state
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_preencrypt",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isPreencrypt",
                        value = org.cryptobiotic.protogen.EncryptedBallot::isPreencrypt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "primary_nonce",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.UInt256.Companion),
                        jsonName = "primaryNonce",
                        value = org.cryptobiotic.protogen.EncryptedBallot::primaryNonce
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "election_id",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.UInt256.Companion),
                        jsonName = "electionId",
                        value = org.cryptobiotic.protogen.EncryptedBallot::electionId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "encrypted_sn",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ElGamalCiphertext.Companion),
                        jsonName = "encryptedSn",
                        value = org.cryptobiotic.protogen.EncryptedBallot::encryptedSn
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "EncryptedBallot",
                messageClass = org.cryptobiotic.protogen.EncryptedBallot::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed class BallotState(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is EncryptedBallot.BallotState && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "EncryptedBallot.BallotState.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object UNKNOWN : BallotState(0, "UNKNOWN")
        public object CAST : BallotState(1, "CAST")
        public object SPOILED : BallotState(2, "SPOILED")
        public class UNRECOGNIZED(value: Int) : BallotState(value)

        public companion object : pbandk.Message.Enum.Companion<EncryptedBallot.BallotState> {
            public val values: List<EncryptedBallot.BallotState> by lazy { listOf(UNKNOWN, CAST, SPOILED) }
            override fun fromValue(value: Int): EncryptedBallot.BallotState = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): EncryptedBallot.BallotState = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No BallotState with name: $name")
        }
    }
}

@pbandk.Export
public data class EncryptedBallotContest(
    val contestId: String = "",
    val sequenceOrder: Int = 0,
    val votesAllowed: Int = 0,
    val contestHash: org.cryptobiotic.protogen.UInt256? = null,
    val selections: List<org.cryptobiotic.protogen.EncryptedBallotSelection> = emptyList(),
    val proof: org.cryptobiotic.protogen.ChaumPedersenRangeProofKnownNonce? = null,
    val encryptedContestData: org.cryptobiotic.protogen.HashedElGamalCiphertext? = null,
    val preEncryption: org.cryptobiotic.protogen.PreEncryption? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.EncryptedBallotContest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.EncryptedBallotContest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.EncryptedBallotContest> {
        public val defaultInstance: org.cryptobiotic.protogen.EncryptedBallotContest by lazy { org.cryptobiotic.protogen.EncryptedBallotContest() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.EncryptedBallotContest = org.cryptobiotic.protogen.EncryptedBallotContest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.EncryptedBallotContest> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.EncryptedBallotContest, *>>(8)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "contest_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "contestId",
                        value = org.cryptobiotic.protogen.EncryptedBallotContest::contestId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sequence_order",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "sequenceOrder",
                        value = org.cryptobiotic.protogen.EncryptedBallotContest::sequenceOrder
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "votes_allowed",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "votesAllowed",
                        value = org.cryptobiotic.protogen.EncryptedBallotContest::votesAllowed
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "contest_hash",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.UInt256.Companion),
                        jsonName = "contestHash",
                        value = org.cryptobiotic.protogen.EncryptedBallotContest::contestHash
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "selections",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.EncryptedBallotSelection>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.EncryptedBallotSelection.Companion)),
                        jsonName = "selections",
                        value = org.cryptobiotic.protogen.EncryptedBallotContest::selections
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "proof",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ChaumPedersenRangeProofKnownNonce.Companion),
                        jsonName = "proof",
                        value = org.cryptobiotic.protogen.EncryptedBallotContest::proof
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "encrypted_contest_data",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.HashedElGamalCiphertext.Companion),
                        jsonName = "encryptedContestData",
                        value = org.cryptobiotic.protogen.EncryptedBallotContest::encryptedContestData
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "pre_encryption",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.PreEncryption.Companion),
                        jsonName = "preEncryption",
                        value = org.cryptobiotic.protogen.EncryptedBallotContest::preEncryption
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "EncryptedBallotContest",
                messageClass = org.cryptobiotic.protogen.EncryptedBallotContest::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class EncryptedBallotSelection(
    val selectionId: String = "",
    val sequenceOrder: Int = 0,
    val encryptedVote: org.cryptobiotic.protogen.ElGamalCiphertext? = null,
    val proof: org.cryptobiotic.protogen.ChaumPedersenRangeProofKnownNonce? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.EncryptedBallotSelection = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.EncryptedBallotSelection> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.EncryptedBallotSelection> {
        public val defaultInstance: org.cryptobiotic.protogen.EncryptedBallotSelection by lazy { org.cryptobiotic.protogen.EncryptedBallotSelection() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.EncryptedBallotSelection = org.cryptobiotic.protogen.EncryptedBallotSelection.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.EncryptedBallotSelection> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.EncryptedBallotSelection, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "selection_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "selectionId",
                        value = org.cryptobiotic.protogen.EncryptedBallotSelection::selectionId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sequence_order",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "sequenceOrder",
                        value = org.cryptobiotic.protogen.EncryptedBallotSelection::sequenceOrder
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "encrypted_vote",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ElGamalCiphertext.Companion),
                        jsonName = "encryptedVote",
                        value = org.cryptobiotic.protogen.EncryptedBallotSelection::encryptedVote
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "proof",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ChaumPedersenRangeProofKnownNonce.Companion),
                        jsonName = "proof",
                        value = org.cryptobiotic.protogen.EncryptedBallotSelection::proof
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "EncryptedBallotSelection",
                messageClass = org.cryptobiotic.protogen.EncryptedBallotSelection::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class ChaumPedersenRangeProofKnownNonce(
    val proofs: List<org.cryptobiotic.protogen.ChaumPedersenProof> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.ChaumPedersenRangeProofKnownNonce = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ChaumPedersenRangeProofKnownNonce> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.ChaumPedersenRangeProofKnownNonce> {
        public val defaultInstance: org.cryptobiotic.protogen.ChaumPedersenRangeProofKnownNonce by lazy { org.cryptobiotic.protogen.ChaumPedersenRangeProofKnownNonce() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.ChaumPedersenRangeProofKnownNonce = org.cryptobiotic.protogen.ChaumPedersenRangeProofKnownNonce.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ChaumPedersenRangeProofKnownNonce> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.ChaumPedersenRangeProofKnownNonce, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "proofs",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.ChaumPedersenProof>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ChaumPedersenProof.Companion)),
                        jsonName = "proofs",
                        value = org.cryptobiotic.protogen.ChaumPedersenRangeProofKnownNonce::proofs
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ChaumPedersenRangeProofKnownNonce",
                messageClass = org.cryptobiotic.protogen.ChaumPedersenRangeProofKnownNonce::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class PreEncryption(
    val preencryptionHash: org.cryptobiotic.protogen.UInt256? = null,
    val allSelectionHashes: List<org.cryptobiotic.protogen.UInt256> = emptyList(),
    val selectedVectors: List<org.cryptobiotic.protogen.SelectionVector> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.PreEncryption = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.PreEncryption> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.PreEncryption> {
        public val defaultInstance: org.cryptobiotic.protogen.PreEncryption by lazy { org.cryptobiotic.protogen.PreEncryption() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.PreEncryption = org.cryptobiotic.protogen.PreEncryption.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.PreEncryption> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.PreEncryption, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "preencryption_hash",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.UInt256.Companion),
                        jsonName = "preencryptionHash",
                        value = org.cryptobiotic.protogen.PreEncryption::preencryptionHash
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "all_selection_hashes",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.UInt256>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.UInt256.Companion)),
                        jsonName = "allSelectionHashes",
                        value = org.cryptobiotic.protogen.PreEncryption::allSelectionHashes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "selected_vectors",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.SelectionVector>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.SelectionVector.Companion)),
                        jsonName = "selectedVectors",
                        value = org.cryptobiotic.protogen.PreEncryption::selectedVectors
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "PreEncryption",
                messageClass = org.cryptobiotic.protogen.PreEncryption::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class SelectionVector(
    val selectionHash: org.cryptobiotic.protogen.UInt256? = null,
    val shortCode: String = "",
    val encryptions: List<org.cryptobiotic.protogen.ElGamalCiphertext> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.SelectionVector = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.SelectionVector> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.SelectionVector> {
        public val defaultInstance: org.cryptobiotic.protogen.SelectionVector by lazy { org.cryptobiotic.protogen.SelectionVector() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.SelectionVector = org.cryptobiotic.protogen.SelectionVector.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.SelectionVector> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.SelectionVector, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "selection_hash",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.UInt256.Companion),
                        jsonName = "selectionHash",
                        value = org.cryptobiotic.protogen.SelectionVector::selectionHash
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "short_code",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "shortCode",
                        value = org.cryptobiotic.protogen.SelectionVector::shortCode
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "encryptions",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.ElGamalCiphertext>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ElGamalCiphertext.Companion)),
                        jsonName = "encryptions",
                        value = org.cryptobiotic.protogen.SelectionVector::encryptions
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "SelectionVector",
                messageClass = org.cryptobiotic.protogen.SelectionVector::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForEncryptedBallot")
public fun EncryptedBallot?.orDefault(): org.cryptobiotic.protogen.EncryptedBallot = this ?: EncryptedBallot.defaultInstance

private fun EncryptedBallot.protoMergeImpl(plus: pbandk.Message?): EncryptedBallot = (plus as? EncryptedBallot)?.let {
    it.copy(
        confirmationCode = confirmationCode?.plus(plus.confirmationCode) ?: plus.confirmationCode,
        electionId = electionId?.plus(plus.electionId) ?: plus.electionId,
        contests = contests + plus.contests,
        encryptedSn = encryptedSn?.plus(plus.encryptedSn) ?: plus.encryptedSn,
        primaryNonce = primaryNonce?.plus(plus.primaryNonce) ?: plus.primaryNonce,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EncryptedBallot.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EncryptedBallot {
    var ballotId = ""
    var ballotStyleId = ""
    var encryptingDevice = ""
    var timestamp = 0L
    var codeBaux: pbandk.ByteArr = pbandk.ByteArr.empty
    var confirmationCode: org.cryptobiotic.protogen.UInt256? = null
    var electionId: org.cryptobiotic.protogen.UInt256? = null
    var contests: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.EncryptedBallotContest>? = null
    var state: org.cryptobiotic.protogen.EncryptedBallot.BallotState = org.cryptobiotic.protogen.EncryptedBallot.BallotState.fromValue(0)
    var encryptedSn: org.cryptobiotic.protogen.ElGamalCiphertext? = null
    var isPreencrypt = false
    var primaryNonce: org.cryptobiotic.protogen.UInt256? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ballotId = _fieldValue as String
            2 -> ballotStyleId = _fieldValue as String
            3 -> encryptingDevice = _fieldValue as String
            4 -> timestamp = _fieldValue as Long
            5 -> codeBaux = _fieldValue as pbandk.ByteArr
            6 -> confirmationCode = _fieldValue as org.cryptobiotic.protogen.UInt256
            7 -> contests = (contests ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.EncryptedBallotContest> }
            8 -> state = _fieldValue as org.cryptobiotic.protogen.EncryptedBallot.BallotState
            9 -> isPreencrypt = _fieldValue as Boolean
            10 -> primaryNonce = _fieldValue as org.cryptobiotic.protogen.UInt256
            11 -> electionId = _fieldValue as org.cryptobiotic.protogen.UInt256
            12 -> encryptedSn = _fieldValue as org.cryptobiotic.protogen.ElGamalCiphertext
        }
    }

    return EncryptedBallot(ballotId, ballotStyleId, encryptingDevice, timestamp,
        codeBaux, confirmationCode, electionId, pbandk.ListWithSize.Builder.fixed(contests),
        state, encryptedSn, isPreencrypt, primaryNonce, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEncryptedBallotContest")
public fun EncryptedBallotContest?.orDefault(): org.cryptobiotic.protogen.EncryptedBallotContest = this ?: EncryptedBallotContest.defaultInstance

private fun EncryptedBallotContest.protoMergeImpl(plus: pbandk.Message?): EncryptedBallotContest = (plus as? EncryptedBallotContest)?.let {
    it.copy(
        contestHash = contestHash?.plus(plus.contestHash) ?: plus.contestHash,
        selections = selections + plus.selections,
        proof = proof?.plus(plus.proof) ?: plus.proof,
        encryptedContestData = encryptedContestData?.plus(plus.encryptedContestData) ?: plus.encryptedContestData,
        preEncryption = preEncryption?.plus(plus.preEncryption) ?: plus.preEncryption,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EncryptedBallotContest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EncryptedBallotContest {
    var contestId = ""
    var sequenceOrder = 0
    var votesAllowed = 0
    var contestHash: org.cryptobiotic.protogen.UInt256? = null
    var selections: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.EncryptedBallotSelection>? = null
    var proof: org.cryptobiotic.protogen.ChaumPedersenRangeProofKnownNonce? = null
    var encryptedContestData: org.cryptobiotic.protogen.HashedElGamalCiphertext? = null
    var preEncryption: org.cryptobiotic.protogen.PreEncryption? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> contestId = _fieldValue as String
            2 -> sequenceOrder = _fieldValue as Int
            3 -> votesAllowed = _fieldValue as Int
            4 -> contestHash = _fieldValue as org.cryptobiotic.protogen.UInt256
            5 -> selections = (selections ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.EncryptedBallotSelection> }
            6 -> proof = _fieldValue as org.cryptobiotic.protogen.ChaumPedersenRangeProofKnownNonce
            7 -> encryptedContestData = _fieldValue as org.cryptobiotic.protogen.HashedElGamalCiphertext
            8 -> preEncryption = _fieldValue as org.cryptobiotic.protogen.PreEncryption
        }
    }

    return EncryptedBallotContest(contestId, sequenceOrder, votesAllowed, contestHash,
        pbandk.ListWithSize.Builder.fixed(selections), proof, encryptedContestData, preEncryption, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEncryptedBallotSelection")
public fun EncryptedBallotSelection?.orDefault(): org.cryptobiotic.protogen.EncryptedBallotSelection = this ?: EncryptedBallotSelection.defaultInstance

private fun EncryptedBallotSelection.protoMergeImpl(plus: pbandk.Message?): EncryptedBallotSelection = (plus as? EncryptedBallotSelection)?.let {
    it.copy(
        encryptedVote = encryptedVote?.plus(plus.encryptedVote) ?: plus.encryptedVote,
        proof = proof?.plus(plus.proof) ?: plus.proof,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EncryptedBallotSelection.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EncryptedBallotSelection {
    var selectionId = ""
    var sequenceOrder = 0
    var encryptedVote: org.cryptobiotic.protogen.ElGamalCiphertext? = null
    var proof: org.cryptobiotic.protogen.ChaumPedersenRangeProofKnownNonce? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> selectionId = _fieldValue as String
            2 -> sequenceOrder = _fieldValue as Int
            3 -> encryptedVote = _fieldValue as org.cryptobiotic.protogen.ElGamalCiphertext
            4 -> proof = _fieldValue as org.cryptobiotic.protogen.ChaumPedersenRangeProofKnownNonce
        }
    }

    return EncryptedBallotSelection(selectionId, sequenceOrder, encryptedVote, proof, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForChaumPedersenRangeProofKnownNonce")
public fun ChaumPedersenRangeProofKnownNonce?.orDefault(): org.cryptobiotic.protogen.ChaumPedersenRangeProofKnownNonce = this ?: ChaumPedersenRangeProofKnownNonce.defaultInstance

private fun ChaumPedersenRangeProofKnownNonce.protoMergeImpl(plus: pbandk.Message?): ChaumPedersenRangeProofKnownNonce = (plus as? ChaumPedersenRangeProofKnownNonce)?.let {
    it.copy(
        proofs = proofs + plus.proofs,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ChaumPedersenRangeProofKnownNonce.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ChaumPedersenRangeProofKnownNonce {
    var proofs: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.ChaumPedersenProof>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> proofs = (proofs ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.ChaumPedersenProof> }
        }
    }

    return ChaumPedersenRangeProofKnownNonce(pbandk.ListWithSize.Builder.fixed(proofs), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPreEncryption")
public fun PreEncryption?.orDefault(): org.cryptobiotic.protogen.PreEncryption = this ?: PreEncryption.defaultInstance

private fun PreEncryption.protoMergeImpl(plus: pbandk.Message?): PreEncryption = (plus as? PreEncryption)?.let {
    it.copy(
        preencryptionHash = preencryptionHash?.plus(plus.preencryptionHash) ?: plus.preencryptionHash,
        allSelectionHashes = allSelectionHashes + plus.allSelectionHashes,
        selectedVectors = selectedVectors + plus.selectedVectors,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PreEncryption.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PreEncryption {
    var preencryptionHash: org.cryptobiotic.protogen.UInt256? = null
    var allSelectionHashes: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.UInt256>? = null
    var selectedVectors: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.SelectionVector>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> preencryptionHash = _fieldValue as org.cryptobiotic.protogen.UInt256
            2 -> allSelectionHashes = (allSelectionHashes ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.UInt256> }
            3 -> selectedVectors = (selectedVectors ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.SelectionVector> }
        }
    }

    return PreEncryption(preencryptionHash, pbandk.ListWithSize.Builder.fixed(allSelectionHashes), pbandk.ListWithSize.Builder.fixed(selectedVectors), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSelectionVector")
public fun SelectionVector?.orDefault(): org.cryptobiotic.protogen.SelectionVector = this ?: SelectionVector.defaultInstance

private fun SelectionVector.protoMergeImpl(plus: pbandk.Message?): SelectionVector = (plus as? SelectionVector)?.let {
    it.copy(
        selectionHash = selectionHash?.plus(plus.selectionHash) ?: plus.selectionHash,
        encryptions = encryptions + plus.encryptions,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SelectionVector.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SelectionVector {
    var selectionHash: org.cryptobiotic.protogen.UInt256? = null
    var shortCode = ""
    var encryptions: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.ElGamalCiphertext>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> selectionHash = _fieldValue as org.cryptobiotic.protogen.UInt256
            2 -> shortCode = _fieldValue as String
            3 -> encryptions = (encryptions ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.ElGamalCiphertext> }
        }
    }

    return SelectionVector(selectionHash, shortCode, pbandk.ListWithSize.Builder.fixed(encryptions), unknownFields)
}
