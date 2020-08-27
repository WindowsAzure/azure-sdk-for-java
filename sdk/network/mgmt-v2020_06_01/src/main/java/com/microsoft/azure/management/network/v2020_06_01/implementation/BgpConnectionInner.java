/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01.implementation;

import com.microsoft.azure.management.network.v2020_06_01.ProvisioningState;
import com.microsoft.azure.management.network.v2020_06_01.HubBgpConnectionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Virtual Appliance Site resource.
 */
@JsonFlatten
public class BgpConnectionInner extends SubResource {
    /**
     * Peer ASN.
     */
    @JsonProperty(value = "properties.peerAsn")
    private Long peerAsn;

    /**
     * Peer IP.
     */
    @JsonProperty(value = "properties.peerIp")
    private String peerIp;

    /**
     * The provisioning state of the resource. Possible values include:
     * 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The current state of the VirtualHub to Peer. Possible values include:
     * 'Unknown', 'Connecting', 'Connected', 'NotConnected'.
     */
    @JsonProperty(value = "properties.connectionState", access = JsonProperty.Access.WRITE_ONLY)
    private HubBgpConnectionStatus connectionState;

    /**
     * Name of the connection.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Connection type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get peer ASN.
     *
     * @return the peerAsn value
     */
    public Long peerAsn() {
        return this.peerAsn;
    }

    /**
     * Set peer ASN.
     *
     * @param peerAsn the peerAsn value to set
     * @return the BgpConnectionInner object itself.
     */
    public BgpConnectionInner withPeerAsn(Long peerAsn) {
        this.peerAsn = peerAsn;
        return this;
    }

    /**
     * Get peer IP.
     *
     * @return the peerIp value
     */
    public String peerIp() {
        return this.peerIp;
    }

    /**
     * Set peer IP.
     *
     * @param peerIp the peerIp value to set
     * @return the BgpConnectionInner object itself.
     */
    public BgpConnectionInner withPeerIp(String peerIp) {
        this.peerIp = peerIp;
        return this;
    }

    /**
     * Get the provisioning state of the resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the current state of the VirtualHub to Peer. Possible values include: 'Unknown', 'Connecting', 'Connected', 'NotConnected'.
     *
     * @return the connectionState value
     */
    public HubBgpConnectionStatus connectionState() {
        return this.connectionState;
    }

    /**
     * Get name of the connection.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the connection.
     *
     * @param name the name value to set
     * @return the BgpConnectionInner object itself.
     */
    public BgpConnectionInner withName(String name) {
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

    /**
     * Get connection type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
