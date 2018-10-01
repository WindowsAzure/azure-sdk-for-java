/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The recurrence schedule occurence.
 */
public class RecurrenceScheduleOccurrence {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

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
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the RecurrenceScheduleOccurrence object itself.
     */
    public RecurrenceScheduleOccurrence withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the day of the week. Possible values include: 'Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'.
     *
     * @return the day value
     */
    public DayOfWeek day() {
        return this.day;
    }

    /**
     * Set the day of the week. Possible values include: 'Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'.
     *
     * @param day the day value to set
     * @return the RecurrenceScheduleOccurrence object itself.
     */
    public RecurrenceScheduleOccurrence withDay(DayOfWeek day) {
        this.day = day;
        return this;
    }

    /**
     * Get the occurrence.
     *
     * @return the occurrence value
     */
    public Integer occurrence() {
        return this.occurrence;
    }

    /**
     * Set the occurrence.
     *
     * @param occurrence the occurrence value to set
     * @return the RecurrenceScheduleOccurrence object itself.
     */
    public RecurrenceScheduleOccurrence withOccurrence(Integer occurrence) {
        this.occurrence = occurrence;
        return this;
    }

}
