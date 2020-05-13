// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PrivateEndpointProperty model. */
@Fluent
public final class PrivateEndpointProperty {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateEndpointProperty.class);

    /*
     * Resource id of the private endpoint.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: Resource id of the private endpoint.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource id of the private endpoint.
     *
     * @param id the id value to set.
     * @return the PrivateEndpointProperty object itself.
     */
    public PrivateEndpointProperty withId(String id) {
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
