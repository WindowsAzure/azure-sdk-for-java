// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.digitaltwins.core.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PagedModelDataCollection model. */
@Fluent
public final class PagedModelDataCollection {
    /*
     * The ModelData objects.
     */
    @JsonProperty(value = "value")
    private List<ModelData> value;

    /*
     * A URI to retrieve the next page of objects.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The ModelData objects.
     *
     * @return the value value.
     */
    public List<ModelData> getValue() {
        return this.value;
    }

    /**
     * Set the value property: The ModelData objects.
     *
     * @param value the value value to set.
     * @return the PagedModelDataCollection object itself.
     */
    public PagedModelDataCollection setValue(List<ModelData> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: A URI to retrieve the next page of objects.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: A URI to retrieve the next page of objects.
     *
     * @param nextLink the nextLink value to set.
     * @return the PagedModelDataCollection object itself.
     */
    public PagedModelDataCollection setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
