// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerservice.generated.models.PrivateEndpoint;
import com.azure.resourcemanager.containerservice.generated.models.PrivateEndpointConnectionProvisioningState;
import com.azure.resourcemanager.containerservice.generated.models.PrivateLinkServiceConnectionState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A private endpoint connection. */
@JsonFlatten
@Fluent
public class PrivateEndpointConnectionInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateEndpointConnectionInner.class);

    /*
     * The current provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateEndpointConnectionProvisioningState provisioningState;

    /*
     * The resource of private endpoint.
     */
    @JsonProperty(value = "properties.privateEndpoint")
    private PrivateEndpoint privateEndpoint;

    /*
     * A collection of information about the state of the connection between
     * service consumer and provider.
     */
    @JsonProperty(value = "properties.privateLinkServiceConnectionState")
    private PrivateLinkServiceConnectionState privateLinkServiceConnectionState;

    /**
     * Get the provisioningState property: The current provisioning state.
     *
     * @return the provisioningState value.
     */
    public PrivateEndpointConnectionProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the privateEndpoint property: The resource of private endpoint.
     *
     * @return the privateEndpoint value.
     */
    public PrivateEndpoint privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the privateEndpoint property: The resource of private endpoint.
     *
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: A collection of information about the state of the connection
     * between service consumer and provider.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: A collection of information about the state of the connection
     * between service consumer and provider.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withPrivateLinkServiceConnectionState(
        PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
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
