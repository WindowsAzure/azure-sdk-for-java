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
import com.microsoft.azure.management.network.v2019_08_01.P2sVpnGateways;
import com.microsoft.azure.management.network.v2019_08_01.P2SVpnGateway;
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
import com.microsoft.azure.management.network.v2019_08_01.VpnProfileResponse;
import com.microsoft.azure.management.network.v2019_08_01.P2SVpnConnectionHealth;
import com.microsoft.azure.management.network.v2019_08_01.P2SVpnConnectionHealthRequest;

class P2sVpnGatewaysImpl extends GroupableResourcesCoreImpl<P2SVpnGateway, P2SVpnGatewayImpl, P2SVpnGatewayInner, P2sVpnGatewaysInner, NetworkManager>  implements P2sVpnGateways {
    protected P2sVpnGatewaysImpl(NetworkManager manager) {
        super(manager.inner().p2sVpnGateways(), manager);
    }

    @Override
    protected Observable<P2SVpnGatewayInner> getInnerAsync(String resourceGroupName, String name) {
        P2sVpnGatewaysInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        P2sVpnGatewaysInner client = this.inner();
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
    public PagedList<P2SVpnGateway> listByResourceGroup(String resourceGroupName) {
        P2sVpnGatewaysInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<P2SVpnGateway> listByResourceGroupAsync(String resourceGroupName) {
        P2sVpnGatewaysInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<P2SVpnGatewayInner>, Iterable<P2SVpnGatewayInner>>() {
            @Override
            public Iterable<P2SVpnGatewayInner> call(Page<P2SVpnGatewayInner> page) {
                return page.items();
            }
        })
        .map(new Func1<P2SVpnGatewayInner, P2SVpnGateway>() {
            @Override
            public P2SVpnGateway call(P2SVpnGatewayInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<P2SVpnGateway> list() {
        P2sVpnGatewaysInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<P2SVpnGateway> listAsync() {
        P2sVpnGatewaysInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<P2SVpnGatewayInner>, Iterable<P2SVpnGatewayInner>>() {
            @Override
            public Iterable<P2SVpnGatewayInner> call(Page<P2SVpnGatewayInner> page) {
                return page.items();
            }
        })
        .map(new Func1<P2SVpnGatewayInner, P2SVpnGateway>() {
            @Override
            public P2SVpnGateway call(P2SVpnGatewayInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public P2SVpnGatewayImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<VpnProfileResponse> generateVpnProfileAsync(String resourceGroupName, String gatewayName) {
        P2sVpnGatewaysInner client = this.inner();
        return client.generateVpnProfileAsync(resourceGroupName, gatewayName)
        .map(new Func1<VpnProfileResponseInner, VpnProfileResponse>() {
            @Override
            public VpnProfileResponse call(VpnProfileResponseInner inner) {
                return new VpnProfileResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<P2SVpnGateway> getP2sVpnConnectionHealthAsync(String resourceGroupName, String gatewayName) {
        P2sVpnGatewaysInner client = this.inner();
        return client.getP2sVpnConnectionHealthAsync(resourceGroupName, gatewayName)
        .map(new Func1<P2SVpnGatewayInner, P2SVpnGateway>() {
            @Override
            public P2SVpnGateway call(P2SVpnGatewayInner inner) {
                return new P2SVpnGatewayImpl(inner.name(), inner, manager());
            }
        });
    }

    @Override
    public Observable<P2SVpnConnectionHealth> getP2sVpnConnectionHealthDetailedAsync(String resourceGroupName, String gatewayName, P2SVpnConnectionHealthRequest request) {
        P2sVpnGatewaysInner client = this.inner();
        return client.getP2sVpnConnectionHealthDetailedAsync(resourceGroupName, gatewayName, request)
        .map(new Func1<P2SVpnConnectionHealthInner, P2SVpnConnectionHealth>() {
            @Override
            public P2SVpnConnectionHealth call(P2SVpnConnectionHealthInner inner) {
                return new P2SVpnConnectionHealthImpl(inner, manager());
            }
        });
    }

    @Override
    protected P2SVpnGatewayImpl wrapModel(P2SVpnGatewayInner inner) {
        return  new P2SVpnGatewayImpl(inner.name(), inner, manager());
    }

    @Override
    protected P2SVpnGatewayImpl wrapModel(String name) {
        return new P2SVpnGatewayImpl(name, new P2SVpnGatewayInner(), this.manager());
    }

}
