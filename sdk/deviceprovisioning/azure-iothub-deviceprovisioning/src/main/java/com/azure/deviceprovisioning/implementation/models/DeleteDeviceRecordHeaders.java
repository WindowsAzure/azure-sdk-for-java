// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.deviceprovisioning.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DeleteDeviceRecordHeaders model. */
@Fluent
public final class DeleteDeviceRecordHeaders {
    /*
     * The location property.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the location property: The location property.
     *
     * @return the location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The location property.
     *
     * @param location the location value to set.
     * @return the DeleteDeviceRecordHeaders object itself.
     */
    public DeleteDeviceRecordHeaders setLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}
}
