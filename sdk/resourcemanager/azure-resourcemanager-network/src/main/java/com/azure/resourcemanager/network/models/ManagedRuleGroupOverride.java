// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines a managed rule group override setting. */
@Fluent
public final class ManagedRuleGroupOverride {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedRuleGroupOverride.class);

    /*
     * The managed rule group to override.
     */
    @JsonProperty(value = "ruleGroupName", required = true)
    private String ruleGroupName;

    /*
     * List of rules that will be disabled. If none specified, all rules in the
     * group will be disabled.
     */
    @JsonProperty(value = "rules")
    private List<ManagedRuleOverride> rules;

    /**
     * Get the ruleGroupName property: The managed rule group to override.
     *
     * @return the ruleGroupName value.
     */
    public String ruleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * Set the ruleGroupName property: The managed rule group to override.
     *
     * @param ruleGroupName the ruleGroupName value to set.
     * @return the ManagedRuleGroupOverride object itself.
     */
    public ManagedRuleGroupOverride withRuleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
        return this;
    }

    /**
     * Get the rules property: List of rules that will be disabled. If none specified, all rules in the group will be
     * disabled.
     *
     * @return the rules value.
     */
    public List<ManagedRuleOverride> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: List of rules that will be disabled. If none specified, all rules in the group will be
     * disabled.
     *
     * @param rules the rules value to set.
     * @return the ManagedRuleGroupOverride object itself.
     */
    public ManagedRuleGroupOverride withRules(List<ManagedRuleOverride> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ruleGroupName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property ruleGroupName in model ManagedRuleGroupOverride"));
        }
        if (rules() != null) {
            rules().forEach(e -> e.validate());
        }
    }
}
