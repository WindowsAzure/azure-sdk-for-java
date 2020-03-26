// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PrivateEndpointConnectionProperties model.
 */
@Fluent
public final class PrivateEndpointConnectionProperties {
    /*
     * The privateEndpoint property.
     */
    @JsonProperty(value = "privateEndpoint")
    private PrivateEndpointProperty privateEndpoint;

    /*
     * The privateLinkServiceConnectionState property.
     */
    @JsonProperty(value = "privateLinkServiceConnectionState")
    private PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState;

    /*
     * State of the private endpoint connection.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateEndpointProvisioningState provisioningState;

    /**
     * Get the privateEndpoint property: The privateEndpoint property.
     * 
     * @return the privateEndpoint value.
     */
    public PrivateEndpointProperty privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the privateEndpoint property: The privateEndpoint property.
     * 
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties withPrivateEndpoint(PrivateEndpointProperty privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: The
     * privateLinkServiceConnectionState property.
     * 
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: The
     * privateLinkServiceConnectionState property.
     * 
     * @param privateLinkServiceConnectionState the
     * privateLinkServiceConnectionState value to set.
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get the provisioningState property: State of the private endpoint
     * connection.
     * 
     * @return the provisioningState value.
     */
    public PrivateEndpointProvisioningState provisioningState() {
        return this.provisioningState;
    }
}
