// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for AccessRights. */
public enum AccessRights {
    /** Enum value Manage. */
    MANAGE("Manage"),

    /** Enum value Send. */
    SEND("Send"),

    /** Enum value Listen. */
    LISTEN("Listen");

    /** The actual serialized value for a AccessRights instance. */
    private final String value;

    AccessRights(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AccessRights instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AccessRights object, or null if unable to parse.
     */
    @JsonCreator
    public static AccessRights fromString(String value) {
        AccessRights[] items = AccessRights.values();
        for (AccessRights item : items) {
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
