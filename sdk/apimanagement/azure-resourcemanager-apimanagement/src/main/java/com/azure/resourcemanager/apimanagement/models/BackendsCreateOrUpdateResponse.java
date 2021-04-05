// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.apimanagement.fluent.models.BackendContractInner;

/** Contains all response data for the createOrUpdate operation. */
public final class BackendsCreateOrUpdateResponse
    extends ResponseBase<BackendsCreateOrUpdateHeaders, BackendContractInner> {
    /**
     * Creates an instance of BackendsCreateOrUpdateResponse.
     *
     * @param request the request which resulted in this BackendsCreateOrUpdateResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public BackendsCreateOrUpdateResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        BackendContractInner value,
        BackendsCreateOrUpdateHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public BackendContractInner getValue() {
        return super.getValue();
    }
}
