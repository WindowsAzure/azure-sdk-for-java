/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Sku for the cache.
 */
public class CacheSku {
    /**
     * Sku name for this cache.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get sku name for this cache.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set sku name for this cache.
     *
     * @param name the name value to set
     * @return the CacheSku object itself.
     */
    public CacheSku withName(String name) {
        this.name = name;
        return this;
    }

}
