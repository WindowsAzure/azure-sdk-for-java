// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the listContainersSegment operation.
 */
public final class ServicesListContainersSegmentResponse extends ResponseBase<ServiceListContainersSegmentHeaders, ListContainersSegmentResponse> {
    /**
     * Creates an instance of ServicesListContainersSegmentResponse.
     *
     * @param request the request which resulted in this ServicesListContainersSegmentResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ServicesListContainersSegmentResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, ListContainersSegmentResponse value, ServiceListContainersSegmentHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public ListContainersSegmentResponse value() {
        return super.value();
    }
}
