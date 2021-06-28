// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.storagesync.fluent.models.PrivateEndpointConnectionInner;

/** Contains all response data for the create operation. */
public final class PrivateEndpointConnectionsCreateResponse
    extends ResponseBase<PrivateEndpointConnectionsCreateHeaders, PrivateEndpointConnectionInner> {
    /**
     * Creates an instance of PrivateEndpointConnectionsCreateResponse.
     *
     * @param request the request which resulted in this PrivateEndpointConnectionsCreateResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public PrivateEndpointConnectionsCreateResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        PrivateEndpointConnectionInner value,
        PrivateEndpointConnectionsCreateHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public PrivateEndpointConnectionInner getValue() {
        return super.getValue();
    }
}
