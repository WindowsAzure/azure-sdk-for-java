/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2020_06_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2020_06_01.LoadBalancers;
import com.microsoft.azure.management.network.v2020_06_01.LoadBalancer;
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

class LoadBalancersImpl extends GroupableResourcesCoreImpl<LoadBalancer, LoadBalancerImpl, LoadBalancerInner, LoadBalancersInner, NetworkManager>  implements LoadBalancers {
    protected LoadBalancersImpl(NetworkManager manager) {
        super(manager.inner().loadBalancers(), manager);
    }

    @Override
    protected Observable<LoadBalancerInner> getInnerAsync(String resourceGroupName, String name) {
        LoadBalancersInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        LoadBalancersInner client = this.inner();
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
    public PagedList<LoadBalancer> listByResourceGroup(String resourceGroupName) {
        LoadBalancersInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<LoadBalancer> listByResourceGroupAsync(String resourceGroupName) {
        LoadBalancersInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<LoadBalancerInner>, Iterable<LoadBalancerInner>>() {
            @Override
            public Iterable<LoadBalancerInner> call(Page<LoadBalancerInner> page) {
                return page.items();
            }
        })
        .map(new Func1<LoadBalancerInner, LoadBalancer>() {
            @Override
            public LoadBalancer call(LoadBalancerInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<LoadBalancer> list() {
        LoadBalancersInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<LoadBalancer> listAsync() {
        LoadBalancersInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<LoadBalancerInner>, Iterable<LoadBalancerInner>>() {
            @Override
            public Iterable<LoadBalancerInner> call(Page<LoadBalancerInner> page) {
                return page.items();
            }
        })
        .map(new Func1<LoadBalancerInner, LoadBalancer>() {
            @Override
            public LoadBalancer call(LoadBalancerInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public LoadBalancerImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected LoadBalancerImpl wrapModel(LoadBalancerInner inner) {
        return  new LoadBalancerImpl(inner.name(), inner, manager());
    }

    @Override
    protected LoadBalancerImpl wrapModel(String name) {
        return new LoadBalancerImpl(name, new LoadBalancerInner(), this.manager());
    }

}
