// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The CapabilitiesListResult model. */
@Fluent
public final class CapabilitiesListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CapabilitiesListResultInner.class);

    /*
     * The list of capabilities.
     */
    @JsonProperty(value = "value")
    private List<CapabilitiesInner> value;

    /*
     * The URI to fetch the next page of capabilities.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of capabilities.
     *
     * @return the value value.
     */
    public List<CapabilitiesInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of capabilities.
     *
     * @param value the value value to set.
     * @return the CapabilitiesListResultInner object itself.
     */
    public CapabilitiesListResultInner withValue(List<CapabilitiesInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of capabilities.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of capabilities.
     *
     * @param nextLink the nextLink value to set.
     * @return the CapabilitiesListResultInner object itself.
     */
    public CapabilitiesListResultInner withNextLink(String nextLink) {
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
