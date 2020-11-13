/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2018_11_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2018_11_01.ExpressRoutePorts;
import com.microsoft.azure.management.network.v2018_11_01.ExpressRoutePort;
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

class ExpressRoutePortsImpl extends GroupableResourcesCoreImpl<ExpressRoutePort, ExpressRoutePortImpl, ExpressRoutePortInner, ExpressRoutePortsInner, NetworkManager>  implements ExpressRoutePorts {
    protected ExpressRoutePortsImpl(NetworkManager manager) {
        super(manager.inner().expressRoutePorts(), manager);
    }

    @Override
    protected Observable<ExpressRoutePortInner> getInnerAsync(String resourceGroupName, String name) {
        ExpressRoutePortsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ExpressRoutePortsInner client = this.inner();
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
    public PagedList<ExpressRoutePort> listByResourceGroup(String resourceGroupName) {
        ExpressRoutePortsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<ExpressRoutePort> listByResourceGroupAsync(String resourceGroupName) {
        ExpressRoutePortsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<ExpressRoutePortInner>, Iterable<ExpressRoutePortInner>>() {
            @Override
            public Iterable<ExpressRoutePortInner> call(Page<ExpressRoutePortInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ExpressRoutePortInner, ExpressRoutePort>() {
            @Override
            public ExpressRoutePort call(ExpressRoutePortInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<ExpressRoutePort> list() {
        ExpressRoutePortsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<ExpressRoutePort> listAsync() {
        ExpressRoutePortsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ExpressRoutePortInner>, Iterable<ExpressRoutePortInner>>() {
            @Override
            public Iterable<ExpressRoutePortInner> call(Page<ExpressRoutePortInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ExpressRoutePortInner, ExpressRoutePort>() {
            @Override
            public ExpressRoutePort call(ExpressRoutePortInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ExpressRoutePortImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected ExpressRoutePortImpl wrapModel(ExpressRoutePortInner inner) {
        return  new ExpressRoutePortImpl(inner.name(), inner, manager());
    }

    @Override
    protected ExpressRoutePortImpl wrapModel(String name) {
        return new ExpressRoutePortImpl(name, new ExpressRoutePortInner(), this.manager());
    }

}
