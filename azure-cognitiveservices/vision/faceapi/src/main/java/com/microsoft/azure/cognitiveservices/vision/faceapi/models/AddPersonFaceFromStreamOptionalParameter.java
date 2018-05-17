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
 * The AddPersonFaceFromStreamOptionalParameter model.
 */
public class AddPersonFaceFromStreamOptionalParameter {
    /**
     * User-specified data about the face for any purpose. The maximum length
     * is 1KB.
     */
    @JsonProperty(value = "userData")
    private String userData;

    /**
     * A face rectangle to specify the target face to be added to a person in
     * the format of "targetFace=left,top,width,height". E.g.
     * "targetFace=10,10,100,100". If there is more than one face in the image,
     * targetFace is required to specify which face to add. No targetFace means
     * there is only one face detected in the entire image.
     */
    @JsonProperty(value = "targetFace")
    private List<Integer> targetFace;

    /**
     * Gets or sets the preferred language for the response.
     */
    @JsonProperty(value = "this\\.client\\.acceptLanguage()")
    private String acceptLanguage;

    /**
     * Get the userData value.
     *
     * @return the userData value
     */
    public String userData() {
        return this.userData;
    }

    /**
     * Set the userData value.
     *
     * @param userData the userData value to set
     * @return the AddPersonFaceFromStreamOptionalParameter object itself.
     */
    public AddPersonFaceFromStreamOptionalParameter withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * Get the targetFace value.
     *
     * @return the targetFace value
     */
    public List<Integer> targetFace() {
        return this.targetFace;
    }

    /**
     * Set the targetFace value.
     *
     * @param targetFace the targetFace value to set
     * @return the AddPersonFaceFromStreamOptionalParameter object itself.
     */
    public AddPersonFaceFromStreamOptionalParameter withTargetFace(List<Integer> targetFace) {
        this.targetFace = targetFace;
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
     * @return the AddPersonFaceFromStreamOptionalParameter object itself.
     */
    public AddPersonFaceFromStreamOptionalParameter withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

}
