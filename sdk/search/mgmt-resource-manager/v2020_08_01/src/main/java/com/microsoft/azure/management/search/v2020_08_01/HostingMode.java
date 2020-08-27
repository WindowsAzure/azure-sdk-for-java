/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.v2020_08_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for HostingMode.
 */
public enum HostingMode {
    /** Enum value default. */
    DEFAULT("default"),

    /** Enum value highDensity. */
    HIGH_DENSITY("highDensity");

    /** The actual serialized value for a HostingMode instance. */
    private String value;

    HostingMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a HostingMode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed HostingMode object, or null if unable to parse.
     */
    @JsonCreator
    public static HostingMode fromString(String value) {
        HostingMode[] items = HostingMode.values();
        for (HostingMode item : items) {
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
