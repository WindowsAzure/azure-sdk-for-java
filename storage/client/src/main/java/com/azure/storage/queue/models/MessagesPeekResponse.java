// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.queue.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import java.util.List;

/**
 * Contains all response data for the peek operation.
 */
public final class MessagesPeekResponse extends ResponseBase<MessagesPeekHeaders, List<PeekedMessage>> {
    /**
     * Creates an instance of MessagesPeekResponse.
     *
     * @param request the request which resulted in this MessagesPeekResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public MessagesPeekResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, List<PeekedMessage> value, MessagesPeekHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public List<PeekedMessage> value() {
        return super.value();
    }
}
