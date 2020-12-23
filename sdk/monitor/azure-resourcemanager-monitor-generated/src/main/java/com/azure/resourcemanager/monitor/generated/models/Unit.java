// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for Unit. */
public enum Unit {
    /** Enum value Count. */
    COUNT("Count"),

    /** Enum value Bytes. */
    BYTES("Bytes"),

    /** Enum value Seconds. */
    SECONDS("Seconds"),

    /** Enum value CountPerSecond. */
    COUNT_PER_SECOND("CountPerSecond"),

    /** Enum value BytesPerSecond. */
    BYTES_PER_SECOND("BytesPerSecond"),

    /** Enum value Percent. */
    PERCENT("Percent"),

    /** Enum value MilliSeconds. */
    MILLI_SECONDS("MilliSeconds"),

    /** Enum value ByteSeconds. */
    BYTE_SECONDS("ByteSeconds"),

    /** Enum value Unspecified. */
    UNSPECIFIED("Unspecified"),

    /** Enum value Cores. */
    CORES("Cores"),

    /** Enum value MilliCores. */
    MILLI_CORES("MilliCores"),

    /** Enum value NanoCores. */
    NANO_CORES("NanoCores"),

    /** Enum value BitsPerSecond. */
    BITS_PER_SECOND("BitsPerSecond");

    /** The actual serialized value for a Unit instance. */
    private final String value;

    Unit(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Unit instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed Unit object, or null if unable to parse.
     */
    @JsonCreator
    public static Unit fromString(String value) {
        Unit[] items = Unit.values();
        for (Unit item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
