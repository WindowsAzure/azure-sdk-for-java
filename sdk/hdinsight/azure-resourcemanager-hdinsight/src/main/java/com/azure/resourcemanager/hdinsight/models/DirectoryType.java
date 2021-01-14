// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for DirectoryType. */
public enum DirectoryType {
    /** Enum value ActiveDirectory. */
    ACTIVE_DIRECTORY("ActiveDirectory");

    /** The actual serialized value for a DirectoryType instance. */
    private final String value;

    DirectoryType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DirectoryType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DirectoryType object, or null if unable to parse.
     */
    @JsonCreator
    public static DirectoryType fromString(String value) {
        DirectoryType[] items = DirectoryType.values();
        for (DirectoryType item : items) {
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
