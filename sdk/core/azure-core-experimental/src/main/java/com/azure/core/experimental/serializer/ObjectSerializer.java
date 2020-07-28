// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.experimental.serializer;

import reactor.core.publisher.Mono;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Generic interface covering serializing and deserialization objects.
 */
public interface ObjectSerializer {
    /**
     * Reads a stream into its object representation.
     *
     * @param stream {@link InputStream} of data.
     * @param typeReference {@link TypeReference} representing the object.
     * @param <T> Type of the object.
     * @return The object represented by the deserialized stream.
     */
    <T> T deserializeSync(InputStream stream, TypeReference<T> typeReference);

    /**
     * Reads a stream into its object representation.
     *
     * @param stream {@link InputStream} of data.
     * @param typeReference {@link TypeReference} representing the object.
     * @param <T> Type of the object.
     * @return The object represented by the deserialized stream.
     */
    <T> Mono<T> deserialize(InputStream stream, TypeReference<T> typeReference);

    /**
     * Writes the object into a stream.
     *
     * @param stream {@link OutputStream} where the object will be written.
     * @param value The object.
     * @param <S> Type of the output stream.
     * @return The stream where the object was written.
     */
    <S extends OutputStream> S serializeSync(S stream, Object value);

    /**
     * Writes the object into a stream.
     *
     * @param stream {@link OutputStream} where the object will be written.
     * @param value The object.
     * @param <S> Type of the output stream.
     * @return The stream where the object was written.
     */
    <S extends OutputStream> Mono<S> serialize(S stream, Object value);
}
