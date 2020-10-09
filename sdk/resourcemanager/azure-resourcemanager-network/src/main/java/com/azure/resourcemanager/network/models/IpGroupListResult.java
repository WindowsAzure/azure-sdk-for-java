// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.models.IpGroupInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for the ListIpGroups API service call. */
@Fluent
public final class IpGroupListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IpGroupListResult.class);

    /*
     * The list of IpGroups information resources.
     */
    @JsonProperty(value = "value")
    private List<IpGroupInner> value;

    /*
     * URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of IpGroups information resources.
     *
     * @return the value value.
     */
    public List<IpGroupInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of IpGroups information resources.
     *
     * @param value the value value to set.
     * @return the IpGroupListResult object itself.
     */
    public IpGroupListResult withValue(List<IpGroupInner> value) {
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
     * @return the IpGroupListResult object itself.
     */
    public IpGroupListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
