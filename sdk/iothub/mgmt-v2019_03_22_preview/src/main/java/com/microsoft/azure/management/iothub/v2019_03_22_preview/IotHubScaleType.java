/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_03_22_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for IotHubScaleType.
 */
public enum IotHubScaleType {
    /** Enum value Automatic. */
    AUTOMATIC("Automatic"),

    /** Enum value Manual. */
    MANUAL("Manual"),

    /** Enum value None. */
    NONE("None");

    /** The actual serialized value for a IotHubScaleType instance. */
    private String value;

    IotHubScaleType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a IotHubScaleType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed IotHubScaleType object, or null if unable to parse.
     */
    @JsonCreator
    public static IotHubScaleType fromString(String value) {
        IotHubScaleType[] items = IotHubScaleType.values();
        for (IotHubScaleType item : items) {
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
