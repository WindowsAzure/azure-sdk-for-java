// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ProviderOperationsMetadataListResult model. */
@Fluent
public final class ProviderOperationsMetadataListResultInner {
    /*
     * The list of providers.
     */
    @JsonProperty(value = "value")
    private List<ProviderOperationsMetadataInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of providers.
     *
     * @return the value value.
     */
    public List<ProviderOperationsMetadataInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of providers.
     *
     * @param value the value value to set.
     * @return the ProviderOperationsMetadataListResultInner object itself.
     */
    public ProviderOperationsMetadataListResultInner withValue(List<ProviderOperationsMetadataInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the ProviderOperationsMetadataListResultInner object itself.
     */
    public ProviderOperationsMetadataListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
