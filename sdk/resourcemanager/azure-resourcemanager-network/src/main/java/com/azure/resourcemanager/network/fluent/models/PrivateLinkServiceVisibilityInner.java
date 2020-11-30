// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response for the CheckPrivateLinkServiceVisibility API service call. */
@Fluent
public final class PrivateLinkServiceVisibilityInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkServiceVisibilityInner.class);

    /*
     * Private Link Service Visibility (True/False).
     */
    @JsonProperty(value = "visible")
    private Boolean visible;

    /**
     * Get the visible property: Private Link Service Visibility (True/False).
     *
     * @return the visible value.
     */
    public Boolean visible() {
        return this.visible;
    }

    /**
     * Set the visible property: Private Link Service Visibility (True/False).
     *
     * @param visible the visible value to set.
     * @return the PrivateLinkServiceVisibilityInner object itself.
     */
    public PrivateLinkServiceVisibilityInner withVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
