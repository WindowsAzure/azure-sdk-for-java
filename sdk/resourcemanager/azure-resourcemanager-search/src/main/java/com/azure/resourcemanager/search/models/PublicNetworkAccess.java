// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for PublicNetworkAccess. */
public enum PublicNetworkAccess {
    /** Enum value enabled. */
    ENABLED("enabled"),

    /** Enum value disabled. */
    DISABLED("disabled");

    /** The actual serialized value for a PublicNetworkAccess instance. */
    private final String value;

    PublicNetworkAccess(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PublicNetworkAccess instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PublicNetworkAccess object, or null if unable to parse.
     */
    @JsonCreator
    public static PublicNetworkAccess fromString(String value) {
        PublicNetworkAccess[] items = PublicNetworkAccess.values();
        for (PublicNetworkAccess item : items) {
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
