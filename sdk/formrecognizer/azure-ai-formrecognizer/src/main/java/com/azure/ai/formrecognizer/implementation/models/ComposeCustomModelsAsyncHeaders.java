// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ComposeCustomModelsAsyncHeaders model. */
@Fluent
public final class ComposeCustomModelsAsyncHeaders {
    /*
     * The Location property.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * Get the location property: The Location property.
     *
     * @return the location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The Location property.
     *
     * @param location the location value to set.
     * @return the ComposeCustomModelsAsyncHeaders object itself.
     */
    public ComposeCustomModelsAsyncHeaders setLocation(String location) {
        this.location = location;
        return this;
    }
}
