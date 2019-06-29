// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.blob.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for LeaseStatusType.
 */
public enum LeaseStatusType {
    /**
     * Enum value locked.
     */
    LOCKED("locked"),

    /**
     * Enum value unlocked.
     */
    UNLOCKED("unlocked");

    /**
     * The actual serialized value for a LeaseStatusType instance.
     */
    private final String value;

    LeaseStatusType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a LeaseStatusType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed LeaseStatusType object, or null if unable to parse.
     */
    @JsonCreator
    public static LeaseStatusType fromString(String value) {
        LeaseStatusType[] items = LeaseStatusType.values();
        for (LeaseStatusType item : items) {
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
