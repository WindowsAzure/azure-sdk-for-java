// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for RestAuthLocation. */
public enum RestAuthLocation {
    /** Enum value Query. */
    QUERY("Query"),

    /** Enum value Header. */
    HEADER("Header");

    /** The actual serialized value for a RestAuthLocation instance. */
    private final String value;

    RestAuthLocation(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RestAuthLocation instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RestAuthLocation object, or null if unable to parse.
     */
    @JsonCreator
    public static RestAuthLocation fromString(String value) {
        RestAuthLocation[] items = RestAuthLocation.values();
        for (RestAuthLocation item : items) {
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
