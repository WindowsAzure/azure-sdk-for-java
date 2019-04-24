// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ListBlobsIncludeItem.
 */
public enum ListBlobsIncludeItem {
    /**
     * Enum value snapshots.
     */
    SNAPSHOTS("snapshots"),

    /**
     * Enum value metadata.
     */
    METADATA("metadata"),

    /**
     * Enum value uncommittedblobs.
     */
    UNCOMMITTEDBLOBS("uncommittedblobs"),

    /**
     * Enum value copy.
     */
    COPY("copy"),

    /**
     * Enum value deleted.
     */
    DELETED("deleted");

    /**
     * The actual serialized value for a ListBlobsIncludeItem instance.
     */
    private final String value;

    private ListBlobsIncludeItem(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ListBlobsIncludeItem instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ListBlobsIncludeItem object, or null if unable to parse.
     */
    @JsonCreator
    public static ListBlobsIncludeItem fromString(String value) {
        ListBlobsIncludeItem[] items = ListBlobsIncludeItem.values();
        for (ListBlobsIncludeItem item : items) {
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
