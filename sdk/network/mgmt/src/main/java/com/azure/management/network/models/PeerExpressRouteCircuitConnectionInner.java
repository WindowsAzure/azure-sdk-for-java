// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.management.network.CircuitConnectionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PeerExpressRouteCircuitConnection model. */
@JsonFlatten
@Fluent
public class PeerExpressRouteCircuitConnectionInner extends SubResource {
    /*
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Reference to Express Route Circuit Private Peering Resource of the
     * circuit.
     */
    @JsonProperty(value = "properties.expressRouteCircuitPeering")
    private SubResource expressRouteCircuitPeering;

    /*
     * Reference to Express Route Circuit Private Peering Resource of the
     * peered circuit.
     */
    @JsonProperty(value = "properties.peerExpressRouteCircuitPeering")
    private SubResource peerExpressRouteCircuitPeering;

    /*
     * /29 IP address space to carve out Customer addresses for tunnels.
     */
    @JsonProperty(value = "properties.addressPrefix")
    private String addressPrefix;

    /*
     * Express Route Circuit connection state.
     */
    @JsonProperty(value = "properties.circuitConnectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private CircuitConnectionStatus circuitConnectionStatus;

    /*
     * The name of the express route circuit connection resource.
     */
    @JsonProperty(value = "properties.connectionName")
    private String connectionName;

    /*
     * The resource guid of the authorization used for the express route
     * circuit connection.
     */
    @JsonProperty(value = "properties.authResourceGuid")
    private String authResourceGuid;

    /*
     * Provisioning state of the peer express route circuit connection
     * resource. Possible values are: 'Succeeded', 'Updating', 'Deleting', and
     * 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the name property: Gets name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the PeerExpressRouteCircuitConnectionInner object itself.
     */
    public PeerExpressRouteCircuitConnectionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the expressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of the
     * circuit.
     *
     * @return the expressRouteCircuitPeering value.
     */
    public SubResource expressRouteCircuitPeering() {
        return this.expressRouteCircuitPeering;
    }

    /**
     * Set the expressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of the
     * circuit.
     *
     * @param expressRouteCircuitPeering the expressRouteCircuitPeering value to set.
     * @return the PeerExpressRouteCircuitConnectionInner object itself.
     */
    public PeerExpressRouteCircuitConnectionInner withExpressRouteCircuitPeering(
        SubResource expressRouteCircuitPeering) {
        this.expressRouteCircuitPeering = expressRouteCircuitPeering;
        return this;
    }

    /**
     * Get the peerExpressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of
     * the peered circuit.
     *
     * @return the peerExpressRouteCircuitPeering value.
     */
    public SubResource peerExpressRouteCircuitPeering() {
        return this.peerExpressRouteCircuitPeering;
    }

    /**
     * Set the peerExpressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of
     * the peered circuit.
     *
     * @param peerExpressRouteCircuitPeering the peerExpressRouteCircuitPeering value to set.
     * @return the PeerExpressRouteCircuitConnectionInner object itself.
     */
    public PeerExpressRouteCircuitConnectionInner withPeerExpressRouteCircuitPeering(
        SubResource peerExpressRouteCircuitPeering) {
        this.peerExpressRouteCircuitPeering = peerExpressRouteCircuitPeering;
        return this;
    }

    /**
     * Get the addressPrefix property: /29 IP address space to carve out Customer addresses for tunnels.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix property: /29 IP address space to carve out Customer addresses for tunnels.
     *
     * @param addressPrefix the addressPrefix value to set.
     * @return the PeerExpressRouteCircuitConnectionInner object itself.
     */
    public PeerExpressRouteCircuitConnectionInner withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the circuitConnectionStatus property: Express Route Circuit connection state.
     *
     * @return the circuitConnectionStatus value.
     */
    public CircuitConnectionStatus circuitConnectionStatus() {
        return this.circuitConnectionStatus;
    }

    /**
     * Get the connectionName property: The name of the express route circuit connection resource.
     *
     * @return the connectionName value.
     */
    public String connectionName() {
        return this.connectionName;
    }

    /**
     * Set the connectionName property: The name of the express route circuit connection resource.
     *
     * @param connectionName the connectionName value to set.
     * @return the PeerExpressRouteCircuitConnectionInner object itself.
     */
    public PeerExpressRouteCircuitConnectionInner withConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * Get the authResourceGuid property: The resource guid of the authorization used for the express route circuit
     * connection.
     *
     * @return the authResourceGuid value.
     */
    public String authResourceGuid() {
        return this.authResourceGuid;
    }

    /**
     * Set the authResourceGuid property: The resource guid of the authorization used for the express route circuit
     * connection.
     *
     * @param authResourceGuid the authResourceGuid value to set.
     * @return the PeerExpressRouteCircuitConnectionInner object itself.
     */
    public PeerExpressRouteCircuitConnectionInner withAuthResourceGuid(String authResourceGuid) {
        this.authResourceGuid = authResourceGuid;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the peer express route circuit connection resource.
     * Possible values are: 'Succeeded', 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }
}
