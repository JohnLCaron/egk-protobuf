@file:OptIn(pbandk.PublicForGeneratedCode::class)

package org.cryptobiotic.protogen

@pbandk.Export
public data class DecryptedTallyOrBallot(
    val id: String = "",
    val contests: List<org.cryptobiotic.protogen.DecryptedContest> = emptyList(),
    val electionId: org.cryptobiotic.protogen.UInt256? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.DecryptedTallyOrBallot = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.DecryptedTallyOrBallot> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.DecryptedTallyOrBallot> {
        public val defaultInstance: org.cryptobiotic.protogen.DecryptedTallyOrBallot by lazy { org.cryptobiotic.protogen.DecryptedTallyOrBallot() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.DecryptedTallyOrBallot = org.cryptobiotic.protogen.DecryptedTallyOrBallot.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.DecryptedTallyOrBallot> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.DecryptedTallyOrBallot, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = org.cryptobiotic.protogen.DecryptedTallyOrBallot::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "contests",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.DecryptedContest>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.DecryptedContest.Companion)),
                        jsonName = "contests",
                        value = org.cryptobiotic.protogen.DecryptedTallyOrBallot::contests
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "election_id",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.UInt256.Companion),
                        jsonName = "electionId",
                        value = org.cryptobiotic.protogen.DecryptedTallyOrBallot::electionId
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "DecryptedTallyOrBallot",
                messageClass = org.cryptobiotic.protogen.DecryptedTallyOrBallot::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class DecryptedContest(
    val contestId: String = "",
    val selections: List<org.cryptobiotic.protogen.DecryptedSelection> = emptyList(),
    val decryptedContestData: org.cryptobiotic.protogen.DecryptedContestData? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.DecryptedContest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.DecryptedContest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.DecryptedContest> {
        public val defaultInstance: org.cryptobiotic.protogen.DecryptedContest by lazy { org.cryptobiotic.protogen.DecryptedContest() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.DecryptedContest = org.cryptobiotic.protogen.DecryptedContest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.DecryptedContest> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.DecryptedContest, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "contest_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "contestId",
                        value = org.cryptobiotic.protogen.DecryptedContest::contestId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "selections",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.DecryptedSelection>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.DecryptedSelection.Companion)),
                        jsonName = "selections",
                        value = org.cryptobiotic.protogen.DecryptedContest::selections
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "decrypted_contest_data",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.DecryptedContestData.Companion),
                        jsonName = "decryptedContestData",
                        value = org.cryptobiotic.protogen.DecryptedContest::decryptedContestData
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "DecryptedContest",
                messageClass = org.cryptobiotic.protogen.DecryptedContest::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class DecryptedSelection(
    val selectionId: String = "",
    val tally: Int = 0,
    val bOverM: org.cryptobiotic.protogen.ElementModP? = null,
    val encryptedVote: org.cryptobiotic.protogen.ElGamalCiphertext? = null,
    val proof: org.cryptobiotic.protogen.ChaumPedersenProof? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.DecryptedSelection = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.DecryptedSelection> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.DecryptedSelection> {
        public val defaultInstance: org.cryptobiotic.protogen.DecryptedSelection by lazy { org.cryptobiotic.protogen.DecryptedSelection() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.DecryptedSelection = org.cryptobiotic.protogen.DecryptedSelection.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.DecryptedSelection> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.DecryptedSelection, *>>(5)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "selection_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "selectionId",
                        value = org.cryptobiotic.protogen.DecryptedSelection::selectionId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tally",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "tally",
                        value = org.cryptobiotic.protogen.DecryptedSelection::tally
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "b_over_m",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ElementModP.Companion),
                        jsonName = "bOverM",
                        value = org.cryptobiotic.protogen.DecryptedSelection::bOverM
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "encrypted_vote",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ElGamalCiphertext.Companion),
                        jsonName = "encryptedVote",
                        value = org.cryptobiotic.protogen.DecryptedSelection::encryptedVote
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "proof",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ChaumPedersenProof.Companion),
                        jsonName = "proof",
                        value = org.cryptobiotic.protogen.DecryptedSelection::proof
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "DecryptedSelection",
                messageClass = org.cryptobiotic.protogen.DecryptedSelection::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class DecryptedContestData(
    val contestData: org.cryptobiotic.protogen.ContestData? = null,
    val encryptedContestData: org.cryptobiotic.protogen.HashedElGamalCiphertext? = null,
    val proof: org.cryptobiotic.protogen.ChaumPedersenProof? = null,
    val beta: org.cryptobiotic.protogen.ElementModP? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.DecryptedContestData = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.DecryptedContestData> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.DecryptedContestData> {
        public val defaultInstance: org.cryptobiotic.protogen.DecryptedContestData by lazy { org.cryptobiotic.protogen.DecryptedContestData() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.DecryptedContestData = org.cryptobiotic.protogen.DecryptedContestData.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.DecryptedContestData> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.DecryptedContestData, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "contest_data",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ContestData.Companion),
                        jsonName = "contestData",
                        value = org.cryptobiotic.protogen.DecryptedContestData::contestData
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "encrypted_contest_data",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.HashedElGamalCiphertext.Companion),
                        jsonName = "encryptedContestData",
                        value = org.cryptobiotic.protogen.DecryptedContestData::encryptedContestData
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "proof",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ChaumPedersenProof.Companion),
                        jsonName = "proof",
                        value = org.cryptobiotic.protogen.DecryptedContestData::proof
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "beta",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ElementModP.Companion),
                        jsonName = "beta",
                        value = org.cryptobiotic.protogen.DecryptedContestData::beta
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "DecryptedContestData",
                messageClass = org.cryptobiotic.protogen.DecryptedContestData::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForDecryptedTallyOrBallot")
