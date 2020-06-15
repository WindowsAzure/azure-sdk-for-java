// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.http.HttpResponse;
import com.azure.core.management.exception.ManagementException;

/** Exception thrown for an invalid response with DefaultErrorResponseError information. */
public final class DefaultErrorResponseErrorException extends ManagementException {
    /**
     * Initializes a new instance of the DefaultErrorResponseErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public DefaultErrorResponseErrorException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the DefaultErrorResponseErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public DefaultErrorResponseErrorException(String message, HttpResponse response, DefaultErrorResponseError value) {
        super(message, response, value);
    }

    @Override
    public DefaultErrorResponseError getValue() {
        return (DefaultErrorResponseError) super.getValue();
    }
}
