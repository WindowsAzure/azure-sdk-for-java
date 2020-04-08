// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.storage.blob.models.BlobTags;

/**
 * Contains all response data for the getTags operation.
 */
public final class BlobsGetTagsResponse extends ResponseBase<BlobGetTagsHeaders, BlobTags> {
    /**
     * Creates an instance of BlobsGetTagsResponse.
     *
     * @param request the request which resulted in this BlobsGetTagsResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public BlobsGetTagsResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, BlobTags value, BlobGetTagsHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public BlobTags getValue() {
        return super.getValue();
    }
}
