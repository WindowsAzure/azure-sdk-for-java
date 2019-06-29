// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.queue.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the setMetadata operation.
 */
public final class QueuesSetMetadataResponse extends ResponseBase<QueueSetMetadataHeaders, Void> {
    /**
     * Creates an instance of QueuesSetMetadataResponse.
     *
     * @param request the request which resulted in this QueuesSetMetadataResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public QueuesSetMetadataResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, QueueSetMetadataHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
