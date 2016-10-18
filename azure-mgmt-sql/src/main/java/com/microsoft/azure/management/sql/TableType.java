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
 * Defines values for TableType.
 */
public enum TableType {
    /** Enum value BaseTable. */
    BASE_TABLE("BaseTable"),

    /** Enum value View. */
    VIEW("View");

    /** The actual serialized value for a TableType instance. */
    private String value;

    TableType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TableType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TableType object, or null if unable to parse.
     */
    @JsonCreator
    public static TableType fromString(String value) {
        TableType[] items = TableType.values();
        for (TableType item : items) {
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
