// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the listSharesSegment operation.
 */
public final class ServicesListSharesSegmentResponse extends ResponseBase<ServiceListSharesSegmentHeaders, ListSharesResponse> {
    /**
     * Creates an instance of ServicesListSharesSegmentResponse.
     *
     * @param request the request which resulted in this ServicesListSharesSegmentResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ServicesListSharesSegmentResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, ListSharesResponse value, ServiceListSharesSegmentHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public ListSharesResponse value() {
        return super.value();
    }
}
