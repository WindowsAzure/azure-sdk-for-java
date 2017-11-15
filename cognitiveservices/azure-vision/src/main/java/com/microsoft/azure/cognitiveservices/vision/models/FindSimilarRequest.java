/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.vision.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request body for find similar operation.
 */
public class FindSimilarRequest {
    /**
     * FaceId of the query face. User needs to call Face - Detect first to get
     * a valid faceId. Note that this faceId is not persisted and will expire
     * 24 hours after the detection call.
     */
    @JsonProperty(value = "faceId", required = true)
    private String faceId;

    /**
     * An existing user-specified unique candidate face list, created in Face
     * List - Create a Face List. Face list contains a set of persistedFaceIds
     * which are persisted and will never expire. Parameter faceListId and
     * faceIds should not be provided at the same time.
     */
    @JsonProperty(value = "faceListId")
    private String faceListId;

    /**
     * An array of candidate faceIds. All of them are created by Face - Detect
     * and the faceIds will expire 24 hours after the detection call.
     */
    @JsonProperty(value = "faceIds")
    private List<String> faceIds;

    /**
     * The number of top similar faces returned. The valid range is [1, 1000].
     */
    @JsonProperty(value = "maxNumOfCandidatesReturned")
    private Integer maxNumOfCandidatesReturned;

    /**
     * Similar face searching mode. It can be "matchPerson" or "matchFace".
     * Possible values include: 'matchPerson', 'matchFace'.
     */
    @JsonProperty(value = "mode")
    private String mode;

    /**
     * Get the faceId value.
     *
     * @return the faceId value
     */
    public String faceId() {
        return this.faceId;
    }

    /**
     * Set the faceId value.
     *
     * @param faceId the faceId value to set
     * @return the FindSimilarRequest object itself.
     */
    public FindSimilarRequest withFaceId(String faceId) {
        this.faceId = faceId;
        return this;
    }

    /**
     * Get the faceListId value.
     *
     * @return the faceListId value
     */
    public String faceListId() {
        return this.faceListId;
    }

    /**
     * Set the faceListId value.
     *
     * @param faceListId the faceListId value to set
     * @return the FindSimilarRequest object itself.
     */
    public FindSimilarRequest withFaceListId(String faceListId) {
        this.faceListId = faceListId;
        return this;
    }

    /**
     * Get the faceIds value.
     *
     * @return the faceIds value
     */
    public List<String> faceIds() {
        return this.faceIds;
    }

    /**
     * Set the faceIds value.
     *
     * @param faceIds the faceIds value to set
     * @return the FindSimilarRequest object itself.
     */
    public FindSimilarRequest withFaceIds(List<String> faceIds) {
        this.faceIds = faceIds;
        return this;
    }

    /**
     * Get the maxNumOfCandidatesReturned value.
     *
     * @return the maxNumOfCandidatesReturned value
     */
    public Integer maxNumOfCandidatesReturned() {
        return this.maxNumOfCandidatesReturned;
    }

    /**
     * Set the maxNumOfCandidatesReturned value.
     *
     * @param maxNumOfCandidatesReturned the maxNumOfCandidatesReturned value to set
     * @return the FindSimilarRequest object itself.
     */
    public FindSimilarRequest withMaxNumOfCandidatesReturned(Integer maxNumOfCandidatesReturned) {
        this.maxNumOfCandidatesReturned = maxNumOfCandidatesReturned;
        return this;
    }

    /**
     * Get the mode value.
     *
     * @return the mode value
     */
    public String mode() {
        return this.mode;
    }

    /**
     * Set the mode value.
     *
     * @param mode the mode value to set
     * @return the FindSimilarRequest object itself.
     */
    public FindSimilarRequest withMode(String mode) {
        this.mode = mode;
        return this;
    }

}
