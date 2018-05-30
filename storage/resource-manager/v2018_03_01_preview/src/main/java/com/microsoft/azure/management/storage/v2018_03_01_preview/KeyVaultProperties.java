/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of key vault.
 */
public class KeyVaultProperties {
    /**
     * The name of KeyVault key.
     */
    @JsonProperty(value = "keyname")
    private String keyName;

    /**
     * The version of KeyVault key.
     */
    @JsonProperty(value = "keyversion")
    private String keyVersion;

    /**
     * The Uri of KeyVault.
     */
    @JsonProperty(value = "keyvaulturi")
    private String keyVaultUri;

    /**
     * Get the keyName value.
     *
     * @return the keyName value
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName value.
     *
     * @param keyName the keyName value to set
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the keyVersion value.
     *
     * @return the keyVersion value
     */
    public String keyVersion() {
        return this.keyVersion;
    }

    /**
     * Set the keyVersion value.
     *
     * @param keyVersion the keyVersion value to set
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }

    /**
     * Get the keyVaultUri value.
     *
     * @return the keyVaultUri value
     */
    public String keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * Set the keyVaultUri value.
     *
     * @param keyVaultUri the keyVaultUri value to set
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyVaultUri(String keyVaultUri) {
        this.keyVaultUri = keyVaultUri;
        return this;
    }

}
