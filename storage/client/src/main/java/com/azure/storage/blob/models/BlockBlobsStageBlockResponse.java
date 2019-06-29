// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the stageBlock operation.
 */
public final class BlockBlobsStageBlockResponse extends ResponseBase<BlockBlobStageBlockHeaders, Void> {
    /**
     * Creates an instance of BlockBlobsStageBlockResponse.
     *
     * @param request the request which resulted in this BlockBlobsStageBlockResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public BlockBlobsStageBlockResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, BlockBlobStageBlockHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
