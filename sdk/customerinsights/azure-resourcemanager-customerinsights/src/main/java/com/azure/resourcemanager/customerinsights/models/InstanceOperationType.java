// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for InstanceOperationType. */
public enum InstanceOperationType {
    /** Enum value Upsert. */
    UPSERT("Upsert"),

    /** Enum value Delete. */
    DELETE("Delete");

    /** The actual serialized value for a InstanceOperationType instance. */
    private final String value;

    InstanceOperationType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a InstanceOperationType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed InstanceOperationType object, or null if unable to parse.
     */
    @JsonCreator
    public static InstanceOperationType fromString(String value) {
        InstanceOperationType[] items = InstanceOperationType.values();
        for (InstanceOperationType item : items) {
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
