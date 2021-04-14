// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for KeyName. */
public enum KeyName {
    /** Enum value Key1. */
    KEY1("Key1"),

    /** Enum value Key2. */
    KEY2("Key2");

    /** The actual serialized value for a KeyName instance. */
    private final String value;

    KeyName(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a KeyName instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed KeyName object, or null if unable to parse.
     */
    @JsonCreator
    public static KeyName fromString(String value) {
        KeyName[] items = KeyName.values();
        for (KeyName item : items) {
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
