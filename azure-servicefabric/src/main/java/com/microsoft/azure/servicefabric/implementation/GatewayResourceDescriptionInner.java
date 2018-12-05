/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import com.microsoft.azure.servicefabric.NetworkRef;
import java.util.List;
import com.microsoft.azure.servicefabric.TcpConfig;
import com.microsoft.azure.servicefabric.HttpConfig;
import com.microsoft.azure.servicefabric.ResourceStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * This type describes a gateway resource.
 */
@JsonFlatten
public class GatewayResourceDescriptionInner {
    /**
     * Name of the Gateway resource.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * User readable description of the gateway.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Network the gateway should listen on for requests.
     */
    @JsonProperty(value = "properties.sourceNetwork", required = true)
    private NetworkRef sourceNetwork;

    /**
     * Network that the Application is using.
     */
    @JsonProperty(value = "properties.destinationNetwork", required = true)
    private NetworkRef destinationNetwork;

    /**
     * Configuration for tcp connectivity for this gateway.
     */
    @JsonProperty(value = "properties.tcp")
    private List<TcpConfig> tcp;

    /**
     * Configuration for http connectivity for this gateway.
     */
    @JsonProperty(value = "properties.http")
    private List<HttpConfig> http;

    /**
     * Status of the resource. Possible values include: 'Unknown', 'Ready',
     * 'Upgrading', 'Creating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceStatus status;

    /**
     * Gives additional information about the current status of the gateway.
     */
    @JsonProperty(value = "properties.statusDetails", access = JsonProperty.Access.WRITE_ONLY)
    private String statusDetails;

    /**
     * IP address of the gateway. This is populated in the response and is
     * ignored for incoming requests.
     */
    @JsonProperty(value = "properties.ipAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String ipAddress;

    /**
     * Get name of the Gateway resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the Gateway resource.
     *
     * @param name the name value to set
     * @return the GatewayResourceDescriptionInner object itself.
     */
    public GatewayResourceDescriptionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get user readable description of the gateway.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set user readable description of the gateway.
     *
     * @param description the description value to set
     * @return the GatewayResourceDescriptionInner object itself.
     */
    public GatewayResourceDescriptionInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get network the gateway should listen on for requests.
     *
     * @return the sourceNetwork value
     */
    public NetworkRef sourceNetwork() {
        return this.sourceNetwork;
    }

    /**
     * Set network the gateway should listen on for requests.
     *
     * @param sourceNetwork the sourceNetwork value to set
     * @return the GatewayResourceDescriptionInner object itself.
     */
    public GatewayResourceDescriptionInner withSourceNetwork(NetworkRef sourceNetwork) {
        this.sourceNetwork = sourceNetwork;
        return this;
    }

    /**
     * Get network that the Application is using.
     *
     * @return the destinationNetwork value
     */
    public NetworkRef destinationNetwork() {
        return this.destinationNetwork;
    }

    /**
     * Set network that the Application is using.
     *
     * @param destinationNetwork the destinationNetwork value to set
     * @return the GatewayResourceDescriptionInner object itself.
     */
    public GatewayResourceDescriptionInner withDestinationNetwork(NetworkRef destinationNetwork) {
        this.destinationNetwork = destinationNetwork;
        return this;
    }

    /**
     * Get configuration for tcp connectivity for this gateway.
     *
     * @return the tcp value
     */
    public List<TcpConfig> tcp() {
        return this.tcp;
    }

    /**
     * Set configuration for tcp connectivity for this gateway.
     *
     * @param tcp the tcp value to set
     * @return the GatewayResourceDescriptionInner object itself.
     */
    public GatewayResourceDescriptionInner withTcp(List<TcpConfig> tcp) {
        this.tcp = tcp;
        return this;
    }

    /**
     * Get configuration for http connectivity for this gateway.
     *
     * @return the http value
     */
    public List<HttpConfig> http() {
        return this.http;
    }

    /**
     * Set configuration for http connectivity for this gateway.
     *
     * @param http the http value to set
     * @return the GatewayResourceDescriptionInner object itself.
     */
    public GatewayResourceDescriptionInner withHttp(List<HttpConfig> http) {
        this.http = http;
        return this;
    }

    /**
     * Get status of the resource. Possible values include: 'Unknown', 'Ready', 'Upgrading', 'Creating', 'Deleting', 'Failed'.
     *
     * @return the status value
     */
    public ResourceStatus status() {
        return this.status;
    }

    /**
     * Get gives additional information about the current status of the gateway.
     *
     * @return the statusDetails value
     */
    public String statusDetails() {
        return this.statusDetails;
    }

    /**
     * Get iP address of the gateway. This is populated in the response and is ignored for incoming requests.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

}
