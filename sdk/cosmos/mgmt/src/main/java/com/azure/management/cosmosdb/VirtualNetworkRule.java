// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VirtualNetworkRule model. */
@Fluent
public final class VirtualNetworkRule {
    /*
     * Resource ID of a subnet, for example:
     * /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Create firewall rule before the virtual network has vnet service
     * endpoint enabled.
     */
    @JsonProperty(value = "ignoreMissingVNetServiceEndpoint")
    private Boolean ignoreMissingVNetServiceEndpoint;

    /**
     * Get the id property: Resource ID of a subnet, for example:
     * /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID of a subnet, for example:
     * /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}.
     *
     * @param id the id value to set.
     * @return the VirtualNetworkRule object itself.
     */
    public VirtualNetworkRule withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the ignoreMissingVNetServiceEndpoint property: Create firewall rule before the virtual network has vnet
     * service endpoint enabled.
     *
     * @return the ignoreMissingVNetServiceEndpoint value.
     */
    public Boolean ignoreMissingVNetServiceEndpoint() {
        return this.ignoreMissingVNetServiceEndpoint;
    }

    /**
     * Set the ignoreMissingVNetServiceEndpoint property: Create firewall rule before the virtual network has vnet
     * service endpoint enabled.
     *
     * @param ignoreMissingVNetServiceEndpoint the ignoreMissingVNetServiceEndpoint value to set.
     * @return the VirtualNetworkRule object itself.
     */
    public VirtualNetworkRule withIgnoreMissingVNetServiceEndpoint(Boolean ignoreMissingVNetServiceEndpoint) {
        this.ignoreMissingVNetServiceEndpoint = ignoreMissingVNetServiceEndpoint;
        return this;
    }
}
