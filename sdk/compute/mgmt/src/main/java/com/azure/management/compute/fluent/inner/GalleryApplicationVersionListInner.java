// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The GalleryApplicationVersionList model. */
@Fluent
public final class GalleryApplicationVersionListInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryApplicationVersionListInner.class);

    /*
     * A list of gallery Application Versions.
     */
    @JsonProperty(value = "value", required = true)
    private List<GalleryApplicationVersionInner> value;

    /*
     * The uri to fetch the next page of gallery Application Versions. Call
     * ListNext() with this to fetch the next page of gallery Application
     * Versions.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A list of gallery Application Versions.
     *
     * @return the value value.
     */
    public List<GalleryApplicationVersionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of gallery Application Versions.
     *
     * @param value the value value to set.
     * @return the GalleryApplicationVersionListInner object itself.
     */
    public GalleryApplicationVersionListInner withValue(List<GalleryApplicationVersionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of gallery Application Versions. Call ListNext() with
     * this to fetch the next page of gallery Application Versions.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of gallery Application Versions. Call ListNext() with
     * this to fetch the next page of gallery Application Versions.
     *
     * @param nextLink the nextLink value to set.
     * @return the GalleryApplicationVersionListInner object itself.
     */
    public GalleryApplicationVersionListInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model GalleryApplicationVersionListInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
