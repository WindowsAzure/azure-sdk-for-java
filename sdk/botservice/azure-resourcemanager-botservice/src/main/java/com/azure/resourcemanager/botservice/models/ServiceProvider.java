// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Service Provider Definition. */
@Fluent
public final class ServiceProvider {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceProvider.class);

    /*
     * The Properties of a Service Provider Object
     */
    @JsonProperty(value = "properties")
    private ServiceProviderProperties properties;

    /**
     * Get the properties property: The Properties of a Service Provider Object.
     *
     * @return the properties value.
     */
    public ServiceProviderProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The Properties of a Service Provider Object.
     *
     * @param properties the properties value to set.
     * @return the ServiceProvider object itself.
     */
    public ServiceProvider withProperties(ServiceProviderProperties properties) {
        this.properties = properties;
        return this;
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
