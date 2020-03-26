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
 * The AvailabilitySetListResult model.
 */
@Fluent
public final class AvailabilitySetListResultInner {
    /*
     * The list of availability sets
     */
    @JsonProperty(value = "value", required = true)
    private List<AvailabilitySetInner> value;

    /*
     * The URI to fetch the next page of AvailabilitySets. Call ListNext() with
     * this URI to fetch the next page of AvailabilitySets.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of availability sets.
     * 
     * @return the value value.
     */
    public List<AvailabilitySetInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of availability sets.
     * 
     * @param value the value value to set.
     * @return the AvailabilitySetListResultInner object itself.
     */
    public AvailabilitySetListResultInner withValue(List<AvailabilitySetInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of
     * AvailabilitySets. Call ListNext() with this URI to fetch the next page
     * of AvailabilitySets.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of
     * AvailabilitySets. Call ListNext() with this URI to fetch the next page
     * of AvailabilitySets.
     * 
     * @param nextLink the nextLink value to set.
     * @return the AvailabilitySetListResultInner object itself.
     */
    public AvailabilitySetListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
