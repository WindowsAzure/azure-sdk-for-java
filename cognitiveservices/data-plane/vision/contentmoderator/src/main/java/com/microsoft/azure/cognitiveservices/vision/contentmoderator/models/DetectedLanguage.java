/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Detect language result.
 */
public class DetectedLanguage {
    /**
     * The detected language.
     */
    @JsonProperty(value = "DetectedLanguage")
    private String detectedLanguage;

    /**
     * The detect language status.
     */
    @JsonProperty(value = "Status")
    private Status status;

    /**
     * The tracking id.
     */
    @JsonProperty(value = "TrackingId")
    private String trackingId;

    /**
     * Get the detectedLanguage value.
     *
     * @return the detectedLanguage value
     */
    public String detectedLanguage() {
        return this.detectedLanguage;
    }

    /**
     * Set the detectedLanguage value.
     *
     * @param detectedLanguage the detectedLanguage value to set
     * @return the DetectedLanguage object itself.
     */
    public DetectedLanguage withDetectedLanguage(String detectedLanguage) {
        this.detectedLanguage = detectedLanguage;
        return this;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the DetectedLanguage object itself.
     */
    public DetectedLanguage withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get the trackingId value.
     *
     * @return the trackingId value
     */
    public String trackingId() {
        return this.trackingId;
    }

    /**
     * Set the trackingId value.
     *
     * @param trackingId the trackingId value to set
     * @return the DetectedLanguage object itself.
     */
    public DetectedLanguage withTrackingId(String trackingId) {
        this.trackingId = trackingId;
        return this;
    }

}
