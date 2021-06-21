// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** The alert rule object for patch operations. */
@JsonFlatten
@Fluent
public class AlertRuleResourcePatch {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AlertRuleResourcePatch.class);

    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * the name of the alert rule.
     */
    @JsonProperty(value = "properties.name")
    private String name;

    /*
     * the description of the alert rule that will be included in the alert
     * email.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * the provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /*
     * the flag that indicates whether the alert rule is enabled.
     */
    @JsonProperty(value = "properties.isEnabled")
    private Boolean isEnabled;

    /*
     * the condition that results in the alert rule being activated.
     */
    @JsonProperty(value = "properties.condition")
    private RuleCondition condition;

    /*
     * action that is performed when the alert rule becomes active, and when an
     * alert condition is resolved.
     */
    @JsonProperty(value = "properties.action")
    private RuleAction action;

    /*
     * the array of actions that are performed when the alert rule becomes
     * active, and when an alert condition is resolved.
     */
    @JsonProperty(value = "properties.actions")
    private List<RuleAction> actions;

    /*
     * Last time the rule was updated in ISO8601 format.
     */
    @JsonProperty(value = "properties.lastUpdatedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedTime;

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the AlertRuleResourcePatch object itself.
     */
    public AlertRuleResourcePatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the name property: the name of the alert rule.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: the name of the alert rule.
     *
     * @param name the name value to set.
     * @return the AlertRuleResourcePatch object itself.
     */
    public AlertRuleResourcePatch withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: the description of the alert rule that will be included in the alert email.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: the description of the alert rule that will be included in the alert email.
     *
     * @param description the description value to set.
     * @return the AlertRuleResourcePatch object itself.
     */
    public AlertRuleResourcePatch withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the provisioningState property: the provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: the provisioning state.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the AlertRuleResourcePatch object itself.
     */
    public AlertRuleResourcePatch withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the isEnabled property: the flag that indicates whether the alert rule is enabled.
     *
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: the flag that indicates whether the alert rule is enabled.
     *
     * @param isEnabled the isEnabled value to set.
     * @return the AlertRuleResourcePatch object itself.
     */
    public AlertRuleResourcePatch withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get the condition property: the condition that results in the alert rule being activated.
     *
     * @return the condition value.
     */
    public RuleCondition condition() {
        return this.condition;
    }

    /**
     * Set the condition property: the condition that results in the alert rule being activated.
     *
     * @param condition the condition value to set.
     * @return the AlertRuleResourcePatch object itself.
     */
    public AlertRuleResourcePatch withCondition(RuleCondition condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get the action property: action that is performed when the alert rule becomes active, and when an alert condition
     * is resolved.
     *
     * @return the action value.
     */
    public RuleAction action() {
        return this.action;
    }

    /**
     * Set the action property: action that is performed when the alert rule becomes active, and when an alert condition
     * is resolved.
     *
     * @param action the action value to set.
     * @return the AlertRuleResourcePatch object itself.
     */
    public AlertRuleResourcePatch withAction(RuleAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get the actions property: the array of actions that are performed when the alert rule becomes active, and when an
     * alert condition is resolved.
     *
     * @return the actions value.
     */
    public List<RuleAction> actions() {
        return this.actions;
    }

    /**
     * Set the actions property: the array of actions that are performed when the alert rule becomes active, and when an
     * alert condition is resolved.
     *
     * @param actions the actions value to set.
     * @return the AlertRuleResourcePatch object itself.
     */
    public AlertRuleResourcePatch withActions(List<RuleAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the lastUpdatedTime property: Last time the rule was updated in ISO8601 format.
     *
     * @return the lastUpdatedTime value.
     */
    public OffsetDateTime lastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (condition() != null) {
            condition().validate();
        }
        if (action() != null) {
            action().validate();
        }
        if (actions() != null) {
            actions().forEach(e -> e.validate());
        }
    }
}
