// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for IntervalInMins. */
public enum IntervalInMins {
    /** Enum value ThreeMins. */
    THREE_MINS("ThreeMins"),

    /** Enum value FiveMins. */
    FIVE_MINS("FiveMins"),

    /** Enum value ThirtyMins. */
    THIRTY_MINS("ThirtyMins"),

    /** Enum value SixtyMins. */
    SIXTY_MINS("SixtyMins");

    /** The actual serialized value for a IntervalInMins instance. */
    private final String value;

    IntervalInMins(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a IntervalInMins instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed IntervalInMins object, or null if unable to parse.
     */
    @JsonCreator
    public static IntervalInMins fromString(String value) {
        IntervalInMins[] items = IntervalInMins.values();
        for (IntervalInMins item : items) {
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
