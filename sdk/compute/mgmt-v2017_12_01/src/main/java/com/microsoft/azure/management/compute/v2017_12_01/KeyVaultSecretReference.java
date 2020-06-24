/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a reference to Key Vault Secret.
 */
public class KeyVaultSecretReference {
    /**
     * The URL referencing a secret in a Key Vault.
     */
    @JsonProperty(value = "secretUrl", required = true)
    private String secretUrl;

    /**
     * The relative URL of the Key Vault containing the secret.
     */
    @JsonProperty(value = "sourceVault", required = true)
    private SubResource sourceVault;

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
     * @return the KeyVaultSecretReference object itself.
     */
    public KeyVaultSecretReference withSecretUrl(String secretUrl) {
        this.secretUrl = secretUrl;
        return this;
    }

    /**
     * Get the sourceVault value.
     *
     * @return the sourceVault value
     */
    public SubResource sourceVault() {
        return this.sourceVault;
    }

    /**
     * Set the sourceVault value.
     *
     * @param sourceVault the sourceVault value to set
     * @return the KeyVaultSecretReference object itself.
     */
    public KeyVaultSecretReference withSourceVault(SubResource sourceVault) {
        this.sourceVault = sourceVault;
        return this;
    }

}
