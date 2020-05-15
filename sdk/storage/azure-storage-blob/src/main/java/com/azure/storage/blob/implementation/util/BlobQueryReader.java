package com.azure.storage.blob.implementation.util;

import com.azure.core.util.logging.ClientLogger;
import com.azure.storage.blob.implementation.models.DelimitedTextConfiguration;
import com.azure.storage.blob.implementation.models.JsonTextConfiguration;
import com.azure.storage.blob.implementation.models.QuickQueryFormat;
import com.azure.storage.blob.implementation.models.QuickQueryFormatType;
import com.azure.storage.blob.implementation.models.QuickQuerySerialization;
import com.azure.storage.blob.models.BlobQueryDelimitedSerialization;
import com.azure.storage.blob.models.BlobQueryError;
import com.azure.storage.blob.models.BlobQueryJsonSerialization;
import com.azure.storage.blob.models.BlobQuerySerialization;
import com.azure.storage.common.ErrorReceiver;
import com.azure.storage.common.ProgressReceiver;
import com.azure.storage.internal.avro.implementation.AvroConstants;
import com.azure.storage.internal.avro.implementation.AvroParser;
import com.azure.storage.internal.avro.implementation.schema.AvroSchema;
import com.azure.storage.internal.avro.implementation.schema.primitive.AvroNullSchema;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/**
 * This class provides helper methods for blob query functions.
 *
 * RESERVED FOR INTERNAL USE.
 */
public class BlobQueryReader {

    private final Flux<ByteBuffer> avro;
    private final ProgressReceiver progressReceiver;
    private final ErrorReceiver<BlobQueryError> errorReceiver;
    private final AvroParser parser;

    /**
     * Creates a new BlobQueryReader.
     *
     * @param avro The reactive avro stream.
     * @param progressReceiver The progress receiver.
     * @param errorReceiver The error receiver.
     */
    public BlobQueryReader(Flux<ByteBuffer> avro, ProgressReceiver progressReceiver,
        ErrorReceiver<BlobQueryError> errorReceiver) {
        this.parser = new AvroParser();
        this.avro = avro;
        this.progressReceiver = progressReceiver;
        this.errorReceiver = errorReceiver;
    }

    /**
     * Avro parses a quick query reactive stream.
     *
     * The Avro stream is formatted as the Avro Header (that specifies the schema) and the Avro Body (that contains
     * a series of blocks of data). The Query Avro schema indicates that the objects being emitted from the parser can
     * either be a result data record, an end record, a progress record or an error record.
     *
     * @return The parsed quick query reactive stream.
     */
    public Flux<ByteBuffer> read() {
        return avro
            .concatMap(parser::parse)
            .concatMap(this::parseRecord);
    }

    /**
     * Parses a quick query record.
     *
     * @param quickQueryRecord The quick query record.
     * @return The optional data in the record.
     */
    private Mono<ByteBuffer> parseRecord(Object quickQueryRecord) {
        if (!(quickQueryRecord instanceof Map)) {
            return Mono.error(new IllegalArgumentException("Expected object to be of type Map"));
        }
        Map<?, ?> record = (Map<?, ?>) quickQueryRecord;
        Object recordSchema = record.get(AvroConstants.RECORD);

        switch (recordSchema.toString()) {
            case "resultData":
                return parseResultData(record);
            case "end":
                return parseEnd(record);
            case "progress":
                return parseProgress(record);
            case "error":
                return parseError(record);
            default:
                return Mono.error(new IllegalStateException(String.format("Unknown record type %s "
                    + "while parsing query response. ", recordSchema.toString())));
        }
    }

    /**
     * Parses a quick query result data record.
     * @param dataRecord The quick query result data record.
     * @return The data in the record.
     */
    private Mono<ByteBuffer> parseResultData(Map<?, ?> dataRecord) {
        Object data = dataRecord.get("data");

        if (checkParametersNotNull(data)) {
            AvroSchema.checkType("data", data, List.class);
            return Mono.just(ByteBuffer.wrap(AvroSchema.getBytes((List<?>) data)));
        } else {
            return Mono.error(new IllegalArgumentException("Failed to parse result data record from "
                + "query response stream."));
        }
    }

    /**
     * Parses a quick query end record.
     * @param endRecord The quick query end record.
     * @return Mono.empty or Mono.error
     */
    private Mono<ByteBuffer> parseEnd(Map<?, ?> endRecord) {
        if (progressReceiver != null) {
            Object total = endRecord.get("totalBytes");

            if (checkParametersNotNull(total)) {
                AvroSchema.checkType("total", total, Long.class);
                progressReceiver.reportProgress((Long) total);
            } else {
                return Mono.error(new IllegalArgumentException("Failed to parse end record from query "
                    + "response stream."));
            }
        }
        return Mono.empty();
    }

