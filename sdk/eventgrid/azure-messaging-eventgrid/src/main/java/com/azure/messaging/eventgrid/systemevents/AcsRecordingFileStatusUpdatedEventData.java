// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Duration;
import java.time.OffsetDateTime;

/** Schema of the Data property of an EventGridEvent for an Microsoft.Communication.RecordingFileStatusUpdated event. */
@Fluent
public final class AcsRecordingFileStatusUpdatedEventData {
    /*
     * The details of recording storage information
     */
    @JsonProperty(value = "recordingStorageInfo")
    private AcsRecordingStorageInfoProperties recordingStorageInfo;

    /*
     * The time at which the recording started
     */
    @JsonProperty(value = "recordingStartTime")
    private OffsetDateTime recordingStartTime;

    /*
     * The recording duration in milliseconds
     */
    @JsonProperty(value = "recordingDurationMs")
    private Long recordingDurationMs;

    /*
     * The reason for ending recording session
     */
    @JsonProperty(value = "sessionEndReason")
    private String sessionEndReason;

    /**
     * Get the recordingStorageInfo property: The details of recording storage information.
     *
     * @return the recordingStorageInfo value.
     */
    public AcsRecordingStorageInfoProperties getRecordingStorageInfo() {
        return this.recordingStorageInfo;
    }

    /**
     * Set the recordingStorageInfo property: The details of recording storage information.
     *
     * @param recordingStorageInfo the recordingStorageInfo value to set.
     * @return the AcsRecordingFileStatusUpdatedEventData object itself.
     */
    public AcsRecordingFileStatusUpdatedEventData setRecordingStorageInfo(
            AcsRecordingStorageInfoProperties recordingStorageInfo) {
        this.recordingStorageInfo = recordingStorageInfo;
        return this;
    }

    /**
     * Get the recordingStartTime property: The time at which the recording started.
     *
     * @return the recordingStartTime value.
     */
    public OffsetDateTime getRecordingStartTime() {
        return this.recordingStartTime;
    }

    /**
     * Set the recordingStartTime property: The time at which the recording started.
     *
     * @param recordingStartTime the recordingStartTime value to set.
     * @return the AcsRecordingFileStatusUpdatedEventData object itself.
     */
    public AcsRecordingFileStatusUpdatedEventData setRecordingStartTime(OffsetDateTime recordingStartTime) {
        this.recordingStartTime = recordingStartTime;
        return this;
    }

    /**
     * Get the {@link Duration} of recordingDuration property: The recording duration.
     *
     * @return the recordingDuration value.
     */
    public Duration getRecordingDuration() {
        return Duration.ofMillis(this.recordingDurationMs);
    }

    /**
     * Set the recordingDuration property: The recording duration.
     *
     * @param recordingDuration the recordingDuration value to set.
     * @return the AcsRecordingFileStatusUpdatedEventData object itself.
     */
    public AcsRecordingFileStatusUpdatedEventData setRecordingDuration(Duration recordingDuration) {
        this.recordingDurationMs = recordingDuration.toMillis();
        return this;
    }

    /**
     * Get the sessionEndReason property: The reason for ending recording session.
     *
     * @return the sessionEndReason value.
     */
    public String getSessionEndReason() {
        return this.sessionEndReason;
    }

    /**
     * Set the sessionEndReason property: The reason for ending recording session.
     *
     * @param sessionEndReason the sessionEndReason value to set.
     * @return the AcsRecordingFileStatusUpdatedEventData object itself.
     */
    public AcsRecordingFileStatusUpdatedEventData setSessionEndReason(String sessionEndReason) {
        this.sessionEndReason = sessionEndReason;
        return this;
    }
}
