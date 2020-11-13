/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An error response from the API.
 */
public class ResponseWithError {
    /**
     * Error information.
     */
    @JsonProperty(value = "error", required = true)
    private Error error;

    /**
     * Get error information.
     *
     * @return the error value
     */
    public Error error() {
        return this.error;
    }

    /**
     * Set error information.
     *
     * @param error the error value to set
     * @return the ResponseWithError object itself.
     */
    public ResponseWithError withError(Error error) {
        this.error = error;
        return this;
    }

}
