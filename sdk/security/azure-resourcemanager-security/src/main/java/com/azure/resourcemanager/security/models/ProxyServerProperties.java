// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * For a non-Azure machine that is not connected directly to the internet, specify a proxy server that the non-Azure
 * machine can use.
 */
@Fluent
public final class ProxyServerProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProxyServerProperties.class);

    /*
     * Proxy server IP
     */
    @JsonProperty(value = "ip")
    private String ip;

    /*
     * Proxy server port
     */
    @JsonProperty(value = "port")
    private String port;

    /**
     * Get the ip property: Proxy server IP.
     *
     * @return the ip value.
     */
    public String ip() {
        return this.ip;
    }

    /**
     * Set the ip property: Proxy server IP.
     *
     * @param ip the ip value to set.
     * @return the ProxyServerProperties object itself.
     */
    public ProxyServerProperties withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * Get the port property: Proxy server port.
     *
     * @return the port value.
     */
    public String port() {
        return this.port;
    }

    /**
     * Set the port property: Proxy server port.
     *
     * @param port the port value to set.
     * @return the ProxyServerProperties object itself.
     */
    public ProxyServerProperties withPort(String port) {
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
