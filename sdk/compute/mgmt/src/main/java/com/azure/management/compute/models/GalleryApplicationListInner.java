// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The GalleryApplicationList model. */
@Fluent
public final class GalleryApplicationListInner {
    /*
     * A list of Gallery Applications.
     */
    @JsonProperty(value = "value", required = true)
    private List<GalleryApplicationInner> value;

    /*
     * The uri to fetch the next page of Application Definitions in the
     * Application Gallery. Call ListNext() with this to fetch the next page of
     * gallery Application Definitions.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A list of Gallery Applications.
     *
     * @return the value value.
     */
    public List<GalleryApplicationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of Gallery Applications.
     *
     * @param value the value value to set.
     * @return the GalleryApplicationListInner object itself.
     */
    public GalleryApplicationListInner withValue(List<GalleryApplicationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of Application Definitions in the Application Gallery.
     * Call ListNext() with this to fetch the next page of gallery Application Definitions.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of Application Definitions in the Application Gallery.
     * Call ListNext() with this to fetch the next page of gallery Application Definitions.
     *
     * @param nextLink the nextLink value to set.
     * @return the GalleryApplicationListInner object itself.
     */
    public GalleryApplicationListInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
