/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.face.models;


/**
 * The optional parameters class for "updateFace" method.
 */
public class UpdateFaceOptionalParameter {
    /**
    * User-provided data attached to the face. The size limit is 1KB.
    */
    private String userData;

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
    * <p>
    * User-provided data attached to the face. The size limit is 1KB.
    *
    * @param userData the userData value to set
    * @return the updateFaceOptionalParameter object itself.
    */
    public UpdateFaceOptionalParameter withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    }
