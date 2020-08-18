// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.digitaltwins.core.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ErrorResponse model. */
@Fluent
public final class ErrorResponse {
    /*
     * The error details.
     */
    @JsonProperty(value = "error")
    private Error error;

    /**
     * Get the error property: The error details.
     *
     * @return the error value.
     */
    public Error getError() {
        return this.error;
    }

    /**
     * Set the error property: The error details.
     *
     * @param error the error value to set.
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse setError(Error error) {
        this.error = error;
        return this;
    }
}
