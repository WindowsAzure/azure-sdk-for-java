// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.fluidrelay.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.fluidrelay.fluent.models.FluidRelayServerKeysInner;

/** Contains all response data for the regenerateKey operation. */
public final class FluidRelayServersRegenerateKeyResponse
    extends ResponseBase<FluidRelayServersRegenerateKeyHeaders, FluidRelayServerKeysInner> {
    /**
     * Creates an instance of FluidRelayServersRegenerateKeyResponse.
     *
     * @param request the request which resulted in this FluidRelayServersRegenerateKeyResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public FluidRelayServersRegenerateKeyResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        FluidRelayServerKeysInner value,
        FluidRelayServersRegenerateKeyHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public FluidRelayServerKeysInner getValue() {
        return super.getValue();
    }
}
