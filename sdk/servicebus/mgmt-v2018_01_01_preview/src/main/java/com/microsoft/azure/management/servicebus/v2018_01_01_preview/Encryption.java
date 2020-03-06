/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2018_01_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties to configure Encryption.
 */
public class Encryption {
    /**
     * Properties of KeyVault.
     */
    @JsonProperty(value = "keyVaultProperties")
    private KeyVaultProperties keyVaultProperties;

    /**
     * Enumerates the possible value of keySource for Encryption. Possible
     * values include: 'Microsoft.KeyVault'.
     */
    @JsonProperty(value = "keySource")
    private KeySource keySource;

    /**
     * Get properties of KeyVault.
     *
     * @return the keyVaultProperties value
     */
    public KeyVaultProperties keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set properties of KeyVault.
     *
     * @param keyVaultProperties the keyVaultProperties value to set
     * @return the Encryption object itself.
     */
    public Encryption withKeyVaultProperties(KeyVaultProperties keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }

    /**
     * Get enumerates the possible value of keySource for Encryption. Possible values include: 'Microsoft.KeyVault'.
     *
     * @return the keySource value
     */
    public KeySource keySource() {
        return this.keySource;
    }

    /**
     * Set enumerates the possible value of keySource for Encryption. Possible values include: 'Microsoft.KeyVault'.
     *
     * @param keySource the keySource value to set
     * @return the Encryption object itself.
     */
    public Encryption withKeySource(KeySource keySource) {
        this.keySource = keySource;
        return this;
    }

}
