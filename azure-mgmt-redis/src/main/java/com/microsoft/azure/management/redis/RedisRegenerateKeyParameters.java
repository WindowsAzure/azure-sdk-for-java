/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies which redis access keys to reset.
 */
public class RedisRegenerateKeyParameters {
    /**
     * Which redis access key to reset. Possible values include: 'Primary',
     * 'Secondary'.
     */
    @JsonProperty(required = true)
    private RedisKeyType keyType;

    /**
     * Get the keyType value.
     *
     * @return the keyType value
     */
    public RedisKeyType keyType() {
        return this.keyType;
    }

    /**
     * Set the keyType value.
     *
     * @param keyType the keyType value to set
     * @return the RedisRegenerateKeyParameters object itself.
     */
    public RedisRegenerateKeyParameters withKeyType(RedisKeyType keyType) {
        this.keyType = keyType;
        return this;
    }

}
