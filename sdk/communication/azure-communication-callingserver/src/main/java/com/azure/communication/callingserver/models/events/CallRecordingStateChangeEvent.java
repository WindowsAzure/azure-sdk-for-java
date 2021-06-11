// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver.models.events;

import com.azure.communication.callingserver.implementation.models.CallRecordingStateChangeEventInternal;
import com.azure.communication.callingserver.models.CallRecordingState;
import com.azure.core.util.BinaryData;

import java.time.OffsetDateTime;

/** The call recording state change event. */
public final class CallRecordingStateChangeEvent {
    /*
     * The call recording id
     */
    private final String recordingId;

    /*
     * The recording state of the recording
     */
    private final CallRecordingState state;

    /*
     * The time of the recording started
     */
    private final OffsetDateTime startDateTime;

    /*
     * The server call.id.
     */
    private final String serverCallId;

    /**
     * Get the recordingId property: The call recording id.
     *
     * @return the recordingId value.
     */
    public String getRecordingId() {
        return this.recordingId;
    }

    /**
     * Get the state property: The recording state of the recording.
     *
     * @return the state value.
     */
    public CallRecordingState getState() {
        return this.state;
    }

    /**
     * Get the startDateTime property: The time of the recording started.
     *
     * @return the startDateTime value.
     */
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }

    /**
     * Get the serverCallId property: The server call.id.
     *
     * @return the serverCallId value.
     */
    public String getServerCallId() {
        return this.serverCallId;
    }

    /**
     * Initializes a new instance of CallRecordingStateChangeEvent.
     *
     * @param recordingId the recordingId value.
     * @param state the state value.
     * @param startDateTime the startDateTime value.
     * @param serverCallId the serverCallId value.
     */
    public CallRecordingStateChangeEvent(String recordingId, CallRecordingState state, OffsetDateTime startDateTime, String serverCallId) {
        this.recordingId = recordingId;
        this.state = state;
        this.startDateTime = startDateTime;
        this.serverCallId = serverCallId;
    }

    /**
     * Deserialize {@link CallRecordingStateChangeEvent} event.
     *
     * @param eventData binary data for event
     * @return {@link CallRecordingStateChangeEvent} event.
     */
    public static CallRecordingStateChangeEvent deserialize(BinaryData eventData) {
        if (eventData == null) {
            return null;
        }
        CallRecordingStateChangeEventInternal callRecordingStateChangeEventInternal =
            eventData.toObject(CallRecordingStateChangeEventInternal.class);
        return new CallRecordingStateChangeEvent(
            callRecordingStateChangeEventInternal.getRecordingId(),
            callRecordingStateChangeEventInternal.getState(),
            callRecordingStateChangeEventInternal.getStartDateTime(),
            callRecordingStateChangeEventInternal.getServerCallId());
    }
}

