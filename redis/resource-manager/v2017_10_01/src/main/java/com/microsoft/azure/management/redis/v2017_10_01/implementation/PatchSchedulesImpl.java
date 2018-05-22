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
import com.microsoft.azure.management.redis.v2017_10_01.PatchSchedules;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.redis.v2017_10_01.RedisPatchSchedule;

class PatchSchedulesImpl extends WrapperImpl<PatchSchedulesInner> implements PatchSchedules {
    private final RedisManager manager;

    PatchSchedulesImpl(RedisManager manager) {
        super(manager.inner().patchSchedules());
        this.manager = manager;
    }

    public RedisManager manager() {
        return this.manager;
    }

    @Override
    public RedisPatchScheduleImpl define(String name) {
        return wrapModel(name);
    }

    private RedisPatchScheduleImpl wrapModel(RedisPatchScheduleInner inner) {
        return  new RedisPatchScheduleImpl(inner, manager());
    }

    private RedisPatchScheduleImpl wrapModel(String name) {
        return new RedisPatchScheduleImpl(name, this.manager());
    }

    private Observable<Page<RedisPatchScheduleInner>> listByRedisResourceNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        PatchSchedulesInner client = this.inner();
        return client.listByRedisResourceNextAsync(nextLink)
        .flatMap(new Func1<Page<RedisPatchScheduleInner>, Observable<Page<RedisPatchScheduleInner>>>() {
            @Override
            public Observable<Page<RedisPatchScheduleInner>> call(Page<RedisPatchScheduleInner> page) {
                return Observable.just(page).concatWith(listByRedisResourceNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<RedisPatchSchedule> listByRedisResourceAsync(final String resourceGroupName, final String cacheName) {
        PatchSchedulesInner client = this.inner();
        return client.listByRedisResourceAsync(resourceGroupName, cacheName)
        .flatMap(new Func1<Page<RedisPatchScheduleInner>, Observable<Page<RedisPatchScheduleInner>>>() {
            @Override
            public Observable<Page<RedisPatchScheduleInner>> call(Page<RedisPatchScheduleInner> page) {
                return listByRedisResourceNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<RedisPatchScheduleInner>, Iterable<RedisPatchScheduleInner>>() {
            @Override
            public Iterable<RedisPatchScheduleInner> call(Page<RedisPatchScheduleInner> page) {
                return page.items();
            }
       })
        .map(new Func1<RedisPatchScheduleInner, RedisPatchSchedule>() {
            @Override
            public RedisPatchSchedule call(RedisPatchScheduleInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Observable<RedisPatchSchedule> getAsync(String resourceGroupName, String name) {
        PatchSchedulesInner client = this.inner();
        return client.getAsync(resourceGroupName, name)
        .map(new Func1<RedisPatchScheduleInner, RedisPatchSchedule>() {
            @Override
            public RedisPatchSchedule call(RedisPatchScheduleInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String name) {
        PatchSchedulesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

}
