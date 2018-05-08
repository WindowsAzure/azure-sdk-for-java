/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DaysOfWeek.
 */
public enum DaysOfWeek {
    /** Enum value Sunday. */
    SUNDAY("Sunday"),

    /** Enum value Monday. */
    MONDAY("Monday"),

    /** Enum value Tuesday. */
    TUESDAY("Tuesday"),

    /** Enum value Wednesday. */
    WEDNESDAY("Wednesday"),

    /** Enum value Thursday. */
    THURSDAY("Thursday"),

    /** Enum value Friday. */
    FRIDAY("Friday"),

    /** Enum value Saturday. */
    SATURDAY("Saturday");

    /** The actual serialized value for a DaysOfWeek instance. */
    private String value;

    DaysOfWeek(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DaysOfWeek instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DaysOfWeek object, or null if unable to parse.
     */
    @JsonCreator
    public static DaysOfWeek fromString(String value) {
        DaysOfWeek[] items = DaysOfWeek.values();
        for (DaysOfWeek item : items) {
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
