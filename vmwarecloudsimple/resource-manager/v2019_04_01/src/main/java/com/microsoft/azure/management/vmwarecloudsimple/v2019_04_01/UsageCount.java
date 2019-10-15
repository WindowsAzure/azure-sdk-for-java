/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for UsageCount.
 */
public enum UsageCount {
    /** Enum value Count. */
    COUNT("Count"),

    /** Enum value Bytes. */
    BYTES("Bytes"),

    /** Enum value Seconds. */
    SECONDS("Seconds"),

    /** Enum value Percent. */
    PERCENT("Percent"),

    /** Enum value CountPerSecond. */
    COUNT_PER_SECOND("CountPerSecond"),

    /** Enum value BytesPerSecond. */
    BYTES_PER_SECOND("BytesPerSecond");

    /** The actual serialized value for a UsageCount instance. */
    private String value;

    UsageCount(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a UsageCount instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed UsageCount object, or null if unable to parse.
     */
    @JsonCreator
    public static UsageCount fromString(String value) {
        UsageCount[] items = UsageCount.values();
        for (UsageCount item : items) {
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
