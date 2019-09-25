/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A web application firewall rule group.
 */
public class ApplicationGatewayFirewallRuleGroup {
    /**
     * The name of the web application firewall rule group.
     */
    @JsonProperty(value = "ruleGroupName", required = true)
    private String ruleGroupName;

    /**
     * The description of the web application firewall rule group.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * The rules of the web application firewall rule group.
     */
    @JsonProperty(value = "rules", required = true)
    private List<ApplicationGatewayFirewallRule> rules;

    /**
     * Get the name of the web application firewall rule group.
     *
     * @return the ruleGroupName value
     */
    public String ruleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * Set the name of the web application firewall rule group.
     *
     * @param ruleGroupName the ruleGroupName value to set
     * @return the ApplicationGatewayFirewallRuleGroup object itself.
     */
    public ApplicationGatewayFirewallRuleGroup withRuleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
        return this;
    }

    /**
     * Get the description of the web application firewall rule group.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of the web application firewall rule group.
     *
     * @param description the description value to set
     * @return the ApplicationGatewayFirewallRuleGroup object itself.
     */
    public ApplicationGatewayFirewallRuleGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the rules of the web application firewall rule group.
     *
     * @return the rules value
     */
    public List<ApplicationGatewayFirewallRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules of the web application firewall rule group.
     *
     * @param rules the rules value to set
     * @return the ApplicationGatewayFirewallRuleGroup object itself.
     */
    public ApplicationGatewayFirewallRuleGroup withRules(List<ApplicationGatewayFirewallRule> rules) {
        this.rules = rules;
        return this;
    }

}
