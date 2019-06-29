// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the startCopy operation.
 */
public final class FilesStartCopyResponse extends ResponseBase<FileStartCopyHeaders, Void> {
    /**
     * Creates an instance of FilesStartCopyResponse.
     *
     * @param request the request which resulted in this FilesStartCopyResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public FilesStartCopyResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, FileStartCopyHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
