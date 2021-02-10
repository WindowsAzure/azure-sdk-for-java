/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2020_10_01_preview.DedicatedHosts;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.compute.v2020_10_01_preview.DedicatedHost;

class DedicatedHostsImpl extends WrapperImpl<DedicatedHostsInner> implements DedicatedHosts {
    private final ComputeManager manager;

    DedicatedHostsImpl(ComputeManager manager) {
        super(manager.inner().dedicatedHosts());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public DedicatedHostImpl define(String name) {
        return wrapModel(name);
    }

    private DedicatedHostImpl wrapModel(DedicatedHostInner inner) {
        return  new DedicatedHostImpl(inner, manager());
    }

    private DedicatedHostImpl wrapModel(String name) {
        return new DedicatedHostImpl(name, this.manager());
    }

    @Override
    public Observable<DedicatedHost> listByHostGroupAsync(final String resourceGroupName, final String hostGroupName) {
        DedicatedHostsInner client = this.inner();
        return client.listByHostGroupAsync(resourceGroupName, hostGroupName)
        .flatMapIterable(new Func1<Page<DedicatedHostInner>, Iterable<DedicatedHostInner>>() {
            @Override
            public Iterable<DedicatedHostInner> call(Page<DedicatedHostInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DedicatedHostInner, DedicatedHost>() {
            @Override
            public DedicatedHost call(DedicatedHostInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<DedicatedHost> getAsync(String resourceGroupName, String hostGroupName, String hostName) {
        DedicatedHostsInner client = this.inner();
        return client.getAsync(resourceGroupName, hostGroupName, hostName)
        .flatMap(new Func1<DedicatedHostInner, Observable<DedicatedHost>>() {
            @Override
            public Observable<DedicatedHost> call(DedicatedHostInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((DedicatedHost)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String hostGroupName, String hostName) {
        DedicatedHostsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, hostGroupName, hostName).toCompletable();
    }

}
