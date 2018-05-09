/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler.v2016_03_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for RetryType.
 */
public enum RetryType {
    /** Enum value None. */
    NONE("None"),

    /** Enum value Fixed. */
    FIXED("Fixed");

    /** The actual serialized value for a RetryType instance. */
    private String value;

    RetryType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RetryType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RetryType object, or null if unable to parse.
     */
    @JsonCreator
    public static RetryType fromString(String value) {
        RetryType[] items = RetryType.values();
        for (RetryType item : items) {
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
