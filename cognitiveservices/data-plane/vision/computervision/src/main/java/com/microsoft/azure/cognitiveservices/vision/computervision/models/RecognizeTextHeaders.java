/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for RecognizeText operation.
 */
public class RecognizeTextHeaders {
    /**
     * URL to query for status of the operation. The operation ID will expire
     * in 48 hours.
     */
    @JsonProperty(value = "Operation-Location")
    private String operationLocation;

    /**
     * Get uRL to query for status of the operation. The operation ID will expire in 48 hours.
     *
     * @return the operationLocation value
     */
    public String operationLocation() {
        return this.operationLocation;
    }

    /**
     * Set uRL to query for status of the operation. The operation ID will expire in 48 hours.
     *
     * @param operationLocation the operationLocation value to set
     * @return the RecognizeTextHeaders object itself.
     */
    public RecognizeTextHeaders withOperationLocation(String operationLocation) {
        this.operationLocation = operationLocation;
        return this;
    }

}
