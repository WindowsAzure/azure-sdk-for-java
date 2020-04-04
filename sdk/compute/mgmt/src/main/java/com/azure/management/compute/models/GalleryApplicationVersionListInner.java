// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The GalleryApplicationVersionList model.
 */
@Fluent
public final class GalleryApplicationVersionListInner {
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
     * Get the nextLink property: The uri to fetch the next page of gallery
     * Application Versions. Call ListNext() with this to fetch the next page
     * of gallery Application Versions.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of gallery
     * Application Versions. Call ListNext() with this to fetch the next page
     * of gallery Application Versions.
     * 
     * @param nextLink the nextLink value to set.
     * @return the GalleryApplicationVersionListInner object itself.
     */
    public GalleryApplicationVersionListInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
