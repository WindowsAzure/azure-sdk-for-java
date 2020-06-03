// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for GetShareExpand. */
public enum GetShareExpand {
    /** Enum value stats. */
    STATS("stats");

    /** The actual serialized value for a GetShareExpand instance. */
    private final String value;

    GetShareExpand(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a GetShareExpand instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed GetShareExpand object, or null if unable to parse.
     */
    @JsonCreator
    public static GetShareExpand fromString(String value) {
        GetShareExpand[] items = GetShareExpand.values();
        for (GetShareExpand item : items) {
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
