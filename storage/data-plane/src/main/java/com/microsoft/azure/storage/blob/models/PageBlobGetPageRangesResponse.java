// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.storage.blob.models;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.http.HttpRequest;

import java.util.Map;

/**
 * Contains all response data for the getPageRanges operation.
 */
public final class PageBlobGetPageRangesResponse extends RestResponse<PageBlobGetPageRangesHeaders, PageList> {
    /**
     * Creates an instance of PageBlobGetPageRangesResponse.
     *
     * @param request the request which resulted in this {response.Name}.
     * @param statusCode the status code of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param body the deserialized body of the HTTP response.
     */
    public PageBlobGetPageRangesResponse(HttpRequest request, int statusCode, PageBlobGetPageRangesHeaders headers, Map<String, String> rawHeaders, PageList body) {
        super(request, statusCode, headers, rawHeaders, body);
    }

    /**
     * @return the deserialized response headers.
     */
    @Override
    public PageBlobGetPageRangesHeaders headers() {
        return super.headers();
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public PageList body() {
        return super.body();
    }
}
