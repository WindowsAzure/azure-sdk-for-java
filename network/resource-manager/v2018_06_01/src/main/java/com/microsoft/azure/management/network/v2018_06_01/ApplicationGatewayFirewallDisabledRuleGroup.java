/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Allows to disable rules within a rule group or an entire rule group.
 */
public class ApplicationGatewayFirewallDisabledRuleGroup {
    /**
     * The name of the rule group that will be disabled.
     */
    @JsonProperty(value = "ruleGroupName", required = true)
    private String ruleGroupName;

    /**
     * The list of rules that will be disabled. If null, all rules of the rule
     * group will be disabled.
     */
    @JsonProperty(value = "rules")
    private List<Integer> rules;

    /**
     * Get the name of the rule group that will be disabled.
     *
     * @return the ruleGroupName value
     */
    public String ruleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * Set the name of the rule group that will be disabled.
     *
     * @param ruleGroupName the ruleGroupName value to set
     * @return the ApplicationGatewayFirewallDisabledRuleGroup object itself.
     */
    public ApplicationGatewayFirewallDisabledRuleGroup withRuleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
        return this;
    }

    /**
     * Get the list of rules that will be disabled. If null, all rules of the rule group will be disabled.
     *
     * @return the rules value
     */
    public List<Integer> rules() {
        return this.rules;
    }

    /**
     * Set the list of rules that will be disabled. If null, all rules of the rule group will be disabled.
     *
     * @param rules the rules value to set
     * @return the ApplicationGatewayFirewallDisabledRuleGroup object itself.
     */
    public ApplicationGatewayFirewallDisabledRuleGroup withRules(List<Integer> rules) {
        this.rules = rules;
        return this;
    }

}
