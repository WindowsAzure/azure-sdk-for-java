/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2015_08_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for EntityAvailabilityStatus.
 */
public enum EntityAvailabilityStatus {
    /** Enum value Available. */
    AVAILABLE("Available"),

    /** Enum value Limited. */
    LIMITED("Limited"),

    /** Enum value Renaming. */
    RENAMING("Renaming"),

    /** Enum value Restoring. */
    RESTORING("Restoring"),

    /** Enum value Unknown. */
    UNKNOWN("Unknown");

    /** The actual serialized value for a EntityAvailabilityStatus instance. */
    private String value;

    EntityAvailabilityStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a EntityAvailabilityStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed EntityAvailabilityStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static EntityAvailabilityStatus fromString(String value) {
        EntityAvailabilityStatus[] items = EntityAvailabilityStatus.values();
        for (EntityAvailabilityStatus item : items) {
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
