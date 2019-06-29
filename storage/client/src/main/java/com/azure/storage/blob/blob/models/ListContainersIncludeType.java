// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.blob.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ListContainersIncludeType.
 */
public enum ListContainersIncludeType {
    /**
     * Enum value metadata.
     */
    METADATA("metadata");

    /**
     * The actual serialized value for a ListContainersIncludeType instance.
     */
    private final String value;

    ListContainersIncludeType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ListContainersIncludeType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ListContainersIncludeType object, or null if unable to parse.
     */
    @JsonCreator
    public static ListContainersIncludeType fromString(String value) {
        ListContainersIncludeType[] items = ListContainersIncludeType.values();
        for (ListContainersIncludeType item : items) {
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
