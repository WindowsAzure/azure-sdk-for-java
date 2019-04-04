/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.storage.blob.models;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.http.HttpRequest;
import java.util.Map;

/**
 * Contains all response data for the getPageRangesDiff operation.
 */
public final class PageBlobGetPageRangesDiffResponse extends RestResponse<PageBlobGetPageRangesDiffHeaders, PageList> {
    /**
     * Creates an instance of PageBlobGetPageRangesDiffResponse.
     *
     * @param request the request which resulted in this {response.Name}.
     * @param statusCode the status code of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param body the deserialized body of the HTTP response.
     */
    public PageBlobGetPageRangesDiffResponse(HttpRequest request, int statusCode, PageBlobGetPageRangesDiffHeaders headers, Map<String, String> rawHeaders, PageList body) {
        super(request, statusCode, headers, rawHeaders, body);
    }

    /**
     * @return the deserialized response headers.
     */
    @Override
    public PageBlobGetPageRangesDiffHeaders headers() {
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
