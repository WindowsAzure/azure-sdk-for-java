/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SkuType.
 */
public enum SkuType {
    /** Enum value free. */
    FREE("free"),

    /** Enum value standard. */
    STANDARD("standard"),

    /** Enum value standard2. */
    STANDARD2("standard2");

    /** The actual serialized value for a SkuType instance. */
    private String value;

    SkuType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SkuType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SkuType object, or null if unable to parse.
     */
    @JsonCreator
    public static SkuType fromString(String value) {
        SkuType[] items = SkuType.values();
        for (SkuType item : items) {
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
