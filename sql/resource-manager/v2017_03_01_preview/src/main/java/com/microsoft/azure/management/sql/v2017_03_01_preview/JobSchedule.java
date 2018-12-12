/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Scheduling properties of a job.
 */
public class JobSchedule {
    /**
     * Schedule start time.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * Schedule end time.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * Schedule interval type. Possible values include: 'Once', 'Recurring'.
     */
    @JsonProperty(value = "type")
    private JobScheduleType type;

    /**
     * Whether or not the schedule is enabled.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Value of the schedule's recurring interval, if the scheduletype is
     * recurring. ISO8601 duration format.
     */
    @JsonProperty(value = "interval")
    private String interval;

    /**
     * Get schedule start time.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set schedule start time.
     *
     * @param startTime the startTime value to set
     * @return the JobSchedule object itself.
     */
    public JobSchedule withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get schedule end time.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set schedule end time.
     *
     * @param endTime the endTime value to set
     * @return the JobSchedule object itself.
     */
    public JobSchedule withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get schedule interval type. Possible values include: 'Once', 'Recurring'.
     *
     * @return the type value
     */
    public JobScheduleType type() {
        return this.type;
    }

    /**
     * Set schedule interval type. Possible values include: 'Once', 'Recurring'.
     *
     * @param type the type value to set
     * @return the JobSchedule object itself.
     */
    public JobSchedule withType(JobScheduleType type) {
        this.type = type;
        return this;
    }

    /**
     * Get whether or not the schedule is enabled.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set whether or not the schedule is enabled.
     *
     * @param enabled the enabled value to set
     * @return the JobSchedule object itself.
     */
    public JobSchedule withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get value of the schedule's recurring interval, if the scheduletype is recurring. ISO8601 duration format.
     *
     * @return the interval value
     */
    public String interval() {
        return this.interval;
    }

    /**
     * Set value of the schedule's recurring interval, if the scheduletype is recurring. ISO8601 duration format.
     *
     * @param interval the interval value to set
     * @return the JobSchedule object itself.
     */
    public JobSchedule withInterval(String interval) {
        this.interval = interval;
        return this;
    }

}
