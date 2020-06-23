/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * API error response.
 */
public class ApiError {
    /**
     * An error returned by the API.
     */
    @JsonProperty(value = "error")
    private ApiErrorBase error;

    /**
     * Get an error returned by the API.
     *
     * @return the error value
     */
    public ApiErrorBase error() {
        return this.error;
    }

    /**
     * Set an error returned by the API.
     *
     * @param error the error value to set
     * @return the ApiError object itself.
     */
    public ApiError withError(ApiErrorBase error) {
        this.error = error;
        return this;
    }

}
