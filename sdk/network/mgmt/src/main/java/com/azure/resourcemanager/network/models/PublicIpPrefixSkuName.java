// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for PublicIpPrefixSkuName. */
public enum PublicIpPrefixSkuName {
    /** Enum value Standard. */
    STANDARD("Standard");

    /** The actual serialized value for a PublicIpPrefixSkuName instance. */
    private final String value;

    PublicIpPrefixSkuName(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PublicIpPrefixSkuName instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PublicIpPrefixSkuName object, or null if unable to parse.
     */
    @JsonCreator
    public static PublicIpPrefixSkuName fromString(String value) {
        PublicIpPrefixSkuName[] items = PublicIpPrefixSkuName.values();
        for (PublicIpPrefixSkuName item : items) {
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
