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
import com.microsoft.azure.management.compute.v2019_11_01.ContainerServices;
import com.microsoft.azure.management.compute.v2019_11_01.ContainerService;
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

class ContainerServicesImpl extends GroupableResourcesCoreImpl<ContainerService, ContainerServiceImpl, ContainerServiceInner, ContainerServicesInner, ComputeManager>  implements ContainerServices {
    protected ContainerServicesImpl(ComputeManager manager) {
        super(manager.inner().containerServices(), manager);
    }

    @Override
    protected Observable<ContainerServiceInner> getInnerAsync(String resourceGroupName, String name) {
        ContainerServicesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ContainerServicesInner client = this.inner();
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
    public PagedList<ContainerService> listByResourceGroup(String resourceGroupName) {
        ContainerServicesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<ContainerService> listByResourceGroupAsync(String resourceGroupName) {
        ContainerServicesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<ContainerServiceInner>, Iterable<ContainerServiceInner>>() {
            @Override
            public Iterable<ContainerServiceInner> call(Page<ContainerServiceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ContainerServiceInner, ContainerService>() {
            @Override
            public ContainerService call(ContainerServiceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<ContainerService> list() {
        ContainerServicesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<ContainerService> listAsync() {
        ContainerServicesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ContainerServiceInner>, Iterable<ContainerServiceInner>>() {
            @Override
            public Iterable<ContainerServiceInner> call(Page<ContainerServiceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ContainerServiceInner, ContainerService>() {
            @Override
            public ContainerService call(ContainerServiceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ContainerServiceImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected ContainerServiceImpl wrapModel(ContainerServiceInner inner) {
        return  new ContainerServiceImpl(inner.name(), inner, manager());
    }

    @Override
    protected ContainerServiceImpl wrapModel(String name) {
        return new ContainerServiceImpl(name, new ContainerServiceInner(), this.manager());
    }

}
