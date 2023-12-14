@file:OptIn(pbandk.PublicForGeneratedCode::class)

package org.cryptobiotic.protogen

@pbandk.Export
public data class PlaintextBallot(
    val ballotId: String = "",
    val ballotStyleId: String = "",
    val contests: List<org.cryptobiotic.protogen.PlaintextBallotContest> = emptyList(),
    val sn: Long = 0L,
    val errors: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.PlaintextBallot = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.PlaintextBallot> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.PlaintextBallot> {
        public val defaultInstance: org.cryptobiotic.protogen.PlaintextBallot by lazy { org.cryptobiotic.protogen.PlaintextBallot() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.PlaintextBallot = org.cryptobiotic.protogen.PlaintextBallot.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.PlaintextBallot> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.PlaintextBallot, *>>(5)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ballot_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "ballotId",
                        value = org.cryptobiotic.protogen.PlaintextBallot::ballotId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ballot_style_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "ballotStyleId",
                        value = org.cryptobiotic.protogen.PlaintextBallot::ballotStyleId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "contests",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.PlaintextBallotContest>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.PlaintextBallotContest.Companion)),
                        jsonName = "contests",
                        value = org.cryptobiotic.protogen.PlaintextBallot::contests
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "errors",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "errors",
                        value = org.cryptobiotic.protogen.PlaintextBallot::errors
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sn",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "sn",
                        value = org.cryptobiotic.protogen.PlaintextBallot::sn
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "PlaintextBallot",
                messageClass = org.cryptobiotic.protogen.PlaintextBallot::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class PlaintextBallotContest(
    val contestId: String = "",
    val sequenceOrder: Int = 0,
    val selections: List<org.cryptobiotic.protogen.PlaintextBallotSelection> = emptyList(),
    val writeIns: List<String> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.PlaintextBallotContest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.PlaintextBallotContest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.PlaintextBallotContest> {
        public val defaultInstance: org.cryptobiotic.protogen.PlaintextBallotContest by lazy { org.cryptobiotic.protogen.PlaintextBallotContest() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.PlaintextBallotContest = org.cryptobiotic.protogen.PlaintextBallotContest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.PlaintextBallotContest> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.PlaintextBallotContest, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "contest_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "contestId",
                        value = org.cryptobiotic.protogen.PlaintextBallotContest::contestId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sequence_order",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "sequenceOrder",
                        value = org.cryptobiotic.protogen.PlaintextBallotContest::sequenceOrder
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "selections",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.PlaintextBallotSelection>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.PlaintextBallotSelection.Companion)),
                        jsonName = "selections",
                        value = org.cryptobiotic.protogen.PlaintextBallotContest::selections
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "write_ins",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "writeIns",
                        value = org.cryptobiotic.protogen.PlaintextBallotContest::writeIns
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "PlaintextBallotContest",
                messageClass = org.cryptobiotic.protogen.PlaintextBallotContest::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class PlaintextBallotSelection(
    val selectionId: String = "",
    val sequenceOrder: Int = 0,
    val vote: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.PlaintextBallotSelection = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.PlaintextBallotSelection> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.PlaintextBallotSelection> {
        public val defaultInstance: org.cryptobiotic.protogen.PlaintextBallotSelection by lazy { org.cryptobiotic.protogen.PlaintextBallotSelection() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.PlaintextBallotSelection = org.cryptobiotic.protogen.PlaintextBallotSelection.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.PlaintextBallotSelection> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.PlaintextBallotSelection, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "selection_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "selectionId",
                        value = org.cryptobiotic.protogen.PlaintextBallotSelection::selectionId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sequence_order",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "sequenceOrder",
                        value = org.cryptobiotic.protogen.PlaintextBallotSelection::sequenceOrder
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "vote",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "vote",
                        value = org.cryptobiotic.protogen.PlaintextBallotSelection::vote
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "PlaintextBallotSelection",
                messageClass = org.cryptobiotic.protogen.PlaintextBallotSelection::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlaintextBallot")
public fun PlaintextBallot?.orDefault(): org.cryptobiotic.protogen.PlaintextBallot = this ?: PlaintextBallot.defaultInstance

private fun PlaintextBallot.protoMergeImpl(plus: pbandk.Message?): PlaintextBallot = (plus as? PlaintextBallot)?.let {
    it.copy(
        contests = contests + plus.contests,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlaintextBallot.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlaintextBallot {
    var ballotId = ""
    var ballotStyleId = ""
    var contests: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.PlaintextBallotContest>? = null
    var sn = 0L
    var errors = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ballotId = _fieldValue as String
            2 -> ballotStyleId = _fieldValue as String
            3 -> contests = (contests ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.PlaintextBallotContest> }
            4 -> errors = _fieldValue as String
            5 -> sn = _fieldValue as Long
        }
    }

    return PlaintextBallot(ballotId, ballotStyleId, pbandk.ListWithSize.Builder.fixed(contests), sn,
        errors, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlaintextBallotContest")
public fun PlaintextBallotContest?.orDefault(): org.cryptobiotic.protogen.PlaintextBallotContest = this ?: PlaintextBallotContest.defaultInstance

private fun PlaintextBallotContest.protoMergeImpl(plus: pbandk.Message?): PlaintextBallotContest = (plus as? PlaintextBallotContest)?.let {
    it.copy(
        selections = selections + plus.selections,
        writeIns = writeIns + plus.writeIns,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlaintextBallotContest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlaintextBallotContest {
    var contestId = ""
    var sequenceOrder = 0
    var selections: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.PlaintextBallotSelection>? = null
    var writeIns: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> contestId = _fieldValue as String
            2 -> sequenceOrder = _fieldValue as Int
            3 -> selections = (selections ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.PlaintextBallotSelection> }
            4 -> writeIns = (writeIns ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
        }
    }

    return PlaintextBallotContest(contestId, sequenceOrder, pbandk.ListWithSize.Builder.fixed(selections), pbandk.ListWithSize.Builder.fixed(writeIns), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPlaintextBallotSelection")
public fun PlaintextBallotSelection?.orDefault(): org.cryptobiotic.protogen.PlaintextBallotSelection = this ?: PlaintextBallotSelection.defaultInstance

private fun PlaintextBallotSelection.protoMergeImpl(plus: pbandk.Message?): PlaintextBallotSelection = (plus as? PlaintextBallotSelection)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PlaintextBallotSelection.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PlaintextBallotSelection {
    var selectionId = ""
    var sequenceOrder = 0
    var vote = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> selectionId = _fieldValue as String
            2 -> sequenceOrder = _fieldValue as Int
            3 -> vote = _fieldValue as Int
        }
    }

    return PlaintextBallotSelection(selectionId, sequenceOrder, vote, unknownFields)
}
