// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ApiManagementSkuCapacityScaleType. */
public enum ApiManagementSkuCapacityScaleType {
    /** Enum value Automatic. */
    AUTOMATIC("Automatic"),

    /** Enum value Manual. */
    MANUAL("Manual"),

    /** Enum value None. */
    NONE("None");

    /** The actual serialized value for a ApiManagementSkuCapacityScaleType instance. */
    private final String value;

    ApiManagementSkuCapacityScaleType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ApiManagementSkuCapacityScaleType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ApiManagementSkuCapacityScaleType object, or null if unable to parse.
     */
    @JsonCreator
    public static ApiManagementSkuCapacityScaleType fromString(String value) {
        ApiManagementSkuCapacityScaleType[] items = ApiManagementSkuCapacityScaleType.values();
        for (ApiManagementSkuCapacityScaleType item : items) {
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
