// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.serializer;

/**
 * Generic interface covering basic Avro serialization and deserialization methods.
 */
public interface AvroSerializer {
    /**
     * Reads the Avro stream into its object representation.
     *
     * @param input Incoming Avro stream.
     * @param schema JSON string representing the Avro schema.
     * @param <T> Type of the object.
     * @return The object representing the Avro stream.
     */
    <T> T read(byte[] input, String schema);

    /**
     * Writes the object into its Avro stream.
     *
     * @param value The object.
     * @param schema JSON string representing the Avro schema.
     * @return The Avro stream representing the object.
     */
    byte[] write(Object value, String schema);
}
