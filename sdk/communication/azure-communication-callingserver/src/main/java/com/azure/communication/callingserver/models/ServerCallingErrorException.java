// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver.models;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpResponse;

/**
 * Exception thrown on server calling specific errors.
 */
public final class ServerCallingErrorException extends HttpResponseException {
    /**
     * Initializes a new instance of the ServerCallingErrorException class.
     *
     * @param message the exception message or the response content if a message is
     * not available.
     * @param response the HTTP response.
     */
    public ServerCallingErrorException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the ServerCallingErrorException class.
     *
     * @param message the exception message or the response content if a message is
     * not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public ServerCallingErrorException(String message, HttpResponse response, ServerCallingError value) {
        super(message, response, value);
    }

    @Override
    public ServerCallingError getValue() {
        return (ServerCallingError) super.getValue();
    }
}
