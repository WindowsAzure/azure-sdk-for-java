// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.Recurrence;
import com.azure.resourcemanager.monitor.ScaleCapacity;
import com.azure.resourcemanager.monitor.TimeWindow;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AutoscaleProfile model. */
@Fluent
public final class AutoscaleProfileInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AutoscaleProfileInner.class);

    /*
     * the name of the profile.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * the number of instances that can be used during this profile.
     */
    @JsonProperty(value = "capacity", required = true)
    private ScaleCapacity capacity;

    /*
     * the collection of rules that provide the triggers and parameters for the
     * scaling action. A maximum of 10 rules can be specified.
     */
    @JsonProperty(value = "rules", required = true)
    private List<ScaleRuleInner> rules;

    /*
     * the specific date-time for the profile. This element is not used if the
     * Recurrence element is used.
     */
    @JsonProperty(value = "fixedDate")
    private TimeWindow fixedDate;

    /*
     * the repeating times at which this profile begins. This element is not
     * used if the FixedDate element is used.
     */
    @JsonProperty(value = "recurrence")
    private Recurrence recurrence;

    /**
     * Get the name property: the name of the profile.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: the name of the profile.
     *
     * @param name the name value to set.
     * @return the AutoscaleProfileInner object itself.
     */
    public AutoscaleProfileInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the capacity property: the number of instances that can be used during this profile.
     *
     * @return the capacity value.
     */
    public ScaleCapacity capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: the number of instances that can be used during this profile.
     *
     * @param capacity the capacity value to set.
     * @return the AutoscaleProfileInner object itself.
     */
    public AutoscaleProfileInner withCapacity(ScaleCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the rules property: the collection of rules that provide the triggers and parameters for the scaling action.
     * A maximum of 10 rules can be specified.
     *
     * @return the rules value.
     */
    public List<ScaleRuleInner> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: the collection of rules that provide the triggers and parameters for the scaling action.
     * A maximum of 10 rules can be specified.
     *
     * @param rules the rules value to set.
     * @return the AutoscaleProfileInner object itself.
     */
    public AutoscaleProfileInner withRules(List<ScaleRuleInner> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get the fixedDate property: the specific date-time for the profile. This element is not used if the Recurrence
     * element is used.
     *
     * @return the fixedDate value.
     */
    public TimeWindow fixedDate() {
        return this.fixedDate;
    }

    /**
     * Set the fixedDate property: the specific date-time for the profile. This element is not used if the Recurrence
     * element is used.
     *
     * @param fixedDate the fixedDate value to set.
     * @return the AutoscaleProfileInner object itself.
     */
    public AutoscaleProfileInner withFixedDate(TimeWindow fixedDate) {
        this.fixedDate = fixedDate;
        return this;
    }

    /**
     * Get the recurrence property: the repeating times at which this profile begins. This element is not used if the
     * FixedDate element is used.
     *
     * @return the recurrence value.
     */
    public Recurrence recurrence() {
        return this.recurrence;
    }

    /**
     * Set the recurrence property: the repeating times at which this profile begins. This element is not used if the
     * FixedDate element is used.
     *
     * @param recurrence the recurrence value to set.
     * @return the AutoscaleProfileInner object itself.
     */
    public AutoscaleProfileInner withRecurrence(Recurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model AutoscaleProfileInner"));
        }
        if (capacity() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property capacity in model AutoscaleProfileInner"));
        } else {
            capacity().validate();
        }
        if (rules() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property rules in model AutoscaleProfileInner"));
        } else {
            rules().forEach(e -> e.validate());
        }
        if (fixedDate() != null) {
            fixedDate().validate();
        }
        if (recurrence() != null) {
            recurrence().validate();
        }
    }
}
