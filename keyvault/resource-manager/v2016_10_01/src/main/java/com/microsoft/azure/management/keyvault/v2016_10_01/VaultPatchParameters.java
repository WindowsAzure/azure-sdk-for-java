/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2016_10_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for creating or updating a vault.
 */
public class VaultPatchParameters {
    /**
     * The tags that will be assigned to the key vault.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Properties of the vault.
     */
    @JsonProperty(value = "properties")
    private VaultPatchProperties properties;

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the VaultPatchParameters object itself.
     */
    public VaultPatchParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public VaultPatchProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the VaultPatchParameters object itself.
     */
    public VaultPatchParameters withProperties(VaultPatchProperties properties) {
        this.properties = properties;
        return this;
    }

}
