// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MaxSizeRangeCapability model.
 */
@Fluent
public final class MaxSizeRangeCapability {
    /*
     * The maximum size capability.
     */
    @JsonProperty(value = "minValue", access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeCapability minValue;

    /*
     * The maximum size capability.
     */
    @JsonProperty(value = "maxValue", access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeCapability maxValue;

    /*
     * The maximum size capability.
     */
    @JsonProperty(value = "scaleSize", access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeCapability scaleSize;

    /*
     * The log size capability.
     */
    @JsonProperty(value = "logSize", access = JsonProperty.Access.WRITE_ONLY)
    private LogSizeCapability logSize;

    /*
     * The status of the capability.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /*
     * The reason for the capability not being available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * Get the minValue property: The maximum size capability.
     * 
     * @return the minValue value.
     */
    public MaxSizeCapability minValue() {
        return this.minValue;
    }

    /**
     * Get the maxValue property: The maximum size capability.
     * 
     * @return the maxValue value.
     */
    public MaxSizeCapability maxValue() {
        return this.maxValue;
    }

    /**
     * Get the scaleSize property: The maximum size capability.
     * 
     * @return the scaleSize value.
     */
    public MaxSizeCapability scaleSize() {
        return this.scaleSize;
    }

    /**
     * Get the logSize property: The log size capability.
     * 
     * @return the logSize value.
     */
    public LogSizeCapability logSize() {
        return this.logSize;
    }

    /**
     * Get the status property: The status of the capability.
     * 
     * @return the status value.
     */
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Get the reason property: The reason for the capability not being
     * available.
     * 
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason for the capability not being
     * available.
     * 
     * @param reason the reason value to set.
     * @return the MaxSizeRangeCapability object itself.
     */
    public MaxSizeRangeCapability withReason(String reason) {
        this.reason = reason;
        return this;
    }
}
