/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for KeyType.
 */
public enum KeyType {
    /** Enum value primary. */
    PRIMARY("primary"),

    /** Enum value secondary. */
    SECONDARY("secondary");

    /** The actual serialized value for a KeyType instance. */
    private String value;

    KeyType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a KeyType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed KeyType object, or null if unable to parse.
     */
    @JsonCreator
    public static KeyType fromString(String value) {
        KeyType[] items = KeyType.values();
        for (KeyType item : items) {
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
