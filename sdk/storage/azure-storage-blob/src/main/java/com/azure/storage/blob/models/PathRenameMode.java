// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for PathRenameMode.
 */
public enum PathRenameMode {
    /**
     * Enum value legacy.
     */
    LEGACY("legacy"),

    /**
     * Enum value posix.
     */
    POSIX("posix");

    /**
     * The actual serialized value for a PathRenameMode instance.
     */
    private final String value;

    PathRenameMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PathRenameMode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PathRenameMode object, or null if unable to parse.
     */
    @JsonCreator
    public static PathRenameMode fromString(String value) {
        PathRenameMode[] items = PathRenameMode.values();
        for (PathRenameMode item : items) {
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
