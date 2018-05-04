/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.face.models;

import java.util.UUID;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response body for identify face operation.
 */
public class IdentifyResult {
    /**
     * FaceId of the query face.
     */
    @JsonProperty(value = "faceId", required = true)
    private UUID faceId;

    /**
     * Identified person candidates for that face (ranked by confidence). Array
     * size should be no larger than input maxNumOfCandidatesReturned. If no
     * person is identified, will return an empty array.
     */
    @JsonProperty(value = "candidates", required = true)
    private List<IdentifyCandidate> candidates;

    /**
     * Get the faceId value.
     *
     * @return the faceId value
     */
    public UUID faceId() {
        return this.faceId;
    }

    /**
     * Set the faceId value.
     *
     * @param faceId the faceId value to set
     * @return the IdentifyResult object itself.
     */
    public IdentifyResult withFaceId(UUID faceId) {
        this.faceId = faceId;
        return this;
    }

    /**
     * Get the candidates value.
     *
     * @return the candidates value
     */
    public List<IdentifyCandidate> candidates() {
        return this.candidates;
    }

    /**
     * Set the candidates value.
     *
     * @param candidates the candidates value to set
     * @return the IdentifyResult object itself.
     */
    public IdentifyResult withCandidates(List<IdentifyCandidate> candidates) {
        this.candidates = candidates;
        return this;
    }

}
