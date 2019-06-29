// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.queue.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import java.util.List;

/**
 * Contains all response data for the getAccessPolicy operation.
 */
public final class QueuesGetAccessPolicyResponse extends ResponseBase<QueueGetAccessPolicyHeaders, List<SignedIdentifier>> {
    /**
     * Creates an instance of QueuesGetAccessPolicyResponse.
     *
     * @param request the request which resulted in this QueuesGetAccessPolicyResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public QueuesGetAccessPolicyResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, List<SignedIdentifier> value, QueueGetAccessPolicyHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public List<SignedIdentifier> value() {
        return super.value();
    }
}
