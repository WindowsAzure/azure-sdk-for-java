package com.microsoft.azure.tables.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the mergeEntity operation. */
public final class TablesMergeEntityResponse extends ResponseBase<TablesMergeEntityHeaders, Void> {
    /**
     * Creates an instance of TablesMergeEntityResponse.
     *
     * @param request the request which resulted in this TablesMergeEntityResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public TablesMergeEntityResponse(
            HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, TablesMergeEntityHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
