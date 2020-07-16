// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.data.schemaregistry.avro;

import com.azure.core.experimental.serializer.ObjectSerializer;
import com.azure.core.util.logging.ClientLogger;
import com.azure.data.schemaregistry.AbstractDataSerializer;
import com.azure.data.schemaregistry.SerializationException;
import com.azure.data.schemaregistry.client.CachedSchemaRegistryClient;
import reactor.core.publisher.Mono;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Asynchronous registry-based serializer implementation.
 */
public class SchemaRegistryAvroAsyncSerializer extends AbstractDataSerializer implements ObjectSerializer {
    private final ClientLogger logger = new ClientLogger(SchemaRegistryAvroAsyncSerializer.class);

    /**
     *
     * @param registryClient
     * @param schemaGroup
     * @param autoRegisterSchemas
     * @param avroSpecificReader
     */
    SchemaRegistryAvroAsyncSerializer(CachedSchemaRegistryClient registryClient, String schemaGroup,
                                 boolean autoRegisterSchemas, boolean avroSpecificReader) {
        super(registryClient);

        AvroCodec avroCodec = new AvroCodec(avroSpecificReader);
        setSerializerCodec(avroCodec);
        loadDeserializerCodec(avroCodec);

        // send configurations only
        this.autoRegisterSchemas = autoRegisterSchemas;
        this.schemaGroup = schemaGroup;
    }

    @Override
    public <S extends OutputStream> Mono<S> serialize(S s, Object o) {
        if (o == null) {
            return Mono.empty();
        }

        return this.serializeImpl(s, o);
    }

    @Override
    public <T> Mono<T> deserialize(InputStream stream, Class<T> clazz) {
        return this.deserialize(stream)
            .map(o -> {
                if (clazz.isInstance(o)) {
                    return clazz.cast(o);
                }
                throw logger.logExceptionAsError(new SerializationException("Deserialized object not of class %s"));
            });
    }
}

