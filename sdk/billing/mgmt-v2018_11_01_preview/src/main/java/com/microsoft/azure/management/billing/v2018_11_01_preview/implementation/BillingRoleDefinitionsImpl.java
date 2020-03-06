/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingRoleDefinitions;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingRoleDefinition;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingRoleDefinitionListResult;

class BillingRoleDefinitionsImpl extends WrapperImpl<BillingRoleDefinitionsInner> implements BillingRoleDefinitions {
    private final BillingManager manager;

    BillingRoleDefinitionsImpl(BillingManager manager) {
        super(manager.inner().billingRoleDefinitions());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public Observable<BillingRoleDefinition> getByBillingAccountNameAsync(String billingAccountName, String billingRoleDefinitionName) {
        BillingRoleDefinitionsInner client = this.inner();
        return client.getByBillingAccountNameAsync(billingAccountName, billingRoleDefinitionName)
        .map(new Func1<BillingRoleDefinitionInner, BillingRoleDefinition>() {
            @Override
            public BillingRoleDefinition call(BillingRoleDefinitionInner inner) {
                return new BillingRoleDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingRoleDefinition> getByInvoiceSectionNameAsync(String billingAccountName, String invoiceSectionName, String billingRoleDefinitionName) {
        BillingRoleDefinitionsInner client = this.inner();
        return client.getByInvoiceSectionNameAsync(billingAccountName, invoiceSectionName, billingRoleDefinitionName)
        .map(new Func1<BillingRoleDefinitionInner, BillingRoleDefinition>() {
            @Override
            public BillingRoleDefinition call(BillingRoleDefinitionInner inner) {
                return new BillingRoleDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingRoleDefinition> getByBillingProfileNameAsync(String billingAccountName, String billingProfileName, String billingRoleDefinitionName) {
        BillingRoleDefinitionsInner client = this.inner();
        return client.getByBillingProfileNameAsync(billingAccountName, billingProfileName, billingRoleDefinitionName)
        .map(new Func1<BillingRoleDefinitionInner, BillingRoleDefinition>() {
            @Override
            public BillingRoleDefinition call(BillingRoleDefinitionInner inner) {
                return new BillingRoleDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingRoleDefinitionListResult> listByBillingAccountNameAsync(String billingAccountName) {
        BillingRoleDefinitionsInner client = this.inner();
        return client.listByBillingAccountNameAsync(billingAccountName)
        .map(new Func1<BillingRoleDefinitionListResultInner, BillingRoleDefinitionListResult>() {
            @Override
            public BillingRoleDefinitionListResult call(BillingRoleDefinitionListResultInner inner) {
                return new BillingRoleDefinitionListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingRoleDefinitionListResult> listByInvoiceSectionNameAsync(String billingAccountName, String invoiceSectionName) {
        BillingRoleDefinitionsInner client = this.inner();
        return client.listByInvoiceSectionNameAsync(billingAccountName, invoiceSectionName)
        .map(new Func1<BillingRoleDefinitionListResultInner, BillingRoleDefinitionListResult>() {
            @Override
            public BillingRoleDefinitionListResult call(BillingRoleDefinitionListResultInner inner) {
                return new BillingRoleDefinitionListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingRoleDefinitionListResult> listByBillingProfileNameAsync(String billingAccountName, String billingProfileName) {
        BillingRoleDefinitionsInner client = this.inner();
        return client.listByBillingProfileNameAsync(billingAccountName, billingProfileName)
        .map(new Func1<BillingRoleDefinitionListResultInner, BillingRoleDefinitionListResult>() {
            @Override
            public BillingRoleDefinitionListResult call(BillingRoleDefinitionListResultInner inner) {
                return new BillingRoleDefinitionListResultImpl(inner, manager());
            }
        });
    }

}
