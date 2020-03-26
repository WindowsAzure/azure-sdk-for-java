// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AutoPauseDelayTimeRange model.
 */
@Immutable
public final class AutoPauseDelayTimeRange {
    /*
     * Minimum value
     */
    @JsonProperty(value = "minValue", access = JsonProperty.Access.WRITE_ONLY)
    private Integer minValue;

    /*
     * Maximum value
     */
    @JsonProperty(value = "maxValue", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxValue;

    /*
     * Step value for discrete values between the minimum value and the maximum
     * value.
     */
    @JsonProperty(value = "stepSize", access = JsonProperty.Access.WRITE_ONLY)
    private Integer stepSize;

    /*
     * Default value is no value is provided
     */
    @JsonProperty(value = "default", access = JsonProperty.Access.WRITE_ONLY)
    private Integer defaultProperty;

    /*
     * Unit of time that delay is expressed in
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /*
     * Value that is used to not pause (infinite delay before pause)
     */
    @JsonProperty(value = "doNotPauseValue", access = JsonProperty.Access.WRITE_ONLY)
    private Integer doNotPauseValue;

    /**
     * Creates an instance of AutoPauseDelayTimeRange class.
     */
    public AutoPauseDelayTimeRange() {
        unit = "Minutes";
    }

    /**
     * Get the minValue property: Minimum value.
     * 
     * @return the minValue value.
     */
    public Integer minValue() {
        return this.minValue;
    }

    /**
     * Get the maxValue property: Maximum value.
     * 
     * @return the maxValue value.
     */
    public Integer maxValue() {
        return this.maxValue;
    }

    /**
     * Get the stepSize property: Step value for discrete values between the
     * minimum value and the maximum value.
     * 
     * @return the stepSize value.
     */
    public Integer stepSize() {
        return this.stepSize;
    }

    /**
     * Get the defaultProperty property: Default value is no value is provided.
     * 
     * @return the defaultProperty value.
     */
    public Integer defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Get the unit property: Unit of time that delay is expressed in.
     * 
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the doNotPauseValue property: Value that is used to not pause
     * (infinite delay before pause).
     * 
     * @return the doNotPauseValue value.
     */
    public Integer doNotPauseValue() {
        return this.doNotPauseValue;
    }
}
