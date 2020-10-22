// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.administration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LocationOptionsResponse model. */
@Fluent
public final class LocationOptionsResponse {
    /*
     * Represents a location options.
     */
    @JsonProperty(value = "locationOptions")
    private LocationOptions locationOptions;

    /**
     * Get the locationOptions property: Represents a location options.
     *
     * @return the locationOptions value.
     */
    public LocationOptions getLocationOptions() {
        return this.locationOptions;
    }

    /**
     * Set the locationOptions property: Represents a location options.
     *
     * @param locationOptions the locationOptions value to set.
     * @return the LocationOptionsResponse object itself.
     */
    public LocationOptionsResponse setLocationOptions(LocationOptions locationOptions) {
        this.locationOptions = locationOptions;
        return this;
    }
}
