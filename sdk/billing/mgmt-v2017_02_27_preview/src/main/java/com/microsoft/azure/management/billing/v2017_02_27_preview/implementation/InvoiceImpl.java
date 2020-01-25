/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.billing.v2017_02_27_preview.implementation;

import com.microsoft.azure.management.billing.v2017_02_27_preview.Invoice;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.billing.v2017_02_27_preview.DownloadUrl;
import org.joda.time.LocalDate;

class InvoiceImpl extends IndexableRefreshableWrapperImpl<Invoice, InvoiceInner> implements Invoice {
    private String invoiceName;
    private final BillingManager manager;

    InvoiceImpl(InvoiceInner inner,  BillingManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.invoiceName = IdParsingUtils.getValueFromIdByName(inner.id(), "invoices");
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<InvoiceInner> getInnerAsync() {
        InvoicesInner client = this.manager().inner().invoices();
        return client.getAsync(this.invoiceName);
    }



    @Override
    public DownloadUrl downloadUrl() {
        return this.inner().downloadUrl();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public LocalDate invoicePeriodEndDate() {
        return this.inner().invoicePeriodEndDate();
    }

    @Override
    public LocalDate invoicePeriodStartDate() {
        return this.inner().invoicePeriodStartDate();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
