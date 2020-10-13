// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.learn.appconfig.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The result of a list request. */
@Fluent
public final class KeyListResult {
    /*
     * The collection value.
     */
    @JsonProperty(value = "items")
    private List<Key> items;

    /*
     * The URI that can be used to request the next set of paged results.
     */
    @JsonProperty(value = "@nextLink")
    private String nextLink;

    /**
     * Get the items property: The collection value.
     *
     * @return the items value.
     */
    public List<Key> getItems() {
        return this.items;
    }

    /**
     * Set the items property: The collection value.
     *
     * @param items the items value to set.
     * @return the KeyListResult object itself.
     */
    public KeyListResult setItems(List<Key> items) {
        this.items = items;
        return this;
    }

    /**
     * Get the nextLink property: The URI that can be used to request the next set of paged results.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI that can be used to request the next set of paged results.
     *
     * @param nextLink the nextLink value to set.
     * @return the KeyListResult object itself.
     */
    public KeyListResult setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
