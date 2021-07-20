// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.implementation.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.mysql.models.PrivateEndpointProperty;
import com.azure.resourcemanager.mysql.models.PrivateLinkServiceConnectionStateProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A private endpoint connection. */
@Fluent
public final class PrivateEndpointConnectionInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateEndpointConnectionInner.class);

    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private PrivateEndpointConnectionProperties properties;

    /**
     * Get the properties property: Resource properties.
     *
     * @return the properties value.
     */
    private PrivateEndpointConnectionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Resource properties.
     *
     * @param properties the properties value to set.
     * @return the PrivateEndpointConnectionInner object itself.
     */
    private PrivateEndpointConnectionInner withProperties(PrivateEndpointConnectionProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the privateEndpoint property: Private endpoint which the connection belongs to.
     *
     * @return the privateEndpoint value.
     */
    public PrivateEndpointProperty privateEndpoint() {
        if (this.properties() == null) {
            return null;
        } else {
            return this.properties().privateEndpoint();
        }
    }

    /**
     * Set the privateEndpoint property: Private endpoint which the connection belongs to.
     *
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withPrivateEndpoint(PrivateEndpointProperty privateEndpoint) {
        if (this.properties() == null) {
            this.withProperties(new PrivateEndpointConnectionProperties());
        }
        this.properties().withPrivateEndpoint(privateEndpoint);
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: Connection state of the private endpoint connection.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState() {
        if (this.properties() == null) {
            return null;
        } else {
            return this.properties().privateLinkServiceConnectionState();
        }
    }

    /**
     * Set the privateLinkServiceConnectionState property: Connection state of the private endpoint connection.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withPrivateLinkServiceConnectionState(
        PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState) {
        if (this.properties() == null) {
            this.withProperties(new PrivateEndpointConnectionProperties());
        }
        this.properties().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }

    /**
     * Get the provisioningState property: State of the private endpoint connection.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        if (this.properties() == null) {
            return null;
        } else {
            return this.properties().provisioningState();
        }
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
