/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;


/**
 * The optional parameters class for "createPersonGroup" method.
 */
public class CreatePersonGroupOptionalParameter {
    /**
    * User defined name, maximum length is 128.
    */
    private String name;

    /**
    * User specified data. Length should not exceed 16KB.
    */
    private String userData;

    /**
    * Get the name value.
    *
    * @return the name value
    */
    public String name() {
        return this.name;
    }

    /**
    * Get the userData value.
    *
    * @return the userData value
    */
    public String userData() {
        return this.userData;
    }

    /**
    * Set the name value.
    * <p>
    * User defined name, maximum length is 128.
    *
    * @param name the name value to set
    * @return the createPersonGroupOptionalParameter object itself.
    */
    public CreatePersonGroupOptionalParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
    * Set the userData value.
    * <p>
    * User specified data. Length should not exceed 16KB.
    *
    * @param userData the userData value to set
    * @return the createPersonGroupOptionalParameter object itself.
    */
    public CreatePersonGroupOptionalParameter withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    }
