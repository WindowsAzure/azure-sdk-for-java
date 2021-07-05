// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a private endpoint connection. */
@Fluent
public final class ManagedInstancePrivateEndpointConnectionProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ManagedInstancePrivateEndpointConnectionProperties.class);

    /*
     * Private endpoint which the connection belongs to.
     */
    @JsonProperty(value = "privateEndpoint")
    private ManagedInstancePrivateEndpointProperty privateEndpoint;

    /*
     * Connection State of the Private Endpoint Connection.
     */
    @JsonProperty(value = "privateLinkServiceConnectionState")
    private ManagedInstancePrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState;

    /*
     * State of the Private Endpoint Connection.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the privateEndpoint property: Private endpoint which the connection belongs to.
     *
     * @return the privateEndpoint value.
     */
    public ManagedInstancePrivateEndpointProperty privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the privateEndpoint property: Private endpoint which the connection belongs to.
     *
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the ManagedInstancePrivateEndpointConnectionProperties object itself.
     */
    public ManagedInstancePrivateEndpointConnectionProperties withPrivateEndpoint(
        ManagedInstancePrivateEndpointProperty privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: Connection State of the Private Endpoint Connection.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    public ManagedInstancePrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: Connection State of the Private Endpoint Connection.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the ManagedInstancePrivateEndpointConnectionProperties object itself.
     */
    public ManagedInstancePrivateEndpointConnectionProperties withPrivateLinkServiceConnectionState(
        ManagedInstancePrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get the provisioningState property: State of the Private Endpoint Connection.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpoint() != null) {
            privateEndpoint().validate();
        }
        if (privateLinkServiceConnectionState() != null) {
            privateLinkServiceConnectionState().validate();
        }
    }
}
