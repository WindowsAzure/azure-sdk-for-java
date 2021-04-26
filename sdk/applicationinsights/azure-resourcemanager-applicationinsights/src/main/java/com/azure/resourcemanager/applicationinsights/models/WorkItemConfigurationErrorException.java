// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.http.HttpResponse;
import com.azure.core.management.exception.ManagementException;

/** Exception thrown for an invalid response with WorkItemConfigurationError information. */
public final class WorkItemConfigurationErrorException extends ManagementException {
    /**
     * Initializes a new instance of the WorkItemConfigurationErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public WorkItemConfigurationErrorException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the WorkItemConfigurationErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public WorkItemConfigurationErrorException(
        String message, HttpResponse response, WorkItemConfigurationError value) {
        super(message, response, value);
    }

    @Override
    public WorkItemConfigurationError getValue() {
        return (WorkItemConfigurationError) super.getValue();
    }
}
