// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The CachedImagesListResult model. */
@Fluent
public final class CachedImagesListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CachedImagesListResult.class);

    /*
     * The list of cached images.
     */
    @JsonProperty(value = "value")
    private List<CachedImages> value;

    /*
     * The URI to fetch the next page of cached images.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of cached images.
     *
     * @return the value value.
     */
    public List<CachedImages> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of cached images.
     *
     * @param value the value value to set.
     * @return the CachedImagesListResult object itself.
     */
    public CachedImagesListResult withValue(List<CachedImages> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of cached images.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of cached images.
     *
     * @param nextLink the nextLink value to set.
     * @return the CachedImagesListResult object itself.
     */
    public CachedImagesListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
