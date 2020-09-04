// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.learn.appconfig.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the getLabels operation. */
public final class GetLabelsResponse extends ResponseBase<GetLabelsHeaders, LabelListResult> {
    /**
     * Creates an instance of GetLabelsResponse.
     *
     * @param request the request which resulted in this GetLabelsResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public GetLabelsResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            LabelListResult value,
            GetLabelsHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public LabelListResult getValue() {
        return super.getValue();
    }
}
