/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.microsoft.azure.management.billing.v2019_10_01_preview.Invoice;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2019_10_01_preview.Amount;
import java.util.List;
import com.microsoft.azure.management.billing.v2019_10_01_preview.Document;
import org.joda.time.DateTime;
import com.microsoft.azure.management.billing.v2019_10_01_preview.PaymentProperties;
import com.microsoft.azure.management.billing.v2019_10_01_preview.InvoiceStatus;

class InvoiceImpl extends WrapperImpl<InvoiceInner> implements Invoice {
    private final BillingManager manager;
    InvoiceImpl(InvoiceInner inner, BillingManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public Amount amountDue() {
        return this.inner().amountDue();
    }

    @Override
    public Amount azurePrepaymentApplied() {
        return this.inner().azurePrepaymentApplied();
    }

    @Override
    public Amount billedAmount() {
        return this.inner().billedAmount();
    }

    @Override
    public String billingProfileDisplayName() {
        return this.inner().billingProfileDisplayName();
    }

    @Override
    public String billingProfileId() {
        return this.inner().billingProfileId();
    }

    @Override
    public Amount creditAmount() {
        return this.inner().creditAmount();
    }

    @Override
    public List<Document> documents() {
        return this.inner().documents();
    }

    @Override
    public DateTime dueDate() {
        return this.inner().dueDate();
    }

    @Override
    public Amount freeAzureCreditApplied() {
        return this.inner().freeAzureCreditApplied();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public DateTime invoiceDate() {
        return this.inner().invoiceDate();
    }

    @Override
    public DateTime invoicePeriodEndDate() {
        return this.inner().invoicePeriodEndDate();
    }

    @Override
    public DateTime invoicePeriodStartDate() {
        return this.inner().invoicePeriodStartDate();
    }

    @Override
    public Object invoiceType() {
        return this.inner().invoiceType();
    }

    @Override
    public Boolean isMonthlyInvoice() {
        return this.inner().isMonthlyInvoice();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<PaymentProperties> payments() {
        return this.inner().payments();
    }

    @Override
    public String purchaseOrderNumber() {
        return this.inner().purchaseOrderNumber();
    }

    @Override
    public InvoiceStatus status() {
        return this.inner().status();
    }

    @Override
    public String subscriptionId() {
        return this.inner().subscriptionId();
    }

    @Override
    public Amount subTotal() {
        return this.inner().subTotal();
    }

    @Override
    public Amount taxAmount() {
        return this.inner().taxAmount();
    }

    @Override
    public Amount totalAmount() {
        return this.inner().totalAmount();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
