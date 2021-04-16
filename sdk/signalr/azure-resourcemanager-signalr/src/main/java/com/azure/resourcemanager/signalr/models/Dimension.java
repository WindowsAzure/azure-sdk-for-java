// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifications of the Dimension of metrics. */
@Fluent
public final class Dimension {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Dimension.class);

    /*
     * The public facing name of the dimension.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Localized friendly display name of the dimension.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Name of the dimension as it appears in MDM.
     */
    @JsonProperty(value = "internalName")
    private String internalName;

    /*
     * A Boolean flag indicating whether this dimension should be included for
     * the shoebox export scenario.
     */
    @JsonProperty(value = "toBeExportedForShoebox")
    private Boolean toBeExportedForShoebox;

    /**
     * Get the name property: The public facing name of the dimension.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The public facing name of the dimension.
     *
     * @param name the name value to set.
     * @return the Dimension object itself.
     */
    public Dimension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Localized friendly display name of the dimension.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Localized friendly display name of the dimension.
     *
     * @param displayName the displayName value to set.
     * @return the Dimension object itself.
     */
    public Dimension withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the internalName property: Name of the dimension as it appears in MDM.
     *
     * @return the internalName value.
     */
    public String internalName() {
        return this.internalName;
    }

    /**
     * Set the internalName property: Name of the dimension as it appears in MDM.
     *
     * @param internalName the internalName value to set.
     * @return the Dimension object itself.
     */
    public Dimension withInternalName(String internalName) {
        this.internalName = internalName;
        return this;
    }

    /**
     * Get the toBeExportedForShoebox property: A Boolean flag indicating whether this dimension should be included for
     * the shoebox export scenario.
     *
     * @return the toBeExportedForShoebox value.
     */
    public Boolean toBeExportedForShoebox() {
        return this.toBeExportedForShoebox;
    }

    /**
     * Set the toBeExportedForShoebox property: A Boolean flag indicating whether this dimension should be included for
     * the shoebox export scenario.
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
