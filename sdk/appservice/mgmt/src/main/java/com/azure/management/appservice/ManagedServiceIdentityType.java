// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ManagedServiceIdentityType.
 */
public enum ManagedServiceIdentityType {
    /**
     * Enum value None.
     */
    NONE("None"),

    /**
     * Enum value SystemAssigned.
     */
    SYSTEM_ASSIGNED("SystemAssigned"),

    /**
     * Enum value UserAssigned.
     */
    USER_ASSIGNED("UserAssigned"),

    /** Enum value "SystemAssigned, UserAssigned. */
    SYSTEM_ASSIGNED_USER_ASSIGNED("SystemAssigned, UserAssigned");

    /**
     * The actual serialized value for a ManagedServiceIdentityType instance.
     */
    private final String value;

    ManagedServiceIdentityType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ManagedServiceIdentityType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ManagedServiceIdentityType object, or null if unable to parse.
     */
    @JsonCreator
    public static ManagedServiceIdentityType fromString(String value) {
        ManagedServiceIdentityType[] items = ManagedServiceIdentityType.values();
        for (ManagedServiceIdentityType item : items) {
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
