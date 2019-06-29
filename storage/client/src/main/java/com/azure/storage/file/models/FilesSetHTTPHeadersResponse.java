// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the setHTTPHeaders operation.
 */
public final class FilesSetHTTPHeadersResponse extends ResponseBase<FileSetHTTPHeadersHeaders, Void> {
    /**
     * Creates an instance of FilesSetHTTPHeadersResponse.
     *
     * @param request the request which resulted in this FilesSetHTTPHeadersResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public FilesSetHTTPHeadersResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, FileSetHTTPHeadersHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
