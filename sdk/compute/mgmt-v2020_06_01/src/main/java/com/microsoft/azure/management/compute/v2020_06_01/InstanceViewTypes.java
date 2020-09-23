/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for InstanceViewTypes.
 */
public enum InstanceViewTypes {
    /** Enum value instanceView. */
    INSTANCE_VIEW("instanceView");

    /** The actual serialized value for a InstanceViewTypes instance. */
    private String value;

    InstanceViewTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a InstanceViewTypes instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed InstanceViewTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static InstanceViewTypes fromString(String value) {
        InstanceViewTypes[] items = InstanceViewTypes.values();
        for (InstanceViewTypes item : items) {
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
