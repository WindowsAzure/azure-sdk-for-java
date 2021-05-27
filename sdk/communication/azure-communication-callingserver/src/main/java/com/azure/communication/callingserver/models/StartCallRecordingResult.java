// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The response payload of start call recording operation. */
@Fluent
public final class StartCallRecordingResult {
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
     * @return the StartCallRecordingResult object itself.
     */
    public StartCallRecordingResult setRecordingId(String recordingId) {
        this.recordingId = recordingId;
        return this;
    }
}
