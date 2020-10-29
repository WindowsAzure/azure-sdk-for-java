/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ApiError model.
 */
public class ApiError {
    /**
     * The error property.
     */
    @JsonProperty(value = "error", required = true)
    private ErrorDetail error;

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public ErrorDetail error() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     * @return the ApiError object itself.
     */
    public ApiError withError(ErrorDetail error) {
        this.error = error;
        return this;
    }

}
