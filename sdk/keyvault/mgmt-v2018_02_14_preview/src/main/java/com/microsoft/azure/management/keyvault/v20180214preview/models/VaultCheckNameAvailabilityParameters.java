/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2018_02_14_preview.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters used to check the availability of the vault name.
 */
public class VaultCheckNameAvailabilityParameters {
    /**
     * The vault name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The type of resource, Microsoft.KeyVault/vaults.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Creates an instance of VaultCheckNameAvailabilityParameters class.
     * @param name the vault name.
     */
    public VaultCheckNameAvailabilityParameters() {
        type = "Microsoft.KeyVault/vaults";
    }

    /**
     * Get the vault name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the vault name.
     *
     * @param name the name value to set
     * @return the VaultCheckNameAvailabilityParameters object itself.
     */
    public VaultCheckNameAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type of resource, Microsoft.KeyVault/vaults.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type of resource, Microsoft.KeyVault/vaults.
     *
     * @param type the type value to set
     * @return the VaultCheckNameAvailabilityParameters object itself.
     */
    public VaultCheckNameAvailabilityParameters withType(String type) {
        this.type = type;
        return this;
    }

}
