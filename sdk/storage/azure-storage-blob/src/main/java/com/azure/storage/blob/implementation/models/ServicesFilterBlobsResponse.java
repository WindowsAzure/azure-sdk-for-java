// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the filterBlobs operation. */
public final class ServicesFilterBlobsResponse extends ResponseBase<ServicesFilterBlobsHeaders, FilterBlobSegment> {
    /**
     * Creates an instance of ServicesFilterBlobsResponse.
     *
     * @param request the request which resulted in this ServicesFilterBlobsResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ServicesFilterBlobsResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            FilterBlobSegment value,
            ServicesFilterBlobsHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public FilterBlobSegment getValue() {
        return super.getValue();
    }
}
