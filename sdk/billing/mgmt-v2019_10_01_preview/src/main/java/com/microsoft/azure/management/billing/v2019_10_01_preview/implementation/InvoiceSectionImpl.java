/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.microsoft.azure.management.billing.v2019_10_01_preview.InvoiceSection;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class InvoiceSectionImpl extends CreatableUpdatableImpl<InvoiceSection, InvoiceSectionInner, InvoiceSectionImpl> implements InvoiceSection, InvoiceSection.Definition, InvoiceSection.Update {
    private final BillingManager manager;
    private String billingAccountName;
    private String billingProfileName;
    private String invoiceSectionName;
    private String cdisplayName;
    private String udisplayName;

    InvoiceSectionImpl(String name, BillingManager manager) {
        super(name, new InvoiceSectionInner());
        this.manager = manager;
        // Set resource name
        this.invoiceSectionName = name;
        //
    }

    InvoiceSectionImpl(InvoiceSectionInner inner, BillingManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.invoiceSectionName = inner.name();
        // set resource ancestor and positional variables
        this.billingAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "billingAccounts");
        this.billingProfileName = IdParsingUtils.getValueFromIdByName(inner.id(), "billingProfiles");
        this.invoiceSectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "invoiceSections");
        //
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public Observable<InvoiceSection> createResourceAsync() {
        InvoiceSectionsInner client = this.manager().inner().invoiceSections();
        return client.createAsync(this.billingAccountName, this.billingProfileName, this.invoiceSectionName, this.cdisplayName)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<InvoiceSection> updateResourceAsync() {
        InvoiceSectionsInner client = this.manager().inner().invoiceSections();
        return client.updateAsync(this.billingAccountName, this.billingProfileName, this.invoiceSectionName, this.udisplayName)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<InvoiceSectionInner> getInnerAsync() {
        InvoiceSectionsInner client = this.manager().inner().invoiceSections();
        return client.getAsync(this.billingAccountName, this.billingProfileName, this.invoiceSectionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public InvoiceSectionImpl withExistingBillingProfile(String billingAccountName, String billingProfileName) {
        this.billingAccountName = billingAccountName;
        this.billingProfileName = billingProfileName;
        return this;
    }

    @Override
    public InvoiceSectionImpl withDisplayName(String displayName) {
        if (isInCreateMode()) {
            this.cdisplayName = displayName;
        } else {
            this.udisplayName = displayName;
        }
        return this;
    }

}
