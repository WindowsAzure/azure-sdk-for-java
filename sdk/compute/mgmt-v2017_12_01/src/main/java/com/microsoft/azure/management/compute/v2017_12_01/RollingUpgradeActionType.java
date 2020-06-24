/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for RollingUpgradeActionType.
 */
public enum RollingUpgradeActionType {
    /** Enum value Start. */
    START("Start"),

    /** Enum value Cancel. */
    CANCEL("Cancel");

    /** The actual serialized value for a RollingUpgradeActionType instance. */
    private String value;

    RollingUpgradeActionType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RollingUpgradeActionType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RollingUpgradeActionType object, or null if unable to parse.
     */
    @JsonCreator
    public static RollingUpgradeActionType fromString(String value) {
        RollingUpgradeActionType[] items = RollingUpgradeActionType.values();
        for (RollingUpgradeActionType item : items) {
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
