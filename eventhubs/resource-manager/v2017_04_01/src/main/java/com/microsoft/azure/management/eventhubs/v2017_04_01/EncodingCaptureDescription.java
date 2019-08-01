/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2017_04_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for EncodingCaptureDescription.
 */
public enum EncodingCaptureDescription {
    /** Enum value Avro. */
    AVRO("Avro"),

    /** Enum value AvroDeflate. */
    AVRO_DEFLATE("AvroDeflate");

    /** The actual serialized value for a EncodingCaptureDescription instance. */
    private String value;

    EncodingCaptureDescription(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a EncodingCaptureDescription instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed EncodingCaptureDescription object, or null if unable to parse.
     */
    @JsonCreator
    public static EncodingCaptureDescription fromString(String value) {
        EncodingCaptureDescription[] items = EncodingCaptureDescription.values();
        for (EncodingCaptureDescription item : items) {
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
