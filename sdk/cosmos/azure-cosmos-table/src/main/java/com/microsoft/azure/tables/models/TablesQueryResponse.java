package com.microsoft.azure.tables.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the query operation. */
public final class TablesQueryResponse extends ResponseBase<TablesQueryHeaders, TableQueryResponse> {
    /**
     * Creates an instance of TablesQueryResponse.
     *
     * @param request the request which resulted in this TablesQueryResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public TablesQueryResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            TableQueryResponse value,
            TablesQueryHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public TableQueryResponse getValue() {
        return super.getValue();
    }
}
