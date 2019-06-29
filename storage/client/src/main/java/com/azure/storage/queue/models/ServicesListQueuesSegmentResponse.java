// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.queue.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the listQueuesSegment operation.
 */
public final class ServicesListQueuesSegmentResponse extends ResponseBase<ServiceListQueuesSegmentHeaders, ListQueuesSegmentResponse> {
    /**
     * Creates an instance of ServicesListQueuesSegmentResponse.
     *
     * @param request the request which resulted in this ServicesListQueuesSegmentResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ServicesListQueuesSegmentResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, ListQueuesSegmentResponse value, ServiceListQueuesSegmentHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public ListQueuesSegmentResponse value() {
        return super.value();
    }
}
