// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.serializer;

import java.io.OutputStream;

/**
 * Generic interface covering basic JSON serialization and deserialization methods.
 */
public interface JsonSerializer {
    /**
     * Reads the JSON byte stream into its object representation.
     *
     * @param input JSON byte stream.
     * @param clazz {@link Class} representing the object.
     * @param <T> Type of the object.
     * @return The object representing the JSON string.
     */
    <T> T read(byte[] input, Class<T> clazz);

    /**
     * Writes the object into its JSON byte stream.
     *
     * @param value The object.
     * @return The JSON byte stream representing the object.
     */
    byte[] write(Object value);

    /**
     * Writes the object into its JSON byte stream.
     *
     * @param value The object.
     * @param clazz {@link Class} representing the object.
     * @return The JSON byte stream representing the object.
     */
    byte[] write(Object value, Class<?> clazz);

    /**
     * Converts the object into a JSON byte stream and writes it to the {@link OutputStream}.
     *
     * @param value The object.
     * @param stream The {@link OutputStream} where the JSON byte stream will be written.
     */
    void write(Object value, OutputStream stream);

    /**
     * Converts the object into a JSON byte stream and writes it to the {@link OutputStream}.
     *
     * @param value The object.
     * @param stream The {@link OutputStream} where the JSON byte stream will be written.
     * @param clazz {@link Class} representing the object.
     */
    void write(Object value, OutputStream stream, Class<?> clazz);
}
