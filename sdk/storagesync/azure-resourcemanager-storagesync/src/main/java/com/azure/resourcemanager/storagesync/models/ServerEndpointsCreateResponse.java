// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.storagesync.fluent.models.ServerEndpointInner;

/** Contains all response data for the create operation. */
public final class ServerEndpointsCreateResponse
    extends ResponseBase<ServerEndpointsCreateHeaders, ServerEndpointInner> {
    /**
     * Creates an instance of ServerEndpointsCreateResponse.
     *
     * @param request the request which resulted in this ServerEndpointsCreateResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ServerEndpointsCreateResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        ServerEndpointInner value,
        ServerEndpointsCreateHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public ServerEndpointInner getValue() {
        return super.getValue();
    }
}
