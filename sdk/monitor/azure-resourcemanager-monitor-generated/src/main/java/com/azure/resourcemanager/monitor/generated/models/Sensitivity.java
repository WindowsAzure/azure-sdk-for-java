// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for Sensitivity. */
public enum Sensitivity {
    /** Enum value Low. */
    LOW("Low"),

    /** Enum value Medium. */
    MEDIUM("Medium"),

    /** Enum value High. */
    HIGH("High");

    /** The actual serialized value for a Sensitivity instance. */
    private final String value;

    Sensitivity(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Sensitivity instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed Sensitivity object, or null if unable to parse.
     */
    @JsonCreator
    public static Sensitivity fromString(String value) {
        Sensitivity[] items = Sensitivity.values();
        for (Sensitivity item : items) {
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
