/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybridkubernetes.v2020_01_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The resource management error response.
 */
public class ErrorResponse {
    /**
     * The error object.
     */
    @JsonProperty(value = "error")
    private ErrorResponseError error;

    /**
     * Get the error object.
     *
     * @return the error value
     */
    public ErrorResponseError error() {
        return this.error;
    }

    /**
     * Set the error object.
     *
     * @param error the error value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withError(ErrorResponseError error) {
        this.error = error;
        return this;
    }

}
