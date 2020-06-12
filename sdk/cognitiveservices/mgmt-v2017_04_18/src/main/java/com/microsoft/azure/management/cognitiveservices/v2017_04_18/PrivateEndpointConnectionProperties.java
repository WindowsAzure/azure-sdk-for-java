/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the PrivateEndpointConnectProperties.
 */
public class PrivateEndpointConnectionProperties {
    /**
     * The resource of private end point.
     */
    @JsonProperty(value = "privateEndpoint")
    private PrivateEndpoint privateEndpoint;

    /**
     * A collection of information about the state of the connection between
     * service consumer and provider.
     */
    @JsonProperty(value = "privateLinkServiceConnectionState", required = true)
    private PrivateLinkServiceConnectionState privateLinkServiceConnectionState;

    /**
     * The private link resource group ids.
     */
    @JsonProperty(value = "groupIds")
    private List<String> groupIds;

    /**
     * Get the resource of private end point.
     *
     * @return the privateEndpoint value
     */
    public PrivateEndpoint privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the resource of private end point.
     *
     * @param privateEndpoint the privateEndpoint value to set
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get a collection of information about the state of the connection between service consumer and provider.
     *
     * @return the privateLinkServiceConnectionState value
     */
    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set a collection of information about the state of the connection between service consumer and provider.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get the private link resource group ids.
     *
     * @return the groupIds value
     */
    public List<String> groupIds() {
        return this.groupIds;
    }

    /**
     * Set the private link resource group ids.
     *
     * @param groupIds the groupIds value to set
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties withGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }

}
