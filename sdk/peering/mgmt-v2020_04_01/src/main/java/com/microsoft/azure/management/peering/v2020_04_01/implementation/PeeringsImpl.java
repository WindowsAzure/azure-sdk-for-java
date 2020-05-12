/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.peering.v2020_04_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.peering.v2020_04_01.Peerings;
import com.microsoft.azure.management.peering.v2020_04_01.Peering;
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

class PeeringsImpl extends GroupableResourcesCoreImpl<Peering, PeeringImpl, PeeringInner, PeeringsInner, PeeringManager>  implements Peerings {
    protected PeeringsImpl(PeeringManager manager) {
        super(manager.inner().peerings(), manager);
    }

    @Override
    protected Observable<PeeringInner> getInnerAsync(String resourceGroupName, String name) {
        PeeringsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        PeeringsInner client = this.inner();
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
    public PagedList<Peering> listByResourceGroup(String resourceGroupName) {
        PeeringsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<Peering> listByResourceGroupAsync(String resourceGroupName) {
        PeeringsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<PeeringInner>, Iterable<PeeringInner>>() {
            @Override
            public Iterable<PeeringInner> call(Page<PeeringInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PeeringInner, Peering>() {
            @Override
            public Peering call(PeeringInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<Peering> list() {
        PeeringsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<Peering> listAsync() {
        PeeringsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<PeeringInner>, Iterable<PeeringInner>>() {
            @Override
            public Iterable<PeeringInner> call(Page<PeeringInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PeeringInner, Peering>() {
            @Override
            public Peering call(PeeringInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PeeringImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected PeeringImpl wrapModel(PeeringInner inner) {
        return  new PeeringImpl(inner.name(), inner, manager());
    }

    @Override
    protected PeeringImpl wrapModel(String name) {
        return new PeeringImpl(name, new PeeringInner(), this.manager());
    }

}
