// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PublicIPPrefixListResult model. */
@Fluent
public final class PublicIPPrefixListResultInner {
    /*
     * A list of public IP prefixes that exists in a resource group.
     */
    @JsonProperty(value = "value")
    private List<PublicIPPrefixInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A list of public IP prefixes that exists in a resource group.
     *
     * @return the value value.
     */
    public List<PublicIPPrefixInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of public IP prefixes that exists in a resource group.
     *
     * @param value the value value to set.
     * @return the PublicIPPrefixListResultInner object itself.
     */
    public PublicIPPrefixListResultInner withValue(List<PublicIPPrefixInner> value) {
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
     * @return the PublicIPPrefixListResultInner object itself.
     */
    public PublicIPPrefixListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
