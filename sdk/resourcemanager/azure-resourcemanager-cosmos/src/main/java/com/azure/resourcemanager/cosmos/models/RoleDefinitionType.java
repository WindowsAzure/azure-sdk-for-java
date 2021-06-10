// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for RoleDefinitionType. */
public enum RoleDefinitionType {
    /** Enum value BuiltInRole. */
    BUILT_IN_ROLE("BuiltInRole"),

    /** Enum value CustomRole. */
    CUSTOM_ROLE("CustomRole");

    /** The actual serialized value for a RoleDefinitionType instance. */
    private final String value;

    RoleDefinitionType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RoleDefinitionType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RoleDefinitionType object, or null if unable to parse.
     */
    @JsonCreator
    public static RoleDefinitionType fromString(String value) {
        RoleDefinitionType[] items = RoleDefinitionType.values();
        for (RoleDefinitionType item : items) {
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
