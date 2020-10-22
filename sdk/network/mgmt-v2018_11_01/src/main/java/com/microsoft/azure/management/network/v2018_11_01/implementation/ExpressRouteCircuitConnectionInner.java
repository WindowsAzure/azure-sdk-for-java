/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_11_01.implementation;

import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2018_11_01.CircuitConnectionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Express Route Circuit Connection in an ExpressRouteCircuitPeering resource.
 */
@JsonFlatten
public class ExpressRouteCircuitConnectionInner extends SubResource {
    /**
     * Reference to Express Route Circuit Private Peering Resource of the
     * circuit initiating connection.
     */
    @JsonProperty(value = "properties.expressRouteCircuitPeering")
    private SubResource expressRouteCircuitPeering;

    /**
     * Reference to Express Route Circuit Private Peering Resource of the
     * peered circuit.
     */
    @JsonProperty(value = "properties.peerExpressRouteCircuitPeering")
    private SubResource peerExpressRouteCircuitPeering;

    /**
     * /29 IP address space to carve out Customer addresses for tunnels.
     */
    @JsonProperty(value = "properties.addressPrefix")
    private String addressPrefix;

    /**
     * The authorization key.
     */
    @JsonProperty(value = "properties.authorizationKey")
    private String authorizationKey;

    /**
     * Express Route Circuit Connection State. Possible values are: 'Connected'
     * and 'Disconnected'. Possible values include: 'Connected', 'Connecting',
     * 'Disconnected'.
     */
    @JsonProperty(value = "properties.circuitConnectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private CircuitConnectionStatus circuitConnectionStatus;

    /**
     * Provisioning state of the circuit connection resource. Possible values
     * are: 'Succeeded', 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get reference to Express Route Circuit Private Peering Resource of the circuit initiating connection.
     *
     * @return the expressRouteCircuitPeering value
     */
    public SubResource expressRouteCircuitPeering() {
        return this.expressRouteCircuitPeering;
    }

    /**
     * Set reference to Express Route Circuit Private Peering Resource of the circuit initiating connection.
     *
     * @param expressRouteCircuitPeering the expressRouteCircuitPeering value to set
     * @return the ExpressRouteCircuitConnectionInner object itself.
     */
    public ExpressRouteCircuitConnectionInner withExpressRouteCircuitPeering(SubResource expressRouteCircuitPeering) {
        this.expressRouteCircuitPeering = expressRouteCircuitPeering;
        return this;
    }

    /**
     * Get reference to Express Route Circuit Private Peering Resource of the peered circuit.
     *
     * @return the peerExpressRouteCircuitPeering value
     */
    public SubResource peerExpressRouteCircuitPeering() {
        return this.peerExpressRouteCircuitPeering;
    }

    /**
     * Set reference to Express Route Circuit Private Peering Resource of the peered circuit.
     *
     * @param peerExpressRouteCircuitPeering the peerExpressRouteCircuitPeering value to set
     * @return the ExpressRouteCircuitConnectionInner object itself.
     */
    public ExpressRouteCircuitConnectionInner withPeerExpressRouteCircuitPeering(SubResource peerExpressRouteCircuitPeering) {
        this.peerExpressRouteCircuitPeering = peerExpressRouteCircuitPeering;
        return this;
    }

    /**
     * Get /29 IP address space to carve out Customer addresses for tunnels.
     *
     * @return the addressPrefix value
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set /29 IP address space to carve out Customer addresses for tunnels.
     *
     * @param addressPrefix the addressPrefix value to set
     * @return the ExpressRouteCircuitConnectionInner object itself.
     */
    public ExpressRouteCircuitConnectionInner withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the authorization key.
     *
     * @return the authorizationKey value
     */
    public String authorizationKey() {
        return this.authorizationKey;
    }

    /**
     * Set the authorization key.
     *
     * @param authorizationKey the authorizationKey value to set
     * @return the ExpressRouteCircuitConnectionInner object itself.
     */
    public ExpressRouteCircuitConnectionInner withAuthorizationKey(String authorizationKey) {
        this.authorizationKey = authorizationKey;
        return this;
    }

    /**
     * Get express Route Circuit Connection State. Possible values are: 'Connected' and 'Disconnected'. Possible values include: 'Connected', 'Connecting', 'Disconnected'.
     *
     * @return the circuitConnectionStatus value
     */
    public CircuitConnectionStatus circuitConnectionStatus() {
        return this.circuitConnectionStatus;
    }

    /**
     * Get provisioning state of the circuit connection resource. Possible values are: 'Succeeded', 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get gets name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set gets name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the ExpressRouteCircuitConnectionInner object itself.
     */
    public ExpressRouteCircuitConnectionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

}
