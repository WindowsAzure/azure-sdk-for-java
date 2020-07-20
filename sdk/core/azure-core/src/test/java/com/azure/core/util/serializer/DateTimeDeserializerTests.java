// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.util.serializer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for {@link DateTimeDeserializer}.
 */
public class DateTimeDeserializerTests {
    @ParameterizedTest
    @MethodSource("deserializeOffsetDateTimeSupplier")
    public void deserializeJson(String offsetDateTimeString, OffsetDateTime expected) {
        assertEquals(expected, DateTimeDeserializer.deserialize(offsetDateTimeString));
    }

    private static Stream<Arguments> deserializeOffsetDateTimeSupplier() {
        OffsetDateTime minValue = OffsetDateTime.of(1, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        OffsetDateTime unixEpoch = OffsetDateTime.of(1970, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);

        return Stream.of(
            Arguments.of("0001-01-01T00:00:00", minValue),
            Arguments.of("0001-01-01T00:00:00Z", minValue),
            Arguments.of("1970-01-01T00:00:00", unixEpoch),
            Arguments.of("1970-01-01T00:00:00Z", unixEpoch)
        );
    }
}
