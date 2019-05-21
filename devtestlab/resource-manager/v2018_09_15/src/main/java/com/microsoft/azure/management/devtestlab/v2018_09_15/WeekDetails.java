/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of a weekly schedule.
 */
public class WeekDetails {
    /**
     * The days of the week for which the schedule is set (e.g. Sunday, Monday,
     * Tuesday, etc.).
     */
    @JsonProperty(value = "weekdays")
    private List<String> weekdays;

    /**
     * The time of the day the schedule will occur.
     */
    @JsonProperty(value = "time")
    private String time;

    /**
     * Get the days of the week for which the schedule is set (e.g. Sunday, Monday, Tuesday, etc.).
     *
     * @return the weekdays value
     */
    public List<String> weekdays() {
        return this.weekdays;
    }

    /**
     * Set the days of the week for which the schedule is set (e.g. Sunday, Monday, Tuesday, etc.).
     *
     * @param weekdays the weekdays value to set
     * @return the WeekDetails object itself.
     */
    public WeekDetails withWeekdays(List<String> weekdays) {
        this.weekdays = weekdays;
        return this;
    }

    /**
     * Get the time of the day the schedule will occur.
     *
     * @return the time value
     */
    public String time() {
        return this.time;
    }

    /**
     * Set the time of the day the schedule will occur.
     *
     * @param time the time value to set
     * @return the WeekDetails object itself.
     */
    public WeekDetails withTime(String time) {
        this.time = time;
        return this;
    }

}
