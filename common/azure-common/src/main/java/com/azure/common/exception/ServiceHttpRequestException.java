// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.common.exception;

import com.azure.common.http.HttpResponse;

/**
 * The exception thrown when received unsuccessful response with http status code (e.g. 4XX, 5XX) from the service request.
 *
 * @see ClientRequestException
 * @see ServerException
 * @see TooManyRedirectsException
 * @see TooManyRetriesException
 */
public class ServiceHttpRequestException extends ServiceRequestException {

    /**
     * Initializes a new instance of the ServiceHttpRequestException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param response the HTTP response
     */
    public ServiceHttpRequestException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the ServiceHttpRequestException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param response the HTTP response
     * @param value the deserialized response value
     */
    public ServiceHttpRequestException(String message, HttpResponse response, Object value) {
        super(message, response, value);
    }

    /**
     * Initializes a new instance of the ServiceHttpRequestException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param response the HTTP response
     * @param cause the Throwable which caused the creation of this ServiceHttpRequestException
     */
    public ServiceHttpRequestException(String message, HttpResponse response, Throwable cause) {
        super(message, response, cause);
    }
}
