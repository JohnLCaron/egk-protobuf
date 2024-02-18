# Egk-Protobuf

_last update 11/14/2023_

This adds protobuf support to [ElectionGuard-Kotlin-Multiplatform (EGK)](https://github.com/votingworks/electionguard-kotlin-multiplatform).

Available under an MIT-style open source [License](LICENSE). 

Currently Java 17 is required.

## Serialization

_We are waiting for the 2.0 JSON serialization specification from Microsoft, before finalizing our serialization. For now,
we are still mostly using the 1.9 serialization._

EGK can use both JSON and [Protocol Buffers](https://en.wikipedia.org/wiki/Protocol_Buffers) for serialization.
Protobuf is a binary format that takes roughly half the space of JSON for the same information.
EGK includes `.proto` files for all the relevant data formats, which constitutes a well defined
and compact schema for EG serialization.

### Protobuf Serialization
* [Protobuf serialization 1.9](docs/ProtoSerializationSpec1.9.md)
* [Election Record serialization for private classes](docs/ProtoSerializationPrivate.md)
* [Preencryption Serialization](docs/PreencryptSerialization.md)
* [Election Record protobuf directory and file layout](docs/ElectionRecordProto.md)

### Previous Serialization specs
* [Protobuf serialization 1.53](docs/ProtoSerializationSpec1.53.md)
* [Protobuf serialization (ver 1) and comparison with JSON](docs/ProtoSerializationSpec1.md)

## Authors
- [John Caron](https://github.com/JohnLCaron)
