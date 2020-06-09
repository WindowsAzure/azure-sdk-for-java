/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for OperationStatusCodes.
 */
public enum OperationStatusCodes {
    /** Enum value notStarted. */
    NOT_STARTED("notStarted"),

    /** Enum value running. */
    RUNNING("running"),

    /** Enum value failed. */
    FAILED("failed"),

    /** Enum value succeeded. */
    SUCCEEDED("succeeded");

    /** The actual serialized value for a OperationStatusCodes instance. */
    private String value;

    OperationStatusCodes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OperationStatusCodes instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed OperationStatusCodes object, or null if unable to parse.
     */
    @JsonCreator
    public static OperationStatusCodes fromString(String value) {
        OperationStatusCodes[] items = OperationStatusCodes.values();
        for (OperationStatusCodes item : items) {
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
