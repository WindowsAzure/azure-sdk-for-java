/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakestore.v2015_10_01_preview.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DataLakeStoreAccountState.
 */
public enum DataLakeStoreAccountState {
    /** Enum value active. */
    ACTIVE("active"),

    /** Enum value suspended. */
    SUSPENDED("suspended");

    /** The actual serialized value for a DataLakeStoreAccountState instance. */
    private String value;

    DataLakeStoreAccountState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DataLakeStoreAccountState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DataLakeStoreAccountState object, or null if unable to parse.
     */
    @JsonCreator
    public static DataLakeStoreAccountState fromString(String value) {
        DataLakeStoreAccountState[] items = DataLakeStoreAccountState.values();
        for (DataLakeStoreAccountState item : items) {
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
