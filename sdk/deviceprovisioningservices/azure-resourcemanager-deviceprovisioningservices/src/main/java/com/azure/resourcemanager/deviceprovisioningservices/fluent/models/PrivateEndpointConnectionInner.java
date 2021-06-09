// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.deviceprovisioningservices.models.PrivateEndpointConnectionProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The private endpoint connection of a provisioning service. */
@Fluent
public final class PrivateEndpointConnectionInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateEndpointConnectionInner.class);

    /*
     * The properties of a private endpoint connection
     */
    @JsonProperty(value = "properties", required = true)
    private PrivateEndpointConnectionProperties properties;

    /**
     * Get the properties property: The properties of a private endpoint connection.
     *
     * @return the properties value.
     */
    public PrivateEndpointConnectionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of a private endpoint connection.
     *
     * @param properties the properties value to set.
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withProperties(PrivateEndpointConnectionProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property properties in model PrivateEndpointConnectionInner"));
        } else {
            properties().validate();
        }
    }
}
