// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.blob.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for LeaseStateType.
 */
public enum LeaseStateType {
    /**
     * Enum value available.
     */
    AVAILABLE("available"),

    /**
     * Enum value leased.
     */
    LEASED("leased"),

    /**
     * Enum value expired.
     */
    EXPIRED("expired"),

    /**
     * Enum value breaking.
     */
    BREAKING("breaking"),

    /**
     * Enum value broken.
     */
    BROKEN("broken");

    /**
     * The actual serialized value for a LeaseStateType instance.
     */
    private final String value;

    LeaseStateType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a LeaseStateType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed LeaseStateType object, or null if unable to parse.
     */
    @JsonCreator
    public static LeaseStateType fromString(String value) {
        LeaseStateType[] items = LeaseStateType.values();
        for (LeaseStateType item : items) {
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
