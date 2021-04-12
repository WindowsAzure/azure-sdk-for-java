// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines a managed rule set. */
@Fluent
public final class ManagedRuleSet {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedRuleSet.class);

    /*
     * Defines the rule set type to use.
     */
    @JsonProperty(value = "ruleSetType", required = true)
    private String ruleSetType;

    /*
     * Defines the version of the rule set to use.
     */
    @JsonProperty(value = "ruleSetVersion", required = true)
    private String ruleSetVersion;

    /*
     * Defines the action to take when a managed rule set score threshold is
     * met.
     */
    @JsonProperty(value = "ruleSetAction")
    private ManagedRuleSetActionType ruleSetAction;

    /*
     * Describes the exclusions that are applied to all rules in the set.
     */
    @JsonProperty(value = "exclusions")
    private List<ManagedRuleExclusion> exclusions;

    /*
     * Defines the rule group overrides to apply to the rule set.
     */
    @JsonProperty(value = "ruleGroupOverrides")
    private List<ManagedRuleGroupOverride> ruleGroupOverrides;

    /**
     * Get the ruleSetType property: Defines the rule set type to use.
     *
     * @return the ruleSetType value.
     */
    public String ruleSetType() {
        return this.ruleSetType;
    }

    /**
     * Set the ruleSetType property: Defines the rule set type to use.
     *
     * @param ruleSetType the ruleSetType value to set.
     * @return the ManagedRuleSet object itself.
     */
    public ManagedRuleSet withRuleSetType(String ruleSetType) {
        this.ruleSetType = ruleSetType;
        return this;
    }

    /**
     * Get the ruleSetVersion property: Defines the version of the rule set to use.
     *
     * @return the ruleSetVersion value.
     */
    public String ruleSetVersion() {
        return this.ruleSetVersion;
    }

    /**
     * Set the ruleSetVersion property: Defines the version of the rule set to use.
     *
     * @param ruleSetVersion the ruleSetVersion value to set.
     * @return the ManagedRuleSet object itself.
     */
    public ManagedRuleSet withRuleSetVersion(String ruleSetVersion) {
        this.ruleSetVersion = ruleSetVersion;
        return this;
    }

    /**
     * Get the ruleSetAction property: Defines the action to take when a managed rule set score threshold is met.
     *
     * @return the ruleSetAction value.
     */
    public ManagedRuleSetActionType ruleSetAction() {
        return this.ruleSetAction;
    }

    /**
     * Set the ruleSetAction property: Defines the action to take when a managed rule set score threshold is met.
     *
     * @param ruleSetAction the ruleSetAction value to set.
     * @return the ManagedRuleSet object itself.
     */
    public ManagedRuleSet withRuleSetAction(ManagedRuleSetActionType ruleSetAction) {
        this.ruleSetAction = ruleSetAction;
        return this;
    }

    /**
     * Get the exclusions property: Describes the exclusions that are applied to all rules in the set.
     *
     * @return the exclusions value.
     */
    public List<ManagedRuleExclusion> exclusions() {
        return this.exclusions;
    }

    /**
     * Set the exclusions property: Describes the exclusions that are applied to all rules in the set.
     *
     * @param exclusions the exclusions value to set.
     * @return the ManagedRuleSet object itself.
     */
    public ManagedRuleSet withExclusions(List<ManagedRuleExclusion> exclusions) {
        this.exclusions = exclusions;
        return this;
    }

    /**
     * Get the ruleGroupOverrides property: Defines the rule group overrides to apply to the rule set.
     *
     * @return the ruleGroupOverrides value.
     */
    public List<ManagedRuleGroupOverride> ruleGroupOverrides() {
        return this.ruleGroupOverrides;
    }

    /**
     * Set the ruleGroupOverrides property: Defines the rule group overrides to apply to the rule set.
     *
     * @param ruleGroupOverrides the ruleGroupOverrides value to set.
     * @return the ManagedRuleSet object itself.
     */
    public ManagedRuleSet withRuleGroupOverrides(List<ManagedRuleGroupOverride> ruleGroupOverrides) {
        this.ruleGroupOverrides = ruleGroupOverrides;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ruleSetType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property ruleSetType in model ManagedRuleSet"));
        }
        if (ruleSetVersion() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property ruleSetVersion in model ManagedRuleSet"));
        }
        if (exclusions() != null) {
            exclusions().forEach(e -> e.validate());
        }
        if (ruleGroupOverrides() != null) {
            ruleGroupOverrides().forEach(e -> e.validate());
        }
    }
}
