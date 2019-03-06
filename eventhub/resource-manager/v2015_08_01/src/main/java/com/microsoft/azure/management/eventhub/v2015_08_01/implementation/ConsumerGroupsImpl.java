/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.eventhub.v2015_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.eventhub.v2015_08_01.ConsumerGroups;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.eventhub.v2015_08_01.ConsumerGroupResource;

class ConsumerGroupsImpl extends WrapperImpl<ConsumerGroupsInner> implements ConsumerGroups {
    private final EventHubManager manager;

    ConsumerGroupsImpl(EventHubManager manager) {
        super(manager.inner().consumerGroups());
        this.manager = manager;
    }

    public EventHubManager manager() {
        return this.manager;
    }

    @Override
    public ConsumerGroupResourceImpl define(String name) {
        return wrapModel(name);
    }

    private ConsumerGroupResourceImpl wrapModel(ConsumerGroupResourceInner inner) {
        return  new ConsumerGroupResourceImpl(inner, manager());
    }

    private ConsumerGroupResourceImpl wrapModel(String name) {
        return new ConsumerGroupResourceImpl(name, this.manager());
    }

    @Override
    public Observable<ConsumerGroupResource> listAllAsync(final String resourceGroupName, final String namespaceName, final String eventHubName) {
        ConsumerGroupsInner client = this.inner();
        return client.listAllAsync(resourceGroupName, namespaceName, eventHubName)
        .flatMapIterable(new Func1<Page<ConsumerGroupResourceInner>, Iterable<ConsumerGroupResourceInner>>() {
            @Override
            public Iterable<ConsumerGroupResourceInner> call(Page<ConsumerGroupResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ConsumerGroupResourceInner, ConsumerGroupResource>() {
            @Override
            public ConsumerGroupResource call(ConsumerGroupResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ConsumerGroupResource> getAsync(String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName) {
        ConsumerGroupsInner client = this.inner();
        return client.getAsync(resourceGroupName, namespaceName, eventHubName, consumerGroupName)
        .map(new Func1<ConsumerGroupResourceInner, ConsumerGroupResource>() {
            @Override
            public ConsumerGroupResource call(ConsumerGroupResourceInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName) {
        ConsumerGroupsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, namespaceName, eventHubName, consumerGroupName).toCompletable();
    }

}