public fun DecryptedTallyOrBallot?.orDefault(): org.cryptobiotic.protogen.DecryptedTallyOrBallot = this ?: DecryptedTallyOrBallot.defaultInstance

private fun DecryptedTallyOrBallot.protoMergeImpl(plus: pbandk.Message?): DecryptedTallyOrBallot = (plus as? DecryptedTallyOrBallot)?.let {
    it.copy(
        contests = contests + plus.contests,
        electionId = electionId?.plus(plus.electionId) ?: plus.electionId,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DecryptedTallyOrBallot.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DecryptedTallyOrBallot {
    var id = ""
    var contests: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.DecryptedContest>? = null
    var electionId: org.cryptobiotic.protogen.UInt256? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> contests = (contests ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.DecryptedContest> }
            3 -> electionId = _fieldValue as org.cryptobiotic.protogen.UInt256
        }
    }

    return DecryptedTallyOrBallot(id, pbandk.ListWithSize.Builder.fixed(contests), electionId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDecryptedContest")
public fun DecryptedContest?.orDefault(): org.cryptobiotic.protogen.DecryptedContest = this ?: DecryptedContest.defaultInstance

private fun DecryptedContest.protoMergeImpl(plus: pbandk.Message?): DecryptedContest = (plus as? DecryptedContest)?.let {
    it.copy(
        selections = selections + plus.selections,
        decryptedContestData = decryptedContestData?.plus(plus.decryptedContestData) ?: plus.decryptedContestData,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DecryptedContest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DecryptedContest {
    var contestId = ""
    var selections: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.DecryptedSelection>? = null
    var decryptedContestData: org.cryptobiotic.protogen.DecryptedContestData? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> contestId = _fieldValue as String
            2 -> selections = (selections ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.DecryptedSelection> }
            3 -> decryptedContestData = _fieldValue as org.cryptobiotic.protogen.DecryptedContestData
        }
    }

    return DecryptedContest(contestId, pbandk.ListWithSize.Builder.fixed(selections), decryptedContestData, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDecryptedSelection")
public fun DecryptedSelection?.orDefault(): org.cryptobiotic.protogen.DecryptedSelection = this ?: DecryptedSelection.defaultInstance

private fun DecryptedSelection.protoMergeImpl(plus: pbandk.Message?): DecryptedSelection = (plus as? DecryptedSelection)?.let {
    it.copy(
        bOverM = bOverM?.plus(plus.bOverM) ?: plus.bOverM,
        encryptedVote = encryptedVote?.plus(plus.encryptedVote) ?: plus.encryptedVote,
        proof = proof?.plus(plus.proof) ?: plus.proof,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DecryptedSelection.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DecryptedSelection {
    var selectionId = ""
    var tally = 0
    var bOverM: org.cryptobiotic.protogen.ElementModP? = null
    var encryptedVote: org.cryptobiotic.protogen.ElGamalCiphertext? = null
    var proof: org.cryptobiotic.protogen.ChaumPedersenProof? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> selectionId = _fieldValue as String
            2 -> tally = _fieldValue as Int
            3 -> bOverM = _fieldValue as org.cryptobiotic.protogen.ElementModP
            4 -> encryptedVote = _fieldValue as org.cryptobiotic.protogen.ElGamalCiphertext
            5 -> proof = _fieldValue as org.cryptobiotic.protogen.ChaumPedersenProof
        }
    }

    return DecryptedSelection(selectionId, tally, bOverM, encryptedVote,
        proof, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDecryptedContestData")
public fun DecryptedContestData?.orDefault(): org.cryptobiotic.protogen.DecryptedContestData = this ?: DecryptedContestData.defaultInstance

private fun DecryptedContestData.protoMergeImpl(plus: pbandk.Message?): DecryptedContestData = (plus as? DecryptedContestData)?.let {
    it.copy(
        contestData = contestData?.plus(plus.contestData) ?: plus.contestData,
        encryptedContestData = encryptedContestData?.plus(plus.encryptedContestData) ?: plus.encryptedContestData,
        proof = proof?.plus(plus.proof) ?: plus.proof,
        beta = beta?.plus(plus.beta) ?: plus.beta,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DecryptedContestData.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DecryptedContestData {
    var contestData: org.cryptobiotic.protogen.ContestData? = null
    var encryptedContestData: org.cryptobiotic.protogen.HashedElGamalCiphertext? = null
    var proof: org.cryptobiotic.protogen.ChaumPedersenProof? = null
    var beta: org.cryptobiotic.protogen.ElementModP? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> contestData = _fieldValue as org.cryptobiotic.protogen.ContestData
            2 -> encryptedContestData = _fieldValue as org.cryptobiotic.protogen.HashedElGamalCiphertext
            3 -> proof = _fieldValue as org.cryptobiotic.protogen.ChaumPedersenProof
            4 -> beta = _fieldValue as org.cryptobiotic.protogen.ElementModP
        }
    }

    return DecryptedContestData(contestData, encryptedContestData, proof, beta, unknownFields)
}
