/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SubscriptionState.
 */
public enum SubscriptionState {
    /** Enum value Enabled. */
    ENABLED("Enabled"),

    /** Enum value Warned. */
    WARNED("Warned"),

    /** Enum value PastDue. */
    PAST_DUE("PastDue"),

    /** Enum value Disabled. */
    DISABLED("Disabled"),

    /** Enum value Deleted. */
    DELETED("Deleted");

    /** The actual serialized value for a SubscriptionState instance. */
    private String value;

    SubscriptionState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SubscriptionState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SubscriptionState object, or null if unable to parse.
     */
    @JsonCreator
    public static SubscriptionState fromString(String value) {
        SubscriptionState[] items = SubscriptionState.values();
        for (SubscriptionState item : items) {
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
