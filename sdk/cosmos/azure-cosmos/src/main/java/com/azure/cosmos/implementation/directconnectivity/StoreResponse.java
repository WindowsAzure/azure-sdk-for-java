// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.directconnectivity;

import com.azure.cosmos.CosmosDiagnostics;
import com.azure.cosmos.implementation.HttpConstants;
import com.azure.cosmos.implementation.RequestTimeline;
import com.azure.cosmos.implementation.apachecommons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Used internally to represents a response from the store.
 */
public class StoreResponse {
    final static Logger LOGGER = LoggerFactory.getLogger(StoreResponse.class);
    final private int status;
    final private Map<String, String> responseHeaders;
    final private byte[] content;

    private CosmosDiagnostics cosmosDiagnostics;
    private RequestTimeline requestTimeline;

    public StoreResponse(
            int status,
            Map<String, String> headerEntries,
            byte[] content) {

        requestTimeline = RequestTimeline.empty();
        responseHeaders = headerEntries;

        this.status = status;
        this.content = content;
    }

    public int getStatus() {
        return status;
    }

    public Map<String, String> getResponseHeaders() {
        return responseHeaders;
    }

    public byte[] getResponseBody() {
        return this.content;
    }

    public long getLSN() {
        String lsnString = this.getHeaderValue(WFConstants.BackendHeaders.LSN);
        if (StringUtils.isNotEmpty(lsnString)) {
            return Long.parseLong(lsnString);
        }

        return -1;
    }

    public String getPartitionKeyRangeId() {
        return this.getHeaderValue(WFConstants.BackendHeaders.PARTITION_KEY_RANGE_ID);
    }

    public String getContinuation() {
        return this.getHeaderValue(HttpConstants.HttpHeaders.CONTINUATION);
    }

    public String getHeaderValue(String attribute) {
        if (this.responseHeaders == null) {
            return null;
        }

        return this.responseHeaders.get(attribute);
    }

    public CosmosDiagnostics getCosmosDiagnostics() {
        return cosmosDiagnostics;
    }

    StoreResponse setCosmosDiagnostics(CosmosDiagnostics cosmosDiagnostics) {
        this.cosmosDiagnostics = cosmosDiagnostics;
        return this;
    }

    void setRequestTimeline(RequestTimeline requestTimeline) {
        this.requestTimeline = requestTimeline;
    }

    RequestTimeline getRequestTimeline() {
        return this.requestTimeline;
    }

    int getSubStatusCode() {
        int subStatusCode = HttpConstants.SubStatusCodes.UNKNOWN;
        String subStatusCodeString = this.getHeaderValue(WFConstants.BackendHeaders.SUB_STATUS);
        if (StringUtils.isNotEmpty(subStatusCodeString)) {
            try {
                subStatusCode = Integer.parseInt(subStatusCodeString);
            } catch (NumberFormatException e) {
                // If value cannot be parsed as Integer, return Unknown.
            }
        }
        return subStatusCode;
    }
}
