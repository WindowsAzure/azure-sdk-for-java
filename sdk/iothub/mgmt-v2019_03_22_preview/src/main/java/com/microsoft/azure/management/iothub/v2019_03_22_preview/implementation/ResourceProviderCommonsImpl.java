/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.iothub.v2019_03_22_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.ResourceProviderCommons;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.UserSubscriptionQuota;

class ResourceProviderCommonsImpl extends WrapperImpl<ResourceProviderCommonsInner> implements ResourceProviderCommons {
    private final DevicesManager manager;

    ResourceProviderCommonsImpl(DevicesManager manager) {
        super(manager.inner().resourceProviderCommons());
        this.manager = manager;
    }

    public DevicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<UserSubscriptionQuota> listAsync() {
        ResourceProviderCommonsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<UserSubscriptionQuotaInner>, Observable<UserSubscriptionQuotaInner>>() {
            @Override
            public Observable<UserSubscriptionQuotaInner> call(Page<UserSubscriptionQuotaInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<UserSubscriptionQuotaInner, UserSubscriptionQuota>() {
            @Override
            public UserSubscriptionQuota call(UserSubscriptionQuotaInner inner) {
                return new UserSubscriptionQuotaImpl(inner, manager());
            }
        });
    }

}
