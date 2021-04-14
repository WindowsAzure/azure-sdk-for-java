// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** Constraints associated with the Job. */
@Fluent
public final class JobBasePropertiesConstraints {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobBasePropertiesConstraints.class);

    /*
     * Max time the job can run. Default value: 1 week.
     */
    @JsonProperty(value = "maxWallClockTime")
    private Duration maxWallClockTime;

    /**
     * Get the maxWallClockTime property: Max time the job can run. Default value: 1 week.
     *
     * @return the maxWallClockTime value.
     */
    public Duration maxWallClockTime() {
        return this.maxWallClockTime;
    }

    /**
     * Set the maxWallClockTime property: Max time the job can run. Default value: 1 week.
     *
     * @param maxWallClockTime the maxWallClockTime value to set.
     * @return the JobBasePropertiesConstraints object itself.
     */
    public JobBasePropertiesConstraints withMaxWallClockTime(Duration maxWallClockTime) {
        this.maxWallClockTime = maxWallClockTime;
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
