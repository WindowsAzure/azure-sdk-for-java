// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for OperatingSystemStateTypes.
 */
public enum OperatingSystemStateTypes {
    /**
     * Enum value Generalized.
     */
    GENERALIZED("Generalized"),

    /**
     * Enum value Specialized.
     */
    SPECIALIZED("Specialized");

    /**
     * The actual serialized value for a OperatingSystemStateTypes instance.
     */
    private final String value;

    OperatingSystemStateTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OperatingSystemStateTypes instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed OperatingSystemStateTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static OperatingSystemStateTypes fromString(String value) {
        OperatingSystemStateTypes[] items = OperatingSystemStateTypes.values();
        for (OperatingSystemStateTypes item : items) {
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
