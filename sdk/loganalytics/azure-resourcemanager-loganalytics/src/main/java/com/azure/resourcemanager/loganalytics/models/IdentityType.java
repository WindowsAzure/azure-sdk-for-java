// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for IdentityType. */
public enum IdentityType {
    /** Enum value SystemAssigned. */
    SYSTEM_ASSIGNED("SystemAssigned"),

    /** Enum value UserAssigned. */
    USER_ASSIGNED("UserAssigned"),

    /** Enum value None. */
    NONE("None");

    /** The actual serialized value for a IdentityType instance. */
    private final String value;

    IdentityType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a IdentityType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed IdentityType object, or null if unable to parse.
     */
    @JsonCreator
    public static IdentityType fromString(String value) {
        IdentityType[] items = IdentityType.values();
        for (IdentityType item : items) {
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
