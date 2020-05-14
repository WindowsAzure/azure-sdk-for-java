/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_03_31.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The cost tag.
 */
public class CostTagInner {
    /**
     * Cost tag key.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * Get cost tag key.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set cost tag key.
     *
     * @param key the key value to set
     * @return the CostTagInner object itself.
     */
    public CostTagInner withKey(String key) {
        this.key = key;
        return this;
    }

}
