/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2015_05_01_preview.SubscriptionUsages;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.sql.v2015_05_01_preview.SubscriptionUsage;
import com.microsoft.azure.Page;

class SubscriptionUsagesImpl extends WrapperImpl<SubscriptionUsagesInner> implements SubscriptionUsages {
    private final SqlManager manager;

    SubscriptionUsagesImpl(SqlManager manager) {
        super(manager.inner().subscriptionUsages());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    private SubscriptionUsageImpl wrapSubscriptionUsageModel(SubscriptionUsageInner inner) {
        return  new SubscriptionUsageImpl(inner, manager());
    }

    private Observable<SubscriptionUsageInner> getSubscriptionUsageInnerUsingSubscriptionUsagesInnerAsync(String id) {
        String locationName = IdParsingUtils.getValueFromIdByName(id, "locations");
        String usageName = IdParsingUtils.getValueFromIdByName(id, "usages");
        SubscriptionUsagesInner client = this.inner();
        return client.getAsync(locationName, usageName);
    }

    @Override
    public Observable<SubscriptionUsage> getAsync(String locationName, String usageName) {
        SubscriptionUsagesInner client = this.inner();
        return client.getAsync(locationName, usageName)
        .map(new Func1<SubscriptionUsageInner, SubscriptionUsage>() {
            @Override
            public SubscriptionUsage call(SubscriptionUsageInner inner) {
                return wrapSubscriptionUsageModel(inner);
            }
       });
    }

    @Override
    public Observable<SubscriptionUsage> listByLocationAsync(final String locationName) {
        SubscriptionUsagesInner client = this.inner();
        return client.listByLocationAsync(locationName)
        .flatMapIterable(new Func1<Page<SubscriptionUsageInner>, Iterable<SubscriptionUsageInner>>() {
            @Override
            public Iterable<SubscriptionUsageInner> call(Page<SubscriptionUsageInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SubscriptionUsageInner, SubscriptionUsage>() {
            @Override
            public SubscriptionUsage call(SubscriptionUsageInner inner) {
                return wrapSubscriptionUsageModel(inner);
            }
        });
    }

}
