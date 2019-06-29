// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.queue.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the delete operation.
 */
public final class MessageIdsDeleteResponse extends ResponseBase<MessageIdDeleteHeaders, Void> {
    /**
     * Creates an instance of MessageIdsDeleteResponse.
     *
     * @param request the request which resulted in this MessageIdsDeleteResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public MessageIdsDeleteResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, MessageIdDeleteHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
