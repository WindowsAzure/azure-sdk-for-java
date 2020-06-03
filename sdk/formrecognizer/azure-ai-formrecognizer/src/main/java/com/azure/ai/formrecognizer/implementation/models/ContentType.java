// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ContentType. */
public enum ContentType {
    /** Enum value application/pdf. */
    APPLICATION_PDF("application/pdf"),

    /** Enum value image/jpeg. */
    IMAGE_JPEG("image/jpeg"),

    /** Enum value image/png. */
    IMAGE_PNG("image/png"),

    /** Enum value image/tiff. */
    IMAGE_TIFF("image/tiff");

    /** The actual serialized value for a ContentType instance. */
    private final String value;

    ContentType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ContentType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ContentType object, or null if unable to parse.
     */
    @JsonCreator
    public static ContentType fromString(String value) {
        ContentType[] items = ContentType.values();
        for (ContentType item : items) {
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
