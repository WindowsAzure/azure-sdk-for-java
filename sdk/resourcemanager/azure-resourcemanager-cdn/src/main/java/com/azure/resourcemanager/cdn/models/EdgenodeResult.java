// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.fluent.models.EdgeNodeInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the request to list CDN edgenodes. It contains a list of ip address group and a URL link to get the next
 * set of results.
 */
@Fluent
public final class EdgenodeResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EdgenodeResult.class);

    /*
     * Edge node of CDN service.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<EdgeNodeInner> value;

    /*
     * URL to get the next set of edgenode list results if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Edge node of CDN service.
     *
     * @return the value value.
     */
    public List<EdgeNodeInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to get the next set of edgenode list results if there are any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of edgenode list results if there are any.
     *
     * @param nextLink the nextLink value to set.
     * @return the EdgenodeResult object itself.
     */
    public EdgenodeResult withNextLink(String nextLink) {
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
