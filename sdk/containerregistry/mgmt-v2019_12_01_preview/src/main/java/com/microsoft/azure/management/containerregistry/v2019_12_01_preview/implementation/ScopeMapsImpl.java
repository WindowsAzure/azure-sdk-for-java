/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.ScopeMaps;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.ScopeMap;

class ScopeMapsImpl extends WrapperImpl<ScopeMapsInner> implements ScopeMaps {
    private final ContainerRegistryManager manager;

    ScopeMapsImpl(ContainerRegistryManager manager) {
        super(manager.inner().scopeMaps());
        this.manager = manager;
    }

    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public ScopeMapImpl define(String name) {
        return wrapModel(name);
    }

    private ScopeMapImpl wrapModel(ScopeMapInner inner) {
        return  new ScopeMapImpl(inner, manager());
    }

    private ScopeMapImpl wrapModel(String name) {
        return new ScopeMapImpl(name, this.manager());
    }

    @Override
    public Observable<ScopeMap> listAsync(final String resourceGroupName, final String registryName) {
        ScopeMapsInner client = this.inner();
        return client.listAsync(resourceGroupName, registryName)
        .flatMapIterable(new Func1<Page<ScopeMapInner>, Iterable<ScopeMapInner>>() {
            @Override
            public Iterable<ScopeMapInner> call(Page<ScopeMapInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ScopeMapInner, ScopeMap>() {
            @Override
            public ScopeMap call(ScopeMapInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ScopeMap> getAsync(String resourceGroupName, String registryName, String scopeMapName) {
        ScopeMapsInner client = this.inner();
        return client.getAsync(resourceGroupName, registryName, scopeMapName)
        .flatMap(new Func1<ScopeMapInner, Observable<ScopeMap>>() {
            @Override
            public Observable<ScopeMap> call(ScopeMapInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ScopeMap)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String registryName, String scopeMapName) {
        ScopeMapsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, registryName, scopeMapName).toCompletable();
    }

}
