// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The NetworkProfile model. */
@Fluent
public final class NetworkProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkProfile.class);

    /*
     * CIDR for the OpenShift Vnet.
     */
    @JsonProperty(value = "vnetCidr")
    private String vnetCidr;

    /*
     * CIDR of the Vnet to peer.
     */
    @JsonProperty(value = "peerVnetId")
    private String peerVnetId;

    /*
     * ID of the Vnet created for OSA cluster.
     */
    @JsonProperty(value = "vnetId")
    private String vnetId;

    /**
     * Get the vnetCidr property: CIDR for the OpenShift Vnet.
     *
     * @return the vnetCidr value.
     */
    public String vnetCidr() {
        return this.vnetCidr;
    }

    /**
     * Set the vnetCidr property: CIDR for the OpenShift Vnet.
     *
     * @param vnetCidr the vnetCidr value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withVnetCidr(String vnetCidr) {
        this.vnetCidr = vnetCidr;
        return this;
    }

    /**
     * Get the peerVnetId property: CIDR of the Vnet to peer.
     *
     * @return the peerVnetId value.
     */
    public String peerVnetId() {
        return this.peerVnetId;
    }

    /**
     * Set the peerVnetId property: CIDR of the Vnet to peer.
     *
     * @param peerVnetId the peerVnetId value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withPeerVnetId(String peerVnetId) {
        this.peerVnetId = peerVnetId;
        return this;
    }

    /**
     * Get the vnetId property: ID of the Vnet created for OSA cluster.
     *
     * @return the vnetId value.
     */
    public String vnetId() {
        return this.vnetId;
    }

    /**
     * Set the vnetId property: ID of the Vnet created for OSA cluster.
     *
     * @param vnetId the vnetId value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withVnetId(String vnetId) {
        this.vnetId = vnetId;
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
