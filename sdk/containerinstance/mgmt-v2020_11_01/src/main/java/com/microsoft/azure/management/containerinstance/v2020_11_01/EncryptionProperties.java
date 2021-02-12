/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2020_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The container group encryption properties.
 */
public class EncryptionProperties {
    /**
     * The keyvault base url.
     */
    @JsonProperty(value = "vaultBaseUrl", required = true)
    private String vaultBaseUrl;

    /**
     * The encryption key name.
     */
    @JsonProperty(value = "keyName", required = true)
    private String keyName;

    /**
     * The encryption key version.
     */
    @JsonProperty(value = "keyVersion", required = true)
    private String keyVersion;

    /**
     * Get the keyvault base url.
     *
     * @return the vaultBaseUrl value
     */
    public String vaultBaseUrl() {
        return this.vaultBaseUrl;
    }

    /**
     * Set the keyvault base url.
     *
     * @param vaultBaseUrl the vaultBaseUrl value to set
     * @return the EncryptionProperties object itself.
     */
    public EncryptionProperties withVaultBaseUrl(String vaultBaseUrl) {
        this.vaultBaseUrl = vaultBaseUrl;
        return this;
    }

    /**
     * Get the encryption key name.
     *
     * @return the keyName value
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the encryption key name.
     *
     * @param keyName the keyName value to set
     * @return the EncryptionProperties object itself.
     */
    public EncryptionProperties withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the encryption key version.
     *
     * @return the keyVersion value
     */
    public String keyVersion() {
        return this.keyVersion;
    }

    /**
     * Set the encryption key version.
     *
     * @param keyVersion the keyVersion value to set
     * @return the EncryptionProperties object itself.
     */
    public EncryptionProperties withKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }

}
