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
 * The virtual network rule for a container registry.
 */
public class VirtualNetworkRule {
    /**
     * Resource ID of a subnet, for example:
     * /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     *
     * @param id the id value to set
     * @return the VirtualNetworkRule object itself.
     */
    public VirtualNetworkRule withId(String id) {
        this.id = id;
        return this;
    }

}
