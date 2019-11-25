/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.AnalyticsItems;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ApplicationInsightsComponentAnalyticsItem;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ItemScopePath;

class AnalyticsItemsImpl extends WrapperImpl<AnalyticsItemsInner> implements AnalyticsItems {
    private final InsightsManager manager;

    AnalyticsItemsImpl(InsightsManager manager) {
        super(manager.inner().analyticsItems());
        this.manager = manager;
    }

    public InsightsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ApplicationInsightsComponentAnalyticsItem> listAsync(String resourceGroupName, String resourceName, ItemScopePath scopePath) {
        AnalyticsItemsInner client = this.inner();
        return client.listAsync(resourceGroupName, resourceName, scopePath)
        .flatMap(new Func1<List<ApplicationInsightsComponentAnalyticsItemInner>, Observable<ApplicationInsightsComponentAnalyticsItemInner>>() {
            @Override
            public Observable<ApplicationInsightsComponentAnalyticsItemInner> call(List<ApplicationInsightsComponentAnalyticsItemInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ApplicationInsightsComponentAnalyticsItemInner, ApplicationInsightsComponentAnalyticsItem>() {
            @Override
            public ApplicationInsightsComponentAnalyticsItem call(ApplicationInsightsComponentAnalyticsItemInner inner) {
                return new ApplicationInsightsComponentAnalyticsItemImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ApplicationInsightsComponentAnalyticsItem> getAsync(String resourceGroupName, String resourceName, ItemScopePath scopePath) {
        AnalyticsItemsInner client = this.inner();
        return client.getAsync(resourceGroupName, resourceName, scopePath)
        .map(new Func1<ApplicationInsightsComponentAnalyticsItemInner, ApplicationInsightsComponentAnalyticsItem>() {
            @Override
            public ApplicationInsightsComponentAnalyticsItem call(ApplicationInsightsComponentAnalyticsItemInner inner) {
                return new ApplicationInsightsComponentAnalyticsItemImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ApplicationInsightsComponentAnalyticsItem> putAsync(String resourceGroupName, String resourceName, ItemScopePath scopePath, ApplicationInsightsComponentAnalyticsItemInner itemProperties) {
        AnalyticsItemsInner client = this.inner();
        return client.putAsync(resourceGroupName, resourceName, scopePath, itemProperties)
        .map(new Func1<ApplicationInsightsComponentAnalyticsItemInner, ApplicationInsightsComponentAnalyticsItem>() {
            @Override
            public ApplicationInsightsComponentAnalyticsItem call(ApplicationInsightsComponentAnalyticsItemInner inner) {
                return new ApplicationInsightsComponentAnalyticsItemImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String resourceName, ItemScopePath scopePath) {
        AnalyticsItemsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, resourceName, scopePath).toCompletable();
    }

}
