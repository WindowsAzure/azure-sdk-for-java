// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SecretObjectType.
 */
public enum SecretObjectType {
    /**
     * Enum value Opaque.
     */
    OPAQUE("Opaque");

    /**
     * The actual serialized value for a SecretObjectType instance.
     */
    private final String value;

    SecretObjectType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SecretObjectType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed SecretObjectType object, or null if unable to parse.
     */
    @JsonCreator
    public static SecretObjectType fromString(String value) {
        SecretObjectType[] items = SecretObjectType.values();
        for (SecretObjectType item : items) {
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
