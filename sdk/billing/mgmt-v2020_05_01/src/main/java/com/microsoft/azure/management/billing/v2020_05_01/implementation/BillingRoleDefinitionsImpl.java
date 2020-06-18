/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.billing.v2020_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2020_05_01.BillingRoleDefinitions;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.billing.v2020_05_01.BillingRoleDefinition;

class BillingRoleDefinitionsImpl extends WrapperImpl<BillingRoleDefinitionsInner> implements BillingRoleDefinitions {
    private final BillingManager manager;

    BillingRoleDefinitionsImpl(BillingManager manager) {
        super(manager.inner().billingRoleDefinitions());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    private BillingRoleDefinitionImpl wrapModel(BillingRoleDefinitionInner inner) {
        return  new BillingRoleDefinitionImpl(inner, manager());
    }

    @Override
    public Observable<BillingRoleDefinition> getByInvoiceSectionAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String billingRoleDefinitionName) {
        BillingRoleDefinitionsInner client = this.inner();
        return client.getByInvoiceSectionAsync(billingAccountName, billingProfileName, invoiceSectionName, billingRoleDefinitionName)
        .map(new Func1<BillingRoleDefinitionInner, BillingRoleDefinition>() {
            @Override
            public BillingRoleDefinition call(BillingRoleDefinitionInner inner) {
                return new BillingRoleDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingRoleDefinition> getByBillingProfileAsync(String billingAccountName, String billingProfileName, String billingRoleDefinitionName) {
        BillingRoleDefinitionsInner client = this.inner();
        return client.getByBillingProfileAsync(billingAccountName, billingProfileName, billingRoleDefinitionName)
        .map(new Func1<BillingRoleDefinitionInner, BillingRoleDefinition>() {
            @Override
            public BillingRoleDefinition call(BillingRoleDefinitionInner inner) {
                return new BillingRoleDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingRoleDefinition> listByInvoiceSectionAsync(final String billingAccountName, final String billingProfileName, final String invoiceSectionName) {
        BillingRoleDefinitionsInner client = this.inner();
        return client.listByInvoiceSectionAsync(billingAccountName, billingProfileName, invoiceSectionName)
        .flatMapIterable(new Func1<Page<BillingRoleDefinitionInner>, Iterable<BillingRoleDefinitionInner>>() {
            @Override
            public Iterable<BillingRoleDefinitionInner> call(Page<BillingRoleDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<BillingRoleDefinitionInner, BillingRoleDefinition>() {
            @Override
            public BillingRoleDefinition call(BillingRoleDefinitionInner inner) {
                return new BillingRoleDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingRoleDefinition> listByBillingProfileAsync(final String billingAccountName, final String billingProfileName) {
        BillingRoleDefinitionsInner client = this.inner();
        return client.listByBillingProfileAsync(billingAccountName, billingProfileName)
        .flatMapIterable(new Func1<Page<BillingRoleDefinitionInner>, Iterable<BillingRoleDefinitionInner>>() {
            @Override
            public Iterable<BillingRoleDefinitionInner> call(Page<BillingRoleDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<BillingRoleDefinitionInner, BillingRoleDefinition>() {
            @Override
            public BillingRoleDefinition call(BillingRoleDefinitionInner inner) {
                return new BillingRoleDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingRoleDefinition> listByBillingAccountAsync(final String billingAccountName) {
        BillingRoleDefinitionsInner client = this.inner();
        return client.listByBillingAccountAsync(billingAccountName)
        .flatMapIterable(new Func1<Page<BillingRoleDefinitionInner>, Iterable<BillingRoleDefinitionInner>>() {
            @Override
            public Iterable<BillingRoleDefinitionInner> call(Page<BillingRoleDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<BillingRoleDefinitionInner, BillingRoleDefinition>() {
            @Override
            public BillingRoleDefinition call(BillingRoleDefinitionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<BillingRoleDefinition> getByBillingAccountAsync(String billingAccountName, String billingRoleDefinitionName) {
        BillingRoleDefinitionsInner client = this.inner();
        return client.getByBillingAccountAsync(billingAccountName, billingRoleDefinitionName)
        .flatMap(new Func1<BillingRoleDefinitionInner, Observable<BillingRoleDefinition>>() {
            @Override
            public Observable<BillingRoleDefinition> call(BillingRoleDefinitionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((BillingRoleDefinition)wrapModel(inner));
                }
            }
       });
    }

}
