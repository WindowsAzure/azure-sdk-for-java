/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for AccessControlEntryAction.
 */
public enum AccessControlEntryAction {
    /** Enum value Permit. */
    PERMIT("Permit"),

    /** Enum value Deny. */
    DENY("Deny");

    /** The actual serialized value for a AccessControlEntryAction instance. */
    private String value;

    AccessControlEntryAction(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AccessControlEntryAction instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AccessControlEntryAction object, or null if unable to parse.
     */
    @JsonCreator
    public static AccessControlEntryAction fromString(String value) {
        AccessControlEntryAction[] items = AccessControlEntryAction.values();
        for (AccessControlEntryAction item : items) {
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
