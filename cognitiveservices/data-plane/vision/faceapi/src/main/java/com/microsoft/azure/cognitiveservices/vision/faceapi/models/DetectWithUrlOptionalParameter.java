/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;

import java.util.List;

/**
 * The DetectWithUrlOptionalParameter model.
 */
public class DetectWithUrlOptionalParameter {
    /**
     * A value indicating whether the operation should return faceIds of
     * detected faces.
     */
    private Boolean returnFaceId;

    /**
     * A value indicating whether the operation should return landmarks of the
     * detected faces.
     */
    private Boolean returnFaceLandmarks;

    /**
     * Analyze and return the one or more specified face attributes in the
     * comma-separated string like "returnFaceAttributes=age,gender". Supported
     * face attributes include age, gender, headPose, smile, facialHair,
     * glasses and emotion. Note that each face attribute analysis has
     * additional computational and time cost.
     */
    private List<FaceAttributeType> returnFaceAttributes;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the returnFaceId value.
     *
     * @return the returnFaceId value
     */
    public Boolean returnFaceId() {
        return this.returnFaceId;
    }

    /**
     * Set the returnFaceId value.
     *
     * @param returnFaceId the returnFaceId value to set
     * @return the DetectWithUrlOptionalParameter object itself.
     */
    public DetectWithUrlOptionalParameter withReturnFaceId(Boolean returnFaceId) {
        this.returnFaceId = returnFaceId;
        return this;
    }

    /**
     * Get the returnFaceLandmarks value.
     *
     * @return the returnFaceLandmarks value
     */
    public Boolean returnFaceLandmarks() {
        return this.returnFaceLandmarks;
    }

    /**
     * Set the returnFaceLandmarks value.
     *
     * @param returnFaceLandmarks the returnFaceLandmarks value to set
     * @return the DetectWithUrlOptionalParameter object itself.
     */
    public DetectWithUrlOptionalParameter withReturnFaceLandmarks(Boolean returnFaceLandmarks) {
        this.returnFaceLandmarks = returnFaceLandmarks;
        return this;
    }

    /**
     * Get the returnFaceAttributes value.
     *
     * @return the returnFaceAttributes value
     */
    public List<FaceAttributeType> returnFaceAttributes() {
        return this.returnFaceAttributes;
    }

    /**
     * Set the returnFaceAttributes value.
     *
     * @param returnFaceAttributes the returnFaceAttributes value to set
     * @return the DetectWithUrlOptionalParameter object itself.
     */
    public DetectWithUrlOptionalParameter withReturnFaceAttributes(List<FaceAttributeType> returnFaceAttributes) {
        this.returnFaceAttributes = returnFaceAttributes;
        return this;
    }

    /**
     * Get the thisclientacceptLanguage value.
     *
     * @return the thisclientacceptLanguage value
     */
    public String thisclientacceptLanguage() {
        return this.thisclientacceptLanguage;
    }

    /**
     * Set the thisclientacceptLanguage value.
     *
     * @param thisclientacceptLanguage the thisclientacceptLanguage value to set
     * @return the DetectWithUrlOptionalParameter object itself.
     */
    public DetectWithUrlOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
