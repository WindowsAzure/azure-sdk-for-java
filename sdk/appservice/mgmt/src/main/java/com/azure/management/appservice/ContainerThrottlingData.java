// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContainerThrottlingData model. */
@Fluent
public final class ContainerThrottlingData {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerThrottlingData.class);

    /*
     * The periods property.
     */
    @JsonProperty(value = "periods")
    private Integer periods;

    /*
     * The throttledPeriods property.
     */
    @JsonProperty(value = "throttledPeriods")
    private Integer throttledPeriods;

    /*
     * The throttledTime property.
     */
    @JsonProperty(value = "throttledTime")
    private Integer throttledTime;

    /**
     * Get the periods property: The periods property.
     *
     * @return the periods value.
     */
    public Integer periods() {
        return this.periods;
    }

    /**
     * Set the periods property: The periods property.
     *
     * @param periods the periods value to set.
     * @return the ContainerThrottlingData object itself.
     */
    public ContainerThrottlingData withPeriods(Integer periods) {
        this.periods = periods;
        return this;
    }

    /**
     * Get the throttledPeriods property: The throttledPeriods property.
     *
     * @return the throttledPeriods value.
     */
    public Integer throttledPeriods() {
        return this.throttledPeriods;
    }

    /**
     * Set the throttledPeriods property: The throttledPeriods property.
     *
     * @param throttledPeriods the throttledPeriods value to set.
     * @return the ContainerThrottlingData object itself.
     */
    public ContainerThrottlingData withThrottledPeriods(Integer throttledPeriods) {
        this.throttledPeriods = throttledPeriods;
        return this;
    }

    /**
     * Get the throttledTime property: The throttledTime property.
     *
     * @return the throttledTime value.
     */
    public Integer throttledTime() {
        return this.throttledTime;
    }

    /**
     * Set the throttledTime property: The throttledTime property.
     *
     * @param throttledTime the throttledTime value to set.
     * @return the ContainerThrottlingData object itself.
     */
    public ContainerThrottlingData withThrottledTime(Integer throttledTime) {
        this.throttledTime = throttledTime;
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
