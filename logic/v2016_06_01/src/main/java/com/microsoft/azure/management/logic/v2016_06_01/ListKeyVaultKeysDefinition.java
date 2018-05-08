/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The list key vault keys definition.
 */
public class ListKeyVaultKeysDefinition {
    /**
     * The key vault reference.
     */
    @JsonProperty(value = "keyVault", required = true)
    private KeyVaultReference keyVault;

    /**
     * The skip token.
     */
    @JsonProperty(value = "skipToken")
    private String skipToken;

    /**
     * Get the keyVault value.
     *
     * @return the keyVault value
     */
    public KeyVaultReference keyVault() {
        return this.keyVault;
    }

    /**
     * Set the keyVault value.
     *
     * @param keyVault the keyVault value to set
     * @return the ListKeyVaultKeysDefinition object itself.
     */
    public ListKeyVaultKeysDefinition withKeyVault(KeyVaultReference keyVault) {
        this.keyVault = keyVault;
        return this;
    }

    /**
     * Get the skipToken value.
     *
     * @return the skipToken value
     */
    public String skipToken() {
        return this.skipToken;
    }

    /**
     * Set the skipToken value.
     *
     * @param skipToken the skipToken value to set
     * @return the ListKeyVaultKeysDefinition object itself.
     */
    public ListKeyVaultKeysDefinition withSkipToken(String skipToken) {
        this.skipToken = skipToken;
        return this;
    }

}
