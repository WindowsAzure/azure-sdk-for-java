// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SensitivityLabelRank.
 */
public enum SensitivityLabelRank {
    /**
     * Enum value None.
     */
    NONE("None"),

    /**
     * Enum value Low.
     */
    LOW("Low"),

    /**
     * Enum value Medium.
     */
    MEDIUM("Medium"),

    /**
     * Enum value High.
     */
    HIGH("High"),

    /**
     * Enum value Critical.
     */
    CRITICAL("Critical");

    /**
     * The actual serialized value for a SensitivityLabelRank instance.
     */
    private final String value;

    SensitivityLabelRank(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SensitivityLabelRank instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed SensitivityLabelRank object, or null if unable to parse.
     */
    @JsonCreator
    public static SensitivityLabelRank fromString(String value) {
        SensitivityLabelRank[] items = SensitivityLabelRank.values();
        for (SensitivityLabelRank item : items) {
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
