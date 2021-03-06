// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CommunicationServicesDeleteHeaders model. */
@Fluent
public final class CommunicationServicesDeleteHeaders {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CommunicationServicesDeleteHeaders.class);

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
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location property.
     *
     * @param location the location value to set.
     * @return the CommunicationServicesDeleteHeaders object itself.
     */
    public CommunicationServicesDeleteHeaders withLocation(String location) {
        this.location = location;
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
