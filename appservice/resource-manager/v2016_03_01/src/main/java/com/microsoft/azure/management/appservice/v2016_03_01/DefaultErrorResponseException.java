/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import com.microsoft.rest.RestException;
import okhttp3.ResponseBody;
import retrofit2.Response;

/**
 * Exception thrown for an invalid response with DefaultErrorResponse
 * information.
 */
public class DefaultErrorResponseException extends RestException {
    /**
     * Initializes a new instance of the DefaultErrorResponseException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param response the HTTP response
     */
    public DefaultErrorResponseException(final String message, final Response<ResponseBody> response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the DefaultErrorResponseException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param response the HTTP response
     * @param body the deserialized response body
     */
    public DefaultErrorResponseException(final String message, final Response<ResponseBody> response, final DefaultErrorResponse body) {
        super(message, response, body);
    }

    @Override
    public DefaultErrorResponse body() {
        return (DefaultErrorResponse) super.body();
    }
}
