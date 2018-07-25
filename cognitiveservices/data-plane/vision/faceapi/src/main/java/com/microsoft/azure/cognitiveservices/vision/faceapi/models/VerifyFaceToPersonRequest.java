/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request body for verify operation.
 */
public class VerifyFaceToPersonRequest {
    /**
     * FaceId the face, comes from Face - Detect.
     */
    @JsonProperty(value = "faceId", required = true)
    private UUID faceId;

    /**
     * Using existing personGroupId and personId for fast loading a specified
     * person. personGroupId is created in Person Groups.Create.
     */
    @JsonProperty(value = "personGroupId", required = true)
    private String personGroupId;

    /**
     * Specify a certain person in a person group. personId is created in
     * Persons.Create.
     */
    @JsonProperty(value = "personId", required = true)
    private UUID personId;

    /**
     * Get faceId the face, comes from Face - Detect.
     *
     * @return the faceId value
     */
    public UUID faceId() {
        return this.faceId;
    }

    /**
     * Set faceId the face, comes from Face - Detect.
     *
     * @param faceId the faceId value to set
     * @return the VerifyFaceToPersonRequest object itself.
     */
    public VerifyFaceToPersonRequest withFaceId(UUID faceId) {
        this.faceId = faceId;
        return this;
    }

    /**
     * Get using existing personGroupId and personId for fast loading a specified person. personGroupId is created in Person Groups.Create.
     *
     * @return the personGroupId value
     */
    public String personGroupId() {
        return this.personGroupId;
    }

    /**
     * Set using existing personGroupId and personId for fast loading a specified person. personGroupId is created in Person Groups.Create.
     *
     * @param personGroupId the personGroupId value to set
     * @return the VerifyFaceToPersonRequest object itself.
     */
    public VerifyFaceToPersonRequest withPersonGroupId(String personGroupId) {
        this.personGroupId = personGroupId;
        return this;
    }

    /**
     * Get specify a certain person in a person group. personId is created in Persons.Create.
     *
     * @return the personId value
     */
    public UUID personId() {
        return this.personId;
    }

    /**
     * Set specify a certain person in a person group. personId is created in Persons.Create.
     *
     * @param personId the personId value to set
     * @return the VerifyFaceToPersonRequest object itself.
     */
    public VerifyFaceToPersonRequest withPersonId(UUID personId) {
        this.personId = personId;
        return this;
    }

}
