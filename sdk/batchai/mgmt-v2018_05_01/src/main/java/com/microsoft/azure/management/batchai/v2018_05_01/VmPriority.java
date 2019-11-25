/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for VmPriority.
 */
public enum VmPriority {
    /** Enum value dedicated. */
    DEDICATED("dedicated"),

    /** Enum value lowpriority. */
    LOWPRIORITY("lowpriority");

    /** The actual serialized value for a VmPriority instance. */
    private String value;

    VmPriority(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a VmPriority instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed VmPriority object, or null if unable to parse.
     */
    @JsonCreator
    public static VmPriority fromString(String value) {
        VmPriority[] items = VmPriority.values();
        for (VmPriority item : items) {
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
