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
 * Defines values for Channels.
 */
public enum Channels {
    /** Enum value Notification. */
    NOTIFICATION("Notification"),

    /** Enum value Api. */
    API("Api"),

    /** Enum value Email. */
    EMAIL("Email"),

    /** Enum value Webhook. */
    WEBHOOK("Webhook"),

    /** Enum value All. */
    ALL("All");

    /** The actual serialized value for a Channels instance. */
    private String value;

    Channels(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Channels instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed Channels object, or null if unable to parse.
     */
    @JsonCreator
    public static Channels fromString(String value) {
        Channels[] items = Channels.values();
        for (Channels item : items) {
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
