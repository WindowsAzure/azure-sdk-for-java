// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.http.HttpResponse;
import com.azure.core.management.exception.ManagementException;

/** Exception thrown for an invalid response with ApiError information. */
public final class ApiErrorException extends ManagementException {
    /**
     * Initializes a new instance of the ApiErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public ApiErrorException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the ApiErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public ApiErrorException(String message, HttpResponse response, ApiError value) {
        super(message, response, value);
    }

    @Override
    public ApiError getValue() {
        return (ApiError) super.getValue();
    }
}
