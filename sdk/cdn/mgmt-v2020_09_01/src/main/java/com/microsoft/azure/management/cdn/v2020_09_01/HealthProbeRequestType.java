/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for HealthProbeRequestType.
 */
public enum HealthProbeRequestType {
    /** Enum value NotSet. */
    NOT_SET("NotSet"),

    /** Enum value GET. */
    GET("GET"),

    /** Enum value HEAD. */
    HEAD("HEAD");

    /** The actual serialized value for a HealthProbeRequestType instance. */
    private String value;

    HealthProbeRequestType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a HealthProbeRequestType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed HealthProbeRequestType object, or null if unable to parse.
     */
    @JsonCreator
    public static HealthProbeRequestType fromString(String value) {
        HealthProbeRequestType[] items = HealthProbeRequestType.values();
        for (HealthProbeRequestType item : items) {
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
