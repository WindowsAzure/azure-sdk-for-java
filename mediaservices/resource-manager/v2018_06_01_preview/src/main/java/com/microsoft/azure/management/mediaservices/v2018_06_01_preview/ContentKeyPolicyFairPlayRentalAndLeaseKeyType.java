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
 * Defines values for ContentKeyPolicyFairPlayRentalAndLeaseKeyType.
 */
public enum ContentKeyPolicyFairPlayRentalAndLeaseKeyType {
    /** Represents a ContentKeyPolicyFairPlayRentalAndLeaseKeyType that is unavailable in current API version. */
    UNKNOWN("Unknown"),

    /** Key duration is not specified. */
    UNDEFINED("Undefined"),

    /** Content key can be persisted with an unlimited duration. */
    PERSISTENT_UNLIMITED("PersistentUnlimited"),

    /** Content key can be persisted and the valid duration is limited by the Rental Duration value. */
    PERSISTENT_LIMITED("PersistentLimited");

    /** The actual serialized value for a ContentKeyPolicyFairPlayRentalAndLeaseKeyType instance. */
    private String value;

    ContentKeyPolicyFairPlayRentalAndLeaseKeyType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ContentKeyPolicyFairPlayRentalAndLeaseKeyType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ContentKeyPolicyFairPlayRentalAndLeaseKeyType object, or null if unable to parse.
     */
    @JsonCreator
    public static ContentKeyPolicyFairPlayRentalAndLeaseKeyType fromString(String value) {
        ContentKeyPolicyFairPlayRentalAndLeaseKeyType[] items = ContentKeyPolicyFairPlayRentalAndLeaseKeyType.values();
        for (ContentKeyPolicyFairPlayRentalAndLeaseKeyType item : items) {
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
