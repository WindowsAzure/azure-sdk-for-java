/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DetectWithStreamOptionalParameter model.
 */
public class DetectWithStreamOptionalParameter {
    /**
     * A value indicating whether the operation should return faceIds of
     * detected faces.
     */
    @JsonProperty(value = "returnFaceId")
    private Boolean returnFaceId;

    /**
     * A value indicating whether the operation should return landmarks of the
     * detected faces.
     */
    @JsonProperty(value = "returnFaceLandmarks")
    private Boolean returnFaceLandmarks;

    /**
     * Analyze and return the one or more specified face attributes in the
     * comma-separated string like "returnFaceAttributes=age,gender". Supported
     * face attributes include age, gender, headPose, smile, facialHair,
     * glasses and emotion. Note that each face attribute analysis has
     * additional computational and time cost.
     */
    @JsonProperty(value = "returnFaceAttributes")
    private List<FaceAttributeType> returnFaceAttributes;

    /**
     * Gets or sets the preferred language for the response.
     */
    @JsonProperty(value = "this\\.client\\.acceptLanguage()")
    private String acceptLanguage;

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
     * @return the DetectWithStreamOptionalParameter object itself.
     */
    public DetectWithStreamOptionalParameter withReturnFaceId(Boolean returnFaceId) {
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
     * @return the DetectWithStreamOptionalParameter object itself.
     */
    public DetectWithStreamOptionalParameter withReturnFaceLandmarks(Boolean returnFaceLandmarks) {
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
     * @return the DetectWithStreamOptionalParameter object itself.
     */
    public DetectWithStreamOptionalParameter withReturnFaceAttributes(List<FaceAttributeType> returnFaceAttributes) {
        this.returnFaceAttributes = returnFaceAttributes;
        return this;
    }

    /**
     * Get the acceptLanguage value.
     *
     * @return the acceptLanguage value
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Set the acceptLanguage value.
     *
     * @param acceptLanguage the acceptLanguage value to set
     * @return the DetectWithStreamOptionalParameter object itself.
     */
    public DetectWithStreamOptionalParameter withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

}
