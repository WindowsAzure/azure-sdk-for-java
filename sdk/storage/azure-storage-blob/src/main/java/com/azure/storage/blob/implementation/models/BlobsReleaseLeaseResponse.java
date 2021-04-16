// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the releaseLease operation. */
public final class BlobsReleaseLeaseResponse extends ResponseBase<BlobsReleaseLeaseHeaders, Void> {
    /**
     * Creates an instance of BlobsReleaseLeaseResponse.
     *
     * @param request the request which resulted in this BlobsReleaseLeaseResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public BlobsReleaseLeaseResponse(
            HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, BlobsReleaseLeaseHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
