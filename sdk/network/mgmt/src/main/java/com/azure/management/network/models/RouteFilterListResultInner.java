// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RouteFilterListResult model. */
@Fluent
public final class RouteFilterListResultInner {
    /*
     * Gets a list of route filters in a resource group.
     */
    @JsonProperty(value = "value")
    private List<RouteFilterInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Gets a list of route filters in a resource group.
     *
     * @return the value value.
     */
    public List<RouteFilterInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets a list of route filters in a resource group.
     *
     * @param value the value value to set.
     * @return the RouteFilterListResultInner object itself.
     */
    public RouteFilterListResultInner withValue(List<RouteFilterInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the RouteFilterListResultInner object itself.
     */
    public RouteFilterListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
