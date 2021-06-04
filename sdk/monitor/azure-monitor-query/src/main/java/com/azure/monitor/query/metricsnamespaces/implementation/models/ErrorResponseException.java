// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.metricsnamespaces.implementation.models;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpResponse;

/** Exception thrown for an invalid response with ErrorResponse information. */
public final class ErrorResponseException extends HttpResponseException {
    /**
     * Initializes a new instance of the ErrorResponseException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public ErrorResponseException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the ErrorResponseException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public ErrorResponseException(String message, HttpResponse response, ErrorResponse value) {
        super(message, response, value);
    }

    @Override
    public ErrorResponse getValue() {
        return (ErrorResponse) super.getValue();
    }
}
