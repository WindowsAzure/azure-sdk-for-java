// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.compute.UsageName;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Usage model. */
@Fluent
public final class UsageInner {
    /*
     * An enum describing the unit of usage measurement.
     */
    @JsonProperty(value = "unit", required = true)
    private String unit;

    /*
     * The current usage of the resource.
     */
    @JsonProperty(value = "currentValue", required = true)
    private int currentValue;

    /*
     * The maximum permitted usage of the resource.
     */
    @JsonProperty(value = "limit", required = true)
    private long limit;

    /*
     * The name of the type of usage.
     */
    @JsonProperty(value = "name", required = true)
    private UsageName name;

    /** Creates an instance of UsageInner class. */
    public UsageInner() {
        unit = "Count";
    }

    /**
     * Get the unit property: An enum describing the unit of usage measurement.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: An enum describing the unit of usage measurement.
     *
     * @param unit the unit value to set.
     * @return the UsageInner object itself.
     */
    public UsageInner withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the currentValue property: The current usage of the resource.
     *
     * @return the currentValue value.
     */
    public int currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue property: The current usage of the resource.
     *
     * @param currentValue the currentValue value to set.
     * @return the UsageInner object itself.
     */
    public UsageInner withCurrentValue(int currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the limit property: The maximum permitted usage of the resource.
     *
     * @return the limit value.
     */
    public long limit() {
        return this.limit;
    }

    /**
     * Set the limit property: The maximum permitted usage of the resource.
     *
     * @param limit the limit value to set.
     * @return the UsageInner object itself.
     */
    public UsageInner withLimit(long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the name property: The name of the type of usage.
     *
     * @return the name value.
     */
    public UsageName name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the type of usage.
     *
     * @param name the name value to set.
     * @return the UsageInner object itself.
     */
    public UsageInner withName(UsageName name) {
        this.name = name;
        return this;
    }
}
