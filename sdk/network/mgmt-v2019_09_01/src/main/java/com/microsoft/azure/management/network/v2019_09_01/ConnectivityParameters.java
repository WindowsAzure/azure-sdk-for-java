/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters that determine how the connectivity check will be performed.
 */
public class ConnectivityParameters {
    /**
     * Describes the source of the connection.
     */
    @JsonProperty(value = "source", required = true)
    private ConnectivitySource source;

    /**
     * Describes the destination of connection.
     */
    @JsonProperty(value = "destination", required = true)
    private ConnectivityDestination destination;

    /**
     * Network protocol. Possible values include: 'Tcp', 'Http', 'Https',
     * 'Icmp'.
     */
    @JsonProperty(value = "protocol")
    private Protocol protocol;

    /**
     * Configuration of the protocol.
     */
    @JsonProperty(value = "protocolConfiguration")
    private ProtocolConfiguration protocolConfiguration;

    /**
     * Preferred IP version of the connection. Possible values include: 'IPv4',
     * 'IPv6'.
     */
    @JsonProperty(value = "preferredIPVersion")
    private IPVersion preferredIPVersion;

    /**
     * Get describes the source of the connection.
     *
     * @return the source value
     */
    public ConnectivitySource source() {
        return this.source;
    }

    /**
     * Set describes the source of the connection.
     *
     * @param source the source value to set
     * @return the ConnectivityParameters object itself.
     */
    public ConnectivityParameters withSource(ConnectivitySource source) {
        this.source = source;
        return this;
    }

    /**
     * Get describes the destination of connection.
     *
     * @return the destination value
     */
    public ConnectivityDestination destination() {
        return this.destination;
    }

    /**
     * Set describes the destination of connection.
     *
     * @param destination the destination value to set
     * @return the ConnectivityParameters object itself.
     */
    public ConnectivityParameters withDestination(ConnectivityDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get network protocol. Possible values include: 'Tcp', 'Http', 'Https', 'Icmp'.
     *
     * @return the protocol value
     */
    public Protocol protocol() {
        return this.protocol;
    }

    /**
     * Set network protocol. Possible values include: 'Tcp', 'Http', 'Https', 'Icmp'.
     *
     * @param protocol the protocol value to set
     * @return the ConnectivityParameters object itself.
     */
    public ConnectivityParameters withProtocol(Protocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get configuration of the protocol.
     *
     * @return the protocolConfiguration value
     */
    public ProtocolConfiguration protocolConfiguration() {
        return this.protocolConfiguration;
    }

    /**
     * Set configuration of the protocol.
     *
     * @param protocolConfiguration the protocolConfiguration value to set
     * @return the ConnectivityParameters object itself.
     */
    public ConnectivityParameters withProtocolConfiguration(ProtocolConfiguration protocolConfiguration) {
        this.protocolConfiguration = protocolConfiguration;
        return this;
    }

    /**
     * Get preferred IP version of the connection. Possible values include: 'IPv4', 'IPv6'.
     *
     * @return the preferredIPVersion value
     */
    public IPVersion preferredIPVersion() {
        return this.preferredIPVersion;
    }

    /**
     * Set preferred IP version of the connection. Possible values include: 'IPv4', 'IPv6'.
     *
     * @param preferredIPVersion the preferredIPVersion value to set
     * @return the ConnectivityParameters object itself.
     */
    public ConnectivityParameters withPreferredIPVersion(IPVersion preferredIPVersion) {
        this.preferredIPVersion = preferredIPVersion;
        return this;
    }

}
