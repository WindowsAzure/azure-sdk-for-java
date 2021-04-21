// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A rule for NAT - exposing a VM's port (backendPort) on the public IP address using a load balancer. */
@Fluent
public final class InboundNatRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InboundNatRule.class);

    /*
     * The transport protocol for the endpoint.
     */
    @JsonProperty(value = "transportProtocol")
    private TransportProtocol transportProtocol;

    /*
     * The external endpoint port of the inbound connection. Possible values
     * range between 1 and 65535, inclusive. If unspecified, a value will be
     * allocated automatically.
     */
    @JsonProperty(value = "frontendPort")
    private Integer frontendPort;

    /*
     * The port to which the external traffic will be redirected.
     */
    @JsonProperty(value = "backendPort")
    private Integer backendPort;

    /**
     * Get the transportProtocol property: The transport protocol for the endpoint.
     *
     * @return the transportProtocol value.
     */
    public TransportProtocol transportProtocol() {
        return this.transportProtocol;
    }

    /**
     * Set the transportProtocol property: The transport protocol for the endpoint.
     *
     * @param transportProtocol the transportProtocol value to set.
     * @return the InboundNatRule object itself.
     */
    public InboundNatRule withTransportProtocol(TransportProtocol transportProtocol) {
        this.transportProtocol = transportProtocol;
        return this;
    }

    /**
     * Get the frontendPort property: The external endpoint port of the inbound connection. Possible values range
     * between 1 and 65535, inclusive. If unspecified, a value will be allocated automatically.
     *
     * @return the frontendPort value.
     */
    public Integer frontendPort() {
        return this.frontendPort;
    }

    /**
     * Set the frontendPort property: The external endpoint port of the inbound connection. Possible values range
     * between 1 and 65535, inclusive. If unspecified, a value will be allocated automatically.
     *
     * @param frontendPort the frontendPort value to set.
     * @return the InboundNatRule object itself.
     */
    public InboundNatRule withFrontendPort(Integer frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }

    /**
     * Get the backendPort property: The port to which the external traffic will be redirected.
     *
     * @return the backendPort value.
     */
    public Integer backendPort() {
        return this.backendPort;
    }

    /**
     * Set the backendPort property: The port to which the external traffic will be redirected.
     *
     * @param backendPort the backendPort value to set.
     * @return the InboundNatRule object itself.
     */
    public InboundNatRule withBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
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
