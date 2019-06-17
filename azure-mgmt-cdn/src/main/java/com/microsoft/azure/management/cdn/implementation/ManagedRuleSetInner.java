/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.implementation;

import java.util.List;
import com.microsoft.azure.management.cdn.ManagedRuleGroupOverride;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines a managed rule set.
 */
public class ManagedRuleSetInner {
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
     * Verizon only : If the rule set supports anomaly detection mode, this
     * describes the threshold for blocking requests.
     */
    @JsonProperty(value = "anomalyScore")
    private Integer anomalyScore;

    /**
     * Defines the rule overrides to apply to the rule set.
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
     * @return the ManagedRuleSetInner object itself.
     */
    public ManagedRuleSetInner withRuleSetType(String ruleSetType) {
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
     * @return the ManagedRuleSetInner object itself.
     */
    public ManagedRuleSetInner withRuleSetVersion(String ruleSetVersion) {
        this.ruleSetVersion = ruleSetVersion;
        return this;
    }

    /**
     * Get verizon only : If the rule set supports anomaly detection mode, this describes the threshold for blocking requests.
     *
     * @return the anomalyScore value
     */
    public Integer anomalyScore() {
        return this.anomalyScore;
    }

    /**
     * Set verizon only : If the rule set supports anomaly detection mode, this describes the threshold for blocking requests.
     *
     * @param anomalyScore the anomalyScore value to set
     * @return the ManagedRuleSetInner object itself.
     */
    public ManagedRuleSetInner withAnomalyScore(Integer anomalyScore) {
        this.anomalyScore = anomalyScore;
        return this;
    }

    /**
     * Get defines the rule overrides to apply to the rule set.
     *
     * @return the ruleGroupOverrides value
     */
    public List<ManagedRuleGroupOverride> ruleGroupOverrides() {
        return this.ruleGroupOverrides;
    }

    /**
     * Set defines the rule overrides to apply to the rule set.
     *
     * @param ruleGroupOverrides the ruleGroupOverrides value to set
     * @return the ManagedRuleSetInner object itself.
     */
    public ManagedRuleSetInner withRuleGroupOverrides(List<ManagedRuleGroupOverride> ruleGroupOverrides) {
        this.ruleGroupOverrides = ruleGroupOverrides;
        return this;
    }

}
