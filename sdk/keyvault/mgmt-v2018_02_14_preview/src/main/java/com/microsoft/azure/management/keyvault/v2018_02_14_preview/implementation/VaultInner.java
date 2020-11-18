/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2018_02_14_preview.implementation;

import com.microsoft.azure.management.keyvault.v2018_02_14_preview.VaultProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.Resource;

/**
 * Resource information with extended details.
 */
public class VaultInner extends Resource {
    /**
     * Properties of the vault.
     */
    @JsonProperty(value = "properties", required = true)
    private VaultProperties properties;

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
     * @return the VaultInner object itself.
     */
    public VaultInner withProperties(VaultProperties properties) {
        this.properties = properties;
        return this;
    }

}
