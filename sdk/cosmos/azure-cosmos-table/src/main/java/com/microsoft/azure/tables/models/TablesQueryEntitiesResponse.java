package com.microsoft.azure.tables.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the queryEntities operation. */
public final class TablesQueryEntitiesResponse
        extends ResponseBase<TablesQueryEntitiesHeaders, TableEntityQueryResponse> {
    /**
     * Creates an instance of TablesQueryEntitiesResponse.
     *
     * @param request the request which resulted in this TablesQueryEntitiesResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public TablesQueryEntitiesResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            TableEntityQueryResponse value,
            TablesQueryEntitiesHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public TableEntityQueryResponse getValue() {
        return super.getValue();
    }
}
