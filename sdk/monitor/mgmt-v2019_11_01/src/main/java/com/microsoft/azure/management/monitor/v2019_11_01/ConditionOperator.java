/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ConditionOperator.
 */
public enum ConditionOperator {
    /** Enum value GreaterThan. */
    GREATER_THAN("GreaterThan"),

    /** Enum value GreaterThanOrEqual. */
    GREATER_THAN_OR_EQUAL("GreaterThanOrEqual"),

    /** Enum value LessThan. */
    LESS_THAN("LessThan"),

    /** Enum value LessThanOrEqual. */
    LESS_THAN_OR_EQUAL("LessThanOrEqual");

    /** The actual serialized value for a ConditionOperator instance. */
    private String value;

    ConditionOperator(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ConditionOperator instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ConditionOperator object, or null if unable to parse.
     */
    @JsonCreator
    public static ConditionOperator fromString(String value) {
        ConditionOperator[] items = ConditionOperator.values();
        for (ConditionOperator item : items) {
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
