@file:OptIn(pbandk.PublicForGeneratedCode::class)

package org.cryptobiotic.protogen

@pbandk.Export
public data class EncryptedTally(
    val tallyId: String = "",
    val contests: List<org.cryptobiotic.protogen.EncryptedTallyContest> = emptyList(),
    val castBallotIds: List<String> = emptyList(),
    val electionId: org.cryptobiotic.protogen.UInt256? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.EncryptedTally = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.EncryptedTally> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.EncryptedTally> {
        public val defaultInstance: org.cryptobiotic.protogen.EncryptedTally by lazy { org.cryptobiotic.protogen.EncryptedTally() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.EncryptedTally = org.cryptobiotic.protogen.EncryptedTally.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.EncryptedTally> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.EncryptedTally, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tally_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "tallyId",
                        value = org.cryptobiotic.protogen.EncryptedTally::tallyId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "contests",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.EncryptedTallyContest>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.EncryptedTallyContest.Companion)),
                        jsonName = "contests",
                        value = org.cryptobiotic.protogen.EncryptedTally::contests
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "cast_ballot_ids",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "castBallotIds",
                        value = org.cryptobiotic.protogen.EncryptedTally::castBallotIds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "election_id",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.UInt256.Companion),
                        jsonName = "electionId",
                        value = org.cryptobiotic.protogen.EncryptedTally::electionId
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "EncryptedTally",
                messageClass = org.cryptobiotic.protogen.EncryptedTally::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class EncryptedTallyContest(
    val contestId: String = "",
    val sequenceOrder: Int = 0,
    val selections: List<org.cryptobiotic.protogen.EncryptedTallySelection> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.EncryptedTallyContest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.EncryptedTallyContest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.EncryptedTallyContest> {
        public val defaultInstance: org.cryptobiotic.protogen.EncryptedTallyContest by lazy { org.cryptobiotic.protogen.EncryptedTallyContest() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.EncryptedTallyContest = org.cryptobiotic.protogen.EncryptedTallyContest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.EncryptedTallyContest> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.EncryptedTallyContest, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "contest_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "contestId",
                        value = org.cryptobiotic.protogen.EncryptedTallyContest::contestId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sequence_order",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "sequenceOrder",
                        value = org.cryptobiotic.protogen.EncryptedTallyContest::sequenceOrder
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "selections",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.EncryptedTallySelection>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.EncryptedTallySelection.Companion)),
                        jsonName = "selections",
                        value = org.cryptobiotic.protogen.EncryptedTallyContest::selections
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "EncryptedTallyContest",
                messageClass = org.cryptobiotic.protogen.EncryptedTallyContest::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class EncryptedTallySelection(
    val selectionId: String = "",
    val sequenceOrder: Int = 0,
    val encryptedVote: org.cryptobiotic.protogen.ElGamalCiphertext? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.EncryptedTallySelection = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.EncryptedTallySelection> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.EncryptedTallySelection> {
        public val defaultInstance: org.cryptobiotic.protogen.EncryptedTallySelection by lazy { org.cryptobiotic.protogen.EncryptedTallySelection() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.EncryptedTallySelection = org.cryptobiotic.protogen.EncryptedTallySelection.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.EncryptedTallySelection> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.EncryptedTallySelection, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "selection_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "selectionId",
                        value = org.cryptobiotic.protogen.EncryptedTallySelection::selectionId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sequence_order",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "sequenceOrder",
                        value = org.cryptobiotic.protogen.EncryptedTallySelection::sequenceOrder
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "encrypted_vote",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ElGamalCiphertext.Companion),
                        jsonName = "encryptedVote",
                        value = org.cryptobiotic.protogen.EncryptedTallySelection::encryptedVote
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "EncryptedTallySelection",
                messageClass = org.cryptobiotic.protogen.EncryptedTallySelection::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForEncryptedTally")
public fun EncryptedTally?.orDefault(): org.cryptobiotic.protogen.EncryptedTally = this ?: EncryptedTally.defaultInstance

private fun EncryptedTally.protoMergeImpl(plus: pbandk.Message?): EncryptedTally = (plus as? EncryptedTally)?.let {
    it.copy(
        contests = contests + plus.contests,
        castBallotIds = castBallotIds + plus.castBallotIds,
        electionId = electionId?.plus(plus.electionId) ?: plus.electionId,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EncryptedTally.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EncryptedTally {
    var tallyId = ""
    var contests: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.EncryptedTallyContest>? = null
    var castBallotIds: pbandk.ListWithSize.Builder<String>? = null
    var electionId: org.cryptobiotic.protogen.UInt256? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> tallyId = _fieldValue as String
            2 -> contests = (contests ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.EncryptedTallyContest> }
            3 -> castBallotIds = (castBallotIds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            11 -> electionId = _fieldValue as org.cryptobiotic.protogen.UInt256
        }
    }

    return EncryptedTally(tallyId, pbandk.ListWithSize.Builder.fixed(contests), pbandk.ListWithSize.Builder.fixed(castBallotIds), electionId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEncryptedTallyContest")
public fun EncryptedTallyContest?.orDefault(): org.cryptobiotic.protogen.EncryptedTallyContest = this ?: EncryptedTallyContest.defaultInstance

private fun EncryptedTallyContest.protoMergeImpl(plus: pbandk.Message?): EncryptedTallyContest = (plus as? EncryptedTallyContest)?.let {
    it.copy(
        selections = selections + plus.selections,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EncryptedTallyContest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EncryptedTallyContest {
    var contestId = ""
    var sequenceOrder = 0
    var selections: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.EncryptedTallySelection>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> contestId = _fieldValue as String
            2 -> sequenceOrder = _fieldValue as Int
            3 -> selections = (selections ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.EncryptedTallySelection> }
        }
    }

    return EncryptedTallyContest(contestId, sequenceOrder, pbandk.ListWithSize.Builder.fixed(selections), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEncryptedTallySelection")
public fun EncryptedTallySelection?.orDefault(): org.cryptobiotic.protogen.EncryptedTallySelection = this ?: EncryptedTallySelection.defaultInstance

private fun EncryptedTallySelection.protoMergeImpl(plus: pbandk.Message?): EncryptedTallySelection = (plus as? EncryptedTallySelection)?.let {
    it.copy(
        encryptedVote = encryptedVote?.plus(plus.encryptedVote) ?: plus.encryptedVote,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EncryptedTallySelection.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EncryptedTallySelection {
    var selectionId = ""
    var sequenceOrder = 0
    var encryptedVote: org.cryptobiotic.protogen.ElGamalCiphertext? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> selectionId = _fieldValue as String
            2 -> sequenceOrder = _fieldValue as Int
            3 -> encryptedVote = _fieldValue as org.cryptobiotic.protogen.ElGamalCiphertext
        }
    }

    return EncryptedTallySelection(selectionId, sequenceOrder, encryptedVote, unknownFields)
}
