// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for PauseDelayTimeUnit. */
public enum PauseDelayTimeUnit {
    /** Enum value Minutes. */
    MINUTES("Minutes");

    /** The actual serialized value for a PauseDelayTimeUnit instance. */
    private final String value;

    PauseDelayTimeUnit(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PauseDelayTimeUnit instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PauseDelayTimeUnit object, or null if unable to parse.
     */
    @JsonCreator
    public static PauseDelayTimeUnit fromString(String value) {
        PauseDelayTimeUnit[] items = PauseDelayTimeUnit.values();
        for (PauseDelayTimeUnit item : items) {
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
