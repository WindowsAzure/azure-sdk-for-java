// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for LogLevel. */
public enum LogLevel {
    /** Enum value Off. */
    OFF("Off"),

    /** Enum value Verbose. */
    VERBOSE("Verbose"),

    /** Enum value Information. */
    INFORMATION("Information"),

    /** Enum value Warning. */
    WARNING("Warning"),

    /** Enum value Error. */
    ERROR("Error");

    /** The actual serialized value for a LogLevel instance. */
    private final String value;

    LogLevel(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a LogLevel instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed LogLevel object, or null if unable to parse.
     */
    @JsonCreator
    public static LogLevel fromString(String value) {
        LogLevel[] items = LogLevel.values();
        for (LogLevel item : items) {
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
