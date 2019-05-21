/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of a network port.
 */
public class PortFragment {
    /**
     * Protocol type of the port. Possible values include: 'Tcp', 'Udp'.
     */
    @JsonProperty(value = "transportProtocol")
    private TransportProtocol transportProtocol;

    /**
     * Backend port of the target virtual machine.
     */
    @JsonProperty(value = "backendPort")
    private Integer backendPort;

    /**
     * Get protocol type of the port. Possible values include: 'Tcp', 'Udp'.
     *
     * @return the transportProtocol value
     */
    public TransportProtocol transportProtocol() {
        return this.transportProtocol;
    }

    /**
     * Set protocol type of the port. Possible values include: 'Tcp', 'Udp'.
     *
     * @param transportProtocol the transportProtocol value to set
     * @return the PortFragment object itself.
     */
    public PortFragment withTransportProtocol(TransportProtocol transportProtocol) {
        this.transportProtocol = transportProtocol;
        return this;
    }

    /**
     * Get backend port of the target virtual machine.
     *
     * @return the backendPort value
     */
    public Integer backendPort() {
        return this.backendPort;
    }

    /**
     * Set backend port of the target virtual machine.
     *
     * @param backendPort the backendPort value to set
     * @return the PortFragment object itself.
     */
    public PortFragment withBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
        return this;
    }

}
