// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.billing.fluent.models.DownloadUrlInner;

/** Contains all response data for the downloadBillingSubscriptionInvoice operation. */
public final class InvoicesDownloadBillingSubscriptionInvoiceResponse
    extends ResponseBase<InvoicesDownloadBillingSubscriptionInvoiceHeaders, DownloadUrlInner> {
    /**
     * Creates an instance of InvoicesDownloadBillingSubscriptionInvoiceResponse.
     *
     * @param request the request which resulted in this InvoicesDownloadBillingSubscriptionInvoiceResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public InvoicesDownloadBillingSubscriptionInvoiceResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        DownloadUrlInner value,
        InvoicesDownloadBillingSubscriptionInvoiceHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public DownloadUrlInner getValue() {
        return super.getValue();
    }
}
