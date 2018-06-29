/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ScheduleRunType.
 */
public enum ScheduleRunType {
    /** Enum value Invalid. */
    INVALID("Invalid"),

    /** Enum value Daily. */
    DAILY("Daily"),

    /** Enum value Weekly. */
    WEEKLY("Weekly");

    /** The actual serialized value for a ScheduleRunType instance. */
    private String value;

    ScheduleRunType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ScheduleRunType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ScheduleRunType object, or null if unable to parse.
     */
    @JsonCreator
    public static ScheduleRunType fromString(String value) {
        ScheduleRunType[] items = ScheduleRunType.values();
        for (ScheduleRunType item : items) {
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
