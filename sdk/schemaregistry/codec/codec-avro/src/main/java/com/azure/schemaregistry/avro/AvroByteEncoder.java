/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License.
 */

package com.azure.schemaregistry.avro;

import com.azure.schemaregistry.ByteEncoder;
import com.azure.schemaregistry.SerializationException;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.specific.SpecificRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * ByteEncoder implementation with all Avro-specific functionality required to serialize Java objects into byte arrays.
 */
public class AvroByteEncoder extends AvroCodec
        implements ByteEncoder {
    private static final Logger log = LoggerFactory.getLogger(AvroByteEncoder.class);
    private final EncoderFactory encoderFactory = EncoderFactory.get();

    private AvroByteEncoder() {}

    /**
     * @param object Schema object used to generate schema string
     * @see AvroSchemaUtils for distinction between primitive and Avro schema generation
     */
    public String getSchemaString(Object object) {
        Schema schema = AvroSchemaUtils.getSchema(object);
        return schema.toString();
    }

    /**
     * Returns schema name for storing schemas in schema registry store.
     *
     * @param object Schema object used to generate schema path
     * @return schema name as string
     */
    public String getSchemaName(Object object) {
        return AvroSchemaUtils.getSchema(object).getFullName();
    }

    /**
     * Returns ByteArrayOutputStream containing Avro encoding of object parameter
     * @param object Object to be encoded into byte stream
     * @return closed ByteArrayOutputStream
     * @throws SerializationException wraps runtime exceptions
     */
    public ByteArrayOutputStream encode(Object object) throws SerializationException {
        Schema schema = AvroSchemaUtils.getSchema(object);

        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            if (object instanceof byte[]) {
                out.write((byte[]) object);
            } else {
                BinaryEncoder encoder = encoderFactory.directBinaryEncoder(out, null);
                DatumWriter<Object> writer;
                if (object instanceof SpecificRecord) {
                    writer = new SpecificDatumWriter<>(schema);
                } else {
                    writer = new GenericDatumWriter<>(schema);
                }
                writer.write(object, encoder);
                encoder.flush();
            }
            out.close();
            return out;
        } catch (IOException | RuntimeException e) {
            // Avro serialization can throw AvroRuntimeException, NullPointerException, ClassCastException, etc
            throw new SerializationException("Error serializing Avro message", e);
        }
    }

    public static class Builder {
        public Builder() {}
        public AvroByteEncoder build() {
            return new AvroByteEncoder();
        }
    }
}
