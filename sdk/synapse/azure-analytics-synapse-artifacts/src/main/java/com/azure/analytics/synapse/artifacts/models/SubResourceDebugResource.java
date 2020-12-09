// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Synapse nested debug resource. */
@Fluent
public class SubResourceDebugResource {
    /*
     * The resource name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the name property: The resource name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The resource name.
     *
     * @param name the name value to set.
     * @return the SubResourceDebugResource object itself.
     */
    public SubResourceDebugResource setName(String name) {
        this.name = name;
        return this;
    }
}
