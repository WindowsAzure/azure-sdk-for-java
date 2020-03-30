/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.consumption.v2017_04_24_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.consumption.v2017_04_24_preview.UsageDetails;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.consumption.v2017_04_24_preview.UsageDetail;

class UsageDetailsImpl extends WrapperImpl<UsageDetailsInner> implements UsageDetails {
    private final ConsumptionManager manager;

    UsageDetailsImpl(ConsumptionManager manager) {
        super(manager.inner().usageDetails());
        this.manager = manager;
    }

    public ConsumptionManager manager() {
        return this.manager;
    }

    @Override
    public Observable<UsageDetail> listAsync(final String scope) {
        UsageDetailsInner client = this.inner();
        return client.listAsync(scope)
        .flatMapIterable(new Func1<Page<UsageDetailInner>, Iterable<UsageDetailInner>>() {
            @Override
            public Iterable<UsageDetailInner> call(Page<UsageDetailInner> page) {
                return page.items();
            }
        })
        .map(new Func1<UsageDetailInner, UsageDetail>() {
            @Override
            public UsageDetail call(UsageDetailInner inner) {
                return new UsageDetailImpl(inner, manager());
            }
        });
    }

}
