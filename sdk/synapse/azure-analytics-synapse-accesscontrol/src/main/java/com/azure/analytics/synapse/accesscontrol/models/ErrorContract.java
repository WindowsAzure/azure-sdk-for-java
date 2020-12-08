// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.accesscontrol.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains details when the response code indicates an error. */
@Fluent
public final class ErrorContract {
    /*
     * The error details.
     */
    @JsonProperty(value = "error")
    private ErrorResponse error;

    /**
     * Get the error property: The error details.
     *
     * @return the error value.
     */
    public ErrorResponse getError() {
        return this.error;
    }

    /**
     * Set the error property: The error details.
     *
     * @param error the error value to set.
     * @return the ErrorContract object itself.
     */
    public ErrorContract setError(ErrorResponse error) {
        this.error = error;
        return this;
    }
}
