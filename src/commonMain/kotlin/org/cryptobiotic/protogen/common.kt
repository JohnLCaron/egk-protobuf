@file:OptIn(pbandk.PublicForGeneratedCode::class)

package org.cryptobiotic.protogen

@pbandk.Export
public data class ContestData(
    val status: org.cryptobiotic.protogen.ContestData.Status = org.cryptobiotic.protogen.ContestData.Status.fromValue(0),
    val overVotes: List<Int> = emptyList(),
    val writeIns: List<String> = emptyList(),
    val filler: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.ContestData = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ContestData> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.ContestData> {
        public val defaultInstance: org.cryptobiotic.protogen.ContestData by lazy { org.cryptobiotic.protogen.ContestData() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.ContestData = org.cryptobiotic.protogen.ContestData.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ContestData> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.ContestData, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "status",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = org.cryptobiotic.protogen.ContestData.Status.Companion),
                        jsonName = "status",
                        value = org.cryptobiotic.protogen.ContestData::status
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "over_votes",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32(), packed = true),
                        jsonName = "overVotes",
                        value = org.cryptobiotic.protogen.ContestData::overVotes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "write_ins",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "writeIns",
                        value = org.cryptobiotic.protogen.ContestData::writeIns
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "filler",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "filler",
                        value = org.cryptobiotic.protogen.ContestData::filler
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ContestData",
                messageClass = org.cryptobiotic.protogen.ContestData::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed class Status(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is ContestData.Status && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "ContestData.Status.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object NORMAL : Status(0, "normal")
        public object NULL_VOTE : Status(1, "null_vote")
        public object OVER_VOTE : Status(2, "over_vote")
        public object UNDER_VOTE : Status(3, "under_vote")
        public class UNRECOGNIZED(value: Int) : Status(value)

        public companion object : pbandk.Message.Enum.Companion<ContestData.Status> {
            public val values: List<ContestData.Status> by lazy { listOf(NORMAL, NULL_VOTE, OVER_VOTE, UNDER_VOTE) }
            override fun fromValue(value: Int): ContestData.Status = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): ContestData.Status = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Status with name: $name")
        }
    }
}

