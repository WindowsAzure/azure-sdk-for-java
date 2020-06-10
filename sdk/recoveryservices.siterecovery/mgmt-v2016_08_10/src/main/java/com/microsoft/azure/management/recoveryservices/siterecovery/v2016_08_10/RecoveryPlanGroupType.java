/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for RecoveryPlanGroupType.
 */
public enum RecoveryPlanGroupType {
    /** Enum value Shutdown. */
    SHUTDOWN("Shutdown"),

    /** Enum value Boot. */
    BOOT("Boot"),

    /** Enum value Failover. */
    FAILOVER("Failover");

    /** The actual serialized value for a RecoveryPlanGroupType instance. */
    private String value;

    RecoveryPlanGroupType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RecoveryPlanGroupType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RecoveryPlanGroupType object, or null if unable to parse.
     */
    @JsonCreator
    public static RecoveryPlanGroupType fromString(String value) {
        RecoveryPlanGroupType[] items = RecoveryPlanGroupType.values();
        for (RecoveryPlanGroupType item : items) {
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
