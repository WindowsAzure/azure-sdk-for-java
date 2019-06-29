// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ListSharesIncludeType.
 */
public enum ListSharesIncludeType {
    /**
     * Enum value snapshots.
     */
    SNAPSHOTS("snapshots"),

    /**
     * Enum value metadata.
     */
    METADATA("metadata");

    /**
     * The actual serialized value for a ListSharesIncludeType instance.
     */
    private final String value;

    ListSharesIncludeType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ListSharesIncludeType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ListSharesIncludeType object, or null if unable to parse.
     */
    @JsonCreator
    public static ListSharesIncludeType fromString(String value) {
        ListSharesIncludeType[] items = ListSharesIncludeType.values();
        for (ListSharesIncludeType item : items) {
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
