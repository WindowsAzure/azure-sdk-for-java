/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import com.microsoft.azure.management.network.v2019_04_01.implementation.PrivateEndpointInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * PrivateEndpointConnection resource.
 */
@JsonFlatten
public class PrivateEndpointConnection extends SubResource {
    /**
     * The resource of private end point.
     */
    @JsonProperty(value = "properties.privateEndpoint")
    private PrivateEndpointInner privateEndpoint;

    /**
     * A collection of information about the state of the connection between
     * service consumer and provider.
     */
    @JsonProperty(value = "properties.privateLinkServiceConnectionState")
    private PrivateLinkServiceConnectionState privateLinkServiceConnectionState;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the resource of private end point.
     *
     * @return the privateEndpoint value
     */
    public PrivateEndpointInner privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the resource of private end point.
     *
     * @param privateEndpoint the privateEndpoint value to set
     * @return the PrivateEndpointConnection object itself.
     */
    public PrivateEndpointConnection withPrivateEndpoint(PrivateEndpointInner privateEndpoint) {
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
     * @return the PrivateEndpointConnection object itself.
     */
    public PrivateEndpointConnection withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the PrivateEndpointConnection object itself.
     */
    public PrivateEndpointConnection withName(String name) {
        this.name = name;
        return this;
    }

}
