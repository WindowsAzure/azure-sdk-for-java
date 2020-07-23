// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContainerPort model. */
@Fluent
public final class ContainerPort {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerPort.class);

    /*
     * The protocol associated with the port.
     */
    @JsonProperty(value = "protocol")
    private ContainerNetworkProtocol protocol;

    /*
     * The port number exposed within the container group.
     */
    @JsonProperty(value = "port", required = true)
    private int port;

    /**
     * Get the protocol property: The protocol associated with the port.
     *
     * @return the protocol value.
     */
    public ContainerNetworkProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The protocol associated with the port.
     *
     * @param protocol the protocol value to set.
     * @return the ContainerPort object itself.
     */
    public ContainerPort withProtocol(ContainerNetworkProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the port property: The port number exposed within the container group.
     *
     * @return the port value.
     */
    public int port() {
        return this.port;
    }

    /**
     * Set the port property: The port number exposed within the container group.
     *
     * @param port the port value to set.
     * @return the ContainerPort object itself.
     */
    public ContainerPort withPort(int port) {
        this.port = port;
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
