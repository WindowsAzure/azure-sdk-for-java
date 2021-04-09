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
 * The API error response.
 */
public class ComputerVisionErrorResponse {
    /**
     * Error contents.
     */
    @JsonProperty(value = "error", required = true)
    private ComputerVisionError error;

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public ComputerVisionError error() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     * @return the ComputerVisionErrorResponse object itself.
     */
    public ComputerVisionErrorResponse withError(ComputerVisionError error) {
        this.error = error;
        return this;
    }

}
