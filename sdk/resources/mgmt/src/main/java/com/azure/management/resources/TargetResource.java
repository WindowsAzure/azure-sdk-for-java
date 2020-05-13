// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TargetResource model. */
@Fluent
public final class TargetResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TargetResource.class);

    /*
     * The ID of the resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The name of the resource.
     */
    @JsonProperty(value = "resourceName")
    private String resourceName;

    /*
     * The type of the resource.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /**
     * Get the id property: The ID of the resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the resource.
     *
     * @param id the id value to set.
     * @return the TargetResource object itself.
     */
    public TargetResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the resourceName property: The name of the resource.
     *
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set the resourceName property: The name of the resource.
     *
     * @param resourceName the resourceName value to set.
     * @return the TargetResource object itself.
     */
    public TargetResource withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * Get the resourceType property: The type of the resource.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: The type of the resource.
     *
     * @param resourceType the resourceType value to set.
     * @return the TargetResource object itself.
     */
    public TargetResource withResourceType(String resourceType) {
        this.resourceType = resourceType;
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
