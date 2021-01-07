// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.saas.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.saas.fluent.models.SaasResourceInner;

/** Contains all response data for the update operation. */
public final class SaasSubscriptionLevelsUpdateResponse
    extends ResponseBase<SaasSubscriptionLevelsUpdateHeaders, SaasResourceInner> {
    /**
     * Creates an instance of SaasSubscriptionLevelsUpdateResponse.
     *
     * @param request the request which resulted in this SaasSubscriptionLevelsUpdateResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public SaasSubscriptionLevelsUpdateResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        SaasResourceInner value,
        SaasSubscriptionLevelsUpdateHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public SaasResourceInner getValue() {
        return super.getValue();
    }
}
