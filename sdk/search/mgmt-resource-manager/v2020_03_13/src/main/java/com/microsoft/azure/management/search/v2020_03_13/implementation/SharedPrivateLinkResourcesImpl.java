/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.search.v2020_03_13.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.search.v2020_03_13.SharedPrivateLinkResources;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.search.v2020_03_13.SharedPrivateLinkResource;

class SharedPrivateLinkResourcesImpl extends WrapperImpl<SharedPrivateLinkResourcesInner> implements SharedPrivateLinkResources {
    private final SearchManager manager;

    SharedPrivateLinkResourcesImpl(SearchManager manager) {
        super(manager.inner().sharedPrivateLinkResources());
        this.manager = manager;
    }

    public SearchManager manager() {
        return this.manager;
    }

    @Override
    public SharedPrivateLinkResourceImpl define(String name) {
        return wrapModel(name);
    }

    private SharedPrivateLinkResourceImpl wrapModel(SharedPrivateLinkResourceInner inner) {
        return  new SharedPrivateLinkResourceImpl(inner, manager());
    }

    private SharedPrivateLinkResourceImpl wrapModel(String name) {
        return new SharedPrivateLinkResourceImpl(name, this.manager());
    }

    @Override
    public Observable<SharedPrivateLinkResource> listByServiceAsync(final String resourceGroupName, final String searchServiceName) {
        SharedPrivateLinkResourcesInner client = this.inner();
        return client.listByServiceAsync(resourceGroupName, searchServiceName)
        .flatMapIterable(new Func1<Page<SharedPrivateLinkResourceInner>, Iterable<SharedPrivateLinkResourceInner>>() {
            @Override
            public Iterable<SharedPrivateLinkResourceInner> call(Page<SharedPrivateLinkResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SharedPrivateLinkResourceInner, SharedPrivateLinkResource>() {
            @Override
            public SharedPrivateLinkResource call(SharedPrivateLinkResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<SharedPrivateLinkResource> getAsync(String resourceGroupName, String searchServiceName, String sharedPrivateLinkResourceName) {
        SharedPrivateLinkResourcesInner client = this.inner();
        return client.getAsync(resourceGroupName, searchServiceName, sharedPrivateLinkResourceName)
        .flatMap(new Func1<SharedPrivateLinkResourceInner, Observable<SharedPrivateLinkResource>>() {
            @Override
            public Observable<SharedPrivateLinkResource> call(SharedPrivateLinkResourceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((SharedPrivateLinkResource)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String searchServiceName, String sharedPrivateLinkResourceName) {
        SharedPrivateLinkResourcesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, searchServiceName, sharedPrivateLinkResourceName).toCompletable();
    }

}
