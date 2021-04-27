// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.anomalydetector.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for AlignMode. */
public enum AlignMode {
    /** Enum value Inner. */
    INNER("Inner"),

    /** Enum value Outer. */
    OUTER("Outer");

    /** The actual serialized value for a AlignMode instance. */
    private final String value;

    AlignMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AlignMode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AlignMode object, or null if unable to parse.
     */
    @JsonCreator
    public static AlignMode fromString(String value) {
        AlignMode[] items = AlignMode.values();
        for (AlignMode item : items) {
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
