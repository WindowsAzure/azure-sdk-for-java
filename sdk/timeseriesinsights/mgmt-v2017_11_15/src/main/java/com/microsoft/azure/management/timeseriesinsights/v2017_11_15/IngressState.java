/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for IngressState.
 */
public enum IngressState {
    /** Enum value Disabled. */
    DISABLED("Disabled"),

    /** Enum value Ready. */
    READY("Ready"),

    /** Enum value Running. */
    RUNNING("Running"),

    /** Enum value Paused. */
    PAUSED("Paused"),

    /** Enum value Unknown. */
    UNKNOWN("Unknown");

    /** The actual serialized value for a IngressState instance. */
    private String value;

    IngressState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a IngressState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed IngressState object, or null if unable to parse.
     */
    @JsonCreator
    public static IngressState fromString(String value) {
        IngressState[] items = IngressState.values();
        for (IngressState item : items) {
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
