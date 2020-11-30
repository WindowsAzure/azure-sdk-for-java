// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the executeCommand operation. */
public final class DataFlowDebugSessionsExecuteCommandResponse
        extends ResponseBase<DataFlowDebugSessionsExecuteCommandHeaders, DataFlowDebugCommandResponse> {
    /**
     * Creates an instance of DataFlowDebugSessionsExecuteCommandResponse.
     *
     * @param request the request which resulted in this DataFlowDebugSessionsExecuteCommandResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public DataFlowDebugSessionsExecuteCommandResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            DataFlowDebugCommandResponse value,
            DataFlowDebugSessionsExecuteCommandHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public DataFlowDebugCommandResponse getValue() {
        return super.getValue();
    }
}
