// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for IndexerExecutionStatus.
 */
public enum IndexerExecutionStatus {
    /**
     * Enum value transientFailure.
     */
    TRANSIENT_FAILURE("transientFailure"),

    /**
     * Enum value success.
     */
    SUCCESS("success"),

    /**
     * Enum value inProgress.
     */
    IN_PROGRESS("inProgress"),

    /**
     * Enum value reset.
     */
    RESET("reset");

    /**
     * The actual serialized value for a IndexerExecutionStatus instance.
     */
    private final String value;

    IndexerExecutionStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a IndexerExecutionStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed IndexerExecutionStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static IndexerExecutionStatus fromString(String value) {
        IndexerExecutionStatus[] items = IndexerExecutionStatus.values();
        for (IndexerExecutionStatus item : items) {
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
