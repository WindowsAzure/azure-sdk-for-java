/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SchemaType.
 */
public enum SchemaType {
    /** Enum value NotSpecified. */
    NOT_SPECIFIED("NotSpecified"),

    /** Enum value Xml. */
    XML("Xml");

    /** The actual serialized value for a SchemaType instance. */
    private String value;

    SchemaType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SchemaType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SchemaType object, or null if unable to parse.
     */
    @JsonCreator
    public static SchemaType fromString(String value) {
        SchemaType[] items = SchemaType.values();
        for (SchemaType item : items) {
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
