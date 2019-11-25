/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import org.joda.time.DateTime;
import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DPM workload-specific job task details.
 */
public class DpmJobTaskDetails {
    /**
     * The task display name.
     */
    @JsonProperty(value = "taskId")
    private String taskId;

    /**
     * The start time.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * The end time.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * Time elapsed for task.
     */
    @JsonProperty(value = "duration")
    private Period duration;

    /**
     * The status.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Get the task display name.
     *
     * @return the taskId value
     */
    public String taskId() {
        return this.taskId;
    }

    /**
     * Set the task display name.
     *
     * @param taskId the taskId value to set
     * @return the DpmJobTaskDetails object itself.
     */
    public DpmJobTaskDetails withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Get the start time.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the start time.
     *
     * @param startTime the startTime value to set
     * @return the DpmJobTaskDetails object itself.
     */
    public DpmJobTaskDetails withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the end time.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the end time.
     *
     * @param endTime the endTime value to set
     * @return the DpmJobTaskDetails object itself.
     */
    public DpmJobTaskDetails withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get time elapsed for task.
     *
     * @return the duration value
     */
    public Period duration() {
        return this.duration;
    }

    /**
     * Set time elapsed for task.
     *
     * @param duration the duration value to set
     * @return the DpmJobTaskDetails object itself.
     */
    public DpmJobTaskDetails withDuration(Period duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get the status.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status.
     *
     * @param status the status value to set
     * @return the DpmJobTaskDetails object itself.
     */
    public DpmJobTaskDetails withStatus(String status) {
        this.status = status;
        return this;
    }

}
