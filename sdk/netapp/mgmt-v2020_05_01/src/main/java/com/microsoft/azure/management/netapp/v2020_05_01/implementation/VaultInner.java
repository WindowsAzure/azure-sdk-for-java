/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_05_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Vault information.
 */
@JsonFlatten
public class VaultInner extends ProxyResource {
    /**
     * Resource location.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * Vault Name.
     */
    @JsonProperty(value = "properties.vaultName")
    private String vaultName;

    /**
     * Get resource location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set resource location.
     *
     * @param location the location value to set
     * @return the VaultInner object itself.
     */
    public VaultInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get vault Name.
     *
     * @return the vaultName value
     */
    public String vaultName() {
        return this.vaultName;
    }

    /**
     * Set vault Name.
     *
     * @param vaultName the vaultName value to set
     * @return the VaultInner object itself.
     */
    public VaultInner withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

}
