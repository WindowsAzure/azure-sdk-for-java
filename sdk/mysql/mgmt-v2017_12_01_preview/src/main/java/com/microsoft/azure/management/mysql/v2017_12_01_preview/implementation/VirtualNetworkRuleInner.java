/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2017_12_01_preview.implementation;

import com.microsoft.azure.management.mysql.v2017_12_01_preview.VirtualNetworkRuleState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A virtual network rule.
 */
@JsonFlatten
public class VirtualNetworkRuleInner extends ProxyResource {
    /**
     * The ARM resource id of the virtual network subnet.
     */
    @JsonProperty(value = "properties.virtualNetworkSubnetId", required = true)
    private String virtualNetworkSubnetId;

    /**
     * Create firewall rule before the virtual network has vnet service
     * endpoint enabled.
     */
    @JsonProperty(value = "properties.ignoreMissingVnetServiceEndpoint")
    private Boolean ignoreMissingVnetServiceEndpoint;

    /**
     * Virtual Network Rule State. Possible values include: 'Initializing',
     * 'InProgress', 'Ready', 'Deleting', 'Unknown'.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualNetworkRuleState state;

    /**
     * Get the ARM resource id of the virtual network subnet.
     *
     * @return the virtualNetworkSubnetId value
     */
    public String virtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId;
    }

    /**
     * Set the ARM resource id of the virtual network subnet.
     *
     * @param virtualNetworkSubnetId the virtualNetworkSubnetId value to set
     * @return the VirtualNetworkRuleInner object itself.
     */
    public VirtualNetworkRuleInner withVirtualNetworkSubnetId(String virtualNetworkSubnetId) {
        this.virtualNetworkSubnetId = virtualNetworkSubnetId;
        return this;
    }

    /**
     * Get create firewall rule before the virtual network has vnet service endpoint enabled.
     *
     * @return the ignoreMissingVnetServiceEndpoint value
     */
    public Boolean ignoreMissingVnetServiceEndpoint() {
        return this.ignoreMissingVnetServiceEndpoint;
    }

    /**
     * Set create firewall rule before the virtual network has vnet service endpoint enabled.
     *
     * @param ignoreMissingVnetServiceEndpoint the ignoreMissingVnetServiceEndpoint value to set
     * @return the VirtualNetworkRuleInner object itself.
     */
    public VirtualNetworkRuleInner withIgnoreMissingVnetServiceEndpoint(Boolean ignoreMissingVnetServiceEndpoint) {
        this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
        return this;
    }

    /**
     * Get virtual Network Rule State. Possible values include: 'Initializing', 'InProgress', 'Ready', 'Deleting', 'Unknown'.
     *
     * @return the state value
     */
    public VirtualNetworkRuleState state() {
        return this.state;
    }

}
