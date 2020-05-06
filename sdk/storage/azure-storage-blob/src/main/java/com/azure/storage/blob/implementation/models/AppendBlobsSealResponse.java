// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the seal operation.
 */
public final class AppendBlobsSealResponse extends ResponseBase<AppendBlobSealHeaders, Void> {
    /**
     * Creates an instance of AppendBlobsSealResponse.
     *
     * @param request the request which resulted in this AppendBlobsSealResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public AppendBlobsSealResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, AppendBlobSealHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
