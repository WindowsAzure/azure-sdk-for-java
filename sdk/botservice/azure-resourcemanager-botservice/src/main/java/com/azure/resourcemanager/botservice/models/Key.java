// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for Key. */
public enum Key {
    /** Enum value key1. */
    KEY1("key1"),

    /** Enum value key2. */
    KEY2("key2");

    /** The actual serialized value for a Key instance. */
    private final String value;

    Key(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Key instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed Key object, or null if unable to parse.
     */
    @JsonCreator
    public static Key fromString(String value) {
        Key[] items = Key.values();
        for (Key item : items) {
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
