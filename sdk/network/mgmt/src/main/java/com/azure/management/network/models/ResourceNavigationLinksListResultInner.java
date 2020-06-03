// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.network.ResourceNavigationLink;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ResourceNavigationLinksListResult model. */
@Fluent
public final class ResourceNavigationLinksListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceNavigationLinksListResultInner.class);

    /*
     * The resource navigation links in a subnet.
     */
    @JsonProperty(value = "value")
    private List<ResourceNavigationLink> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The resource navigation links in a subnet.
     *
     * @return the value value.
     */
    public List<ResourceNavigationLink> value() {
        return this.value;
    }

    /**
     * Set the value property: The resource navigation links in a subnet.
     *
     * @param value the value value to set.
     * @return the ResourceNavigationLinksListResultInner object itself.
     */
    public ResourceNavigationLinksListResultInner withValue(List<ResourceNavigationLink> value) {
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
