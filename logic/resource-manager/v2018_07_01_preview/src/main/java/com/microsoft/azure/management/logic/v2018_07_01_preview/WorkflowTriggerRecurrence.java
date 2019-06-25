/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The workflow trigger recurrence.
 */
public class WorkflowTriggerRecurrence {
    /**
     * The frequency. Possible values include: 'NotSpecified', 'Second',
     * 'Minute', 'Hour', 'Day', 'Week', 'Month', 'Year'.
     */
    @JsonProperty(value = "frequency")
    private RecurrenceFrequency frequency;

    /**
     * The interval.
     */
    @JsonProperty(value = "interval")
    private Integer interval;

    /**
     * The start time.
     */
    @JsonProperty(value = "startTime")
    private String startTime;

    /**
     * The end time.
     */
    @JsonProperty(value = "endTime")
    private String endTime;

    /**
     * The time zone.
     */
    @JsonProperty(value = "timeZone")
    private String timeZone;

    /**
     * The recurrence schedule.
     */
    @JsonProperty(value = "schedule")
    private RecurrenceSchedule schedule;

    /**
     * Get the frequency. Possible values include: 'NotSpecified', 'Second', 'Minute', 'Hour', 'Day', 'Week', 'Month', 'Year'.
     *
     * @return the frequency value
     */
    public RecurrenceFrequency frequency() {
        return this.frequency;
    }

    /**
     * Set the frequency. Possible values include: 'NotSpecified', 'Second', 'Minute', 'Hour', 'Day', 'Week', 'Month', 'Year'.
     *
     * @param frequency the frequency value to set
     * @return the WorkflowTriggerRecurrence object itself.
     */
    public WorkflowTriggerRecurrence withFrequency(RecurrenceFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get the interval.
     *
     * @return the interval value
     */
    public Integer interval() {
        return this.interval;
    }

    /**
     * Set the interval.
     *
     * @param interval the interval value to set
     * @return the WorkflowTriggerRecurrence object itself.
     */
    public WorkflowTriggerRecurrence withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the start time.
     *
     * @return the startTime value
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Set the start time.
     *
     * @param startTime the startTime value to set
     * @return the WorkflowTriggerRecurrence object itself.
     */
    public WorkflowTriggerRecurrence withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the end time.
     *
     * @return the endTime value
     */
    public String endTime() {
        return this.endTime;
    }

    /**
     * Set the end time.
     *
     * @param endTime the endTime value to set
     * @return the WorkflowTriggerRecurrence object itself.
     */
    public WorkflowTriggerRecurrence withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the time zone.
     *
     * @return the timeZone value
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set the time zone.
     *
     * @param timeZone the timeZone value to set
     * @return the WorkflowTriggerRecurrence object itself.
     */
    public WorkflowTriggerRecurrence withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get the recurrence schedule.
     *
     * @return the schedule value
     */
    public RecurrenceSchedule schedule() {
        return this.schedule;
    }

    /**
     * Set the recurrence schedule.
     *
     * @param schedule the schedule value to set
     * @return the WorkflowTriggerRecurrence object itself.
     */
    public WorkflowTriggerRecurrence withSchedule(RecurrenceSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

}
