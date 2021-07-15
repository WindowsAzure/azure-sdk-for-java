// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.webpubsub.fluent.models.SharedPrivateLinkResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of shared private link resources. */
@Fluent
public final class SharedPrivateLinkResourceList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SharedPrivateLinkResourceList.class);

    /*
     * The list of the shared private link resources
     */
    @JsonProperty(value = "value")
    private List<SharedPrivateLinkResourceInner> value;

    /*
     * Request URL that can be used to query next page of private endpoint
     * connections. Returned when the total number of requested private
     * endpoint connections exceed maximum page size.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of the shared private link resources.
     *
     * @return the value value.
     */
    public List<SharedPrivateLinkResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of the shared private link resources.
     *
     * @param value the value value to set.
     * @return the SharedPrivateLinkResourceList object itself.
     */
    public SharedPrivateLinkResourceList withValue(List<SharedPrivateLinkResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Request URL that can be used to query next page of private endpoint connections.
     * Returned when the total number of requested private endpoint connections exceed maximum page size.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Request URL that can be used to query next page of private endpoint connections.
     * Returned when the total number of requested private endpoint connections exceed maximum page size.
     *
     * @param nextLink the nextLink value to set.
     * @return the SharedPrivateLinkResourceList object itself.
     */
    public SharedPrivateLinkResourceList withNextLink(String nextLink) {
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
