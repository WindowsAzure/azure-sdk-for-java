/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.hybridcompute.v2020_08_02.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.hybridcompute.v2020_08_02.Machines;
import com.microsoft.azure.management.hybridcompute.v2020_08_02.Machine;
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

class MachinesImpl extends GroupableResourcesCoreImpl<Machine, MachineImpl, MachineInner, MachinesInner, HybridComputeManager>  implements Machines {
    protected MachinesImpl(HybridComputeManager manager) {
        super(manager.inner().machines(), manager);
    }

    @Override
    protected Observable<MachineInner> getInnerAsync(String resourceGroupName, String name) {
        MachinesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        MachinesInner client = this.inner();
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
    public PagedList<Machine> listByResourceGroup(String resourceGroupName) {
        MachinesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<Machine> listByResourceGroupAsync(String resourceGroupName) {
        MachinesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<MachineInner>, Iterable<MachineInner>>() {
            @Override
            public Iterable<MachineInner> call(Page<MachineInner> page) {
                return page.items();
            }
        })
        .map(new Func1<MachineInner, Machine>() {
            @Override
            public Machine call(MachineInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<Machine> list() {
        MachinesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<Machine> listAsync() {
        MachinesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<MachineInner>, Iterable<MachineInner>>() {
            @Override
            public Iterable<MachineInner> call(Page<MachineInner> page) {
                return page.items();
            }
        })
        .map(new Func1<MachineInner, Machine>() {
            @Override
            public Machine call(MachineInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    protected MachineImpl wrapModel(MachineInner inner) {
        return  new MachineImpl(inner.name(), inner, manager());
    }

    @Override
    protected MachineImpl wrapModel(String name) {
        return null; // Model is not creatable
    }

}
