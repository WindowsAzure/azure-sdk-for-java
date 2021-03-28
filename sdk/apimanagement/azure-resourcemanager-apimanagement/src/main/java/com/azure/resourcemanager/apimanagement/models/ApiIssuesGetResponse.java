// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.apimanagement.fluent.models.IssueContractInner;

/** Contains all response data for the get operation. */
public final class ApiIssuesGetResponse extends ResponseBase<ApiIssuesGetHeaders, IssueContractInner> {
    /**
     * Creates an instance of ApiIssuesGetResponse.
     *
     * @param request the request which resulted in this ApiIssuesGetResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ApiIssuesGetResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        IssueContractInner value,
        ApiIssuesGetHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public IssueContractInner getValue() {
        return super.getValue();
    }
}
