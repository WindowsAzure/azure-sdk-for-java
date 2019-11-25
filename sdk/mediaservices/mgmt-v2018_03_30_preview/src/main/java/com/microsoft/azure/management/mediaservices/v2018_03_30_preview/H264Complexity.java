/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for H264Complexity.
 */
public enum H264Complexity {
    /** Tells the encoder to use settings that are optimized for faster encoding. Quality is sacrificed to decrease encoding time. */
    SPEED("Speed"),

    /** Tells the encoder to use settings that achieve a balance between speed and quality. */
    BALANCED("Balanced"),

    /** Tells the encoder to use settings that are optimized to produce higher quality output at the expense of slower overall encode time. */
    QUALITY("Quality");

    /** The actual serialized value for a H264Complexity instance. */
    private String value;

    H264Complexity(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a H264Complexity instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed H264Complexity object, or null if unable to parse.
     */
    @JsonCreator
    public static H264Complexity fromString(String value) {
        H264Complexity[] items = H264Complexity.values();
        for (H264Complexity item : items) {
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
