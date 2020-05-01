/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License.
 */

package com.azure.schemaregistry.avro;

import com.azure.schemaregistry.ByteDecoder;
import com.azure.schemaregistry.SerializationException;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * ByteDecoder implementation with all Avro-specific functionality required to deserialize byte arrays given Avro schema.
 */
public class AvroByteDecoder extends AvroCodec
        implements ByteDecoder {
    private final Logger log = LoggerFactory.getLogger(getClass());
    private final DecoderFactory decoderFactory = DecoderFactory.get();

    private AvroByteDecoder(Boolean avroSpecificReader) {
        this.avroSpecificReader = avroSpecificReader;
    }

    private final boolean avroSpecificReader;

    /**
     * @param b byte array containing encoded bytes
     * @param object schema for Avro reader read - fetched from Azure Schema Registry
     * @return deserialized object
     * @throws SerializationException
     */
    public Object decodeBytes(byte[] b, Object object) throws SerializationException {
        if (!(object instanceof Schema)) {
            throw new SerializationException("Attempted to decode with non-Avro schema object in AvroByteDecoder");
        }
        Schema schema = (Schema)object;

        if (schema.getType().equals(Schema.Type.BYTES)) {
            return b;
        }

        DatumReader<?> reader = getDatumReader(schema);

        try {
            Object result = reader.read(null, decoderFactory.binaryDecoder(b, null));

            if (schema.getType().equals(Schema.Type.STRING)) {
                return result.toString();
            }

            return result;
        } catch (IOException | RuntimeException e) {
            // avro deserialization may throw AvroRuntimeException, NullPointerException, etc
            throw new SerializationException("Error deserializing Avro message.", e);
        }
    }


    /**
     * Returns correct reader for decoding payload
     *
     * @param writerSchema Avro schema fetched from schema registry store
     * @return
     */
    private DatumReader<?> getDatumReader(Schema writerSchema) {
        boolean writerSchemaIsPrimitive = AvroSchemaUtils.getPrimitiveSchemas().values().contains(writerSchema);
        // do not use SpecificDatumReader if writerSchema is a primitive
        if (avroSpecificReader && !writerSchemaIsPrimitive) {
            return new SpecificDatumReader<>(writerSchema);
        } else {
            return new GenericDatumReader<>(writerSchema);
        }
    }

    public static class Builder {
        private Boolean avroSpecificReader = false;

        public Builder() {}

        public Builder avroSpecificReader(Boolean avroSpecificReader) {
            this.avroSpecificReader = avroSpecificReader;
            return this;
        }

        public AvroByteDecoder build() {
            return new AvroByteDecoder(this.avroSpecificReader);
        }
    }
}
