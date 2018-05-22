/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2015_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The request body for a RegenerateKey API.
 */
public class RegenerateKeyInput {
    /**
     * The keyType indicating which key you want to regenerate, Primary or
     * Secondary. Possible values include: 'Primary', 'Secondary'.
     */
    @JsonProperty(value = "keyType", required = true)
    private KeyType keyType;

    /**
     * Get the keyType value.
     *
     * @return the keyType value
     */
    public KeyType keyType() {
        return this.keyType;
    }

    /**
     * Set the keyType value.
     *
     * @param keyType the keyType value to set
     * @return the RegenerateKeyInput object itself.
     */
    public RegenerateKeyInput withKeyType(KeyType keyType) {
        this.keyType = keyType;
        return this;
    }

}
