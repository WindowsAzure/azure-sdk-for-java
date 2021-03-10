// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import java.util.List;

/** Contains all response data for the dequeue operation. */
public final class MessagesDequeueResponse
        extends ResponseBase<MessagesDequeueHeaders, List<QueueMessageItemInternal>> {
    /**
     * Creates an instance of MessagesDequeueResponse.
     *
     * @param request the request which resulted in this MessagesDequeueResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public MessagesDequeueResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            List<QueueMessageItemInternal> value,
            MessagesDequeueHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public List<QueueMessageItemInternal> getValue() {
        return super.getValue();
    }
}
