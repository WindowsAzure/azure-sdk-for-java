// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for HostnameType. */
public enum HostnameType {
    /** Enum value Verified. */
    VERIFIED("Verified"),

    /** Enum value Managed. */
    MANAGED("Managed");

    /** The actual serialized value for a HostnameType instance. */
    private final String value;

    HostnameType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a HostnameType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed HostnameType object, or null if unable to parse.
     */
    @JsonCreator
    public static HostnameType fromString(String value) {
        HostnameType[] items = HostnameType.values();
        for (HostnameType item : items) {
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
