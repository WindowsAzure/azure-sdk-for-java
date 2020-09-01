// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ErrorResponse model. */
@Fluent
public final class ErrorResponse {
    /*
     * Document Error.
     */
    @JsonProperty(value = "error", required = true)
    private TextAnalyticsError error;

    /**
     * Get the error property: Document Error.
     *
     * @return the error value.
     */
    public TextAnalyticsError getError() {
        return this.error;
    }

    /**
     * Set the error property: Document Error.
     *
     * @param error the error value to set.
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse setError(TextAnalyticsError error) {
        this.error = error;
        return this;
    }
}
