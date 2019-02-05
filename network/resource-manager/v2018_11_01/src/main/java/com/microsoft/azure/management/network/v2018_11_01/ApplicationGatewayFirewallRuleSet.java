/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_11_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * A web application firewall rule set.
 */
@JsonFlatten
@SkipParentValidation
public class ApplicationGatewayFirewallRuleSet extends Resource {
    /**
     * The provisioning state of the web application firewall rule set.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The type of the web application firewall rule set.
     */
    @JsonProperty(value = "properties.ruleSetType", required = true)
    private String ruleSetType;

    /**
     * The version of the web application firewall rule set type.
     */
    @JsonProperty(value = "properties.ruleSetVersion", required = true)
    private String ruleSetVersion;

    /**
     * The rule groups of the web application firewall rule set.
     */
    @JsonProperty(value = "properties.ruleGroups", required = true)
    private List<ApplicationGatewayFirewallRuleGroup> ruleGroups;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the provisioning state of the web application firewall rule set.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the web application firewall rule set.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ApplicationGatewayFirewallRuleSet object itself.
     */
    public ApplicationGatewayFirewallRuleSet withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the type of the web application firewall rule set.
     *
     * @return the ruleSetType value
     */
    public String ruleSetType() {
        return this.ruleSetType;
    }

    /**
     * Set the type of the web application firewall rule set.
     *
     * @param ruleSetType the ruleSetType value to set
     * @return the ApplicationGatewayFirewallRuleSet object itself.
     */
    public ApplicationGatewayFirewallRuleSet withRuleSetType(String ruleSetType) {
        this.ruleSetType = ruleSetType;
        return this;
    }

    /**
     * Get the version of the web application firewall rule set type.
     *
     * @return the ruleSetVersion value
     */
    public String ruleSetVersion() {
        return this.ruleSetVersion;
    }

    /**
     * Set the version of the web application firewall rule set type.
     *
     * @param ruleSetVersion the ruleSetVersion value to set
     * @return the ApplicationGatewayFirewallRuleSet object itself.
     */
    public ApplicationGatewayFirewallRuleSet withRuleSetVersion(String ruleSetVersion) {
        this.ruleSetVersion = ruleSetVersion;
        return this;
    }

    /**
     * Get the rule groups of the web application firewall rule set.
     *
     * @return the ruleGroups value
     */
    public List<ApplicationGatewayFirewallRuleGroup> ruleGroups() {
        return this.ruleGroups;
    }

    /**
     * Set the rule groups of the web application firewall rule set.
     *
     * @param ruleGroups the ruleGroups value to set
     * @return the ApplicationGatewayFirewallRuleSet object itself.
     */
    public ApplicationGatewayFirewallRuleSet withRuleGroups(List<ApplicationGatewayFirewallRuleGroup> ruleGroups) {
        this.ruleGroups = ruleGroups;
        return this;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the ApplicationGatewayFirewallRuleSet object itself.
     */
    public ApplicationGatewayFirewallRuleSet withId(String id) {
        this.id = id;
        return this;
    }

}
