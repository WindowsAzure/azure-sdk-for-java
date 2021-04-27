// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ComputeNodeFillType. */
public enum ComputeNodeFillType {
    /** Enum value Spread. */
    SPREAD("Spread"),

    /** Enum value Pack. */
    PACK("Pack");

    /** The actual serialized value for a ComputeNodeFillType instance. */
    private final String value;

    ComputeNodeFillType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ComputeNodeFillType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ComputeNodeFillType object, or null if unable to parse.
     */
    @JsonCreator
    public static ComputeNodeFillType fromString(String value) {
        ComputeNodeFillType[] items = ComputeNodeFillType.values();
        for (ComputeNodeFillType item : items) {
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
