// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for LengthUnit. */
public enum LengthUnit {
    /** Enum value pixel. */
    PIXEL("pixel"),

    /** Enum value inch. */
    INCH("inch");

    /** The actual serialized value for a LengthUnit instance. */
    private final String value;

    LengthUnit(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a LengthUnit instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed LengthUnit object, or null if unable to parse.
     */
    @JsonCreator
    public static LengthUnit fromString(String value) {
        LengthUnit[] items = LengthUnit.values();
        for (LengthUnit item : items) {
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
