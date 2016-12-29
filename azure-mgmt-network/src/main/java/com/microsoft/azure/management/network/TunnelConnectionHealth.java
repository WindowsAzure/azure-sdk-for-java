/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VirtualNetworkGatewayConnection properties.
 */
public class TunnelConnectionHealth {
    /**
     * Tunnel name.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String tunnel;

    /**
     * Virtual network Gateway connection status. Possible values include:
     * 'Unknown', 'Connecting', 'Connected', 'NotConnected'.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private VirtualNetworkGatewayConnectionStatus connectionStatus;

    /**
     * The Ingress Bytes Transferred in this connection.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long ingressBytesTransferred;

    /**
     * The Egress Bytes Transferred in this connection.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long egressBytesTransferred;

    /**
     * The time at which connection was established in Utc format.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String lastConnectionEstablishedUtcTime;

    /**
     * Get the tunnel value.
     *
     * @return the tunnel value
     */
    public String tunnel() {
        return this.tunnel;
    }

    /**
     * Get the connectionStatus value.
     *
     * @return the connectionStatus value
     */
    public VirtualNetworkGatewayConnectionStatus connectionStatus() {
        return this.connectionStatus;
    }

    /**
     * Get the ingressBytesTransferred value.
     *
     * @return the ingressBytesTransferred value
     */
    public Long ingressBytesTransferred() {
        return this.ingressBytesTransferred;
    }

    /**
     * Get the egressBytesTransferred value.
     *
     * @return the egressBytesTransferred value
     */
    public Long egressBytesTransferred() {
        return this.egressBytesTransferred;
    }

    /**
     * Get the lastConnectionEstablishedUtcTime value.
     *
     * @return the lastConnectionEstablishedUtcTime value
     */
    public String lastConnectionEstablishedUtcTime() {
        return this.lastConnectionEstablishedUtcTime;
    }

}
