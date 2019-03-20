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
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingSubscriptionsByBillingProfiles;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingSubscriptionsListResult;

class BillingSubscriptionsByBillingProfilesImpl extends WrapperImpl<BillingSubscriptionsByBillingProfilesInner> implements BillingSubscriptionsByBillingProfiles {
    private final BillingManager manager;

    BillingSubscriptionsByBillingProfilesImpl(BillingManager manager) {
        super(manager.inner().billingSubscriptionsByBillingProfiles());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public Observable<BillingSubscriptionsListResult> listAsync(String billingAccountId, String billingProfileId) {
        BillingSubscriptionsByBillingProfilesInner client = this.inner();
        return client.listAsync(billingAccountId, billingProfileId)
        .map(new Func1<BillingSubscriptionsListResultInner, BillingSubscriptionsListResult>() {
            @Override
            public BillingSubscriptionsListResult call(BillingSubscriptionsListResultInner inner) {
                return new BillingSubscriptionsListResultImpl(inner, manager());
            }
        });
    }

}
