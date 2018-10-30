/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.devtestlab.v2018_09_15.Disks;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.devtestlab.v2018_09_15.Disk;

class DisksImpl extends WrapperImpl<DisksInner> implements Disks {
    private final DevTestLabManager manager;

    DisksImpl(DevTestLabManager manager) {
        super(manager.inner().disks());
        this.manager = manager;
    }

    public DevTestLabManager manager() {
        return this.manager;
    }

    @Override
    public DiskImpl define(String name) {
        return wrapModel(name);
    }

    private DiskImpl wrapModel(DiskInner inner) {
        return  new DiskImpl(inner, manager());
    }

    private DiskImpl wrapModel(String name) {
        return new DiskImpl(name, this.manager());
    }

    @Override
    public Completable attachAsync(String resourceGroupName, String labName, String userName, String name) {
        DisksInner client = this.inner();
        return client.attachAsync(resourceGroupName, labName, userName, name).toCompletable();
    }

    @Override
    public Completable detachAsync(String resourceGroupName, String labName, String userName, String name) {
        DisksInner client = this.inner();
        return client.detachAsync(resourceGroupName, labName, userName, name).toCompletable();
    }

    @Override
    public Observable<Disk> listAsync(final String resourceGroupName, final String labName, final String userName) {
        DisksInner client = this.inner();
        return client.listAsync(resourceGroupName, labName, userName)
        .flatMapIterable(new Func1<Page<DiskInner>, Iterable<DiskInner>>() {
            @Override
            public Iterable<DiskInner> call(Page<DiskInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DiskInner, Disk>() {
            @Override
            public Disk call(DiskInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Disk> getAsync(String resourceGroupName, String labName, String userName, String name) {
        DisksInner client = this.inner();
        return client.getAsync(resourceGroupName, labName, userName, name)
        .map(new Func1<DiskInner, Disk>() {
            @Override
            public Disk call(DiskInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String labName, String userName, String name) {
        DisksInner client = this.inner();
        return client.deleteAsync(resourceGroupName, labName, userName, name).toCompletable();
    }

}
