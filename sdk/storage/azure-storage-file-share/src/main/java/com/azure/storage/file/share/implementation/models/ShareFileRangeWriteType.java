// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ShareFileRangeWriteType. */
public enum ShareFileRangeWriteType {
    /** Enum value update. */
    UPDATE("update"),

    /** Enum value clear. */
    CLEAR("clear");

    /** The actual serialized value for a ShareFileRangeWriteType instance. */
    private final String value;

    ShareFileRangeWriteType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ShareFileRangeWriteType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ShareFileRangeWriteType object, or null if unable to parse.
     */
    @JsonCreator
    public static ShareFileRangeWriteType fromString(String value) {
        ShareFileRangeWriteType[] items = ShareFileRangeWriteType.values();
        for (ShareFileRangeWriteType item : items) {
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
