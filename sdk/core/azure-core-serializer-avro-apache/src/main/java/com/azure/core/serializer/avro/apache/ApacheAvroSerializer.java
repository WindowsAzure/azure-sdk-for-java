// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.serializer.avro.apache;

import com.azure.core.experimental.serializer.ObjectSerializer;
import com.azure.core.experimental.serializer.TypeReference;
import com.azure.core.util.logging.ClientLogger;
import org.apache.avro.Schema;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UncheckedIOException;

/**
 * Apache Avro based implementation of the {@link ObjectSerializer} interface.
 */
public class ApacheAvroSerializer implements ObjectSerializer {
    private final ClientLogger logger = new ClientLogger(ApacheAvroSerializer.class);

    private final Schema schema;
    private final DecoderFactory decoderFactory;
    private final EncoderFactory encoderFactory;
    private final SpecificData specificData;

    ApacheAvroSerializer(Schema schema, DecoderFactory decoderFactory, EncoderFactory encoderFactory,
        SpecificData specificData) {
        this.schema = schema;
        this.decoderFactory = decoderFactory;
        this.encoderFactory = encoderFactory;
        this.specificData = specificData;
    }

    @Override
    public <T> T deserializeSync(InputStream stream, TypeReference<T> typeReference) {
        if (stream == null) {
            return null;
        }

        DatumReader<T> reader = new SpecificDatumReader<>(schema, schema, specificData);

        try {
            return reader.read(null, decoderFactory.binaryDecoder(stream, null));
        } catch (IOException ex) {
            throw logger.logExceptionAsError(new UncheckedIOException(ex));
        }
    }

    @Override
    public <T> Mono<T> deserialize(InputStream stream, TypeReference<T> typeReference) {
        return Mono.fromCallable(() -> deserializeSync(stream, typeReference));
    }

    @Override
    public <S extends OutputStream> S serializeSync(S stream, Object value) {
        DatumWriter<Object> writer = new SpecificDatumWriter<>(schema, specificData);

        Encoder encoder = encoderFactory.binaryEncoder(stream, null);
        try {
            writer.write(value, encoder);
            encoder.flush();
            return stream;
        } catch (IOException ex) {
            throw logger.logExceptionAsError(new UncheckedIOException(ex));
        }
    }

    @Override
    public <S extends OutputStream> Mono<S> serialize(S stream, Object value) {
        return Mono.fromCallable(() -> serializeSync(stream, value));
    }
}
