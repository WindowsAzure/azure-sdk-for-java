// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SecurityAlertPolicyUseServerDefault.
 */
public enum SecurityAlertPolicyUseServerDefault {
    /**
     * Enum value Enabled.
     */
    ENABLED("Enabled"),

    /**
     * Enum value Disabled.
     */
    DISABLED("Disabled");

    /**
     * The actual serialized value for a SecurityAlertPolicyUseServerDefault instance.
     */
    private final String value;

    SecurityAlertPolicyUseServerDefault(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SecurityAlertPolicyUseServerDefault instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed SecurityAlertPolicyUseServerDefault object, or null if unable to parse.
     */
    @JsonCreator
    public static SecurityAlertPolicyUseServerDefault fromString(String value) {
        SecurityAlertPolicyUseServerDefault[] items = SecurityAlertPolicyUseServerDefault.values();
        for (SecurityAlertPolicyUseServerDefault item : items) {
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
