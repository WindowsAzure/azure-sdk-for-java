// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.common.exception;

import com.azure.common.http.HttpResponse;

/**
 * The exception thrown when received unsuccessful response with http status code (e.g. 3XX, 4XX, 5XX) from the service request.
 *
 * @see ResourceModifiedException
 * @see ResourceExistsException
 * @see ClientAuthenticationException
 * @see ResourceNotFoundException
 * @see ServerException
 * @see TooManyRedirectsException
 */
public class HttpRequestException extends ServiceRequestException {

    /**
     * Information about the associated HTTP response.
     */
    private HttpResponse response;

    /**
     * Initializes a new instance of the HttpRequestException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param response the HTTP response
     */
    public HttpRequestException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the HttpRequestException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param response the HTTP response
     * @param value the deserialized response value
     */
    public HttpRequestException(String message, HttpResponse response, Object value) {
        super(message, value);
        this.response = response;
    }

    /**
     * Initializes a new instance of the HttpRequestException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param response the HTTP response
     * @param cause the Throwable which caused the creation of this HttpRequestException
     */
    public HttpRequestException(String message, HttpResponse response, Throwable cause) {
        super(message, cause);
        this.response = response;
    }


    /**
     * @return information about the associated HTTP response
     */
    public HttpResponse response() {
        return response;
    }

}
