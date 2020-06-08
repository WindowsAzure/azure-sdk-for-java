// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.fluent.inner;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.keyvault.models.PrivateEndpointConnectionsDeleteHeaders;

/** Contains all response data for the delete operation. */
public final class PrivateEndpointConnectionsDeleteResponse
    extends ResponseBase<PrivateEndpointConnectionsDeleteHeaders, PrivateEndpointConnectionInner> {
    /**
     * Creates an instance of PrivateEndpointConnectionsDeleteResponse.
     *
     * @param request the request which resulted in this PrivateEndpointConnectionsDeleteResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public PrivateEndpointConnectionsDeleteResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        PrivateEndpointConnectionInner value,
        PrivateEndpointConnectionsDeleteHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public PrivateEndpointConnectionInner getValue() {
        return super.getValue();
    }
}
