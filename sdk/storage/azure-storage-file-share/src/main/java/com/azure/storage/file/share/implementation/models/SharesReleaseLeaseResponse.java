// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the releaseLease operation. */
public final class SharesReleaseLeaseResponse extends ResponseBase<SharesReleaseLeaseHeaders, Void> {
    /**
     * Creates an instance of SharesReleaseLeaseResponse.
     *
     * @param request the request which resulted in this SharesReleaseLeaseResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public SharesReleaseLeaseResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            Void value,
            SharesReleaseLeaseHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
