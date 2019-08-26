/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2016_10_01.implementation;

import com.microsoft.azure.management.keyvault.v2016_10_01.DeletedVaultProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deleted vault information with extended details.
 */
public class DeletedVaultInner {
    /**
     * The resource ID for the deleted key vault.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The name of the key vault.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The resource type of the key vault.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Properties of the vault.
     */
    @JsonProperty(value = "properties")
    private DeletedVaultProperties properties;

    /**
     * Get the resource ID for the deleted key vault.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name of the key vault.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the resource type of the key vault.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get properties of the vault.
     *
     * @return the properties value
     */
    public DeletedVaultProperties properties() {
        return this.properties;
    }

    /**
     * Set properties of the vault.
     *
     * @param properties the properties value to set
     * @return the DeletedVaultInner object itself.
     */
    public DeletedVaultInner withProperties(DeletedVaultProperties properties) {
        this.properties = properties;
        return this;
    }

}
