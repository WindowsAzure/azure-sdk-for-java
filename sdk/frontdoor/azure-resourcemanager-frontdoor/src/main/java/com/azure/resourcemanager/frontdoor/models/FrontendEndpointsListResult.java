// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.frontdoor.fluent.models.FrontendEndpointInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the request to list frontend endpoints. It contains a list of Frontend endpoint objects and a URL link to
 * get the next set of results.
 */
@Fluent
public final class FrontendEndpointsListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FrontendEndpointsListResult.class);

    /*
     * List of Frontend endpoints within a Front Door.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<FrontendEndpointInner> value;

    /*
     * URL to get the next set of frontend endpoints if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of Frontend endpoints within a Front Door.
     *
     * @return the value value.
     */
    public List<FrontendEndpointInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to get the next set of frontend endpoints if there are any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of frontend endpoints if there are any.
     *
     * @param nextLink the nextLink value to set.
     * @return the FrontendEndpointsListResult object itself.
     */
    public FrontendEndpointsListResult withNextLink(String nextLink) {
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
