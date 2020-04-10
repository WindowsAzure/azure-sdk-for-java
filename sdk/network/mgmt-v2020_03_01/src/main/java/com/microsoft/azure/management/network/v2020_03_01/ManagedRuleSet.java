/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines a managed rule set.
 */
public class ManagedRuleSet {
    /**
     * Defines the rule set type to use.
     */
    @JsonProperty(value = "ruleSetType", required = true)
    private String ruleSetType;

    /**
     * Defines the version of the rule set to use.
     */
    @JsonProperty(value = "ruleSetVersion", required = true)
    private String ruleSetVersion;

    /**
     * Defines the rule group overrides to apply to the rule set.
     */
    @JsonProperty(value = "ruleGroupOverrides")
    private List<ManagedRuleGroupOverride> ruleGroupOverrides;

    /**
     * Get defines the rule set type to use.
     *
     * @return the ruleSetType value
     */
    public String ruleSetType() {
        return this.ruleSetType;
    }

    /**
     * Set defines the rule set type to use.
     *
     * @param ruleSetType the ruleSetType value to set
     * @return the ManagedRuleSet object itself.
     */
    public ManagedRuleSet withRuleSetType(String ruleSetType) {
        this.ruleSetType = ruleSetType;
        return this;
    }

    /**
     * Get defines the version of the rule set to use.
     *
     * @return the ruleSetVersion value
     */
    public String ruleSetVersion() {
        return this.ruleSetVersion;
    }

    /**
     * Set defines the version of the rule set to use.
     *
     * @param ruleSetVersion the ruleSetVersion value to set
     * @return the ManagedRuleSet object itself.
     */
    public ManagedRuleSet withRuleSetVersion(String ruleSetVersion) {
        this.ruleSetVersion = ruleSetVersion;
        return this;
    }

    /**
     * Get defines the rule group overrides to apply to the rule set.
     *
     * @return the ruleGroupOverrides value
     */
    public List<ManagedRuleGroupOverride> ruleGroupOverrides() {
        return this.ruleGroupOverrides;
    }

    /**
     * Set defines the rule group overrides to apply to the rule set.
     *
     * @param ruleGroupOverrides the ruleGroupOverrides value to set
     * @return the ManagedRuleSet object itself.
     */
    public ManagedRuleSet withRuleGroupOverrides(List<ManagedRuleGroupOverride> ruleGroupOverrides) {
        this.ruleGroupOverrides = ruleGroupOverrides;
        return this;
    }

}
