// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.management.resources.DeploymentsWhatIfHeaders;

/** Contains all response data for the whatIf operation. */
public final class DeploymentsWhatIfResponse
    extends ResponseBase<DeploymentsWhatIfHeaders, WhatIfOperationResultInner> {
    /**
     * Creates an instance of DeploymentsWhatIfResponse.
     *
     * @param request the request which resulted in this DeploymentsWhatIfResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public DeploymentsWhatIfResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        WhatIfOperationResultInner value,
        DeploymentsWhatIfHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public WhatIfOperationResultInner getValue() {
        return super.getValue();
    }
}
