// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.storage.blob.models.BlobUndeleteHeaders;

/**
 * Contains all response data for the undelete operation.
 */
public final class BlobsUndeleteResponse extends ResponseBase<com.azure.storage.blob.models.BlobUndeleteHeaders, Void> {
    /**
     * Creates an instance of BlobsUndeleteResponse.
     *
     * @param request the request which resulted in this BlobsUndeleteResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public BlobsUndeleteResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, BlobUndeleteHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
