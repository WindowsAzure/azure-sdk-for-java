// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.serializer.json.jackson;

import com.azure.core.experimental.serializer.JsonNode;
import com.azure.core.experimental.serializer.JsonSerializer;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UncheckedIOException;

/**
 * Jackson based implementation of the {@link JsonSerializer} interface.
 */
public final class JacksonJsonSerializer implements JsonSerializer {
    private static final ClientLogger LOGGER = new ClientLogger(JacksonJsonSerializer.class);

    private final ObjectMapper mapper;

    /**
     * Constructs a {@link JsonSerializer} using the passed Jackson serializer.
     *
     * @param mapper Configured Jackson serializer.
     */
    JacksonJsonSerializer(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public <T> T deserializeSync(InputStream stream, Class<T> clazz) {
        if (stream == null) {
            return null;
        }

        try {
            return mapper.readValue(stream, clazz);
        } catch (IOException ex) {
            throw LOGGER.logExceptionAsError(new UncheckedIOException(ex));
        }
    }

    @Override
    public <T> Mono<T> deserialize(InputStream stream, Class<T> clazz) {
        return Mono.fromCallable(() -> deserializeSync(stream, clazz));
    }

    @Override
    public <T> T deserializeTreeSync(JsonNode jsonNode, Class<T> clazz) {
        try {
            return mapper.treeToValue(JsonNodeUtils.toJacksonNode(jsonNode), clazz);
        } catch (JsonProcessingException ex) {
            throw LOGGER.logExceptionAsError(new UncheckedIOException(ex));
        }
    }

    @Override
    public <T> Mono<T> deserializeTree(JsonNode jsonNode, Class<T> clazz) {
        return Mono.fromCallable(() -> deserializeTreeSync(jsonNode, clazz));
    }

    @Override
    public <S extends OutputStream> S serializeSync(S stream, Object value) {
        try {
            mapper.writeValue(stream, value);
        } catch (IOException ex) {
            throw LOGGER.logExceptionAsError(new UncheckedIOException(ex));
        }

        return stream;
    }

    @Override
    public <S extends OutputStream> Mono<S> serialize(S stream, Object value) {
        return Mono.fromCallable(() -> serializeSync(stream, value));
    }

    @Override
    public <S extends OutputStream> S serializeTreeSync(S stream, JsonNode jsonNode) {
        return serializeSync(stream, JsonNodeUtils.toJacksonNode(jsonNode));
    }

    @Override
    public <S extends OutputStream> Mono<S> serializeTree(S stream, JsonNode jsonNode) {
        return serialize(stream, JsonNodeUtils.toJacksonNode(jsonNode));
    }

    @Override
    public JsonNode toTreeSync(InputStream stream) {
        try {
            return JsonNodeUtils.fromJacksonNode(mapper.readTree(stream));
        } catch (IOException ex) {
            throw LOGGER.logExceptionAsError(new UncheckedIOException(ex));
        }
    }

    @Override
    public Mono<JsonNode> toTree(InputStream stream) {
        return Mono.fromCallable(() -> toTreeSync(stream));
    }

    @Override
    public JsonNode toTreeSync(Object value) {
        return JsonNodeUtils.fromJacksonNode(mapper.valueToTree(value));
    }

    @Override
    public Mono<JsonNode> toTree(Object value) {
        return Mono.fromCallable(() -> toTreeSync(value));
    }
}
