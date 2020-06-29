/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VpnClientConnectionHealth properties.
 */
public class VpnClientConnectionHealth {
    /**
     * Total of the Ingress Bytes Transferred in this P2S Vpn connection.
     */
    @JsonProperty(value = "totalIngressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long totalIngressBytesTransferred;

    /**
     * Total of the Egress Bytes Transferred in this connection.
     */
    @JsonProperty(value = "totalEgressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long totalEgressBytesTransferred;

    /**
     * The total of p2s vpn clients connected at this time to this
     * P2SVpnGateway.
     */
    @JsonProperty(value = "vpnClientConnectionsCount")
    private Integer vpnClientConnectionsCount;

    /**
     * List of allocated ip addresses to the connected p2s vpn clients.
     */
    @JsonProperty(value = "allocatedIpAddresses")
    private List<String> allocatedIpAddresses;

    /**
     * Get total of the Ingress Bytes Transferred in this P2S Vpn connection.
     *
     * @return the totalIngressBytesTransferred value
     */
    public Long totalIngressBytesTransferred() {
        return this.totalIngressBytesTransferred;
    }

    /**
     * Get total of the Egress Bytes Transferred in this connection.
     *
     * @return the totalEgressBytesTransferred value
     */
    public Long totalEgressBytesTransferred() {
        return this.totalEgressBytesTransferred;
    }

    /**
     * Get the total of p2s vpn clients connected at this time to this P2SVpnGateway.
     *
     * @return the vpnClientConnectionsCount value
     */
    public Integer vpnClientConnectionsCount() {
        return this.vpnClientConnectionsCount;
    }

    /**
     * Set the total of p2s vpn clients connected at this time to this P2SVpnGateway.
     *
     * @param vpnClientConnectionsCount the vpnClientConnectionsCount value to set
     * @return the VpnClientConnectionHealth object itself.
     */
    public VpnClientConnectionHealth withVpnClientConnectionsCount(Integer vpnClientConnectionsCount) {
        this.vpnClientConnectionsCount = vpnClientConnectionsCount;
        return this;
    }

    /**
     * Get list of allocated ip addresses to the connected p2s vpn clients.
     *
     * @return the allocatedIpAddresses value
     */
    public List<String> allocatedIpAddresses() {
        return this.allocatedIpAddresses;
    }

    /**
     * Set list of allocated ip addresses to the connected p2s vpn clients.
     *
     * @param allocatedIpAddresses the allocatedIpAddresses value to set
     * @return the VpnClientConnectionHealth object itself.
     */
    public VpnClientConnectionHealth withAllocatedIpAddresses(List<String> allocatedIpAddresses) {
        this.allocatedIpAddresses = allocatedIpAddresses;
        return this;
    }

}
