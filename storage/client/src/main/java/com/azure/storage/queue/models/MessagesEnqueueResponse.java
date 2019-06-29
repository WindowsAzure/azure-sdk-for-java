// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.queue.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import java.util.List;

/**
 * Contains all response data for the enqueue operation.
 */
public final class MessagesEnqueueResponse extends ResponseBase<MessagesEnqueueHeaders, List<EnqueuedMessage>> {
    /**
     * Creates an instance of MessagesEnqueueResponse.
     *
     * @param request the request which resulted in this MessagesEnqueueResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public MessagesEnqueueResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, List<EnqueuedMessage> value, MessagesEnqueueHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public List<EnqueuedMessage> value() {
        return super.value();
    }
}
