// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.keyvault;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for AccessPolicyUpdateKind. */
public enum AccessPolicyUpdateKind {
    /** Enum value add. */
    ADD("add"),

    /** Enum value replace. */
    REPLACE("replace"),

    /** Enum value remove. */
    REMOVE("remove");

    /** The actual serialized value for a AccessPolicyUpdateKind instance. */
    private final String value;

    AccessPolicyUpdateKind(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AccessPolicyUpdateKind instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AccessPolicyUpdateKind object, or null if unable to parse.
     */
    @JsonCreator
    public static AccessPolicyUpdateKind fromString(String value) {
        AccessPolicyUpdateKind[] items = AccessPolicyUpdateKind.values();
        for (AccessPolicyUpdateKind item : items) {
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
