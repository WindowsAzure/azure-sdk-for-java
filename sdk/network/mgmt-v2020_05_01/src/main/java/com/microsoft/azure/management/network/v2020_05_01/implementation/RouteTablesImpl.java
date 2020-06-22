/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2020_05_01.RouteTables;
import com.microsoft.azure.management.network.v2020_05_01.RouteTable;
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

class RouteTablesImpl extends GroupableResourcesCoreImpl<RouteTable, RouteTableImpl, RouteTableInner, RouteTablesInner, NetworkManager>  implements RouteTables {
    protected RouteTablesImpl(NetworkManager manager) {
        super(manager.inner().routeTables(), manager);
    }

    @Override
    protected Observable<RouteTableInner> getInnerAsync(String resourceGroupName, String name) {
        RouteTablesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        RouteTablesInner client = this.inner();
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
    public PagedList<RouteTable> listByResourceGroup(String resourceGroupName) {
        RouteTablesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<RouteTable> listByResourceGroupAsync(String resourceGroupName) {
        RouteTablesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<RouteTableInner>, Iterable<RouteTableInner>>() {
            @Override
            public Iterable<RouteTableInner> call(Page<RouteTableInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RouteTableInner, RouteTable>() {
            @Override
            public RouteTable call(RouteTableInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<RouteTable> list() {
        RouteTablesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<RouteTable> listAsync() {
        RouteTablesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<RouteTableInner>, Iterable<RouteTableInner>>() {
            @Override
            public Iterable<RouteTableInner> call(Page<RouteTableInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RouteTableInner, RouteTable>() {
            @Override
            public RouteTable call(RouteTableInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public RouteTableImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected RouteTableImpl wrapModel(RouteTableInner inner) {
        return  new RouteTableImpl(inner.name(), inner, manager());
    }

    @Override
    protected RouteTableImpl wrapModel(String name) {
        return new RouteTableImpl(name, new RouteTableInner(), this.manager());
    }

}
