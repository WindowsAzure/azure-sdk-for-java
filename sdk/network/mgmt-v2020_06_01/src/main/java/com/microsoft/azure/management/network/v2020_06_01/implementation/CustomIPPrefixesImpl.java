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
import com.microsoft.azure.management.network.v2020_06_01.CustomIPPrefixes;
import com.microsoft.azure.management.network.v2020_06_01.CustomIpPrefix;
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

class CustomIPPrefixesImpl extends GroupableResourcesCoreImpl<CustomIpPrefix, CustomIpPrefixImpl, CustomIpPrefixInner, CustomIPPrefixesInner, NetworkManager>  implements CustomIPPrefixes {
    protected CustomIPPrefixesImpl(NetworkManager manager) {
        super(manager.inner().customIPPrefixes(), manager);
    }

    @Override
    protected Observable<CustomIpPrefixInner> getInnerAsync(String resourceGroupName, String name) {
        CustomIPPrefixesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        CustomIPPrefixesInner client = this.inner();
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
    public PagedList<CustomIpPrefix> listByResourceGroup(String resourceGroupName) {
        CustomIPPrefixesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<CustomIpPrefix> listByResourceGroupAsync(String resourceGroupName) {
        CustomIPPrefixesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<CustomIpPrefixInner>, Iterable<CustomIpPrefixInner>>() {
            @Override
            public Iterable<CustomIpPrefixInner> call(Page<CustomIpPrefixInner> page) {
                return page.items();
            }
        })
        .map(new Func1<CustomIpPrefixInner, CustomIpPrefix>() {
            @Override
            public CustomIpPrefix call(CustomIpPrefixInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<CustomIpPrefix> list() {
        CustomIPPrefixesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<CustomIpPrefix> listAsync() {
        CustomIPPrefixesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<CustomIpPrefixInner>, Iterable<CustomIpPrefixInner>>() {
            @Override
            public Iterable<CustomIpPrefixInner> call(Page<CustomIpPrefixInner> page) {
                return page.items();
            }
        })
        .map(new Func1<CustomIpPrefixInner, CustomIpPrefix>() {
            @Override
            public CustomIpPrefix call(CustomIpPrefixInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public CustomIpPrefixImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected CustomIpPrefixImpl wrapModel(CustomIpPrefixInner inner) {
        return  new CustomIpPrefixImpl(inner.name(), inner, manager());
    }

    @Override
    protected CustomIpPrefixImpl wrapModel(String name) {
        return new CustomIpPrefixImpl(name, new CustomIpPrefixInner(), this.manager());
    }

}
