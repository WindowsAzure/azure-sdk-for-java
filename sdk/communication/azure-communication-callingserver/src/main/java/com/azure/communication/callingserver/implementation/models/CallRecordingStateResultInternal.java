// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.communication.callingserver.models.CallRecordingState;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The response payload of get call recording state operation. */
@Fluent
public final class CallRecordingStateResultInternal {
    /*
     * The recording state of the recording
     */
    @JsonProperty(value = "recordingState")
    private CallRecordingState recordingState;

    /**
     * Get the recordingState property: The recording state of the recording.
     *
     * @return the recordingState value.
     */
    public CallRecordingState getRecordingState() {
        return this.recordingState;
    }

    /**
     * Set the recordingState property: The recording state of the recording.
     *
     * @param recordingState the recordingState value to set.
     * @return the CallRecordingStateResultInternal object itself.
     */
    public CallRecordingStateResultInternal setRecordingState(CallRecordingState recordingState) {
        this.recordingState = recordingState;
        return this;
    }
}
