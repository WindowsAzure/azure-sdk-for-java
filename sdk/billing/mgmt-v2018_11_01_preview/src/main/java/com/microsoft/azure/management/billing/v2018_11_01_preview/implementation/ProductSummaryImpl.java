/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.management.billing.v2018_11_01_preview.ProductSummary;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingFrequency;
import org.joda.time.DateTime;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Amount;
import com.microsoft.azure.management.billing.v2018_11_01_preview.ProductStatusType;

class ProductSummaryImpl extends WrapperImpl<ProductSummaryInner> implements ProductSummary {
    private final BillingManager manager;

    ProductSummaryImpl(ProductSummaryInner inner,  BillingManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }



    @Override
    public String availabilityId() {
        return this.inner().availabilityId();
    }

    @Override
    public BillingFrequency billingFrequency() {
        return this.inner().billingFrequency();
    }

    @Override
    public String billingProfileId() {
        return this.inner().billingProfileId();
    }

    @Override
    public String billingProfileName() {
        return this.inner().billingProfileName();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public DateTime endDate() {
        return this.inner().endDate();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String invoiceSectionId() {
        return this.inner().invoiceSectionId();
    }

    @Override
    public String invoiceSectionName() {
        return this.inner().invoiceSectionName();
    }

    @Override
    public Amount lastCharge() {
        return this.inner().lastCharge();
    }

    @Override
    public DateTime lastChargeDate() {
        return this.inner().lastChargeDate();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String parentProductId() {
        return this.inner().parentProductId();
    }

    @Override
    public String productType() {
        return this.inner().productType();
    }

    @Override
    public String productTypeId() {
        return this.inner().productTypeId();
    }

    @Override
    public DateTime purchaseDate() {
        return this.inner().purchaseDate();
    }

    @Override
    public Double quantity() {
        return this.inner().quantity();
    }

    @Override
    public String skuDescription() {
        return this.inner().skuDescription();
    }

    @Override
    public String skuId() {
        return this.inner().skuId();
    }

    @Override
    public ProductStatusType status() {
        return this.inner().status();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
