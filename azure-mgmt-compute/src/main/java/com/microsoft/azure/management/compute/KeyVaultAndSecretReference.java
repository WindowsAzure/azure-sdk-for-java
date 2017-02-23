/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Key Vault Secret Url and vault id of the encryption key.
 */
public class KeyVaultAndSecretReference {
    /**
     * Resource id of the KeyVault containing the key or secret.
     */
    @JsonProperty(value = "sourceVault", required = true)
    private SourceVault sourceVault;

    /**
     * Url pointing to a key or secret in KeyVault.
     */
    @JsonProperty(value = "secretUrl", required = true)
    private String secretUrl;

    /**
     * Get the sourceVault value.
     *
     * @return the sourceVault value
     */
    public SourceVault sourceVault() {
        return this.sourceVault;
    }

    /**
     * Set the sourceVault value.
     *
     * @param sourceVault the sourceVault value to set
     * @return the KeyVaultAndSecretReference object itself.
     */
    public KeyVaultAndSecretReference withSourceVault(SourceVault sourceVault) {
        this.sourceVault = sourceVault;
        return this;
    }

    /**
     * Get the secretUrl value.
     *
     * @return the secretUrl value
     */
    public String secretUrl() {
        return this.secretUrl;
    }

    /**
     * Set the secretUrl value.
     *
     * @param secretUrl the secretUrl value to set
     * @return the KeyVaultAndSecretReference object itself.
     */
    public KeyVaultAndSecretReference withSecretUrl(String secretUrl) {
        this.secretUrl = secretUrl;
        return this;
    }

}
