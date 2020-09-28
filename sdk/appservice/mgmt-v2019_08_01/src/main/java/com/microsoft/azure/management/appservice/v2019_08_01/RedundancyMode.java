/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for RedundancyMode.
 */
public enum RedundancyMode {
    /** Enum value None. */
    NONE("None"),

    /** Enum value Manual. */
    MANUAL("Manual"),

    /** Enum value Failover. */
    FAILOVER("Failover"),

    /** Enum value ActiveActive. */
    ACTIVE_ACTIVE("ActiveActive"),

    /** Enum value GeoRedundant. */
    GEO_REDUNDANT("GeoRedundant");

    /** The actual serialized value for a RedundancyMode instance. */
    private String value;

    RedundancyMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RedundancyMode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RedundancyMode object, or null if unable to parse.
     */
    @JsonCreator
    public static RedundancyMode fromString(String value) {
        RedundancyMode[] items = RedundancyMode.values();
        for (RedundancyMode item : items) {
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
