// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.quantum.jobs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Error information returned by the API. */
@Fluent
public final class RestError {
    /*
     * An error response from Azure.
     */
    @JsonProperty(value = "error")
    private ErrorData error;

    /**
     * Get the error property: An error response from Azure.
     *
     * @return the error value.
     */
    public ErrorData getError() {
        return this.error;
    }

    /**
     * Set the error property: An error response from Azure.
     *
     * @param error the error value to set.
     * @return the RestError object itself.
     */
    public RestError setError(ErrorData error) {
        this.error = error;
        return this;
    }
}
