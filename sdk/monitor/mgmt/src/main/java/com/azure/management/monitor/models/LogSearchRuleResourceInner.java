// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.monitor.Action;
import com.azure.management.monitor.Enabled;
import com.azure.management.monitor.ProvisioningState;
import com.azure.management.monitor.Schedule;
import com.azure.management.monitor.Source;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The LogSearchRuleResource model. */
@JsonFlatten
@Fluent
public class LogSearchRuleResourceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LogSearchRuleResourceInner.class);

    /*
     * The description of the Log Search rule.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The flag which indicates whether the Log Search rule is enabled. Value
     * should be true or false
     */
    @JsonProperty(value = "properties.enabled")
    private Enabled enabled;

    /*
     * Last time the rule was updated in IS08601 format.
     */
    @JsonProperty(value = "properties.lastUpdatedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedTime;

    /*
     * Provisioning state of the scheduled query rule
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Data Source against which rule will Query Data
     */
    @JsonProperty(value = "properties.source", required = true)
    private Source source;

    /*
     * Schedule (Frequency, Time Window) for rule. Required for action type -
     * AlertingAction
     */
    @JsonProperty(value = "properties.schedule")
    private Schedule schedule;

    /*
     * Action needs to be taken on rule execution.
     */
    @JsonProperty(value = "properties.action", required = true)
    private Action action;

    /**
     * Get the description property: The description of the Log Search rule.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the Log Search rule.
     *
     * @param description the description value to set.
     * @return the LogSearchRuleResourceInner object itself.
     */
    public LogSearchRuleResourceInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the enabled property: The flag which indicates whether the Log Search rule is enabled. Value should be true
     * or false.
     *
     * @return the enabled value.
     */
    public Enabled enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: The flag which indicates whether the Log Search rule is enabled. Value should be true
     * or false.
     *
     * @param enabled the enabled value to set.
     * @return the LogSearchRuleResourceInner object itself.
     */
    public LogSearchRuleResourceInner withEnabled(Enabled enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the lastUpdatedTime property: Last time the rule was updated in IS08601 format.
     *
     * @return the lastUpdatedTime value.
     */
    public OffsetDateTime lastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * Get the provisioningState property: Provisioning state of the scheduled query rule.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the source property: Data Source against which rule will Query Data.
     *
     * @return the source value.
     */
    public Source source() {
        return this.source;
    }

    /**
     * Set the source property: Data Source against which rule will Query Data.
     *
     * @param source the source value to set.
     * @return the LogSearchRuleResourceInner object itself.
     */
    public LogSearchRuleResourceInner withSource(Source source) {
        this.source = source;
        return this;
    }

    /**
     * Get the schedule property: Schedule (Frequency, Time Window) for rule. Required for action type - AlertingAction.
     *
     * @return the schedule value.
     */
    public Schedule schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: Schedule (Frequency, Time Window) for rule. Required for action type - AlertingAction.
     *
     * @param schedule the schedule value to set.
     * @return the LogSearchRuleResourceInner object itself.
     */
    public LogSearchRuleResourceInner withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get the action property: Action needs to be taken on rule execution.
     *
     * @return the action value.
     */
    public Action action() {
        return this.action;
    }

    /**
     * Set the action property: Action needs to be taken on rule execution.
     *
     * @param action the action value to set.
     * @return the LogSearchRuleResourceInner object itself.
     */
    public LogSearchRuleResourceInner withAction(Action action) {
        this.action = action;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property source in model LogSearchRuleResourceInner"));
        } else {
            source().validate();
        }
        if (schedule() != null) {
            schedule().validate();
        }
        if (action() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property action in model LogSearchRuleResourceInner"));
        } else {
            action().validate();
        }
    }
}
