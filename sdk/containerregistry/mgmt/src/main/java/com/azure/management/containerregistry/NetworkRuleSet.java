// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The NetworkRuleSet model.
 */
@Fluent
public final class NetworkRuleSet {
    /*
     * The default action of allow or deny when no other rules match.
     */
    @JsonProperty(value = "defaultAction", required = true)
    private DefaultAction defaultAction;

    /*
     * The virtual network rules.
     */
    @JsonProperty(value = "virtualNetworkRules")
    private List<VirtualNetworkRule> virtualNetworkRules;

    /*
     * The IP ACL rules.
     */
    @JsonProperty(value = "ipRules")
    private List<IPRule> ipRules;

    /**
     * Get the defaultAction property: The default action of allow or deny when
     * no other rules match.
     * 
     * @return the defaultAction value.
     */
    public DefaultAction defaultAction() {
        return this.defaultAction;
    }

    /**
     * Set the defaultAction property: The default action of allow or deny when
     * no other rules match.
     * 
     * @param defaultAction the defaultAction value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withDefaultAction(DefaultAction defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    /**
     * Get the virtualNetworkRules property: The virtual network rules.
     * 
     * @return the virtualNetworkRules value.
     */
    public List<VirtualNetworkRule> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set the virtualNetworkRules property: The virtual network rules.
     * 
     * @param virtualNetworkRules the virtualNetworkRules value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

    /**
     * Get the ipRules property: The IP ACL rules.
     * 
     * @return the ipRules value.
     */
    public List<IPRule> ipRules() {
        return this.ipRules;
    }

    /**
     * Set the ipRules property: The IP ACL rules.
     * 
     * @param ipRules the ipRules value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withIpRules(List<IPRule> ipRules) {
        this.ipRules = ipRules;
        return this;
    }
}
