// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.management.sql.PrivateEndpointProperty;
import com.azure.management.sql.PrivateLinkServiceConnectionStateProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PrivateEndpointConnection model.
 */
@JsonFlatten
@Fluent
public class PrivateEndpointConnectionInner extends ProxyResource {
    /*
     * Private endpoint which the connection belongs to.
     */
    @JsonProperty(value = "properties.privateEndpoint")
    private PrivateEndpointProperty privateEndpoint;

    /*
     * Connection state of the private endpoint connection.
     */
    @JsonProperty(value = "properties.privateLinkServiceConnectionState")
    private PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState;

    /*
     * State of the private endpoint connection.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the privateEndpoint property: Private endpoint which the connection
     * belongs to.
     * 
     * @return the privateEndpoint value.
     */
    public PrivateEndpointProperty privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the privateEndpoint property: Private endpoint which the connection
     * belongs to.
     * 
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withPrivateEndpoint(PrivateEndpointProperty privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: Connection state of
     * the private endpoint connection.
     * 
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: Connection state of
     * the private endpoint connection.
     * 
     * @param privateLinkServiceConnectionState the
     * privateLinkServiceConnectionState value to set.
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get the provisioningState property: State of the private endpoint
     * connection.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }
}
