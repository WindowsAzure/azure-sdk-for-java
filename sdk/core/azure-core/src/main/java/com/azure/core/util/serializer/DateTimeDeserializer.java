// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.util.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQueries;

/**
 * Custom deserializer that handles converting ISO8601 dates into {@link OffsetDateTime} objects.
 */
class DateTimeDeserializer extends JsonDeserializer<OffsetDateTime> {
    private static final SimpleModule MODULE;

    static {
        MODULE = new SimpleModule().addDeserializer(OffsetDateTime.class, new DateTimeDeserializer());
    }

    /**
     * Gets a module wrapping this deserializer as an adapter for the Jackson ObjectMapper.
     *
     * @return A {@link SimpleModule} to be plugged onto Jackson ObjectMapper.
     */
    public static SimpleModule getModule() {
        return MODULE;
    }

    @Override
    public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
        throws IOException {
        return deserialize(jsonParser.getValueAsString());
    }

    static OffsetDateTime deserialize(String offsetDateTimeString) {
        TemporalAccessor temporal = DateTimeFormatter.ISO_DATE_TIME
            .parseBest(offsetDateTimeString, OffsetDateTime::from, LocalDateTime::from);
        if (temporal.query(TemporalQueries.offset()) == null) {
            return LocalDateTime.from(temporal).atOffset(ZoneOffset.UTC);
        } else {
            return OffsetDateTime.from(temporal);
        }
    }
}
