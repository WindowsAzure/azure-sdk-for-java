/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.v2018_01_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Single item in a List or Get VirtualNetworkRules operation.
 */
@JsonFlatten
public class VirtualNetworkRuleInner extends ProxyResource {
    /**
     * ARM ID of Virtual Network Subnet.
     */
    @JsonProperty(value = "properties.virtualNetworkSubnetId")
    private String virtualNetworkSubnetId;

    /**
     * Get aRM ID of Virtual Network Subnet.
     *
     * @return the virtualNetworkSubnetId value
     */
    public String virtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId;
    }

    /**
     * Set aRM ID of Virtual Network Subnet.
     *
     * @param virtualNetworkSubnetId the virtualNetworkSubnetId value to set
     * @return the VirtualNetworkRuleInner object itself.
     */
    public VirtualNetworkRuleInner withVirtualNetworkSubnetId(String virtualNetworkSubnetId) {
        this.virtualNetworkSubnetId = virtualNetworkSubnetId;
        return this;
    }

}
