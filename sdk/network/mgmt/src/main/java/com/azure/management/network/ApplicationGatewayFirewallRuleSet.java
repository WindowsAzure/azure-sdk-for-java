// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ApplicationGatewayFirewallRuleSet model.
 */
@JsonFlatten
@Fluent
public class ApplicationGatewayFirewallRuleSet extends Resource {
    /*
     * The provisioning state of the web application firewall rule set.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /*
     * The type of the web application firewall rule set.
     */
    @JsonProperty(value = "properties.ruleSetType")
    private String ruleSetType;

    /*
     * The version of the web application firewall rule set type.
     */
    @JsonProperty(value = "properties.ruleSetVersion")
    private String ruleSetVersion;

    /*
     * The rule groups of the web application firewall rule set.
     */
    @JsonProperty(value = "properties.ruleGroups")
    private List<ApplicationGatewayFirewallRuleGroup> ruleGroups;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the provisioningState property: The provisioning state of the web
     * application firewall rule set.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the web
     * application firewall rule set.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the ApplicationGatewayFirewallRuleSet object itself.
     */
    public ApplicationGatewayFirewallRuleSet withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the ruleSetType property: The type of the web application firewall
     * rule set.
     * 
     * @return the ruleSetType value.
     */
    public String ruleSetType() {
        return this.ruleSetType;
    }

    /**
     * Set the ruleSetType property: The type of the web application firewall
     * rule set.
     * 
     * @param ruleSetType the ruleSetType value to set.
     * @return the ApplicationGatewayFirewallRuleSet object itself.
     */
    public ApplicationGatewayFirewallRuleSet withRuleSetType(String ruleSetType) {
        this.ruleSetType = ruleSetType;
        return this;
    }

    /**
     * Get the ruleSetVersion property: The version of the web application
     * firewall rule set type.
     * 
     * @return the ruleSetVersion value.
     */
    public String ruleSetVersion() {
        return this.ruleSetVersion;
    }

    /**
     * Set the ruleSetVersion property: The version of the web application
     * firewall rule set type.
     * 
     * @param ruleSetVersion the ruleSetVersion value to set.
     * @return the ApplicationGatewayFirewallRuleSet object itself.
     */
    public ApplicationGatewayFirewallRuleSet withRuleSetVersion(String ruleSetVersion) {
        this.ruleSetVersion = ruleSetVersion;
        return this;
    }

    /**
     * Get the ruleGroups property: The rule groups of the web application
     * firewall rule set.
     * 
     * @return the ruleGroups value.
     */
    public List<ApplicationGatewayFirewallRuleGroup> ruleGroups() {
        return this.ruleGroups;
    }

    /**
     * Set the ruleGroups property: The rule groups of the web application
     * firewall rule set.
     * 
     * @param ruleGroups the ruleGroups value to set.
     * @return the ApplicationGatewayFirewallRuleSet object itself.
     */
    public ApplicationGatewayFirewallRuleSet withRuleGroups(List<ApplicationGatewayFirewallRuleGroup> ruleGroups) {
        this.ruleGroups = ruleGroups;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the ApplicationGatewayFirewallRuleSet object itself.
     */
    public ApplicationGatewayFirewallRuleSet withId(String id) {
        this.id = id;
        return this;
    }
}
