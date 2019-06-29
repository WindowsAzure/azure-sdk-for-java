// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.blob.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.storage.blob.models.ContainerGetAccessPolicyHeaders;
import com.azure.storage.blob.models.SignedIdentifier;
import java.util.List;

/**
 * Contains all response data for the getAccessPolicy operation.
 */
public final class ContainersGetAccessPolicyResponse extends ResponseBase<com.azure.storage.blob.models.ContainerGetAccessPolicyHeaders, List<com.azure.storage.blob.models.SignedIdentifier>> {
    /**
     * Creates an instance of ContainersGetAccessPolicyResponse.
     *
     * @param request the request which resulted in this ContainersGetAccessPolicyResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ContainersGetAccessPolicyResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, List<com.azure.storage.blob.models.SignedIdentifier> value, ContainerGetAccessPolicyHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public List<SignedIdentifier> value() {
        return super.value();
    }
}
