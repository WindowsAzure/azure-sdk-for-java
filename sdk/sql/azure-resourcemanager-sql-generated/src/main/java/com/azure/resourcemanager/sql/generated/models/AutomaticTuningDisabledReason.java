// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for AutomaticTuningDisabledReason. */
public enum AutomaticTuningDisabledReason {
    /** Enum value Default. */
    DEFAULT("Default"),

    /** Enum value Disabled. */
    DISABLED("Disabled"),

    /** Enum value AutoConfigured. */
    AUTO_CONFIGURED("AutoConfigured"),

    /** Enum value InheritedFromServer. */
    INHERITED_FROM_SERVER("InheritedFromServer"),

    /** Enum value QueryStoreOff. */
    QUERY_STORE_OFF("QueryStoreOff"),

    /** Enum value QueryStoreReadOnly. */
    QUERY_STORE_READ_ONLY("QueryStoreReadOnly"),

    /** Enum value NotSupported. */
    NOT_SUPPORTED("NotSupported");

    /** The actual serialized value for a AutomaticTuningDisabledReason instance. */
    private final String value;

    AutomaticTuningDisabledReason(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AutomaticTuningDisabledReason instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AutomaticTuningDisabledReason object, or null if unable to parse.
     */
    @JsonCreator
    public static AutomaticTuningDisabledReason fromString(String value) {
        AutomaticTuningDisabledReason[] items = AutomaticTuningDisabledReason.values();
        for (AutomaticTuningDisabledReason item : items) {
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
