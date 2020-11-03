/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2019_09_01.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A set of rules governing the network accessibility of a vault.
 */
public class NetworkRuleSet {
    /**
     * Tells what traffic can bypass network rules. This can be 'AzureServices'
     * or 'None'.  If not specified the default is 'AzureServices'. Possible
     * values include: 'AzureServices', 'None'.
     */
    @JsonProperty(value = "bypass")
    private NetworkRuleBypassOptions bypass;

    /**
     * The default action when no rule from ipRules and from
     * virtualNetworkRules match. This is only used after the bypass property
     * has been evaluated. Possible values include: 'Allow', 'Deny'.
     */
    @JsonProperty(value = "defaultAction")
    private NetworkRuleAction defaultAction;

    /**
     * The list of IP address rules.
     */
    @JsonProperty(value = "ipRules")
    private List<IPRule> ipRules;

    /**
     * The list of virtual network rules.
     */
    @JsonProperty(value = "virtualNetworkRules")
    private List<VirtualNetworkRule> virtualNetworkRules;

    /**
     * Get tells what traffic can bypass network rules. This can be 'AzureServices' or 'None'.  If not specified the default is 'AzureServices'. Possible values include: 'AzureServices', 'None'.
     *
     * @return the bypass value
     */
    public NetworkRuleBypassOptions bypass() {
        return this.bypass;
    }

    /**
     * Set tells what traffic can bypass network rules. This can be 'AzureServices' or 'None'.  If not specified the default is 'AzureServices'. Possible values include: 'AzureServices', 'None'.
     *
     * @param bypass the bypass value to set
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withBypass(NetworkRuleBypassOptions bypass) {
        this.bypass = bypass;
        return this;
    }

    /**
     * Get the default action when no rule from ipRules and from virtualNetworkRules match. This is only used after the bypass property has been evaluated. Possible values include: 'Allow', 'Deny'.
     *
     * @return the defaultAction value
     */
    public NetworkRuleAction defaultAction() {
        return this.defaultAction;
    }

    /**
     * Set the default action when no rule from ipRules and from virtualNetworkRules match. This is only used after the bypass property has been evaluated. Possible values include: 'Allow', 'Deny'.
     *
     * @param defaultAction the defaultAction value to set
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withDefaultAction(NetworkRuleAction defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    /**
     * Get the list of IP address rules.
     *
     * @return the ipRules value
     */
    public List<IPRule> ipRules() {
        return this.ipRules;
    }

    /**
     * Set the list of IP address rules.
     *
     * @param ipRules the ipRules value to set
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withIpRules(List<IPRule> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

    /**
     * Get the list of virtual network rules.
     *
     * @return the virtualNetworkRules value
     */
    public List<VirtualNetworkRule> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set the list of virtual network rules.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

}
