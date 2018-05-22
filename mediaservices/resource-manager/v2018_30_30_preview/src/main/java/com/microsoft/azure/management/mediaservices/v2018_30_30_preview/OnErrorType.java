/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for OnErrorType.
 */
public enum OnErrorType {
    /** Tells the service that if this TransformOutput fails, then any other incomplete TransformOutputs can be stopped. */
    STOP_PROCESSING_JOB("StopProcessingJob"),

    /** Tells the service that if this TransformOutput fails, then allow any other TransformOutput to continue. */
    CONTINUE_JOB("ContinueJob");

    /** The actual serialized value for a OnErrorType instance. */
    private String value;

    OnErrorType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OnErrorType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed OnErrorType object, or null if unable to parse.
     */
    @JsonCreator
    public static OnErrorType fromString(String value) {
        OnErrorType[] items = OnErrorType.values();
        for (OnErrorType item : items) {
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
