/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for WeekOfMonth.
 */
public enum WeekOfMonth {
    /** Enum value First. */
    FIRST("First"),

    /** Enum value Second. */
    SECOND("Second"),

    /** Enum value Third. */
    THIRD("Third"),

    /** Enum value Fourth. */
    FOURTH("Fourth"),

    /** Enum value Last. */
    LAST("Last");

    /** The actual serialized value for a WeekOfMonth instance. */
    private String value;

    WeekOfMonth(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a WeekOfMonth instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed WeekOfMonth object, or null if unable to parse.
     */
    @JsonCreator
    public static WeekOfMonth fromString(String value) {
        WeekOfMonth[] items = WeekOfMonth.values();
        for (WeekOfMonth item : items) {
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
