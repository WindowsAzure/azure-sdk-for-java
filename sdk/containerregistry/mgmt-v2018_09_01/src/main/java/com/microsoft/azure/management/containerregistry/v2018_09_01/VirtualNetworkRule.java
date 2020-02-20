/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Virtual network rule.
 */
public class VirtualNetworkRule {
    /**
     * The action of virtual network rule. Possible values include: 'Allow'.
     */
    @JsonProperty(value = "action")
    private Action action;

    /**
     * Resource ID of a subnet, for example:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     */
    @JsonProperty(value = "id", required = true)
    private String virtualNetworkResourceId;

    /**
     * Get the action of virtual network rule. Possible values include: 'Allow'.
     *
     * @return the action value
     */
    public Action action() {
        return this.action;
    }

    /**
     * Set the action of virtual network rule. Possible values include: 'Allow'.
     *
     * @param action the action value to set
     * @return the VirtualNetworkRule object itself.
     */
    public VirtualNetworkRule withAction(Action action) {
        this.action = action;
        return this;
    }

    /**
     * Get resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     *
     * @return the virtualNetworkResourceId value
     */
    public String virtualNetworkResourceId() {
        return this.virtualNetworkResourceId;
    }

    /**
     * Set resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     *
     * @param virtualNetworkResourceId the virtualNetworkResourceId value to set
     * @return the VirtualNetworkRule object itself.
     */
    public VirtualNetworkRule withVirtualNetworkResourceId(String virtualNetworkResourceId) {
        this.virtualNetworkResourceId = virtualNetworkResourceId;
        return this;
    }

}
