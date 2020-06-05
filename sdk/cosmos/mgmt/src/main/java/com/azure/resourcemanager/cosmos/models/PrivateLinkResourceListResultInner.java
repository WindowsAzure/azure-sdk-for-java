// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PrivateLinkResourceListResult model. */
@Fluent
public final class PrivateLinkResourceListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkResourceListResultInner.class);

    /*
     * Array of private link resources
     */
    @JsonProperty(value = "value")
    private List<PrivateLinkResourceInner> value;

    /**
     * Get the value property: Array of private link resources.
     *
     * @return the value value.
     */
    public List<PrivateLinkResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of private link resources.
     *
     * @param value the value value to set.
     * @return the PrivateLinkResourceListResultInner object itself.
     */
    public PrivateLinkResourceListResultInner withValue(List<PrivateLinkResourceInner> value) {
        this.value = value;
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
