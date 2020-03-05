/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for BlobAuditingPolicyState.
 */
public enum BlobAuditingPolicyState {
    /** Enum value Enabled. */
    ENABLED("Enabled"),

    /** Enum value Disabled. */
    DISABLED("Disabled");

    /** The actual serialized value for a BlobAuditingPolicyState instance. */
    private String value;

    BlobAuditingPolicyState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a BlobAuditingPolicyState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed BlobAuditingPolicyState object, or null if unable to parse.
     */
    @JsonCreator
    public static BlobAuditingPolicyState fromString(String value) {
        BlobAuditingPolicyState[] items = BlobAuditingPolicyState.values();
        for (BlobAuditingPolicyState item : items) {
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
