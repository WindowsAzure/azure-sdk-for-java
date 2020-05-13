// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for KeyPermission. */
public enum KeyPermission {
    /** Enum value Read. */
    READ("Read"),

    /** Enum value Full. */
    FULL("Full");

    /** The actual serialized value for a KeyPermission instance. */
    private final String value;

    KeyPermission(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a KeyPermission instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed KeyPermission object, or null if unable to parse.
     */
    @JsonCreator
    public static KeyPermission fromString(String value) {
        KeyPermission[] items = KeyPermission.values();
        for (KeyPermission item : items) {
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
