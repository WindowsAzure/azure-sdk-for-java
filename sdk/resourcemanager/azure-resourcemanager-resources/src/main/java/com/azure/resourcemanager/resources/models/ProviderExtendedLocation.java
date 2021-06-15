// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The provider extended location. */
@Fluent
public final class ProviderExtendedLocation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProviderExtendedLocation.class);

    /*
     * The azure location.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * The extended location type.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The extended locations for the azure location.
     */
    @JsonProperty(value = "extendedLocations")
    private List<String> extendedLocations;

    /**
     * Get the location property: The azure location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The azure location.
     *
     * @param location the location value to set.
     * @return the ProviderExtendedLocation object itself.
     */
    public ProviderExtendedLocation withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the type property: The extended location type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The extended location type.
     *
     * @param type the type value to set.
     * @return the ProviderExtendedLocation object itself.
     */
    public ProviderExtendedLocation withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the extendedLocations property: The extended locations for the azure location.
     *
     * @return the extendedLocations value.
     */
    public List<String> extendedLocations() {
        return this.extendedLocations;
    }

    /**
     * Set the extendedLocations property: The extended locations for the azure location.
     *
     * @param extendedLocations the extendedLocations value to set.
     * @return the ProviderExtendedLocation object itself.
     */
    public ProviderExtendedLocation withExtendedLocations(List<String> extendedLocations) {
        this.extendedLocations = extendedLocations;
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
