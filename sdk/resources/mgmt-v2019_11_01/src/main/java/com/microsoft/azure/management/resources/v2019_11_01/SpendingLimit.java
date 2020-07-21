/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SpendingLimit.
 */
public enum SpendingLimit {
    /** Enum value On. */
    ON("On"),

    /** Enum value Off. */
    OFF("Off"),

    /** Enum value CurrentPeriodOff. */
    CURRENT_PERIOD_OFF("CurrentPeriodOff");

    /** The actual serialized value for a SpendingLimit instance. */
    private String value;

    SpendingLimit(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SpendingLimit instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SpendingLimit object, or null if unable to parse.
     */
    @JsonCreator
    public static SpendingLimit fromString(String value) {
        SpendingLimit[] items = SpendingLimit.values();
        for (SpendingLimit item : items) {
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
