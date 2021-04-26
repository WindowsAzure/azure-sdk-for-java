// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a VHD in the lab. */
@Fluent
public final class LabVhdInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LabVhdInner.class);

    /*
     * The URI to the VHD.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: The URI to the VHD.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The URI to the VHD.
     *
     * @param id the id value to set.
     * @return the LabVhdInner object itself.
     */
    public LabVhdInner withId(String id) {
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
