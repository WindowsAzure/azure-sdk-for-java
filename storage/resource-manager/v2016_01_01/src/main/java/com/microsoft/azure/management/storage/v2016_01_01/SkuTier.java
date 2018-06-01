/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2016_01_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SkuTier.
 */
public enum SkuTier {
    /** Enum value Standard. */
    STANDARD("Standard"),

    /** Enum value Premium. */
    PREMIUM("Premium");

    /** The actual serialized value for a SkuTier instance. */
    private String value;

    SkuTier(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SkuTier instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SkuTier object, or null if unable to parse.
     */
    @JsonCreator
    public static SkuTier fromString(String value) {
        SkuTier[] items = SkuTier.values();
        for (SkuTier item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
