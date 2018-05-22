/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.redis.v2017_10_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.redis.v2017_10_01.LinkedServers;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.redis.v2017_10_01.RedisLinkedServerWithProperties;

class LinkedServersImpl extends WrapperImpl<LinkedServersInner> implements LinkedServers {
    private final RedisManager manager;

    LinkedServersImpl(RedisManager manager) {
        super(manager.inner().linkedServers());
        this.manager = manager;
    }

    public RedisManager manager() {
        return this.manager;
    }

    @Override
    public RedisLinkedServerWithPropertiesImpl define(String name) {
        return wrapModel(name);
    }

    private RedisLinkedServerWithPropertiesImpl wrapModel(RedisLinkedServerWithPropertiesInner inner) {
        return  new RedisLinkedServerWithPropertiesImpl(inner, manager());
    }

    private RedisLinkedServerWithPropertiesImpl wrapModel(String name) {
        return new RedisLinkedServerWithPropertiesImpl(name, this.manager());
    }

    private Observable<Page<RedisLinkedServerWithPropertiesInner>> listNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        LinkedServersInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<RedisLinkedServerWithPropertiesInner>, Observable<Page<RedisLinkedServerWithPropertiesInner>>>() {
            @Override
            public Observable<Page<RedisLinkedServerWithPropertiesInner>> call(Page<RedisLinkedServerWithPropertiesInner> page) {
                return Observable.just(page).concatWith(listNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<RedisLinkedServerWithProperties> listAsync(final String resourceGroupName, final String name) {
        LinkedServersInner client = this.inner();
        return client.listAsync(resourceGroupName, name)
        .flatMap(new Func1<Page<RedisLinkedServerWithPropertiesInner>, Observable<Page<RedisLinkedServerWithPropertiesInner>>>() {
            @Override
            public Observable<Page<RedisLinkedServerWithPropertiesInner>> call(Page<RedisLinkedServerWithPropertiesInner> page) {
                return listNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<RedisLinkedServerWithPropertiesInner>, Iterable<RedisLinkedServerWithPropertiesInner>>() {
            @Override
            public Iterable<RedisLinkedServerWithPropertiesInner> call(Page<RedisLinkedServerWithPropertiesInner> page) {
                return page.items();
            }
       })
        .map(new Func1<RedisLinkedServerWithPropertiesInner, RedisLinkedServerWithProperties>() {
            @Override
            public RedisLinkedServerWithProperties call(RedisLinkedServerWithPropertiesInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Observable<RedisLinkedServerWithProperties> getAsync(String resourceGroupName, String name, String linkedServerName) {
        LinkedServersInner client = this.inner();
        return client.getAsync(resourceGroupName, name, linkedServerName)
        .map(new Func1<RedisLinkedServerWithPropertiesInner, RedisLinkedServerWithProperties>() {
            @Override
            public RedisLinkedServerWithProperties call(RedisLinkedServerWithPropertiesInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String name, String linkedServerName) {
        LinkedServersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name, linkedServerName).toCompletable();
    }

}
