/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2018_10_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IP address for the container group.
 */
public class IpAddress {
    /**
     * The list of ports exposed on the container group.
     */
    @JsonProperty(value = "ports", required = true)
    private List<Port> ports;

    /**
     * Specifies if the IP is exposed to the public internet or private VNET.
     * Possible values include: 'Public', 'Private'.
     */
    @JsonProperty(value = "type", required = true)
    private ContainerGroupIpAddressType type;

    /**
     * The IP exposed to the public internet.
     */
    @JsonProperty(value = "ip")
    private String ip;

    /**
     * The Dns name label for the IP.
     */
    @JsonProperty(value = "dnsNameLabel")
    private String dnsNameLabel;

    /**
     * The FQDN for the IP.
     */
    @JsonProperty(value = "fqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String fqdn;

    /**
     * Get the list of ports exposed on the container group.
     *
     * @return the ports value
     */
    public List<Port> ports() {
        return this.ports;
    }

    /**
     * Set the list of ports exposed on the container group.
     *
     * @param ports the ports value to set
     * @return the IpAddress object itself.
     */
    public IpAddress withPorts(List<Port> ports) {
        this.ports = ports;
        return this;
    }

    /**
     * Get specifies if the IP is exposed to the public internet or private VNET. Possible values include: 'Public', 'Private'.
     *
     * @return the type value
     */
    public ContainerGroupIpAddressType type() {
        return this.type;
    }

    /**
     * Set specifies if the IP is exposed to the public internet or private VNET. Possible values include: 'Public', 'Private'.
     *
     * @param type the type value to set
     * @return the IpAddress object itself.
     */
    public IpAddress withType(ContainerGroupIpAddressType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the IP exposed to the public internet.
     *
     * @return the ip value
     */
    public String ip() {
        return this.ip;
    }

    /**
     * Set the IP exposed to the public internet.
     *
     * @param ip the ip value to set
     * @return the IpAddress object itself.
     */
    public IpAddress withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * Get the Dns name label for the IP.
     *
     * @return the dnsNameLabel value
     */
    public String dnsNameLabel() {
        return this.dnsNameLabel;
    }

    /**
     * Set the Dns name label for the IP.
     *
     * @param dnsNameLabel the dnsNameLabel value to set
     * @return the IpAddress object itself.
     */
    public IpAddress withDnsNameLabel(String dnsNameLabel) {
        this.dnsNameLabel = dnsNameLabel;
        return this;
    }

    /**
     * Get the FQDN for the IP.
     *
     * @return the fqdn value
     */
    public String fqdn() {
        return this.fqdn;
    }

}
