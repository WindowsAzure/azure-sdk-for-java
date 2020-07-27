// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.resources.fluent.inner.WhatIfOperationResultInner;

/** Contains all response data for the whatIfAtManagementGroupScope operation. */
public final class DeploymentsWhatIfAtManagementGroupScopeResponse
    extends ResponseBase<DeploymentsWhatIfAtManagementGroupScopeHeaders, WhatIfOperationResultInner> {
    /**
     * Creates an instance of DeploymentsWhatIfAtManagementGroupScopeResponse.
     *
     * @param request the request which resulted in this DeploymentsWhatIfAtManagementGroupScopeResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public DeploymentsWhatIfAtManagementGroupScopeResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        WhatIfOperationResultInner value,
        DeploymentsWhatIfAtManagementGroupScopeHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public WhatIfOperationResultInner getValue() {
        return super.getValue();
    }
}
