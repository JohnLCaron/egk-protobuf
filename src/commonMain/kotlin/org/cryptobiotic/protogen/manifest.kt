@file:OptIn(pbandk.PublicForGeneratedCode::class)

package org.cryptobiotic.protogen

@pbandk.Export
public data class Manifest(
    val electionScopeId: String = "",
    val specVersion: String = "",
    val electionType: org.cryptobiotic.protogen.Manifest.ElectionType = org.cryptobiotic.protogen.Manifest.ElectionType.fromValue(0),
    val startDate: String = "",
    val endDate: String = "",
    val geopoliticalUnits: List<org.cryptobiotic.protogen.GeopoliticalUnit> = emptyList(),
    val parties: List<org.cryptobiotic.protogen.Party> = emptyList(),
    val candidates: List<org.cryptobiotic.protogen.Candidate> = emptyList(),
    val contests: List<org.cryptobiotic.protogen.ContestDescription> = emptyList(),
    val ballotStyles: List<org.cryptobiotic.protogen.BallotStyle> = emptyList(),
    val name: List<org.cryptobiotic.protogen.Language> = emptyList(),
    val contactInformation: org.cryptobiotic.protogen.ContactInformation? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.Manifest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.Manifest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.Manifest> {
        public val defaultInstance: org.cryptobiotic.protogen.Manifest by lazy { org.cryptobiotic.protogen.Manifest() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.Manifest = org.cryptobiotic.protogen.Manifest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.Manifest> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.Manifest, *>>(12)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "election_scope_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "electionScopeId",
                        value = org.cryptobiotic.protogen.Manifest::electionScopeId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "spec_version",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "specVersion",
                        value = org.cryptobiotic.protogen.Manifest::specVersion
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "election_type",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = org.cryptobiotic.protogen.Manifest.ElectionType.Companion),
                        jsonName = "electionType",
                        value = org.cryptobiotic.protogen.Manifest::electionType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "start_date",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "startDate",
                        value = org.cryptobiotic.protogen.Manifest::startDate
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "end_date",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "endDate",
                        value = org.cryptobiotic.protogen.Manifest::endDate
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "geopolitical_units",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.GeopoliticalUnit>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.GeopoliticalUnit.Companion)),
                        jsonName = "geopoliticalUnits",
                        value = org.cryptobiotic.protogen.Manifest::geopoliticalUnits
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "parties",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.Party>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.Party.Companion)),
                        jsonName = "parties",
                        value = org.cryptobiotic.protogen.Manifest::parties
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "candidates",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.Candidate>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.Candidate.Companion)),
                        jsonName = "candidates",
                        value = org.cryptobiotic.protogen.Manifest::candidates
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "contests",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.ContestDescription>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ContestDescription.Companion)),
                        jsonName = "contests",
                        value = org.cryptobiotic.protogen.Manifest::contests
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ballot_styles",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.BallotStyle>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.BallotStyle.Companion)),
                        jsonName = "ballotStyles",
                        value = org.cryptobiotic.protogen.Manifest::ballotStyles
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.Language>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.Language.Companion)),
                        jsonName = "name",
                        value = org.cryptobiotic.protogen.Manifest::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "contact_information",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.ContactInformation.Companion),
                        jsonName = "contactInformation",
                        value = org.cryptobiotic.protogen.Manifest::contactInformation
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "Manifest",
                messageClass = org.cryptobiotic.protogen.Manifest::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed class ElectionType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is Manifest.ElectionType && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "Manifest.ElectionType.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object UNKNOWN : ElectionType(0, "unknown")
        public object GENERAL : ElectionType(1, "general")
        public object PARTISAN_PRIMARY_CLOSED : ElectionType(2, "partisan_primary_closed")
        public object PARTISAN_PRIMARY_OPEN : ElectionType(3, "partisan_primary_open")
        public object PRIMARY : ElectionType(4, "primary")
        public object RUNOFF : ElectionType(5, "runoff")
        public object SPECIAL : ElectionType(6, "special")
        public object OTHER : ElectionType(7, "other")
        public class UNRECOGNIZED(value: Int) : ElectionType(value)

        public companion object : pbandk.Message.Enum.Companion<Manifest.ElectionType> {
            public val values: List<Manifest.ElectionType> by lazy { listOf(UNKNOWN, GENERAL, PARTISAN_PRIMARY_CLOSED, PARTISAN_PRIMARY_OPEN, PRIMARY, RUNOFF, SPECIAL, OTHER) }
            override fun fromValue(value: Int): Manifest.ElectionType = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): Manifest.ElectionType = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No ElectionType with name: $name")
        }
    }
}

