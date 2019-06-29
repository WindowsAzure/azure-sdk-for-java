// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.blob.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for BlobType.
 */
public enum BlobType {
    /**
     * Enum value BlockBlob.
     */
    BLOCK_BLOB("BlockBlob"),

    /**
     * Enum value PageBlob.
     */
    PAGE_BLOB("PageBlob"),

    /**
     * Enum value AppendBlob.
     */
    APPEND_BLOB("AppendBlob");

    /**
     * The actual serialized value for a BlobType instance.
     */
    private final String value;

    BlobType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a BlobType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed BlobType object, or null if unable to parse.
     */
    @JsonCreator
    public static BlobType fromString(String value) {
        BlobType[] items = BlobType.values();
        for (BlobType item : items) {
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
