/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2020_03_01.NetworkProfiles;
import com.microsoft.azure.management.network.v2020_03_01.NetworkProfile;
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

class NetworkProfilesImpl extends GroupableResourcesCoreImpl<NetworkProfile, NetworkProfileImpl, NetworkProfileInner, NetworkProfilesInner, NetworkManager>  implements NetworkProfiles {
    protected NetworkProfilesImpl(NetworkManager manager) {
        super(manager.inner().networkProfiles(), manager);
    }

    @Override
    protected Observable<NetworkProfileInner> getInnerAsync(String resourceGroupName, String name) {
        NetworkProfilesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        NetworkProfilesInner client = this.inner();
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
    public PagedList<NetworkProfile> listByResourceGroup(String resourceGroupName) {
        NetworkProfilesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<NetworkProfile> listByResourceGroupAsync(String resourceGroupName) {
        NetworkProfilesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<NetworkProfileInner>, Iterable<NetworkProfileInner>>() {
            @Override
            public Iterable<NetworkProfileInner> call(Page<NetworkProfileInner> page) {
                return page.items();
            }
        })
        .map(new Func1<NetworkProfileInner, NetworkProfile>() {
            @Override
            public NetworkProfile call(NetworkProfileInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<NetworkProfile> list() {
        NetworkProfilesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<NetworkProfile> listAsync() {
        NetworkProfilesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<NetworkProfileInner>, Iterable<NetworkProfileInner>>() {
            @Override
            public Iterable<NetworkProfileInner> call(Page<NetworkProfileInner> page) {
                return page.items();
            }
        })
        .map(new Func1<NetworkProfileInner, NetworkProfile>() {
            @Override
            public NetworkProfile call(NetworkProfileInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public NetworkProfileImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected NetworkProfileImpl wrapModel(NetworkProfileInner inner) {
        return  new NetworkProfileImpl(inner.name(), inner, manager());
    }

    @Override
    protected NetworkProfileImpl wrapModel(String name) {
        return new NetworkProfileImpl(name, new NetworkProfileInner(), this.manager());
    }

}
