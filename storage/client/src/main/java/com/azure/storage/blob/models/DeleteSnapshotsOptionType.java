// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DeleteSnapshotsOptionType.
 */
public enum DeleteSnapshotsOptionType {
    /**
     * Enum value include.
     */
    INCLUDE("include"),

    /**
     * Enum value only.
     */
    ONLY("only");

    /**
     * The actual serialized value for a DeleteSnapshotsOptionType instance.
     */
    private final String value;

    DeleteSnapshotsOptionType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DeleteSnapshotsOptionType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DeleteSnapshotsOptionType object, or null if unable to parse.
     */
    @JsonCreator
    public static DeleteSnapshotsOptionType fromString(String value) {
        DeleteSnapshotsOptionType[] items = DeleteSnapshotsOptionType.values();
        for (DeleteSnapshotsOptionType item : items) {
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
