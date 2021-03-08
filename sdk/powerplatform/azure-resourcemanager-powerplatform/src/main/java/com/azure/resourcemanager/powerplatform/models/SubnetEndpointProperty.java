// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Endpoint of the subnet. */
@Fluent
public final class SubnetEndpointProperty {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SubnetEndpointProperty.class);

    /*
     * Resource id of the subnet.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: Resource id of the subnet.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource id of the subnet.
     *
     * @param id the id value to set.
     * @return the SubnetEndpointProperty object itself.
     */
    public SubnetEndpointProperty withId(String id) {
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
