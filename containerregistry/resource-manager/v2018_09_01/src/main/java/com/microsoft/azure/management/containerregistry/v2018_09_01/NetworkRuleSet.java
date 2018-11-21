/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The network rule set for a container registry.
 */
public class NetworkRuleSet {
    /**
     * The default action of allow or deny when no other rules match. Possible
     * values include: 'Allow', 'Deny'.
     */
    @JsonProperty(value = "defaultAction")
    private DefaultAction defaultAction;

    /**
     * The virtual network rules.
     */
    @JsonProperty(value = "virtualNetworkRules")
    private List<VirtualNetworkRule> virtualNetworkRules;

    /**
     * Get the default action of allow or deny when no other rules match. Possible values include: 'Allow', 'Deny'.
     *
     * @return the defaultAction value
     */
    public DefaultAction defaultAction() {
        return this.defaultAction;
    }

    /**
     * Set the default action of allow or deny when no other rules match. Possible values include: 'Allow', 'Deny'.
     *
     * @param defaultAction the defaultAction value to set
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withDefaultAction(DefaultAction defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    /**
     * Get the virtual network rules.
     *
     * @return the virtualNetworkRules value
     */
    public List<VirtualNetworkRule> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set the virtual network rules.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

}
