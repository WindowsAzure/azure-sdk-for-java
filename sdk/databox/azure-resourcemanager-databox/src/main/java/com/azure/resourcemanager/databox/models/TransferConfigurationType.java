// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for TransferConfigurationType. */
public enum TransferConfigurationType {
    /** Enum value TransferAll. */
    TRANSFER_ALL("TransferAll"),

    /** Enum value TransferUsingFilter. */
    TRANSFER_USING_FILTER("TransferUsingFilter");

    /** The actual serialized value for a TransferConfigurationType instance. */
    private final String value;

    TransferConfigurationType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TransferConfigurationType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TransferConfigurationType object, or null if unable to parse.
     */
    @JsonCreator
    public static TransferConfigurationType fromString(String value) {
        TransferConfigurationType[] items = TransferConfigurationType.values();
        for (TransferConfigurationType item : items) {
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