@pbandk.Export
public data class BallotStyle(
    val ballotStyleId: String = "",
    val geopoliticalUnitIds: List<String> = emptyList(),
    val partyIds: List<String> = emptyList(),
    val imageUrl: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.BallotStyle = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.BallotStyle> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.BallotStyle> {
        public val defaultInstance: org.cryptobiotic.protogen.BallotStyle by lazy { org.cryptobiotic.protogen.BallotStyle() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.BallotStyle = org.cryptobiotic.protogen.BallotStyle.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.BallotStyle> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.BallotStyle, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ballot_style_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "ballotStyleId",
                        value = org.cryptobiotic.protogen.BallotStyle::ballotStyleId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "geopolitical_unit_ids",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "geopoliticalUnitIds",
                        value = org.cryptobiotic.protogen.BallotStyle::geopoliticalUnitIds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "party_ids",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "partyIds",
                        value = org.cryptobiotic.protogen.BallotStyle::partyIds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "image_url",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "imageUrl",
                        value = org.cryptobiotic.protogen.BallotStyle::imageUrl
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "BallotStyle",
                messageClass = org.cryptobiotic.protogen.BallotStyle::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class Candidate(
    val candidateId: String = "",
    val name: String = "",
    val partyId: String = "",
    val imageUrl: String = "",
    val isWriteIn: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.Candidate = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.Candidate> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.Candidate> {
        public val defaultInstance: org.cryptobiotic.protogen.Candidate by lazy { org.cryptobiotic.protogen.Candidate() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.Candidate = org.cryptobiotic.protogen.Candidate.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.Candidate> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.Candidate, *>>(5)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "candidate_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "candidateId",
                        value = org.cryptobiotic.protogen.Candidate::candidateId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = org.cryptobiotic.protogen.Candidate::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "party_id",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "partyId",
                        value = org.cryptobiotic.protogen.Candidate::partyId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "image_url",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "imageUrl",
                        value = org.cryptobiotic.protogen.Candidate::imageUrl
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_write_in",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isWriteIn",
                        value = org.cryptobiotic.protogen.Candidate::isWriteIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "Candidate",
                messageClass = org.cryptobiotic.protogen.Candidate::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class ContactInformation(
    val name: String = "",
    val addressLine: List<String> = emptyList(),
    val email: String = "",
    val phone: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.ContactInformation = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ContactInformation> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.ContactInformation> {
        public val defaultInstance: org.cryptobiotic.protogen.ContactInformation by lazy { org.cryptobiotic.protogen.ContactInformation() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.ContactInformation = org.cryptobiotic.protogen.ContactInformation.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ContactInformation> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.ContactInformation, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = org.cryptobiotic.protogen.ContactInformation::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "address_line",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "addressLine",
                        value = org.cryptobiotic.protogen.ContactInformation::addressLine
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "email",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "email",
                        value = org.cryptobiotic.protogen.ContactInformation::email
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "phone",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "phone",
                        value = org.cryptobiotic.protogen.ContactInformation::phone
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ContactInformation",
                messageClass = org.cryptobiotic.protogen.ContactInformation::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class GeopoliticalUnit(
    val geopoliticalUnitId: String = "",
    val name: String = "",
    val type: org.cryptobiotic.protogen.GeopoliticalUnit.ReportingUnitType = org.cryptobiotic.protogen.GeopoliticalUnit.ReportingUnitType.fromValue(0),
    val contactInformation: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.GeopoliticalUnit = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.GeopoliticalUnit> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.GeopoliticalUnit> {
        public val defaultInstance: org.cryptobiotic.protogen.GeopoliticalUnit by lazy { org.cryptobiotic.protogen.GeopoliticalUnit() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.GeopoliticalUnit = org.cryptobiotic.protogen.GeopoliticalUnit.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.GeopoliticalUnit> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.GeopoliticalUnit, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "geopolitical_unit_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "geopoliticalUnitId",
                        value = org.cryptobiotic.protogen.GeopoliticalUnit::geopoliticalUnitId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = org.cryptobiotic.protogen.GeopoliticalUnit::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "type",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = org.cryptobiotic.protogen.GeopoliticalUnit.ReportingUnitType.Companion),
                        jsonName = "type",
                        value = org.cryptobiotic.protogen.GeopoliticalUnit::type
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "contact_information",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "contactInformation",
                        value = org.cryptobiotic.protogen.GeopoliticalUnit::contactInformation
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "GeopoliticalUnit",
                messageClass = org.cryptobiotic.protogen.GeopoliticalUnit::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed class ReportingUnitType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is GeopoliticalUnit.ReportingUnitType && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "GeopoliticalUnit.ReportingUnitType.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object UNKNOWN : ReportingUnitType(0, "unknown")
        public object BALLOT_BATCH : ReportingUnitType(1, "ballot_batch")
        public object BALLOT_STYLE_AREA : ReportingUnitType(2, "ballot_style_area")
        public object BOROUGH : ReportingUnitType(3, "borough")
        public object CITY : ReportingUnitType(4, "city")
        public object CITY_COUNCIL : ReportingUnitType(5, "city_council")
        public object COMBINED_PRECINCT : ReportingUnitType(6, "combined_precinct")
        public object CONGRESSIONAL : ReportingUnitType(7, "congressional")
        public object COUNTRY : ReportingUnitType(8, "country")
        public object COUNTY : ReportingUnitType(9, "county")
        public object COUNTY_COUNCIL : ReportingUnitType(10, "county_council")
        public object DROP_BOX : ReportingUnitType(11, "drop_box")
        public object JUDICIAL : ReportingUnitType(12, "judicial")
        public object MUNICIPALITY : ReportingUnitType(13, "municipality")
        public object POLLING_PLACE : ReportingUnitType(14, "polling_place")
        public object PRECINCT : ReportingUnitType(15, "precinct")
        public object SCHOOL : ReportingUnitType(16, "school")
        public object SPECIAL : ReportingUnitType(17, "special")
        public object SPLIT_PRECINCT : ReportingUnitType(18, "split_precinct")
        public object STATE : ReportingUnitType(19, "state")
        public object STATE_HOUSE : ReportingUnitType(20, "state_house")
        public object STATE_SENATE : ReportingUnitType(21, "state_senate")
        public object TOWNSHIP : ReportingUnitType(22, "township")
        public object UTILITY : ReportingUnitType(23, "utility")
        public object VILLAGE : ReportingUnitType(24, "village")
        public object VOTE_CENTER : ReportingUnitType(25, "vote_center")
        public object WARD : ReportingUnitType(26, "ward")
        public object WATER : ReportingUnitType(27, "water")
        public object OTHER : ReportingUnitType(28, "other")
        public class UNRECOGNIZED(value: Int) : ReportingUnitType(value)

        public companion object : pbandk.Message.Enum.Companion<GeopoliticalUnit.ReportingUnitType> {
            public val values: List<GeopoliticalUnit.ReportingUnitType> by lazy { listOf(UNKNOWN, BALLOT_BATCH, BALLOT_STYLE_AREA, BOROUGH, CITY, CITY_COUNCIL, COMBINED_PRECINCT, CONGRESSIONAL, COUNTRY, COUNTY, COUNTY_COUNCIL, DROP_BOX, JUDICIAL, MUNICIPALITY, POLLING_PLACE, PRECINCT, SCHOOL, SPECIAL, SPLIT_PRECINCT, STATE, STATE_HOUSE, STATE_SENATE, TOWNSHIP, UTILITY, VILLAGE, VOTE_CENTER, WARD, WATER, OTHER) }
            override fun fromValue(value: Int): GeopoliticalUnit.ReportingUnitType = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): GeopoliticalUnit.ReportingUnitType = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No ReportingUnitType with name: $name")
        }
    }
}

@pbandk.Export
public data class Language(
    val value: String = "",
    val language: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.Language = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.Language> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.Language> {
        public val defaultInstance: org.cryptobiotic.protogen.Language by lazy { org.cryptobiotic.protogen.Language() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.Language = org.cryptobiotic.protogen.Language.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.Language> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.Language, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "value",
                        value = org.cryptobiotic.protogen.Language::value
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "language",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "language",
                        value = org.cryptobiotic.protogen.Language::language
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "Language",
                messageClass = org.cryptobiotic.protogen.Language::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class Party(
    val partyId: String = "",
    val name: String = "",
    val abbreviation: String = "",
    val color: String = "",
    val logoUri: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.Party = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.Party> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.Party> {
        public val defaultInstance: org.cryptobiotic.protogen.Party by lazy { org.cryptobiotic.protogen.Party() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.Party = org.cryptobiotic.protogen.Party.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.Party> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.Party, *>>(5)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "party_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "partyId",
                        value = org.cryptobiotic.protogen.Party::partyId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = org.cryptobiotic.protogen.Party::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "abbreviation",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "abbreviation",
                        value = org.cryptobiotic.protogen.Party::abbreviation
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "color",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "color",
                        value = org.cryptobiotic.protogen.Party::color
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "logo_uri",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "logoUri",
                        value = org.cryptobiotic.protogen.Party::logoUri
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "Party",
                messageClass = org.cryptobiotic.protogen.Party::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class ContestDescription(
    val contestId: String = "",
    val sequenceOrder: Int = 0,
    val geopoliticalUnitId: String = "",
    val voteVariation: org.cryptobiotic.protogen.ContestDescription.VoteVariationType = org.cryptobiotic.protogen.ContestDescription.VoteVariationType.fromValue(0),
    val numberElected: Int = 0,
    val votesAllowed: Int = 0,
    val name: String = "",
    val selections: List<org.cryptobiotic.protogen.SelectionDescription> = emptyList(),
    val ballotTitle: String = "",
    val ballotSubtitle: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.ContestDescription = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ContestDescription> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.ContestDescription> {
        public val defaultInstance: org.cryptobiotic.protogen.ContestDescription by lazy { org.cryptobiotic.protogen.ContestDescription() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.ContestDescription = org.cryptobiotic.protogen.ContestDescription.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.ContestDescription> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.ContestDescription, *>>(10)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "contest_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "contestId",
                        value = org.cryptobiotic.protogen.ContestDescription::contestId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sequence_order",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "sequenceOrder",
                        value = org.cryptobiotic.protogen.ContestDescription::sequenceOrder
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "geopolitical_unit_id",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "geopoliticalUnitId",
                        value = org.cryptobiotic.protogen.ContestDescription::geopoliticalUnitId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "vote_variation",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = org.cryptobiotic.protogen.ContestDescription.VoteVariationType.Companion),
                        jsonName = "voteVariation",
                        value = org.cryptobiotic.protogen.ContestDescription::voteVariation
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "number_elected",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "numberElected",
                        value = org.cryptobiotic.protogen.ContestDescription::numberElected
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "votes_allowed",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "votesAllowed",
                        value = org.cryptobiotic.protogen.ContestDescription::votesAllowed
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = org.cryptobiotic.protogen.ContestDescription::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "selections",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Repeated<org.cryptobiotic.protogen.SelectionDescription>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = org.cryptobiotic.protogen.SelectionDescription.Companion)),
                        jsonName = "selections",
                        value = org.cryptobiotic.protogen.ContestDescription::selections
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ballot_title",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "ballotTitle",
                        value = org.cryptobiotic.protogen.ContestDescription::ballotTitle
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ballot_subtitle",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "ballotSubtitle",
                        value = org.cryptobiotic.protogen.ContestDescription::ballotSubtitle
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ContestDescription",
                messageClass = org.cryptobiotic.protogen.ContestDescription::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed class VoteVariationType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is ContestDescription.VoteVariationType && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "ContestDescription.VoteVariationType.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object UNKNOWN : VoteVariationType(0, "unknown")
        public object ONE_OF_M : VoteVariationType(1, "one_of_m")
        public object APPROVAL : VoteVariationType(2, "approval")
        public object BORDA : VoteVariationType(3, "borda")
        public object CUMULATIVE : VoteVariationType(4, "cumulative")
        public object MAJORITY : VoteVariationType(5, "majority")
        public object N_OF_M : VoteVariationType(6, "n_of_m")
        public object PLURALITY : VoteVariationType(7, "plurality")
        public object PROPORTIONAL : VoteVariationType(8, "proportional")
        public object RANGE : VoteVariationType(9, "range")
        public object RCV : VoteVariationType(10, "rcv")
        public object SUPER_MAJORITY : VoteVariationType(11, "super_majority")
        public object OTHER : VoteVariationType(12, "other")
        public class UNRECOGNIZED(value: Int) : VoteVariationType(value)

        public companion object : pbandk.Message.Enum.Companion<ContestDescription.VoteVariationType> {
            public val values: List<ContestDescription.VoteVariationType> by lazy { listOf(UNKNOWN, ONE_OF_M, APPROVAL, BORDA, CUMULATIVE, MAJORITY, N_OF_M, PLURALITY, PROPORTIONAL, RANGE, RCV, SUPER_MAJORITY, OTHER) }
            override fun fromValue(value: Int): ContestDescription.VoteVariationType = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): ContestDescription.VoteVariationType = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No VoteVariationType with name: $name")
        }
    }
}

@pbandk.Export
public data class SelectionDescription(
    val selectionId: String = "",
    val sequenceOrder: Int = 0,
    val candidateId: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): org.cryptobiotic.protogen.SelectionDescription = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.SelectionDescription> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<org.cryptobiotic.protogen.SelectionDescription> {
        public val defaultInstance: org.cryptobiotic.protogen.SelectionDescription by lazy { org.cryptobiotic.protogen.SelectionDescription() }
        override fun decodeWith(u: pbandk.MessageDecoder): org.cryptobiotic.protogen.SelectionDescription = org.cryptobiotic.protogen.SelectionDescription.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<org.cryptobiotic.protogen.SelectionDescription> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<org.cryptobiotic.protogen.SelectionDescription, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "selection_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "selectionId",
                        value = org.cryptobiotic.protogen.SelectionDescription::selectionId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sequence_order",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "sequenceOrder",
                        value = org.cryptobiotic.protogen.SelectionDescription::sequenceOrder
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "candidate_id",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "candidateId",
                        value = org.cryptobiotic.protogen.SelectionDescription::candidateId
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "SelectionDescription",
                messageClass = org.cryptobiotic.protogen.SelectionDescription::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForManifest")
public fun Manifest?.orDefault(): org.cryptobiotic.protogen.Manifest = this ?: Manifest.defaultInstance

private fun Manifest.protoMergeImpl(plus: pbandk.Message?): Manifest = (plus as? Manifest)?.let {
    it.copy(
        geopoliticalUnits = geopoliticalUnits + plus.geopoliticalUnits,
        parties = parties + plus.parties,
        candidates = candidates + plus.candidates,
        contests = contests + plus.contests,
        ballotStyles = ballotStyles + plus.ballotStyles,
        name = name + plus.name,
        contactInformation = contactInformation?.plus(plus.contactInformation) ?: plus.contactInformation,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Manifest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Manifest {
    var electionScopeId = ""
    var specVersion = ""
    var electionType: org.cryptobiotic.protogen.Manifest.ElectionType = org.cryptobiotic.protogen.Manifest.ElectionType.fromValue(0)
    var startDate = ""
    var endDate = ""
    var geopoliticalUnits: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.GeopoliticalUnit>? = null
    var parties: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.Party>? = null
    var candidates: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.Candidate>? = null
    var contests: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.ContestDescription>? = null
    var ballotStyles: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.BallotStyle>? = null
    var name: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.Language>? = null
    var contactInformation: org.cryptobiotic.protogen.ContactInformation? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> electionScopeId = _fieldValue as String
            2 -> specVersion = _fieldValue as String
            3 -> electionType = _fieldValue as org.cryptobiotic.protogen.Manifest.ElectionType
            4 -> startDate = _fieldValue as String
            5 -> endDate = _fieldValue as String
            6 -> geopoliticalUnits = (geopoliticalUnits ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.GeopoliticalUnit> }
            7 -> parties = (parties ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.Party> }
            8 -> candidates = (candidates ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.Candidate> }
            9 -> contests = (contests ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.ContestDescription> }
            10 -> ballotStyles = (ballotStyles ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.BallotStyle> }
            11 -> name = (name ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.Language> }
            12 -> contactInformation = _fieldValue as org.cryptobiotic.protogen.ContactInformation
        }
    }

    return Manifest(electionScopeId, specVersion, electionType, startDate,
        endDate, pbandk.ListWithSize.Builder.fixed(geopoliticalUnits), pbandk.ListWithSize.Builder.fixed(parties), pbandk.ListWithSize.Builder.fixed(candidates),
        pbandk.ListWithSize.Builder.fixed(contests), pbandk.ListWithSize.Builder.fixed(ballotStyles), pbandk.ListWithSize.Builder.fixed(name), contactInformation, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForBallotStyle")
public fun BallotStyle?.orDefault(): org.cryptobiotic.protogen.BallotStyle = this ?: BallotStyle.defaultInstance

private fun BallotStyle.protoMergeImpl(plus: pbandk.Message?): BallotStyle = (plus as? BallotStyle)?.let {
    it.copy(
        geopoliticalUnitIds = geopoliticalUnitIds + plus.geopoliticalUnitIds,
        partyIds = partyIds + plus.partyIds,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun BallotStyle.Companion.decodeWithImpl(u: pbandk.MessageDecoder): BallotStyle {
    var ballotStyleId = ""
    var geopoliticalUnitIds: pbandk.ListWithSize.Builder<String>? = null
    var partyIds: pbandk.ListWithSize.Builder<String>? = null
    var imageUrl = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ballotStyleId = _fieldValue as String
            2 -> geopoliticalUnitIds = (geopoliticalUnitIds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            3 -> partyIds = (partyIds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            4 -> imageUrl = _fieldValue as String
        }
    }

    return BallotStyle(ballotStyleId, pbandk.ListWithSize.Builder.fixed(geopoliticalUnitIds), pbandk.ListWithSize.Builder.fixed(partyIds), imageUrl, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForCandidate")
public fun Candidate?.orDefault(): org.cryptobiotic.protogen.Candidate = this ?: Candidate.defaultInstance

private fun Candidate.protoMergeImpl(plus: pbandk.Message?): Candidate = (plus as? Candidate)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Candidate.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Candidate {
    var candidateId = ""
    var name = ""
    var partyId = ""
    var imageUrl = ""
    var isWriteIn = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> candidateId = _fieldValue as String
            2 -> name = _fieldValue as String
            3 -> partyId = _fieldValue as String
            4 -> imageUrl = _fieldValue as String
            5 -> isWriteIn = _fieldValue as Boolean
        }
    }

    return Candidate(candidateId, name, partyId, imageUrl,
        isWriteIn, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForContactInformation")
public fun ContactInformation?.orDefault(): org.cryptobiotic.protogen.ContactInformation = this ?: ContactInformation.defaultInstance

private fun ContactInformation.protoMergeImpl(plus: pbandk.Message?): ContactInformation = (plus as? ContactInformation)?.let {
    it.copy(
        addressLine = addressLine + plus.addressLine,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ContactInformation.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ContactInformation {
    var name = ""
    var addressLine: pbandk.ListWithSize.Builder<String>? = null
    var email = ""
    var phone = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> addressLine = (addressLine ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            3 -> email = _fieldValue as String
            4 -> phone = _fieldValue as String
        }
    }

    return ContactInformation(name, pbandk.ListWithSize.Builder.fixed(addressLine), email, phone, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGeopoliticalUnit")
public fun GeopoliticalUnit?.orDefault(): org.cryptobiotic.protogen.GeopoliticalUnit = this ?: GeopoliticalUnit.defaultInstance

private fun GeopoliticalUnit.protoMergeImpl(plus: pbandk.Message?): GeopoliticalUnit = (plus as? GeopoliticalUnit)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GeopoliticalUnit.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GeopoliticalUnit {
    var geopoliticalUnitId = ""
    var name = ""
    var type: org.cryptobiotic.protogen.GeopoliticalUnit.ReportingUnitType = org.cryptobiotic.protogen.GeopoliticalUnit.ReportingUnitType.fromValue(0)
    var contactInformation = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> geopoliticalUnitId = _fieldValue as String
            2 -> name = _fieldValue as String
            3 -> type = _fieldValue as org.cryptobiotic.protogen.GeopoliticalUnit.ReportingUnitType
            4 -> contactInformation = _fieldValue as String
        }
    }

    return GeopoliticalUnit(geopoliticalUnitId, name, type, contactInformation, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForLanguage")
public fun Language?.orDefault(): org.cryptobiotic.protogen.Language = this ?: Language.defaultInstance

private fun Language.protoMergeImpl(plus: pbandk.Message?): Language = (plus as? Language)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Language.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Language {
    var value = ""
    var language = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as String
            2 -> language = _fieldValue as String
        }
    }

    return Language(value, language, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForParty")
public fun Party?.orDefault(): org.cryptobiotic.protogen.Party = this ?: Party.defaultInstance

private fun Party.protoMergeImpl(plus: pbandk.Message?): Party = (plus as? Party)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Party.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Party {
    var partyId = ""
    var name = ""
    var abbreviation = ""
    var color = ""
    var logoUri = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> partyId = _fieldValue as String
            2 -> name = _fieldValue as String
            3 -> abbreviation = _fieldValue as String
            4 -> color = _fieldValue as String
            5 -> logoUri = _fieldValue as String
        }
    }

    return Party(partyId, name, abbreviation, color,
        logoUri, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForContestDescription")
public fun ContestDescription?.orDefault(): org.cryptobiotic.protogen.ContestDescription = this ?: ContestDescription.defaultInstance

private fun ContestDescription.protoMergeImpl(plus: pbandk.Message?): ContestDescription = (plus as? ContestDescription)?.let {
    it.copy(
        selections = selections + plus.selections,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ContestDescription.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ContestDescription {
    var contestId = ""
    var sequenceOrder = 0
    var geopoliticalUnitId = ""
    var voteVariation: org.cryptobiotic.protogen.ContestDescription.VoteVariationType = org.cryptobiotic.protogen.ContestDescription.VoteVariationType.fromValue(0)
    var numberElected = 0
    var votesAllowed = 0
    var name = ""
    var selections: pbandk.ListWithSize.Builder<org.cryptobiotic.protogen.SelectionDescription>? = null
    var ballotTitle = ""
    var ballotSubtitle = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> contestId = _fieldValue as String
            2 -> sequenceOrder = _fieldValue as Int
            3 -> geopoliticalUnitId = _fieldValue as String
            4 -> voteVariation = _fieldValue as org.cryptobiotic.protogen.ContestDescription.VoteVariationType
            5 -> numberElected = _fieldValue as Int
            6 -> votesAllowed = _fieldValue as Int
            7 -> name = _fieldValue as String
            8 -> selections = (selections ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<org.cryptobiotic.protogen.SelectionDescription> }
            9 -> ballotTitle = _fieldValue as String
            10 -> ballotSubtitle = _fieldValue as String
        }
    }

    return ContestDescription(contestId, sequenceOrder, geopoliticalUnitId, voteVariation,
        numberElected, votesAllowed, name, pbandk.ListWithSize.Builder.fixed(selections),
        ballotTitle, ballotSubtitle, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSelectionDescription")
public fun SelectionDescription?.orDefault(): org.cryptobiotic.protogen.SelectionDescription = this ?: SelectionDescription.defaultInstance

private fun SelectionDescription.protoMergeImpl(plus: pbandk.Message?): SelectionDescription = (plus as? SelectionDescription)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SelectionDescription.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SelectionDescription {
    var selectionId = ""
    var sequenceOrder = 0
    var candidateId = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> selectionId = _fieldValue as String
            2 -> sequenceOrder = _fieldValue as Int
            3 -> candidateId = _fieldValue as String
        }
    }

    return SelectionDescription(selectionId, sequenceOrder, candidateId, unknownFields)
}
