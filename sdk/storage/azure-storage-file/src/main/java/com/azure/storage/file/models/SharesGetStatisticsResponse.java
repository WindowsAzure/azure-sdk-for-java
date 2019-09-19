// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import java.util.Map;

/**
 * Contains all response data for the getStatistics operation.
 */
public final class SharesGetStatisticsResponse extends ResponseBase<ShareGetStatisticsHeaders, ShareStats> {
    /**
     * Creates an instance of SharesGetStatisticsResponse.
     *
     * @param request the request which resulted in this SharesGetStatisticsResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public SharesGetStatisticsResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, ShareStats value, ShareGetStatisticsHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public ShareStats value() {
        return super.value();
    }
}
