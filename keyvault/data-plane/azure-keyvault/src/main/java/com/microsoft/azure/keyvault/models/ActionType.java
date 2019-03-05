// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.keyvault.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ActionType.
 */
public enum ActionType {
    /** Enum value EmailContacts. */
    EMAIL_CONTACTS("EmailContacts"),

    /** Enum value AutoRenew. */
    AUTO_RENEW("AutoRenew");

    /** The actual serialized value for a ActionType instance. */
    private String value;

    ActionType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ActionType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ActionType object, or null if unable to parse.
     */
    @JsonCreator
    public static ActionType fromString(String value) {
        ActionType[] items = ActionType.values();
        for (ActionType item : items) {
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
