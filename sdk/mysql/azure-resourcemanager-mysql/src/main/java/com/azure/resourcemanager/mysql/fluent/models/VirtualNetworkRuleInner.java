// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.models.VirtualNetworkRuleState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A virtual network rule. */
@JsonFlatten
@Fluent
public class VirtualNetworkRuleInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetworkRuleInner.class);

    /*
     * The ARM resource id of the virtual network subnet.
     */
    @JsonProperty(value = "properties.virtualNetworkSubnetId")
    private String virtualNetworkSubnetId;

    /*
     * Create firewall rule before the virtual network has vnet service
     * endpoint enabled.
     */
    @JsonProperty(value = "properties.ignoreMissingVnetServiceEndpoint")
    private Boolean ignoreMissingVnetServiceEndpoint;

    /*
     * Virtual Network Rule State
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualNetworkRuleState state;

    /**
     * Get the virtualNetworkSubnetId property: The ARM resource id of the virtual network subnet.
     *
     * @return the virtualNetworkSubnetId value.
     */
    public String virtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId;
    }

    /**
     * Set the virtualNetworkSubnetId property: The ARM resource id of the virtual network subnet.
     *
     * @param virtualNetworkSubnetId the virtualNetworkSubnetId value to set.
     * @return the VirtualNetworkRuleInner object itself.
     */
    public VirtualNetworkRuleInner withVirtualNetworkSubnetId(String virtualNetworkSubnetId) {
        this.virtualNetworkSubnetId = virtualNetworkSubnetId;
        return this;
    }

    /**
     * Get the ignoreMissingVnetServiceEndpoint property: Create firewall rule before the virtual network has vnet
     * service endpoint enabled.
     *
     * @return the ignoreMissingVnetServiceEndpoint value.
     */
    public Boolean ignoreMissingVnetServiceEndpoint() {
        return this.ignoreMissingVnetServiceEndpoint;
    }

    /**
     * Set the ignoreMissingVnetServiceEndpoint property: Create firewall rule before the virtual network has vnet
     * service endpoint enabled.
     *
     * @param ignoreMissingVnetServiceEndpoint the ignoreMissingVnetServiceEndpoint value to set.
     * @return the VirtualNetworkRuleInner object itself.
     */
    public VirtualNetworkRuleInner withIgnoreMissingVnetServiceEndpoint(Boolean ignoreMissingVnetServiceEndpoint) {
        this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
        return this;
    }

    /**
     * Get the state property: Virtual Network Rule State.
     *
     * @return the state value.
     */
    public VirtualNetworkRuleState state() {
        return this.state;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
