/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.compute.v2020_12_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.compute.v2020_12_01.DedicatedHostGroups;
import com.microsoft.azure.management.compute.v2020_12_01.DedicatedHostGroup;
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

class DedicatedHostGroupsImpl extends GroupableResourcesCoreImpl<DedicatedHostGroup, DedicatedHostGroupImpl, DedicatedHostGroupInner, DedicatedHostGroupsInner, ComputeManager>  implements DedicatedHostGroups {
    protected DedicatedHostGroupsImpl(ComputeManager manager) {
        super(manager.inner().dedicatedHostGroups(), manager);
    }

    @Override
    protected Observable<DedicatedHostGroupInner> getInnerAsync(String resourceGroupName, String name) {
        DedicatedHostGroupsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        DedicatedHostGroupsInner client = this.inner();
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
    public PagedList<DedicatedHostGroup> listByResourceGroup(String resourceGroupName) {
        DedicatedHostGroupsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<DedicatedHostGroup> listByResourceGroupAsync(String resourceGroupName) {
        DedicatedHostGroupsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<DedicatedHostGroupInner>, Iterable<DedicatedHostGroupInner>>() {
            @Override
            public Iterable<DedicatedHostGroupInner> call(Page<DedicatedHostGroupInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DedicatedHostGroupInner, DedicatedHostGroup>() {
            @Override
            public DedicatedHostGroup call(DedicatedHostGroupInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<DedicatedHostGroup> list() {
        DedicatedHostGroupsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<DedicatedHostGroup> listAsync() {
        DedicatedHostGroupsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<DedicatedHostGroupInner>, Iterable<DedicatedHostGroupInner>>() {
            @Override
            public Iterable<DedicatedHostGroupInner> call(Page<DedicatedHostGroupInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DedicatedHostGroupInner, DedicatedHostGroup>() {
            @Override
            public DedicatedHostGroup call(DedicatedHostGroupInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public DedicatedHostGroupImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected DedicatedHostGroupImpl wrapModel(DedicatedHostGroupInner inner) {
        return  new DedicatedHostGroupImpl(inner.name(), inner, manager());
    }

    @Override
    protected DedicatedHostGroupImpl wrapModel(String name) {
        return new DedicatedHostGroupImpl(name, new DedicatedHostGroupInner(), this.manager());
    }

}
