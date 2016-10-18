/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for RestorePointTypes.
 */
public enum RestorePointTypes {
    /** Enum value DISCRETE. */
    DISCRETE("DISCRETE"),

    /** Enum value CONTINUOUS. */
    CONTINUOUS("CONTINUOUS");

    /** The actual serialized value for a RestorePointTypes instance. */
    private String value;

    RestorePointTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RestorePointTypes instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RestorePointTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static RestorePointTypes fromString(String value) {
        RestorePointTypes[] items = RestorePointTypes.values();
        for (RestorePointTypes item : items) {
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
