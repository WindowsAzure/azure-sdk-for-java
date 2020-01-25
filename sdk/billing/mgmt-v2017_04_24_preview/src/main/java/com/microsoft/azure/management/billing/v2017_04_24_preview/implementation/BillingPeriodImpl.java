/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.billing.v2017_04_24_preview.implementation;

import com.microsoft.azure.management.billing.v2017_04_24_preview.BillingPeriod;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import org.joda.time.LocalDate;
import java.util.List;

class BillingPeriodImpl extends IndexableRefreshableWrapperImpl<BillingPeriod, BillingPeriodInner> implements BillingPeriod {
    private String billingPeriodName;
    private final BillingManager manager;

    BillingPeriodImpl(BillingPeriodInner inner,  BillingManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.billingPeriodName = IdParsingUtils.getValueFromIdByName(inner.id(), "billingPeriods");
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<BillingPeriodInner> getInnerAsync() {
        BillingPeriodsInner client = this.manager().inner().billingPeriods();
        return client.getAsync(this.billingPeriodName);
    }



    @Override
    public LocalDate billingPeriodEndDate() {
        return this.inner().billingPeriodEndDate();
    }

    @Override
    public LocalDate billingPeriodStartDate() {
        return this.inner().billingPeriodStartDate();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public List<String> invoiceIds() {
        return this.inner().invoiceIds();
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
