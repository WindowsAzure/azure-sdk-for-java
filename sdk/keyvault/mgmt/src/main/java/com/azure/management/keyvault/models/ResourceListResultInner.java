// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.keyvault.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ResourceListResult model. */
@Fluent
public final class ResourceListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceListResultInner.class);

    /*
     * The list of vault resources.
     */
    @JsonProperty(value = "value")
    private List<Resource> value;

    /*
     * The URL to get the next set of vault resources.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of vault resources.
     *
     * @return the value value.
     */
    public List<Resource> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of vault resources.
     *
     * @param value the value value to set.
     * @return the ResourceListResultInner object itself.
     */
    public ResourceListResultInner withValue(List<Resource> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of vault resources.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of vault resources.
     *
     * @param nextLink the nextLink value to set.
     * @return the ResourceListResultInner object itself.
     */
    public ResourceListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
