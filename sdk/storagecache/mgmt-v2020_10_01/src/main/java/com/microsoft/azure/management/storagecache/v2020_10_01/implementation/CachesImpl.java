/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.storagecache.v2020_10_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.storagecache.v2020_10_01.Caches;
import com.microsoft.azure.management.storagecache.v2020_10_01.Cache;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class CachesImpl extends GroupableResourcesCoreImpl<Cache, CacheImpl, CacheInner, CachesInner, StorageCacheManager>  implements Caches {
    protected CachesImpl(StorageCacheManager manager) {
        super(manager.inner().caches(), manager);
    }

    @Override
    protected Observable<CacheInner> getInnerAsync(String resourceGroupName, String name) {
        CachesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        CachesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<Cache> listByResourceGroup(String resourceGroupName) {
        CachesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<Cache> listByResourceGroupAsync(String resourceGroupName) {
        CachesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<CacheInner>, Iterable<CacheInner>>() {
            @Override
            public Iterable<CacheInner> call(Page<CacheInner> page) {
                return page.items();
            }
        })
        .map(new Func1<CacheInner, Cache>() {
            @Override
            public Cache call(CacheInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<Cache> list() {
        CachesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<Cache> listAsync() {
        CachesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<CacheInner>, Iterable<CacheInner>>() {
            @Override
            public Iterable<CacheInner> call(Page<CacheInner> page) {
                return page.items();
            }
        })
        .map(new Func1<CacheInner, Cache>() {
            @Override
            public Cache call(CacheInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public CacheImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Completable debugInfoAsync(String resourceGroupName, String cacheName) {
        CachesInner client = this.inner();
        return client.debugInfoAsync(resourceGroupName, cacheName).toCompletable();
    }

    @Override
    public Completable flushAsync(String resourceGroupName, String cacheName) {
        CachesInner client = this.inner();
        return client.flushAsync(resourceGroupName, cacheName).toCompletable();
    }

    @Override
    public Completable startAsync(String resourceGroupName, String cacheName) {
        CachesInner client = this.inner();
        return client.startAsync(resourceGroupName, cacheName).toCompletable();
    }

    @Override
    public Completable stopAsync(String resourceGroupName, String cacheName) {
        CachesInner client = this.inner();
        return client.stopAsync(resourceGroupName, cacheName).toCompletable();
    }

    @Override
    public Completable upgradeFirmwareAsync(String resourceGroupName, String cacheName) {
        CachesInner client = this.inner();
        return client.upgradeFirmwareAsync(resourceGroupName, cacheName).toCompletable();
    }

    @Override
    protected CacheImpl wrapModel(CacheInner inner) {
        return  new CacheImpl(inner.name(), inner, manager());
    }

    @Override
    protected CacheImpl wrapModel(String name) {
        return new CacheImpl(name, new CacheInner(), this.manager());
    }

}
