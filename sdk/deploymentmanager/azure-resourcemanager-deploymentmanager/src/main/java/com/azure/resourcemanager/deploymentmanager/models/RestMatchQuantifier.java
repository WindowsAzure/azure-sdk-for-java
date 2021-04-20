// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for RestMatchQuantifier. */
public enum RestMatchQuantifier {
    /** Enum value All. */
    ALL("All"),

    /** Enum value Any. */
    ANY("Any");

    /** The actual serialized value for a RestMatchQuantifier instance. */
    private final String value;

    RestMatchQuantifier(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RestMatchQuantifier instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RestMatchQuantifier object, or null if unable to parse.
     */
    @JsonCreator
    public static RestMatchQuantifier fromString(String value) {
        RestMatchQuantifier[] items = RestMatchQuantifier.values();
        for (RestMatchQuantifier item : items) {
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
