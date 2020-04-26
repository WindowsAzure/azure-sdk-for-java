// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for CategoryType. */
public enum CategoryType {
    /** Enum value Metrics. */
    METRICS("Metrics"),

    /** Enum value Logs. */
    LOGS("Logs");

    /** The actual serialized value for a CategoryType instance. */
    private final String value;

    CategoryType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CategoryType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed CategoryType object, or null if unable to parse.
     */
    @JsonCreator
    public static CategoryType fromString(String value) {
        CategoryType[] items = CategoryType.values();
        for (CategoryType item : items) {
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
