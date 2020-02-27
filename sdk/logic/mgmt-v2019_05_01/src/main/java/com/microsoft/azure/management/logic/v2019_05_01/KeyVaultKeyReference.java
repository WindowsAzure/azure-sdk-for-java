/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The reference to the key vault key.
 */
public class KeyVaultKeyReference {
    /**
     * The key vault reference.
     */
    @JsonProperty(value = "keyVault", required = true)
    private KeyVaultKeyReferenceKeyVault keyVault;

    /**
     * The private key name in key vault.
     */
    @JsonProperty(value = "keyName", required = true)
    private String keyName;

    /**
     * The private key version in key vault.
     */
    @JsonProperty(value = "keyVersion")
    private String keyVersion;

    /**
     * Get the key vault reference.
     *
     * @return the keyVault value
     */
    public KeyVaultKeyReferenceKeyVault keyVault() {
        return this.keyVault;
    }

    /**
     * Set the key vault reference.
     *
     * @param keyVault the keyVault value to set
     * @return the KeyVaultKeyReference object itself.
     */
    public KeyVaultKeyReference withKeyVault(KeyVaultKeyReferenceKeyVault keyVault) {
        this.keyVault = keyVault;
        return this;
    }

    /**
     * Get the private key name in key vault.
     *
     * @return the keyName value
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the private key name in key vault.
     *
     * @param keyName the keyName value to set
     * @return the KeyVaultKeyReference object itself.
     */
    public KeyVaultKeyReference withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the private key version in key vault.
     *
     * @return the keyVersion value
     */
    public String keyVersion() {
        return this.keyVersion;
    }

    /**
     * Set the private key version in key vault.
     *
     * @param keyVersion the keyVersion value to set
     * @return the KeyVaultKeyReference object itself.
     */
    public KeyVaultKeyReference withKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }

}