    /**
     * Parses a quick query progress record.
     * @param progressRecord The quick query progress record.
     * @return Mono.empty or Mono.error
     */
    private Mono<ByteBuffer> parseProgress(Map<?, ?> progressRecord) {
        if (progressReceiver != null) {
            Object bytesScanned = progressRecord.get("bytesScanned");

            if (checkParametersNotNull(bytesScanned)) {
                AvroSchema.checkType("bytesScanned", bytesScanned, Long.class);
                progressReceiver.reportProgress((Long) bytesScanned);
            } else {
                return Mono.error(new IllegalArgumentException("Failed to parse progress record from "
                    + "query response stream."));
            }
        }
        return Mono.empty();
    }

    /**
     * Parses a quick query error record.
     * @param errorRecord The quick query error record.
     * @return Mono.empty or Mono.error
     */
    private Mono<ByteBuffer> parseError(Map<?, ?> errorRecord) {
        Object fatal = errorRecord.get("fatal");
        Object name = errorRecord.get("name");
        Object description = errorRecord.get("description");
        Object position = errorRecord.get("position");

        if (checkParametersNotNull(fatal, name, description, position)) {
            AvroSchema.checkType("fatal", fatal, Boolean.class);
            AvroSchema.checkType("name", name, String.class);
            AvroSchema.checkType("description", description, String.class);
            AvroSchema.checkType("position", position, Long.class);

            BlobQueryError error = new BlobQueryError((Boolean) fatal, (String) name,
                (String) description, (Long) position);

            if (errorReceiver != null) {
                errorReceiver.reportError(error);
            } else {
                return Mono.error(new IOException("An error was reported during query response processing, "
                    + System.lineSeparator() + error.toString()));
            }
        } else {
            return Mono.error(new IllegalArgumentException("Failed to parse error record from "
                + "query response stream."));
        }
        return Mono.empty();
    }

    /**
     * Checks whether or not all parameters are non-null.
     */
    private static boolean checkParametersNotNull(Object... data) {
        for (Object o : data) {
            if (o == null || o instanceof AvroNullSchema.Null) {
                return false;
            }
        }
        return true;
    }

    /**
     * Transforms a generic BlobQuickQuerySerialization into a QuickQuerySerialization.
     * @param userSerialization {@link BlobQuerySerialization}
     * @param logger {@link ClientLogger}
     * @return {@link QuickQuerySerialization}
     */
    public static QuickQuerySerialization transformSerialization(BlobQuerySerialization userSerialization,
        ClientLogger logger) {
        if (userSerialization == null) {
            return null;
        }

        QuickQueryFormat generatedFormat = new QuickQueryFormat();
        if (userSerialization instanceof BlobQueryDelimitedSerialization) {

            generatedFormat.setType(QuickQueryFormatType.DELIMITED);
            generatedFormat.setDelimitedTextConfiguration(transformDelimited(
                (BlobQueryDelimitedSerialization) userSerialization));

        } else if (userSerialization instanceof BlobQueryJsonSerialization) {

            generatedFormat.setType(QuickQueryFormatType.JSON);
            generatedFormat.setJsonTextConfiguration(transformJson(
                (BlobQueryJsonSerialization) userSerialization));

        } else {
            throw logger.logExceptionAsError(new IllegalArgumentException(
                String.format("'input' must be one of %s or %s", BlobQueryJsonSerialization.class.getSimpleName(),
                    BlobQueryDelimitedSerialization.class.getSimpleName())));
        }
        return new QuickQuerySerialization().setFormat(generatedFormat);
    }

    /**
     * Transforms a BlobQuickQueryDelimitedSerialization into a DelimitedTextConfiguration.
     *
     * @param delimitedSerialization {@link BlobQueryDelimitedSerialization}
     * @return {@link DelimitedTextConfiguration}
     */
    private static DelimitedTextConfiguration transformDelimited(
        BlobQueryDelimitedSerialization delimitedSerialization) {
        if (delimitedSerialization == null) {
            return null;
        }
        return new DelimitedTextConfiguration()
            .setColumnSeparator(charToString(delimitedSerialization.getColumnSeparator()))
            .setEscapeChar(charToString(delimitedSerialization.getEscapeChar()))
            .setFieldQuote(charToString(delimitedSerialization.getFieldQuote()))
            .setHeadersPresent(delimitedSerialization.isHeadersPresent())
            .setRecordSeparator(charToString(delimitedSerialization.getRecordSeparator()));
    }

    /**
     * Transforms a BlobQuickQueryJsonSerialization into a JsonTextConfiguration.
     *
     * @param jsonSerialization {@link BlobQueryJsonSerialization}
     * @return {@link JsonTextConfiguration}
     */
    private static JsonTextConfiguration transformJson(BlobQueryJsonSerialization jsonSerialization) {
        if (jsonSerialization == null) {
            return null;
        }
        return new JsonTextConfiguration()
            .setRecordSeparator(charToString(jsonSerialization.getRecordSeparator()));
    }

    private static String charToString(char c) {
        return c == '\0' ? "" : Character.toString(c);
    }
}
