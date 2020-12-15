// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the ARM updatable properties of a hybrid machine. */
@Fluent
public class MachineUpdateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MachineUpdateProperties.class);

    /*
     * Metadata pertaining to the geographic location of the resource.
     */
    @JsonProperty(value = "locationData")
    private LocationData locationData;

    /**
     * Get the locationData property: Metadata pertaining to the geographic location of the resource.
     *
     * @return the locationData value.
     */
    public LocationData locationData() {
        return this.locationData;
    }

    /**
     * Set the locationData property: Metadata pertaining to the geographic location of the resource.
     *
     * @param locationData the locationData value to set.
     * @return the MachineUpdateProperties object itself.
     */
    public MachineUpdateProperties withLocationData(LocationData locationData) {
        this.locationData = locationData;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (locationData() != null) {
            locationData().validate();
        }
    }
}
