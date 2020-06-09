// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Availability model. */
@Fluent
public final class Availability {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Availability.class);

    /*
     * The time grain of the availability.
     */
    @JsonProperty(value = "timeGrain")
    private String timeGrain;

    /*
     * The retention of the availability.
     */
    @JsonProperty(value = "retention")
    private String retention;

    /*
     * Duration of the availability blob.
     */
    @JsonProperty(value = "blobDuration")
    private String blobDuration;

    /**
     * Get the timeGrain property: The time grain of the availability.
     *
     * @return the timeGrain value.
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * Set the timeGrain property: The time grain of the availability.
     *
     * @param timeGrain the timeGrain value to set.
     * @return the Availability object itself.
     */
    public Availability withTimeGrain(String timeGrain) {
        this.timeGrain = timeGrain;
        return this;
    }

    /**
     * Get the retention property: The retention of the availability.
     *
     * @return the retention value.
     */
    public String retention() {
        return this.retention;
    }

    /**
     * Set the retention property: The retention of the availability.
     *
     * @param retention the retention value to set.
     * @return the Availability object itself.
     */
    public Availability withRetention(String retention) {
        this.retention = retention;
        return this;
    }

    /**
     * Get the blobDuration property: Duration of the availability blob.
     *
     * @return the blobDuration value.
     */
    public String blobDuration() {
        return this.blobDuration;
    }

    /**
     * Set the blobDuration property: Duration of the availability blob.
     *
     * @param blobDuration the blobDuration value to set.
     * @return the Availability object itself.
     */
    public Availability withBlobDuration(String blobDuration) {
        this.blobDuration = blobDuration;
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
