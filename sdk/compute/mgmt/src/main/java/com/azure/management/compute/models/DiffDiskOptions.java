// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for DiffDiskOptions. */
public enum DiffDiskOptions {
    /** Enum value Local. */
    LOCAL("Local");

    /** The actual serialized value for a DiffDiskOptions instance. */
    private final String value;

    DiffDiskOptions(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DiffDiskOptions instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DiffDiskOptions object, or null if unable to parse.
     */
    @JsonCreator
    public static DiffDiskOptions fromString(String value) {
        DiffDiskOptions[] items = DiffDiskOptions.values();
        for (DiffDiskOptions item : items) {
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
