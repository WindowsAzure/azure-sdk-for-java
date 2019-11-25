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
 * Defines values for JobState.
 */
public enum JobState {
    /** The job was canceled. This is a final state for the job. */
    CANCELED("Canceled"),

    /** The job is in the process of being canceled. This is a transient state for the job. */
    CANCELING("Canceling"),

    /** The job has encountered an error. This is a final state for the job. */
    ERROR("Error"),

    /** The job is finished. This is a final state for the job. */
    FINISHED("Finished"),

    /** The job is processing. This is a transient state for the job. */
    PROCESSING("Processing"),

    /** The job is in a queued state, waiting for resources to become available. This is a transient state. */
    QUEUED("Queued"),

    /** The job is being scheduled to run on an available resource. This is a transient state, between queued and processing states. */
    SCHEDULED("Scheduled");

    /** The actual serialized value for a JobState instance. */
    private String value;

    JobState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a JobState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed JobState object, or null if unable to parse.
     */
    @JsonCreator
    public static JobState fromString(String value) {
        JobState[] items = JobState.values();
        for (JobState item : items) {
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
