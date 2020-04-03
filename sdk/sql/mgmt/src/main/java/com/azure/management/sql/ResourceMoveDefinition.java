// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ResourceMoveDefinition model.
 */
@Fluent
public final class ResourceMoveDefinition {
    /*
     * The target ID for the resource
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the id property: The target ID for the resource.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The target ID for the resource.
     * 
     * @param id the id value to set.
     * @return the ResourceMoveDefinition object itself.
     */
    public ResourceMoveDefinition withId(String id) {
        this.id = id;
        return this;
    }
}
