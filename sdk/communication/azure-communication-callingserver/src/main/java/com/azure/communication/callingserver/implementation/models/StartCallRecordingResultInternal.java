// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The response payload of start call recording operation. */
@Fluent
public final class StartCallRecordingResultInternal {
    /*
     * The recording id of the started recording
     */
    @JsonProperty(value = "recordingId")
    private String recordingId;

    /**
     * Get the recordingId property: The recording id of the started recording.
     *
     * @return the recordingId value.
     */
    public String getRecordingId() {
        return this.recordingId;
    }

    /**
     * Set the recordingId property: The recording id of the started recording.
     *
     * @param recordingId the recordingId value to set.
     * @return the StartCallRecordingResultInternal object itself.
     */
    public StartCallRecordingResultInternal setRecordingId(String recordingId) {
        this.recordingId = recordingId;
        return this;
    }
}
