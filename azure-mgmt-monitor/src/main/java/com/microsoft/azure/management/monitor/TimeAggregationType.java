/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for TimeAggregationType.
 */
public enum TimeAggregationType {
    /** Enum value Average. */
    AVERAGE("Average"),

    /** Enum value Minimum. */
    MINIMUM("Minimum"),

    /** Enum value Maximum. */
    MAXIMUM("Maximum"),

    /** Enum value Total. */
    TOTAL("Total"),

    /** Enum value Last. */
    LAST("Last"),

    /** Enum value Count. */
    COUNT("Count");

    /** The actual serialized value for a TimeAggregationType instance. */
    private String value;

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
