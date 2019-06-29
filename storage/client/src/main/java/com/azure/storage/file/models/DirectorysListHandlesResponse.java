// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the listHandles operation.
 */
public final class DirectorysListHandlesResponse extends ResponseBase<DirectoryListHandlesHeaders, ListHandlesResponse> {
    /**
     * Creates an instance of DirectorysListHandlesResponse.
     *
     * @param request the request which resulted in this DirectorysListHandlesResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public DirectorysListHandlesResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, ListHandlesResponse value, DirectoryListHandlesHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public ListHandlesResponse value() {
        return super.value();
    }
}
