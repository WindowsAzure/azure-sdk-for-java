// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The NWRuleSetVirtualNetworkRules model. */
@Fluent
public final class NWRuleSetVirtualNetworkRules {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NWRuleSetVirtualNetworkRules.class);

    /*
     * Subnet properties
     */
    @JsonProperty(value = "subnet")
    private Subnet subnet;

    /*
     * Value that indicates whether to ignore missing VNet Service Endpoint
     */
    @JsonProperty(value = "ignoreMissingVnetServiceEndpoint")
    private Boolean ignoreMissingVnetServiceEndpoint;

    /**
     * Get the subnet property: Subnet properties.
     *
     * @return the subnet value.
     */
    public Subnet subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Subnet properties.
     *
     * @param subnet the subnet value to set.
     * @return the NWRuleSetVirtualNetworkRules object itself.
     */
    public NWRuleSetVirtualNetworkRules withSubnet(Subnet subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the ignoreMissingVnetServiceEndpoint property: Value that indicates whether to ignore missing VNet Service
     * Endpoint.
     *
     * @return the ignoreMissingVnetServiceEndpoint value.
     */
    public Boolean ignoreMissingVnetServiceEndpoint() {
        return this.ignoreMissingVnetServiceEndpoint;
    }

    /**
     * Set the ignoreMissingVnetServiceEndpoint property: Value that indicates whether to ignore missing VNet Service
     * Endpoint.
     *
     * @param ignoreMissingVnetServiceEndpoint the ignoreMissingVnetServiceEndpoint value to set.
     * @return the NWRuleSetVirtualNetworkRules object itself.
     */
    public NWRuleSetVirtualNetworkRules withIgnoreMissingVnetServiceEndpoint(Boolean ignoreMissingVnetServiceEndpoint) {
        this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subnet() != null) {
            subnet().validate();
        }
    }
}
