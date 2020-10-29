/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_10_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for AliasType.
 */
public enum AliasType {
    /** Alias type is unknown (same as not providing alias type). */
    NOT_SPECIFIED("NotSpecified"),

    /** Alias value is not secret. */
    PLAIN_TEXT("PlainText"),

    /** Alias value is secret. */
    MASK("Mask");

    /** The actual serialized value for a AliasType instance. */
    private String value;

    AliasType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AliasType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AliasType object, or null if unable to parse.
     */
    @JsonCreator
    public static AliasType fromString(String value) {
        AliasType[] items = AliasType.values();
        for (AliasType item : items) {
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
