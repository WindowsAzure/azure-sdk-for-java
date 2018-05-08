/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The recurrence schedule occurrence.
 */
public class RecurrenceScheduleOccurrence {
    /**
     * The day of the week. Possible values include: 'Sunday', 'Monday',
     * 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'.
     */
    @JsonProperty(value = "day")
    private DayOfWeek day;

    /**
     * The occurrence.
     */
    @JsonProperty(value = "occurrence")
    private Integer occurrence;

    /**
     * Get the day value.
     *
     * @return the day value
     */
    public DayOfWeek day() {
        return this.day;
    }

    /**
     * Set the day value.
     *
     * @param day the day value to set
     * @return the RecurrenceScheduleOccurrence object itself.
     */
    public RecurrenceScheduleOccurrence withDay(DayOfWeek day) {
        this.day = day;
        return this;
    }

    /**
     * Get the occurrence value.
     *
     * @return the occurrence value
     */
    public Integer occurrence() {
        return this.occurrence;
    }

    /**
     * Set the occurrence value.
     *
     * @param occurrence the occurrence value to set
     * @return the RecurrenceScheduleOccurrence object itself.
     */
    public RecurrenceScheduleOccurrence withOccurrence(Integer occurrence) {
        this.occurrence = occurrence;
        return this;
    }

}
