/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.eventhubs.v2017_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.eventhubs.v2017_04_01.Regions;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.eventhubs.v2017_04_01.MessagingRegions;

class RegionsImpl extends WrapperImpl<RegionsInner> implements Regions {
    private final EventHubsManager manager;

    RegionsImpl(EventHubsManager manager) {
        super(manager.inner().regions());
        this.manager = manager;
    }

    public EventHubsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<MessagingRegions> listBySkuAsync(final String sku) {
        RegionsInner client = this.inner();
        return client.listBySkuAsync(sku)
        .flatMapIterable(new Func1<Page<MessagingRegionsInner>, Iterable<MessagingRegionsInner>>() {
            @Override
            public Iterable<MessagingRegionsInner> call(Page<MessagingRegionsInner> page) {
                return page.items();
            }
        })
        .map(new Func1<MessagingRegionsInner, MessagingRegions>() {
            @Override
            public MessagingRegions call(MessagingRegionsInner inner) {
                return new MessagingRegionsImpl(inner, manager());
            }
        });
    }

}