@pbandk.Export
public data class ElementModP(
    val value: pbandk.ByteArr = pbandk.ByteArr.empty,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.ElementModP = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ElementModP> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.ElementModP> {
        public val defaultInstance: org.cryptobiotic.protogen.ElementModP by lazy { org.cryptobiotic.protogen.ElementModP() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.ElementModP = org.cryptobiotic.protogen.ElementModP.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ElementModP> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.ElementModP, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "value",
                        value = org.cryptobiotic.protogen.ElementModP::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ElementModP",
                messageClass = org.cryptobiotic.protogen.ElementModP::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class ElementModQ(
    val value: pbandk.ByteArr = pbandk.ByteArr.empty,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.ElementModQ = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ElementModQ> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.ElementModQ> {
        public val defaultInstance: org.cryptobiotic.protogen.ElementModQ by lazy { org.cryptobiotic.protogen.ElementModQ() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.ElementModQ = org.cryptobiotic.protogen.ElementModQ.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ElementModQ> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.ElementModQ, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "value",
                        value = org.cryptobiotic.protogen.ElementModQ::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ElementModQ",
                messageClass = org.cryptobiotic.protogen.ElementModQ::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class ElGamalCiphertext(
    val pad: org.cryptobiotic.protogen.ElementModP? = null,
    val data: org.cryptobiotic.protogen.ElementModP? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.ElGamalCiphertext = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ElGamalCiphertext> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.ElGamalCiphertext> {
        public val defaultInstance: org.cryptobiotic.protogen.ElGamalCiphertext by lazy { org.cryptobiotic.protogen.ElGamalCiphertext() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.ElGamalCiphertext = org.cryptobiotic.protogen.ElGamalCiphertext.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ElGamalCiphertext> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.ElGamalCiphertext, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "pad",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ElementModP.Companion),
                        jsonName = "pad",
                        value = org.cryptobiotic.protogen.ElGamalCiphertext::pad
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "data",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ElementModP.Companion),
                        jsonName = "data",
                        value = org.cryptobiotic.protogen.ElGamalCiphertext::data
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ElGamalCiphertext",
                messageClass = org.cryptobiotic.protogen.ElGamalCiphertext::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class ChaumPedersenProof(
    val challenge: org.cryptobiotic.protogen.ElementModQ? = null,
    val response: org.cryptobiotic.protogen.ElementModQ? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.ChaumPedersenProof = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ChaumPedersenProof> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.ChaumPedersenProof> {
        public val defaultInstance: org.cryptobiotic.protogen.ChaumPedersenProof by lazy { org.cryptobiotic.protogen.ChaumPedersenProof() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.ChaumPedersenProof = org.cryptobiotic.protogen.ChaumPedersenProof.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ChaumPedersenProof> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.ChaumPedersenProof, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "challenge",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ElementModQ.Companion),
                        jsonName = "challenge",
                        value = org.cryptobiotic.protogen.ChaumPedersenProof::challenge
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "response",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ElementModQ.Companion),
                        jsonName = "response",
                        value = org.cryptobiotic.protogen.ChaumPedersenProof::response
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ChaumPedersenProof",
                messageClass = org.cryptobiotic.protogen.ChaumPedersenProof::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class HashedElGamalCiphertext(
    val c0: org.cryptobiotic.protogen.ElementModP? = null,
    val c1: pbandk.ByteArr = pbandk.ByteArr.empty,
    val c2: org.cryptobiotic.protogen.UInt256? = null,
    val numBytes: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.HashedElGamalCiphertext = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.HashedElGamalCiphertext> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.HashedElGamalCiphertext> {
        public val defaultInstance: org.cryptobiotic.protogen.HashedElGamalCiphertext by lazy { org.cryptobiotic.protogen.HashedElGamalCiphertext() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.HashedElGamalCiphertext = org.cryptobiotic.protogen.HashedElGamalCiphertext.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.HashedElGamalCiphertext> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.HashedElGamalCiphertext, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "c0",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ElementModP.Companion),
                        jsonName = "c0",
                        value = org.cryptobiotic.protogen.HashedElGamalCiphertext::c0
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "c1",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "c1",
                        value = org.cryptobiotic.protogen.HashedElGamalCiphertext::c1
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "c2",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.UInt256.Companion),
                        jsonName = "c2",
                        value = org.cryptobiotic.protogen.HashedElGamalCiphertext::c2
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "numBytes",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "numBytes",
                        value = org.cryptobiotic.protogen.HashedElGamalCiphertext::numBytes
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "HashedElGamalCiphertext",
                messageClass = org.cryptobiotic.protogen.HashedElGamalCiphertext::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class SchnorrProof(
    val publicKey: org.cryptobiotic.protogen.ElementModP? = null,
    val challenge: org.cryptobiotic.protogen.ElementModQ? = null,
    val response: org.cryptobiotic.protogen.ElementModQ? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.SchnorrProof = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.SchnorrProof> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.SchnorrProof> {
        public val defaultInstance: org.cryptobiotic.protogen.SchnorrProof by lazy { org.cryptobiotic.protogen.SchnorrProof() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.SchnorrProof = org.cryptobiotic.protogen.SchnorrProof.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.SchnorrProof> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.SchnorrProof, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "public_key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ElementModP.Companion),
                        jsonName = "publicKey",
                        value = org.cryptobiotic.protogen.SchnorrProof::publicKey
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "challenge",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ElementModQ.Companion),
                        jsonName = "challenge",
                        value = org.cryptobiotic.protogen.SchnorrProof::challenge
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "response",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ElementModQ.Companion),
                        jsonName = "response",
                        value = org.cryptobiotic.protogen.SchnorrProof::response
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "SchnorrProof",
                messageClass = org.cryptobiotic.protogen.SchnorrProof::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class UInt256(
    val value: pbandk.ByteArr = pbandk.ByteArr.empty,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.UInt256 = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.UInt256> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.UInt256> {
        public val defaultInstance: org.cryptobiotic.protogen.UInt256 by lazy { org.cryptobiotic.protogen.UInt256() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.UInt256 = org.cryptobiotic.protogen.UInt256.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.UInt256> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.UInt256, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "value",
                        value = org.cryptobiotic.protogen.UInt256::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "UInt256",
                messageClass = org.cryptobiotic.protogen.UInt256::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForContestData")
public fun ContestData?.orDefault(): org.cryptobiotic.protogen.ContestData = this ?: ContestData.defaultInstance

private fun ContestData.protoMergeImpl(plus: pbandk.Message?): ContestData = (plus as? ContestData)?.let {
    it.copy(
        overVotes = overVotes + plus.overVotes,
        writeIns = writeIns + plus.writeIns,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ContestData.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ContestData {
    var status: org.cryptobiotic.protogen.ContestData.Status = org.cryptobiotic.protogen.ContestData.Status.fromValue(0)
    var overVotes: pbandk.ListWithSize.Builder<Int>? = null
    var writeIns: pbandk.ListWithSize.Builder<String>? = null
    var filler = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> status = _fieldValue as org.cryptobiotic.protogen.ContestData.Status
            2 -> overVotes = (overVotes ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
            3 -> writeIns = (writeIns ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            4 -> filler = _fieldValue as String
        }
    }

    return ContestData(status, pbandk.ListWithSize.Builder.fixed(overVotes), pbandk.ListWithSize.Builder.fixed(writeIns), filler, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForElementModP")
public fun ElementModP?.orDefault(): org.cryptobiotic.protogen.ElementModP = this ?: ElementModP.defaultInstance

private fun ElementModP.protoMergeImpl(plus: pbandk.Message?): ElementModP = (plus as? ElementModP)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ElementModP.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ElementModP {
    var value: pbandk.ByteArr = pbandk.ByteArr.empty

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as pbandk.ByteArr
        }
    }

    return ElementModP(value, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForElementModQ")
public fun ElementModQ?.orDefault(): org.cryptobiotic.protogen.ElementModQ = this ?: ElementModQ.defaultInstance

private fun ElementModQ.protoMergeImpl(plus: pbandk.Message?): ElementModQ = (plus as? ElementModQ)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ElementModQ.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ElementModQ {
    var value: pbandk.ByteArr = pbandk.ByteArr.empty

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as pbandk.ByteArr
        }
    }

    return ElementModQ(value, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForElGamalCiphertext")
public fun ElGamalCiphertext?.orDefault(): org.cryptobiotic.protogen.ElGamalCiphertext = this ?: ElGamalCiphertext.defaultInstance

private fun ElGamalCiphertext.protoMergeImpl(plus: pbandk.Message?): ElGamalCiphertext = (plus as? ElGamalCiphertext)?.let {
    it.copy(
        pad = pad?.plus(plus.pad) ?: plus.pad,
        data = data?.plus(plus.data) ?: plus.data,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ElGamalCiphertext.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ElGamalCiphertext {
    var pad: org.cryptobiotic.protogen.ElementModP? = null
    var data: org.cryptobiotic.protogen.ElementModP? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> pad = _fieldValue as org.cryptobiotic.protogen.ElementModP
            2 -> data = _fieldValue as org.cryptobiotic.protogen.ElementModP
        }
    }

    return ElGamalCiphertext(pad, data, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForChaumPedersenProof")
public fun ChaumPedersenProof?.orDefault(): org.cryptobiotic.protogen.ChaumPedersenProof = this ?: ChaumPedersenProof.defaultInstance

private fun ChaumPedersenProof.protoMergeImpl(plus: pbandk.Message?): ChaumPedersenProof = (plus as? ChaumPedersenProof)?.let {
    it.copy(
        challenge = challenge?.plus(plus.challenge) ?: plus.challenge,
        response = response?.plus(plus.response) ?: plus.response,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ChaumPedersenProof.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ChaumPedersenProof {
    var challenge: org.cryptobiotic.protogen.ElementModQ? = null
    var response: org.cryptobiotic.protogen.ElementModQ? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> challenge = _fieldValue as org.cryptobiotic.protogen.ElementModQ
            2 -> response = _fieldValue as org.cryptobiotic.protogen.ElementModQ
        }
    }

    return ChaumPedersenProof(challenge, response, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForHashedElGamalCiphertext")
public fun HashedElGamalCiphertext?.orDefault(): org.cryptobiotic.protogen.HashedElGamalCiphertext = this ?: HashedElGamalCiphertext.defaultInstance

private fun HashedElGamalCiphertext.protoMergeImpl(plus: pbandk.Message?): HashedElGamalCiphertext = (plus as? HashedElGamalCiphertext)?.let {
    it.copy(
        c0 = c0?.plus(plus.c0) ?: plus.c0,
        c2 = c2?.plus(plus.c2) ?: plus.c2,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun HashedElGamalCiphertext.Companion.decodeWithImpl(u: pbandk.MessageDecoder): HashedElGamalCiphertext {
    var c0: org.cryptobiotic.protogen.ElementModP? = null
    var c1: pbandk.ByteArr = pbandk.ByteArr.empty
    var c2: org.cryptobiotic.protogen.UInt256? = null
    var numBytes = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> c0 = _fieldValue as org.cryptobiotic.protogen.ElementModP
            2 -> c1 = _fieldValue as pbandk.ByteArr
            3 -> c2 = _fieldValue as org.cryptobiotic.protogen.UInt256
            4 -> numBytes = _fieldValue as Int
        }
    }

    return HashedElGamalCiphertext(c0, c1, c2, numBytes, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSchnorrProof")
public fun SchnorrProof?.orDefault(): org.cryptobiotic.protogen.SchnorrProof = this ?: SchnorrProof.defaultInstance

private fun SchnorrProof.protoMergeImpl(plus: pbandk.Message?): SchnorrProof = (plus as? SchnorrProof)?.let {
    it.copy(
        publicKey = publicKey?.plus(plus.publicKey) ?: plus.publicKey,
        challenge = challenge?.plus(plus.challenge) ?: plus.challenge,
        response = response?.plus(plus.response) ?: plus.response,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SchnorrProof.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SchnorrProof {
    var publicKey: org.cryptobiotic.protogen.ElementModP? = null
    var challenge: org.cryptobiotic.protogen.ElementModQ? = null
    var response: org.cryptobiotic.protogen.ElementModQ? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> publicKey = _fieldValue as org.cryptobiotic.protogen.ElementModP
            2 -> challenge = _fieldValue as org.cryptobiotic.protogen.ElementModQ
            3 -> response = _fieldValue as org.cryptobiotic.protogen.ElementModQ
        }
    }

    return SchnorrProof(publicKey, challenge, response, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForUInt256")
public fun UInt256?.orDefault(): org.cryptobiotic.protogen.UInt256 = this ?: UInt256.defaultInstance

private fun UInt256.protoMergeImpl(plus: pbandk.Message?): UInt256 = (plus as? UInt256)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UInt256.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UInt256 {
    var value: pbandk.ByteArr = pbandk.ByteArr.empty

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as pbandk.ByteArr
        }
    }

    return UInt256(value, unknownFields)
}
