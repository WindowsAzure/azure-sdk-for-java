/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.compute.v2020_10_01_preview.AvailabilitySets;
import com.microsoft.azure.management.compute.v2020_10_01_preview.AvailabilitySet;
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
import java.util.List;
import com.microsoft.azure.management.compute.v2020_10_01_preview.AvailabilitySetVirtualMachineSize;

class AvailabilitySetsImpl extends GroupableResourcesCoreImpl<AvailabilitySet, AvailabilitySetImpl, AvailabilitySetInner, AvailabilitySetsInner, ComputeManager>  implements AvailabilitySets {
    protected AvailabilitySetsImpl(ComputeManager manager) {
        super(manager.inner().availabilitySets(), manager);
    }

    @Override
    protected Observable<AvailabilitySetInner> getInnerAsync(String resourceGroupName, String name) {
        AvailabilitySetsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        AvailabilitySetsInner client = this.inner();
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
    public PagedList<AvailabilitySet> listByResourceGroup(String resourceGroupName) {
        AvailabilitySetsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<AvailabilitySet> listByResourceGroupAsync(String resourceGroupName) {
        AvailabilitySetsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<AvailabilitySetInner>, Iterable<AvailabilitySetInner>>() {
            @Override
            public Iterable<AvailabilitySetInner> call(Page<AvailabilitySetInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AvailabilitySetInner, AvailabilitySet>() {
            @Override
            public AvailabilitySet call(AvailabilitySetInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<AvailabilitySet> list() {
        AvailabilitySetsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<AvailabilitySet> listAsync() {
        AvailabilitySetsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<AvailabilitySetInner>, Iterable<AvailabilitySetInner>>() {
            @Override
            public Iterable<AvailabilitySetInner> call(Page<AvailabilitySetInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AvailabilitySetInner, AvailabilitySet>() {
            @Override
            public AvailabilitySet call(AvailabilitySetInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public AvailabilitySetImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected AvailabilitySetImpl wrapModel(AvailabilitySetInner inner) {
        return  new AvailabilitySetImpl(inner.name(), inner, manager());
    }

    @Override
    protected AvailabilitySetImpl wrapModel(String name) {
        return new AvailabilitySetImpl(name, new AvailabilitySetInner(), this.manager());
    }

    private AvailabilitySetVirtualMachineSizeImpl wrapAvailabilitySetVirtualMachineSizeModel(VirtualMachineSizeInner inner) {
        return  new AvailabilitySetVirtualMachineSizeImpl(inner, manager());
    }

    @Override
    public Observable<AvailabilitySetVirtualMachineSize> listAvailableSizesAsync(String resourceGroupName, String availabilitySetName) {
        AvailabilitySetsInner client = this.inner();
        return client.listAvailableSizesAsync(resourceGroupName, availabilitySetName)
        .flatMap(new Func1<List<VirtualMachineSizeInner>, Observable<VirtualMachineSizeInner>>() {
            @Override
            public Observable<VirtualMachineSizeInner> call(List<VirtualMachineSizeInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<VirtualMachineSizeInner, AvailabilitySetVirtualMachineSize>() {
            @Override
            public AvailabilitySetVirtualMachineSize call(VirtualMachineSizeInner inner) {
                return wrapAvailabilitySetVirtualMachineSizeModel(inner);
            }
        });
    }

}
