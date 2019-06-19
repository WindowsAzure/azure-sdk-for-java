/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_03_01.implementation;

import com.microsoft.azure.management.batchai.v2018_03_01.UsageName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes Batch AI Resource Usage.
 */
public class UsageInner {
    /**
     * An enum describing the unit of usage measurement.
     */
    @JsonProperty(value = "unit", required = true)
    private String unit;

    /**
     * The current usage of the resource.
     */
    @JsonProperty(value = "currentValue", required = true)
    private int currentValue;

    /**
     * The maximum permitted usage of the resource.
     */
    @JsonProperty(value = "limit", required = true)
    private long limit;

    /**
     * The name of the type of usage.
     */
    @JsonProperty(value = "name", required = true)
    private UsageName name;

    /**
     * Creates an instance of UsageInner class.
     * @param currentValue the current usage of the resource.
     * @param limit the maximum permitted usage of the resource.
     * @param name the name of the type of usage.
     */
    public UsageInner() {
        unit = "Count";
    }

    /**
     * Get an enum describing the unit of usage measurement.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set an enum describing the unit of usage measurement.
     *
     * @param unit the unit value to set
     * @return the UsageInner object itself.
     */
    public UsageInner withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the current usage of the resource.
     *
     * @return the currentValue value
     */
    public int currentValue() {
        return this.currentValue;
    }

    /**
     * Set the current usage of the resource.
     *
     * @param currentValue the currentValue value to set
     * @return the UsageInner object itself.
     */
    public UsageInner withCurrentValue(int currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the maximum permitted usage of the resource.
     *
     * @return the limit value
     */
    public long limit() {
        return this.limit;
    }

    /**
     * Set the maximum permitted usage of the resource.
     *
     * @param limit the limit value to set
     * @return the UsageInner object itself.
     */
    public UsageInner withLimit(long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the name of the type of usage.
     *
     * @return the name value
     */
    public UsageName name() {
        return this.name;
    }

    /**
     * Set the name of the type of usage.
     *
     * @param name the name value to set
     * @return the UsageInner object itself.
     */
    public UsageInner withName(UsageName name) {
        this.name = name;
        return this;
    }

}
