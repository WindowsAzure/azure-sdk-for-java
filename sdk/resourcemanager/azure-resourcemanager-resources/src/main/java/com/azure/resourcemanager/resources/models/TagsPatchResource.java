// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Wrapper resource for tags patch API request only. */
@Fluent
public final class TagsPatchResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TagsPatchResource.class);

    /*
     * The operation type for the patch API.
     */
    @JsonProperty(value = "operation")
    private TagsPatchOperation operation;

    /*
     * The set of tags.
     */
    @JsonProperty(value = "properties")
    private Tags properties;

    /**
     * Get the operation property: The operation type for the patch API.
     *
     * @return the operation value.
     */
    public TagsPatchOperation operation() {
        return this.operation;
    }

    /**
     * Set the operation property: The operation type for the patch API.
     *
     * @param operation the operation value to set.
     * @return the TagsPatchResource object itself.
     */
    public TagsPatchResource withOperation(TagsPatchOperation operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the properties property: The set of tags.
     *
     * @return the properties value.
     */
    public Tags properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The set of tags.
     *
     * @param properties the properties value to set.
     * @return the TagsPatchResource object itself.
     */
    public TagsPatchResource withProperties(Tags properties) {
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
