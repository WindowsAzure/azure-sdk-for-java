/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2017_04_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for FilterType.
 */
public enum FilterType {
    /** Enum value SqlFilter. */
    SQL_FILTER("SqlFilter"),

    /** Enum value CorrelationFilter. */
    CORRELATION_FILTER("CorrelationFilter");

    /** The actual serialized value for a FilterType instance. */
    private String value;

    FilterType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a FilterType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed FilterType object, or null if unable to parse.
     */
    @JsonCreator
    public static FilterType fromString(String value) {
        FilterType[] items = FilterType.values();
        for (FilterType item : items) {
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
