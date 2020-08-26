// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.digitaltwins.core.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the getById operation. */
public final class DigitalTwinsGetByIdResponse extends ResponseBase<DigitalTwinsGetByIdHeaders, Object> {
    /**
     * Creates an instance of DigitalTwinsGetByIdResponse.
     *
     * @param request the request which resulted in this DigitalTwinsGetByIdResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public DigitalTwinsGetByIdResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            Object value,
            DigitalTwinsGetByIdHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public Object getValue() {
        return super.getValue();
    }
}
