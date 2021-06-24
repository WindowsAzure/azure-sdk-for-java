// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Dimension of a resource metric. For e.g. instance specific HTTP requests for a web app, where instance name is
 * dimension of the metric HTTP request.
 */
@Fluent
public final class Dimension {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Dimension.class);

    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The displayName property.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The internalName property.
     */
    @JsonProperty(value = "internalName")
    private String internalName;

    /*
     * The toBeExportedForShoebox property.
     */
    @JsonProperty(value = "toBeExportedForShoebox")
    private Boolean toBeExportedForShoebox;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the Dimension object itself.
     */
    public Dimension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: The displayName property.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The displayName property.
     *
     * @param displayName the displayName value to set.
     * @return the Dimension object itself.
     */
    public Dimension withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the internalName property: The internalName property.
     *
     * @return the internalName value.
     */
    public String internalName() {
        return this.internalName;
    }

    /**
     * Set the internalName property: The internalName property.
     *
     * @param internalName the internalName value to set.
     * @return the Dimension object itself.
     */
    public Dimension withInternalName(String internalName) {
        this.internalName = internalName;
        return this;
    }

    /**
     * Get the toBeExportedForShoebox property: The toBeExportedForShoebox property.
     *
     * @return the toBeExportedForShoebox value.
     */
    public Boolean toBeExportedForShoebox() {
        return this.toBeExportedForShoebox;
    }

    /**
     * Set the toBeExportedForShoebox property: The toBeExportedForShoebox property.
     *
     * @param toBeExportedForShoebox the toBeExportedForShoebox value to set.
     * @return the Dimension object itself.
     */
    public Dimension withToBeExportedForShoebox(Boolean toBeExportedForShoebox) {
        this.toBeExportedForShoebox = toBeExportedForShoebox;
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
