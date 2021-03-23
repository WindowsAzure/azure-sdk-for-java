// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.apimanagement.fluent.models.LoggerContractInner;

/** Contains all response data for the get operation. */
public final class LoggersGetResponse extends ResponseBase<LoggersGetHeaders, LoggerContractInner> {
    /**
     * Creates an instance of LoggersGetResponse.
     *
     * @param request the request which resulted in this LoggersGetResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public LoggersGetResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        LoggerContractInner value,
        LoggersGetHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public LoggerContractInner getValue() {
        return super.getValue();
    }
}
