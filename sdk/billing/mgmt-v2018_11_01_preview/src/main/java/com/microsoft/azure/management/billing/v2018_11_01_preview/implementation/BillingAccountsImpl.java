/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingAccounts;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingAccount;

class BillingAccountsImpl extends WrapperImpl<BillingAccountsInner> implements BillingAccounts {
    private final BillingManager manager;

    BillingAccountsImpl(BillingManager manager) {
        super(manager.inner().billingAccounts());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    private BillingAccountImpl wrapModel(BillingAccountInner inner) {
        return  new BillingAccountImpl(inner, manager());
    }

    @Override
    public Observable<BillingAccount> getAsync(String billingAccountName) {
        BillingAccountsInner client = this.inner();
        return client.getAsync(billingAccountName)
        .map(new Func1<BillingAccountInner, BillingAccount>() {
            @Override
            public BillingAccount call(BillingAccountInner inner) {
                return new BillingAccountImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingAccount> listAsync() {
        BillingAccountsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<BillingAccountInner>, Iterable<BillingAccountInner>>() {
            @Override
            public Iterable<BillingAccountInner> call(Page<BillingAccountInner> page) {
                return page.items();
            }
        })
        .map(new Func1<BillingAccountInner, BillingAccount>() {
            @Override
            public BillingAccount call(BillingAccountInner inner) {
                return new BillingAccountImpl(inner, manager());
            }
        });
    }

}
