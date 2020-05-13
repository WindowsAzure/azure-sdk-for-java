// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for TimeAggregationType. */
public enum TimeAggregationType {
    /** Enum value Average. */
    AVERAGE("Average"),

    /** Enum value Minimum. */
    MINIMUM("Minimum"),

    /** Enum value Maximum. */
    MAXIMUM("Maximum"),

    /** Enum value Total. */
    TOTAL("Total"),

    /** Enum value Count. */
    COUNT("Count"),

    /** Enum value Last. */
    LAST("Last");

    /** The actual serialized value for a TimeAggregationType instance. */
    private final String value;

    TimeAggregationType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TimeAggregationType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TimeAggregationType object, or null if unable to parse.
     */
    @JsonCreator
    public static TimeAggregationType fromString(String value) {
        TimeAggregationType[] items = TimeAggregationType.values();
        for (TimeAggregationType item : items) {
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
