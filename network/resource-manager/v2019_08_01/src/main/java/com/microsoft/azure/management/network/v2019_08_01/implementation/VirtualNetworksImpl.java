/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2019_08_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2019_08_01.VirtualNetworks;
import com.microsoft.azure.management.network.v2019_08_01.VirtualNetwork;
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
import com.microsoft.azure.management.network.v2019_08_01.IPAddressAvailabilityResult;
import com.microsoft.azure.management.network.v2019_08_01.VirtualNetworkUsage;

class VirtualNetworksImpl extends GroupableResourcesCoreImpl<VirtualNetwork, VirtualNetworkImpl, VirtualNetworkInner, VirtualNetworksInner, NetworkManager>  implements VirtualNetworks {
    protected VirtualNetworksImpl(NetworkManager manager) {
        super(manager.inner().virtualNetworks(), manager);
    }

    @Override
    protected Observable<VirtualNetworkInner> getInnerAsync(String resourceGroupName, String name) {
        VirtualNetworksInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        VirtualNetworksInner client = this.inner();
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
    public PagedList<VirtualNetwork> listByResourceGroup(String resourceGroupName) {
        VirtualNetworksInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<VirtualNetwork> listByResourceGroupAsync(String resourceGroupName) {
        VirtualNetworksInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<VirtualNetworkInner>, Iterable<VirtualNetworkInner>>() {
            @Override
            public Iterable<VirtualNetworkInner> call(Page<VirtualNetworkInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualNetworkInner, VirtualNetwork>() {
            @Override
            public VirtualNetwork call(VirtualNetworkInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<VirtualNetwork> list() {
        VirtualNetworksInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<VirtualNetwork> listAsync() {
        VirtualNetworksInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<VirtualNetworkInner>, Iterable<VirtualNetworkInner>>() {
            @Override
            public Iterable<VirtualNetworkInner> call(Page<VirtualNetworkInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualNetworkInner, VirtualNetwork>() {
            @Override
            public VirtualNetwork call(VirtualNetworkInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public VirtualNetworkImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<IPAddressAvailabilityResult> checkIPAddressAvailabilityAsync(String resourceGroupName, String virtualNetworkName, String ipAddress) {
        VirtualNetworksInner client = this.inner();
        return client.checkIPAddressAvailabilityAsync(resourceGroupName, virtualNetworkName, ipAddress)
        .map(new Func1<IPAddressAvailabilityResultInner, IPAddressAvailabilityResult>() {
            @Override
            public IPAddressAvailabilityResult call(IPAddressAvailabilityResultInner inner) {
                return new IPAddressAvailabilityResultImpl(inner, manager());
            }
        });
    }

    @Override
    protected VirtualNetworkImpl wrapModel(VirtualNetworkInner inner) {
        return  new VirtualNetworkImpl(inner.name(), inner, manager());
    }

    @Override
    protected VirtualNetworkImpl wrapModel(String name) {
        return new VirtualNetworkImpl(name, new VirtualNetworkInner(), this.manager());
    }

    private VirtualNetworkUsageImpl wrapVirtualNetworkUsageModel(VirtualNetworkUsageInner inner) {
        return  new VirtualNetworkUsageImpl(inner, manager());
    }

    @Override
    public Observable<VirtualNetworkUsage> listUsageAsync(final String resourceGroupName, final String virtualNetworkName) {
        VirtualNetworksInner client = this.inner();
        return client.listUsageAsync(resourceGroupName, virtualNetworkName)
        .flatMapIterable(new Func1<Page<VirtualNetworkUsageInner>, Iterable<VirtualNetworkUsageInner>>() {
            @Override
            public Iterable<VirtualNetworkUsageInner> call(Page<VirtualNetworkUsageInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualNetworkUsageInner, VirtualNetworkUsage>() {
            @Override
            public VirtualNetworkUsage call(VirtualNetworkUsageInner inner) {
                return wrapVirtualNetworkUsageModel(inner);
            }
        });
    }

}
