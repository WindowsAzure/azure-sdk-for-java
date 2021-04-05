// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.apimanagement.fluent.models.GroupContractInner;

/** Contains all response data for the get operation. */
public final class GroupsGetResponse extends ResponseBase<GroupsGetHeaders, GroupContractInner> {
    /**
     * Creates an instance of GroupsGetResponse.
     *
     * @param request the request which resulted in this GroupsGetResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public GroupsGetResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        GroupContractInner value,
        GroupsGetHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public GroupContractInner getValue() {
        return super.getValue();
    }
}
