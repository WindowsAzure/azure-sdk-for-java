// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the getProperties operation.
 */
public final class DirectorysGetPropertiesResponse extends ResponseBase<DirectoryGetPropertiesHeaders, Void> {
    /**
     * Creates an instance of DirectorysGetPropertiesResponse.
     *
     * @param request the request which resulted in this DirectorysGetPropertiesResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public DirectorysGetPropertiesResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, DirectoryGetPropertiesHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
