package com.microsoft.azure.tables.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the setProperties operation. */
public final class ServicesSetPropertiesResponse extends ResponseBase<ServicesSetPropertiesHeaders, Void> {
    /**
     * Creates an instance of ServicesSetPropertiesResponse.
     *
     * @param request the request which resulted in this ServicesSetPropertiesResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ServicesSetPropertiesResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            Void value,
            ServicesSetPropertiesHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
