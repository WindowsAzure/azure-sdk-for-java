package com.microsoft.azure.tables.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the create operation. */
public final class TablesCreateResponse extends ResponseBase<TablesCreateHeaders, TableResponse> {
    /**
     * Creates an instance of TablesCreateResponse.
     *
     * @param request the request which resulted in this TablesCreateResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public TablesCreateResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            TableResponse value,
            TablesCreateHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public TableResponse getValue() {
        return super.getValue();
    }
}
