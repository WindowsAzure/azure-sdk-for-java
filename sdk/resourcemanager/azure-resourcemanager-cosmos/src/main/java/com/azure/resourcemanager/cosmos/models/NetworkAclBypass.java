// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for NetworkAclBypass. */
public enum NetworkAclBypass {
    /** Enum value None. */
    NONE("None"),

    /** Enum value AzureServices. */
    AZURE_SERVICES("AzureServices");

    /** The actual serialized value for a NetworkAclBypass instance. */
    private final String value;

    NetworkAclBypass(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a NetworkAclBypass instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed NetworkAclBypass object, or null if unable to parse.
     */
    @JsonCreator
    public static NetworkAclBypass fromString(String value) {
        NetworkAclBypass[] items = NetworkAclBypass.values();
        for (NetworkAclBypass item : items) {
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
