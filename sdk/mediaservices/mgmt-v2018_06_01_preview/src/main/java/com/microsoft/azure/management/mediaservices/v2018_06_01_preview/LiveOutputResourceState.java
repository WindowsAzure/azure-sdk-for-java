/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for LiveOutputResourceState.
 */
public enum LiveOutputResourceState {
    /** Enum value Creating. */
    CREATING("Creating"),

    /** Enum value Running. */
    RUNNING("Running"),

    /** Enum value Deleting. */
    DELETING("Deleting");

    /** The actual serialized value for a LiveOutputResourceState instance. */
    private String value;

    LiveOutputResourceState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a LiveOutputResourceState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed LiveOutputResourceState object, or null if unable to parse.
     */
    @JsonCreator
    public static LiveOutputResourceState fromString(String value) {
        LiveOutputResourceState[] items = LiveOutputResourceState.values();
        for (LiveOutputResourceState item : items) {
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
