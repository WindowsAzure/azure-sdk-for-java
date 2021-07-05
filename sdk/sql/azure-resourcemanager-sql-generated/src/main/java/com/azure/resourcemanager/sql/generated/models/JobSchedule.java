// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Scheduling properties of a job. */
@Fluent
public final class JobSchedule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobSchedule.class);

    /*
     * Schedule start time.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * Schedule end time.
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * Schedule interval type
     */
    @JsonProperty(value = "type")
    private JobScheduleType type;

    /*
     * Whether or not the schedule is enabled.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Value of the schedule's recurring interval, if the ScheduleType is
     * recurring. ISO8601 duration format.
     */
    @JsonProperty(value = "interval")
    private String interval;

    /**
     * Get the startTime property: Schedule start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Schedule start time.
     *
     * @param startTime the startTime value to set.
     * @return the JobSchedule object itself.
     */
    public JobSchedule withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: Schedule end time.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: Schedule end time.
     *
     * @param endTime the endTime value to set.
     * @return the JobSchedule object itself.
     */
    public JobSchedule withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the type property: Schedule interval type.
     *
     * @return the type value.
     */
    public JobScheduleType type() {
        return this.type;
    }

    /**
     * Set the type property: Schedule interval type.
     *
     * @param type the type value to set.
     * @return the JobSchedule object itself.
     */
    public JobSchedule withType(JobScheduleType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the enabled property: Whether or not the schedule is enabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether or not the schedule is enabled.
     *
     * @param enabled the enabled value to set.
     * @return the JobSchedule object itself.
     */
    public JobSchedule withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the interval property: Value of the schedule's recurring interval, if the ScheduleType is recurring. ISO8601
     * duration format.
     *
     * @return the interval value.
     */
    public String interval() {
        return this.interval;
    }

    /**
     * Set the interval property: Value of the schedule's recurring interval, if the ScheduleType is recurring. ISO8601
     * duration format.
     *
     * @param interval the interval value to set.
     * @return the JobSchedule object itself.
     */
    public JobSchedule withInterval(String interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
