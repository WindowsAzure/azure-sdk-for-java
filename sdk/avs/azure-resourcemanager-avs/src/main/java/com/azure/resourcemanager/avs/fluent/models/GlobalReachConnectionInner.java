// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.models.GlobalReachConnectionProvisioningState;
import com.azure.resourcemanager.avs.models.GlobalReachConnectionStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A global reach connection resource. */
@JsonFlatten
@Fluent
public class GlobalReachConnectionInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GlobalReachConnectionInner.class);

    /*
     * The state of the  ExpressRoute Circuit Authorization provisioning
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private GlobalReachConnectionProvisioningState provisioningState;

    /*
     * The network used for global reach carved out from the original network
     * block provided for the private cloud
     */
    @JsonProperty(value = "properties.addressPrefix", access = JsonProperty.Access.WRITE_ONLY)
    private String addressPrefix;

    /*
     * Authorization key from the peer express route used for the global reach
     * connection
     */
    @JsonProperty(value = "properties.authorizationKey")
    private String authorizationKey;

    /*
     * The connection status of the global reach connection
     */
    @JsonProperty(value = "properties.circuitConnectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private GlobalReachConnectionStatus circuitConnectionStatus;

    /*
     * Identifier of the ExpressRoute Circuit to peer with in the global reach
     * connection
     */
    @JsonProperty(value = "properties.peerExpressRouteCircuit")
    private String peerExpressRouteCircuit;

    /**
     * Get the provisioningState property: The state of the ExpressRoute Circuit Authorization provisioning.
     *
     * @return the provisioningState value.
     */
    public GlobalReachConnectionProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the addressPrefix property: The network used for global reach carved out from the original network block
     * provided for the private cloud.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Get the authorizationKey property: Authorization key from the peer express route used for the global reach
     * connection.
     *
     * @return the authorizationKey value.
     */
    public String authorizationKey() {
        return this.authorizationKey;
    }

    /**
     * Set the authorizationKey property: Authorization key from the peer express route used for the global reach
     * connection.
     *
     * @param authorizationKey the authorizationKey value to set.
     * @return the GlobalReachConnectionInner object itself.
     */
    public GlobalReachConnectionInner withAuthorizationKey(String authorizationKey) {
        this.authorizationKey = authorizationKey;
        return this;
    }

    /**
     * Get the circuitConnectionStatus property: The connection status of the global reach connection.
     *
     * @return the circuitConnectionStatus value.
     */
    public GlobalReachConnectionStatus circuitConnectionStatus() {
        return this.circuitConnectionStatus;
    }

    /**
     * Get the peerExpressRouteCircuit property: Identifier of the ExpressRoute Circuit to peer with in the global reach
     * connection.
     *
     * @return the peerExpressRouteCircuit value.
     */
    public String peerExpressRouteCircuit() {
        return this.peerExpressRouteCircuit;
    }

    /**
     * Set the peerExpressRouteCircuit property: Identifier of the ExpressRoute Circuit to peer with in the global reach
     * connection.
     *
     * @param peerExpressRouteCircuit the peerExpressRouteCircuit value to set.
     * @return the GlobalReachConnectionInner object itself.
     */
    public GlobalReachConnectionInner withPeerExpressRouteCircuit(String peerExpressRouteCircuit) {
        this.peerExpressRouteCircuit = peerExpressRouteCircuit;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
