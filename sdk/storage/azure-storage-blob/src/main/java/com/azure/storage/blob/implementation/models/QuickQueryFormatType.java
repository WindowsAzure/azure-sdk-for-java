// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for QuickQueryFormatType.
 */
public enum QuickQueryFormatType {
    /**
     * Enum value delimited.
     */
    DELIMITED("delimited"),

    /**
     * Enum value json.
     */
    JSON("json");

    /**
     * The actual serialized value for a QuickQueryFormatType instance.
     */
    private final String value;

    QuickQueryFormatType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a QuickQueryFormatType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed QuickQueryFormatType object, or null if unable to parse.
     */
    @JsonCreator
    public static QuickQueryFormatType fromString(String value) {
        QuickQueryFormatType[] items = QuickQueryFormatType.values();
        for (QuickQueryFormatType item : items) {
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
