/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2019_09_01.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for creating or updating a vault.
 */
public class VaultCreateOrUpdateParameters {
    /**
     * The supported Azure location where the key vault should be created.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * The tags that will be assigned to the key vault.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Properties of the vault.
     */
    @JsonProperty(value = "properties", required = true)
    private VaultProperties properties;

    /**
     * Get the supported Azure location where the key vault should be created.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the supported Azure location where the key vault should be created.
     *
     * @param location the location value to set
     * @return the VaultCreateOrUpdateParameters object itself.
     */
    public VaultCreateOrUpdateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags that will be assigned to the key vault.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags that will be assigned to the key vault.
     *
     * @param tags the tags value to set
     * @return the VaultCreateOrUpdateParameters object itself.
     */
    public VaultCreateOrUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get properties of the vault.
     *
     * @return the properties value
     */
    public VaultProperties properties() {
        return this.properties;
    }

    /**
     * Set properties of the vault.
     *
     * @param properties the properties value to set
     * @return the VaultCreateOrUpdateParameters object itself.
     */
    public VaultCreateOrUpdateParameters withProperties(VaultProperties properties) {
        this.properties = properties;
        return this;
    }

}
