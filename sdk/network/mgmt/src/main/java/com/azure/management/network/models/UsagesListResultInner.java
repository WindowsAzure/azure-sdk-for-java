// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The UsagesListResult model.
 */
@Fluent
public final class UsagesListResultInner {
    /*
     * The list network resource usages.
     */
    @JsonProperty(value = "value")
    private List<UsageInner> value;

    /*
     * URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list network resource usages.
     * 
     * @return the value value.
     */
    public List<UsageInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list network resource usages.
     * 
     * @param value the value value to set.
     * @return the UsagesListResultInner object itself.
     */
    public UsagesListResultInner withValue(List<UsageInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the UsagesListResultInner object itself.
     */
    public UsagesListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
