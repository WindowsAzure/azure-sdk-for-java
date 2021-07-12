// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the endpoint properties. */
@Fluent
public final class Endpoint {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Endpoint.class);

    /*
     * The name of the endpoint
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The endpoint URL
     */
    @JsonProperty(value = "endpoint")
    private String endpoint;

    /**
     * Get the name property: The name of the endpoint.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the endpoint.
     *
     * @param name the name value to set.
     * @return the Endpoint object itself.
     */
    public Endpoint withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the endpoint property: The endpoint URL.
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: The endpoint URL.
     *
     * @param endpoint the endpoint value to set.
     * @return the Endpoint object itself.
     */
    public Endpoint withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
