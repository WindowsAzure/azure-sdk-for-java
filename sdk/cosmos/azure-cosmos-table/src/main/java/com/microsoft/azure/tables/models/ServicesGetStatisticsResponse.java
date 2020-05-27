package com.microsoft.azure.tables.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the getStatistics operation. */
public final class ServicesGetStatisticsResponse extends ResponseBase<ServicesGetStatisticsHeaders, TableServiceStats> {
    /**
     * Creates an instance of ServicesGetStatisticsResponse.
     *
     * @param request the request which resulted in this ServicesGetStatisticsResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ServicesGetStatisticsResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            TableServiceStats value,
            ServicesGetStatisticsHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public TableServiceStats getValue() {
        return super.getValue();
    }
}
