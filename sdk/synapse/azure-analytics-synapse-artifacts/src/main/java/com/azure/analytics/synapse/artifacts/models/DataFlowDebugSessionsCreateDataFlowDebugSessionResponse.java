// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the createDataFlowDebugSession operation. */
public final class DataFlowDebugSessionsCreateDataFlowDebugSessionResponse
        extends ResponseBase<
                DataFlowDebugSessionsCreateDataFlowDebugSessionHeaders, CreateDataFlowDebugSessionResponse> {
    /**
     * Creates an instance of DataFlowDebugSessionsCreateDataFlowDebugSessionResponse.
     *
     * @param request the request which resulted in this DataFlowDebugSessionsCreateDataFlowDebugSessionResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public DataFlowDebugSessionsCreateDataFlowDebugSessionResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            CreateDataFlowDebugSessionResponse value,
            DataFlowDebugSessionsCreateDataFlowDebugSessionHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public CreateDataFlowDebugSessionResponse getValue() {
        return super.getValue();
    }
}
