/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines contents of a web application rule.
 */
public class WebApplicationFirewallCustomRule {
    /**
     * Gets name of the resource that is unique within a policy. This name can
     * be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Describes priority of the rule. Rules with a lower value will be
     * evaluated before rules with a higher value.
     */
    @JsonProperty(value = "priority", required = true)
    private int priority;

    /**
     * Describes type of rule. Possible values include: 'MatchRule', 'Invalid'.
     */
    @JsonProperty(value = "ruleType", required = true)
    private WebApplicationFirewallRuleType ruleType;

    /**
     * List of match conditions.
     */
    @JsonProperty(value = "matchConditions", required = true)
    private List<MatchCondition> matchConditions;

    /**
     * Type of Actions. Possible values include: 'Allow', 'Block', 'Log'.
     */
    @JsonProperty(value = "action", required = true)
    private WebApplicationFirewallAction action;

    /**
     * Get gets name of the resource that is unique within a policy. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set gets name of the resource that is unique within a policy. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get describes priority of the rule. Rules with a lower value will be evaluated before rules with a higher value.
     *
     * @return the priority value
     */
    public int priority() {
        return this.priority;
    }

    /**
     * Set describes priority of the rule. Rules with a lower value will be evaluated before rules with a higher value.
     *
     * @param priority the priority value to set
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule withPriority(int priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get describes type of rule. Possible values include: 'MatchRule', 'Invalid'.
     *
     * @return the ruleType value
     */
    public WebApplicationFirewallRuleType ruleType() {
        return this.ruleType;
    }

    /**
     * Set describes type of rule. Possible values include: 'MatchRule', 'Invalid'.
     *
     * @param ruleType the ruleType value to set
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule withRuleType(WebApplicationFirewallRuleType ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * Get list of match conditions.
     *
     * @return the matchConditions value
     */
    public List<MatchCondition> matchConditions() {
        return this.matchConditions;
    }

    /**
     * Set list of match conditions.
     *
     * @param matchConditions the matchConditions value to set
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule withMatchConditions(List<MatchCondition> matchConditions) {
        this.matchConditions = matchConditions;
        return this;
    }

    /**
     * Get type of Actions. Possible values include: 'Allow', 'Block', 'Log'.
     *
     * @return the action value
     */
    public WebApplicationFirewallAction action() {
        return this.action;
    }

    /**
     * Set type of Actions. Possible values include: 'Allow', 'Block', 'Log'.
     *
     * @param action the action value to set
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule withAction(WebApplicationFirewallAction action) {
        this.action = action;
        return this;
    }

}
