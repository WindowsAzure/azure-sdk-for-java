/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler.v2016_03_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for JobScheduleDay.
 */
public enum JobScheduleDay {
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
    SATURDAY("Saturday"),

    /** Enum value Sunday. */
    SUNDAY("Sunday");

    /** The actual serialized value for a JobScheduleDay instance. */
    private String value;

    JobScheduleDay(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a JobScheduleDay instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed JobScheduleDay object, or null if unable to parse.
     */
    @JsonCreator
    public static JobScheduleDay fromString(String value) {
        JobScheduleDay[] items = JobScheduleDay.values();
        for (JobScheduleDay item : items) {
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
