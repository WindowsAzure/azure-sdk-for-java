// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.management.network.ExpressRouteCircuitPeeringId;
import com.azure.management.network.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ExpressRouteConnection model. */
@JsonFlatten
@Fluent
public class ExpressRouteConnectionInner extends SubResource {
    /*
     * The name of the resource.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The ExpressRoute circuit peering.
     */
    @JsonProperty(value = "properties.expressRouteCircuitPeering")
    private ExpressRouteCircuitPeeringId expressRouteCircuitPeering;

    /*
     * Authorization key to establish the connection.
     */
    @JsonProperty(value = "properties.authorizationKey")
    private String authorizationKey;

    /*
     * The routing weight associated to the connection.
     */
    @JsonProperty(value = "properties.routingWeight")
    private Integer routingWeight;

    /**
     * Get the name property: The name of the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource.
     *
     * @param name the name value to set.
     * @return the ExpressRouteConnectionInner object itself.
     */
    public ExpressRouteConnectionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the expressRouteCircuitPeering property: The ExpressRoute circuit peering.
     *
     * @return the expressRouteCircuitPeering value.
     */
    public ExpressRouteCircuitPeeringId expressRouteCircuitPeering() {
        return this.expressRouteCircuitPeering;
    }

    /**
     * Set the expressRouteCircuitPeering property: The ExpressRoute circuit peering.
     *
     * @param expressRouteCircuitPeering the expressRouteCircuitPeering value to set.
     * @return the ExpressRouteConnectionInner object itself.
     */
    public ExpressRouteConnectionInner withExpressRouteCircuitPeering(
        ExpressRouteCircuitPeeringId expressRouteCircuitPeering) {
        this.expressRouteCircuitPeering = expressRouteCircuitPeering;
        return this;
    }

    /**
     * Get the authorizationKey property: Authorization key to establish the connection.
     *
     * @return the authorizationKey value.
     */
    public String authorizationKey() {
        return this.authorizationKey;
    }

    /**
     * Set the authorizationKey property: Authorization key to establish the connection.
     *
     * @param authorizationKey the authorizationKey value to set.
     * @return the ExpressRouteConnectionInner object itself.
     */
    public ExpressRouteConnectionInner withAuthorizationKey(String authorizationKey) {
        this.authorizationKey = authorizationKey;
        return this;
    }

    /**
     * Get the routingWeight property: The routing weight associated to the connection.
     *
     * @return the routingWeight value.
     */
    public Integer routingWeight() {
        return this.routingWeight;
    }

    /**
     * Set the routingWeight property: The routing weight associated to the connection.
     *
     * @param routingWeight the routingWeight value to set.
     * @return the ExpressRouteConnectionInner object itself.
     */
    public ExpressRouteConnectionInner withRoutingWeight(Integer routingWeight) {
        this.routingWeight = routingWeight;
        return this;
    }
}
