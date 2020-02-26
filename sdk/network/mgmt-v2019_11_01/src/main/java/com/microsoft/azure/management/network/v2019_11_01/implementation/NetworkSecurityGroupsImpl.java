/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2019_11_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2019_11_01.NetworkSecurityGroups;
import com.microsoft.azure.management.network.v2019_11_01.NetworkSecurityGroup;
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

class NetworkSecurityGroupsImpl extends GroupableResourcesCoreImpl<NetworkSecurityGroup, NetworkSecurityGroupImpl, NetworkSecurityGroupInner, NetworkSecurityGroupsInner, NetworkManager>  implements NetworkSecurityGroups {
    protected NetworkSecurityGroupsImpl(NetworkManager manager) {
        super(manager.inner().networkSecurityGroups(), manager);
    }

    @Override
    protected Observable<NetworkSecurityGroupInner> getInnerAsync(String resourceGroupName, String name) {
        NetworkSecurityGroupsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        NetworkSecurityGroupsInner client = this.inner();
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
    public PagedList<NetworkSecurityGroup> listByResourceGroup(String resourceGroupName) {
        NetworkSecurityGroupsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<NetworkSecurityGroup> listByResourceGroupAsync(String resourceGroupName) {
        NetworkSecurityGroupsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<NetworkSecurityGroupInner>, Iterable<NetworkSecurityGroupInner>>() {
            @Override
            public Iterable<NetworkSecurityGroupInner> call(Page<NetworkSecurityGroupInner> page) {
                return page.items();
            }
        })
        .map(new Func1<NetworkSecurityGroupInner, NetworkSecurityGroup>() {
            @Override
            public NetworkSecurityGroup call(NetworkSecurityGroupInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<NetworkSecurityGroup> list() {
        NetworkSecurityGroupsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<NetworkSecurityGroup> listAsync() {
        NetworkSecurityGroupsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<NetworkSecurityGroupInner>, Iterable<NetworkSecurityGroupInner>>() {
            @Override
            public Iterable<NetworkSecurityGroupInner> call(Page<NetworkSecurityGroupInner> page) {
                return page.items();
            }
        })
        .map(new Func1<NetworkSecurityGroupInner, NetworkSecurityGroup>() {
            @Override
            public NetworkSecurityGroup call(NetworkSecurityGroupInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public NetworkSecurityGroupImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected NetworkSecurityGroupImpl wrapModel(NetworkSecurityGroupInner inner) {
        return  new NetworkSecurityGroupImpl(inner.name(), inner, manager());
    }

    @Override
    protected NetworkSecurityGroupImpl wrapModel(String name) {
        return new NetworkSecurityGroupImpl(name, new NetworkSecurityGroupInner(), this.manager());
    }

}
