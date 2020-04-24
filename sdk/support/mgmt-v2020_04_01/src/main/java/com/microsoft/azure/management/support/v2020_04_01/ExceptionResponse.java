/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.v2020_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The API error.
 */
public class ExceptionResponse {
    /**
     * The API error details.
     */
    @JsonProperty(value = "error")
    private ServiceError error;

    /**
     * Get the API error details.
     *
     * @return the error value
     */
    public ServiceError error() {
        return this.error;
    }

    /**
     * Set the API error details.
     *
     * @param error the error value to set
     * @return the ExceptionResponse object itself.
     */
    public ExceptionResponse withError(ServiceError error) {
        this.error = error;
        return this;
    }

}
