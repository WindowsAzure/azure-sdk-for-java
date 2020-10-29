// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ExpressRouteCircuitPeeringId;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.RoutingConfiguration;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ExpressRouteConnection resource. */
@JsonFlatten
@Fluent
public class ExpressRouteConnectionInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteConnectionInner.class);

    /*
     * The name of the resource.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The provisioning state of the express route connection resource.
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

    /*
     * Enable internet security.
     */
    @JsonProperty(value = "properties.enableInternetSecurity")
    private Boolean enableInternetSecurity;

    /*
     * The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     */
    @JsonProperty(value = "properties.routingConfiguration")
    private RoutingConfiguration routingConfiguration;

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
     * Get the provisioningState property: The provisioning state of the express route connection resource.
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

    /**
     * Get the enableInternetSecurity property: Enable internet security.
     *
     * @return the enableInternetSecurity value.
     */
    public Boolean enableInternetSecurity() {
        return this.enableInternetSecurity;
    }

    /**
     * Set the enableInternetSecurity property: Enable internet security.
     *
     * @param enableInternetSecurity the enableInternetSecurity value to set.
     * @return the ExpressRouteConnectionInner object itself.
     */
    public ExpressRouteConnectionInner withEnableInternetSecurity(Boolean enableInternetSecurity) {
        this.enableInternetSecurity = enableInternetSecurity;
        return this;
    }

    /**
     * Get the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     *
     * @return the routingConfiguration value.
     */
    public RoutingConfiguration routingConfiguration() {
        return this.routingConfiguration;
    }

    /**
     * Set the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     *
     * @param routingConfiguration the routingConfiguration value to set.
     * @return the ExpressRouteConnectionInner object itself.
     */
    public ExpressRouteConnectionInner withRoutingConfiguration(RoutingConfiguration routingConfiguration) {
        this.routingConfiguration = routingConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model ExpressRouteConnectionInner"));
        }
        if (expressRouteCircuitPeering() != null) {
            expressRouteCircuitPeering().validate();
        }
        if (routingConfiguration() != null) {
            routingConfiguration().validate();
        }
    }
}
