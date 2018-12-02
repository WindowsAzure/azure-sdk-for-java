/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Wrapper for error response to follow ARM guidelines.
 */
public class ErrorResponseWrapper {
    /**
     * The error response.
     */
    @JsonProperty(value = "error")
    private ErrorResponse error;

    /**
     * Get the error response.
     *
     * @return the error value
     */
    public ErrorResponse error() {
        return this.error;
    }

    /**
     * Set the error response.
     *
     * @param error the error value to set
     * @return the ErrorResponseWrapper object itself.
     */
    public ErrorResponseWrapper withError(ErrorResponse error) {
        this.error = error;
        return this;
    }

}
