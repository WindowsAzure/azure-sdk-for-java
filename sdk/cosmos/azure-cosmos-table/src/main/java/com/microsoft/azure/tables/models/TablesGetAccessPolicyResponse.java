package com.microsoft.azure.tables.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import java.util.List;

/** Contains all response data for the getAccessPolicy operation. */
public final class TablesGetAccessPolicyResponse
        extends ResponseBase<TablesGetAccessPolicyHeaders, List<SignedIdentifier>> {
    /**
     * Creates an instance of TablesGetAccessPolicyResponse.
     *
     * @param request the request which resulted in this TablesGetAccessPolicyResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public TablesGetAccessPolicyResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            List<SignedIdentifier> value,
            TablesGetAccessPolicyHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public List<SignedIdentifier> getValue() {
        return super.getValue();
    }
}
