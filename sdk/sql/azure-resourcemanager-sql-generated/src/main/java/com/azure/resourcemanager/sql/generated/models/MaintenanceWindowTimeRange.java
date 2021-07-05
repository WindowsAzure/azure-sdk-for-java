// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Maintenance window time range. */
@Fluent
public final class MaintenanceWindowTimeRange {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MaintenanceWindowTimeRange.class);

    /*
     * Day of maintenance window.
     */
    @JsonProperty(value = "dayOfWeek")
    private DayOfWeek dayOfWeek;

    /*
     * Start time minutes offset from 12am.
     */
    @JsonProperty(value = "startTime")
    private String startTime;

    /*
     * Duration of maintenance window in minutes.
     */
    @JsonProperty(value = "duration")
    private String duration;

    /**
     * Get the dayOfWeek property: Day of maintenance window.
     *
     * @return the dayOfWeek value.
     */
    public DayOfWeek dayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * Set the dayOfWeek property: Day of maintenance window.
     *
     * @param dayOfWeek the dayOfWeek value to set.
     * @return the MaintenanceWindowTimeRange object itself.
     */
    public MaintenanceWindowTimeRange withDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    /**
     * Get the startTime property: Start time minutes offset from 12am.
     *
     * @return the startTime value.
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time minutes offset from 12am.
     *
     * @param startTime the startTime value to set.
     * @return the MaintenanceWindowTimeRange object itself.
     */
    public MaintenanceWindowTimeRange withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the duration property: Duration of maintenance window in minutes.
     *
     * @return the duration value.
     */
    public String duration() {
        return this.duration;
    }

    /**
     * Set the duration property: Duration of maintenance window in minutes.
     *
     * @param duration the duration value to set.
     * @return the MaintenanceWindowTimeRange object itself.
     */
    public MaintenanceWindowTimeRange withDuration(String duration) {
        this.duration = duration;
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
