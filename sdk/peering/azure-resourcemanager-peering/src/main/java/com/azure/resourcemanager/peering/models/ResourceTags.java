// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The resource tags. */
@Fluent
public final class ResourceTags {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceTags.class);

    /*
     * Gets or sets the tags, a dictionary of descriptors arm object
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the tags property: Gets or sets the tags, a dictionary of descriptors arm object.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Gets or sets the tags, a dictionary of descriptors arm object.
     *
     * @param tags the tags value to set.
     * @return the ResourceTags object itself.
     */
    public ResourceTags withTags(Map<String, String> tags) {
        this.tags = tags;
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
