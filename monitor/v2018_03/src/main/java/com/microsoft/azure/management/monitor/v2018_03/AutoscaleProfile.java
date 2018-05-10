/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2018_03;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Autoscale profile.
 */
public class AutoscaleProfile {
    /**
     * the name of the profile.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * the number of instances that can be used during this profile.
     */
    @JsonProperty(value = "capacity", required = true)
    private ScaleCapacity capacity;

    /**
     * the collection of rules that provide the triggers and parameters for the
     * scaling action. A maximum of 10 rules can be specified.
     */
    @JsonProperty(value = "rules", required = true)
    private List<ScaleRule> rules;

    /**
     * the specific date-time for the profile. This element is not used if the
     * Recurrence element is used.
     */
    @JsonProperty(value = "fixedDate")
    private TimeWindow fixedDate;

    /**
     * the repeating times at which this profile begins. This element is not
     * used if the FixedDate element is used.
     */
    @JsonProperty(value = "recurrence")
    private Recurrence recurrence;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the AutoscaleProfile object itself.
     */
    public AutoscaleProfile withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the capacity value.
     *
     * @return the capacity value
     */
    public ScaleCapacity capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity value.
     *
     * @param capacity the capacity value to set
     * @return the AutoscaleProfile object itself.
     */
    public AutoscaleProfile withCapacity(ScaleCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the rules value.
     *
     * @return the rules value
     */
    public List<ScaleRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules value.
     *
     * @param rules the rules value to set
     * @return the AutoscaleProfile object itself.
     */
    public AutoscaleProfile withRules(List<ScaleRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get the fixedDate value.
     *
     * @return the fixedDate value
     */
    public TimeWindow fixedDate() {
        return this.fixedDate;
    }

    /**
     * Set the fixedDate value.
     *
     * @param fixedDate the fixedDate value to set
     * @return the AutoscaleProfile object itself.
     */
    public AutoscaleProfile withFixedDate(TimeWindow fixedDate) {
        this.fixedDate = fixedDate;
        return this;
    }

    /**
     * Get the recurrence value.
     *
     * @return the recurrence value
     */
    public Recurrence recurrence() {
        return this.recurrence;
    }

    /**
     * Set the recurrence value.
     *
     * @param recurrence the recurrence value to set
     * @return the AutoscaleProfile object itself.
     */
    public AutoscaleProfile withRecurrence(Recurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

}
