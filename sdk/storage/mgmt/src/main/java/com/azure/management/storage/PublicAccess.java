// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for PublicAccess. */
public enum PublicAccess {
    /** Enum value Container. */
    CONTAINER("Container"),

    /** Enum value Blob. */
    BLOB("Blob"),

    /** Enum value None. */
    NONE("None");

    /** The actual serialized value for a PublicAccess instance. */
    private final String value;

    PublicAccess(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PublicAccess instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PublicAccess object, or null if unable to parse.
     */
    @JsonCreator
    public static PublicAccess fromString(String value) {
        PublicAccess[] items = PublicAccess.values();
        for (PublicAccess item : items) {
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
