// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Private endpoint which a connection belongs to. */
@Fluent
public final class PrivateEndpoint {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateEndpoint.class);

    /*
     * The resource Id for private endpoint
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: The resource Id for private endpoint.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The resource Id for private endpoint.
     *
     * @param id the id value to set.
     * @return the PrivateEndpoint object itself.
     */
    public PrivateEndpoint withId(String id) {
        this.id = id;
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
