/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EndpointDetail model.
 */
public class EndpointDetail {
    /**
     * An IP Address that Domain Name currently resolves to.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /**
     * The port an endpoint is connected to.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /**
     * The time in milliseconds it takes to connect to this IpAddress at this
     * Port.
     */
    @JsonProperty(value = "latency")
    private Double latency;

    /**
     * Whether it is possible to connect to IpAddress.
     */
    @JsonProperty(value = "isAccessable")
    private Boolean isAccessable;

    /**
     * Get an IP Address that Domain Name currently resolves to.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set an IP Address that Domain Name currently resolves to.
     *
     * @param ipAddress the ipAddress value to set
     * @return the EndpointDetail object itself.
     */
    public EndpointDetail withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the port an endpoint is connected to.
     *
     * @return the port value
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port an endpoint is connected to.
     *
     * @param port the port value to set
     * @return the EndpointDetail object itself.
     */
    public EndpointDetail withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the time in milliseconds it takes to connect to this IpAddress at this Port.
     *
     * @return the latency value
     */
    public Double latency() {
        return this.latency;
    }

    /**
     * Set the time in milliseconds it takes to connect to this IpAddress at this Port.
     *
     * @param latency the latency value to set
     * @return the EndpointDetail object itself.
     */
    public EndpointDetail withLatency(Double latency) {
        this.latency = latency;
        return this;
    }

    /**
     * Get whether it is possible to connect to IpAddress.
     *
     * @return the isAccessable value
     */
    public Boolean isAccessable() {
        return this.isAccessable;
    }

    /**
     * Set whether it is possible to connect to IpAddress.
     *
     * @param isAccessable the isAccessable value to set
     * @return the EndpointDetail object itself.
     */
    public EndpointDetail withIsAccessable(Boolean isAccessable) {
        this.isAccessable = isAccessable;
        return this;
    }

}
