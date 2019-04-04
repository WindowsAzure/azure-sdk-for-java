// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for PoolState.
 */
public enum PoolState {
    /** The pool is available to run tasks subject to the availability of compute nodes. */
    ACTIVE("active"),

    /** The user has requested that the pool be deleted, but the delete operation has not yet completed. */
    DELETING("deleting");

    /** The actual serialized value for a PoolState instance. */
    private String value;

    PoolState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PoolState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PoolState object, or null if unable to parse.
     */
    @JsonCreator
    public static PoolState fromString(String value) {
        PoolState[] items = PoolState.values();
        for (PoolState item : items) {
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
