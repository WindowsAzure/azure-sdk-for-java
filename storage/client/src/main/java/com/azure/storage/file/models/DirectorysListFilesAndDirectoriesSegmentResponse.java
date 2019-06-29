// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/**
 * Contains all response data for the listFilesAndDirectoriesSegment operation.
 */
public final class DirectorysListFilesAndDirectoriesSegmentResponse extends ResponseBase<DirectoryListFilesAndDirectoriesSegmentHeaders, ListFilesAndDirectoriesSegmentResponse> {
    /**
     * Creates an instance of DirectorysListFilesAndDirectoriesSegmentResponse.
     *
     * @param request the request which resulted in this DirectorysListFilesAndDirectoriesSegmentResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public DirectorysListFilesAndDirectoriesSegmentResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, ListFilesAndDirectoriesSegmentResponse value, DirectoryListFilesAndDirectoriesSegmentHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public ListFilesAndDirectoriesSegmentResponse value() {
        return super.value();
    }
}
