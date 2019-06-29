// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for FileRangeWriteType.
 */
public enum FileRangeWriteType {
    /**
     * Enum value update.
     */
    UPDATE("update"),

    /**
     * Enum value clear.
     */
    CLEAR("clear");

    /**
     * The actual serialized value for a FileRangeWriteType instance.
     */
    private final String value;

    FileRangeWriteType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a FileRangeWriteType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed FileRangeWriteType object, or null if unable to parse.
     */
    @JsonCreator
    public static FileRangeWriteType fromString(String value) {
        FileRangeWriteType[] items = FileRangeWriteType.values();
        for (FileRangeWriteType item : items) {
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
