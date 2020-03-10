/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.compute.v2019_11_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.compute.v2019_11_01.Disks;
import com.microsoft.azure.management.compute.v2019_11_01.Disk;
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
import com.microsoft.azure.management.compute.v2019_11_01.AccessUri;
import com.microsoft.azure.management.compute.v2019_11_01.GrantAccessData;

class DisksImpl extends GroupableResourcesCoreImpl<Disk, DiskImpl, DiskInner, DisksInner, ComputeManager>  implements Disks {
    protected DisksImpl(ComputeManager manager) {
        super(manager.inner().disks(), manager);
    }

    @Override
    protected Observable<DiskInner> getInnerAsync(String resourceGroupName, String name) {
        DisksInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        DisksInner client = this.inner();
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
    public PagedList<Disk> listByResourceGroup(String resourceGroupName) {
        DisksInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<Disk> listByResourceGroupAsync(String resourceGroupName) {
        DisksInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
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
    public PagedList<Disk> list() {
        DisksInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<Disk> listAsync() {
        DisksInner client = this.inner();
        return client.listAsync()
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
    public DiskImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<AccessUri> grantAccessAsync(String resourceGroupName, String diskName, GrantAccessData grantAccessData) {
        DisksInner client = this.inner();
        return client.grantAccessAsync(resourceGroupName, diskName, grantAccessData)
        .map(new Func1<AccessUriInner, AccessUri>() {
            @Override
            public AccessUri call(AccessUriInner inner) {
                return new AccessUriImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable revokeAccessAsync(String resourceGroupName, String diskName) {
        DisksInner client = this.inner();
        return client.revokeAccessAsync(resourceGroupName, diskName).toCompletable();
    }

    @Override
    protected DiskImpl wrapModel(DiskInner inner) {
        return  new DiskImpl(inner.name(), inner, manager());
    }

    @Override
    protected DiskImpl wrapModel(String name) {
        return new DiskImpl(name, new DiskInner(), this.manager());
    }

}
