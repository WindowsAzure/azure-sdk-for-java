/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2019_09_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2019_09_01.VirtualNetworkGatewayConnections;
import com.microsoft.azure.management.network.v2019_09_01.VirtualNetworkGatewayConnection;
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
import com.microsoft.azure.management.network.v2019_09_01.ConnectionSharedKey;
import com.microsoft.azure.management.network.v2019_09_01.ConnectionResetSharedKey;

class VirtualNetworkGatewayConnectionsImpl extends GroupableResourcesCoreImpl<VirtualNetworkGatewayConnection, VirtualNetworkGatewayConnectionImpl, VirtualNetworkGatewayConnectionInner, VirtualNetworkGatewayConnectionsInner, NetworkManager>  implements VirtualNetworkGatewayConnections {
    protected VirtualNetworkGatewayConnectionsImpl(NetworkManager manager) {
        super(manager.inner().virtualNetworkGatewayConnections(), manager);
    }

    @Override
    protected Observable<VirtualNetworkGatewayConnectionInner> getInnerAsync(String resourceGroupName, String name) {
        VirtualNetworkGatewayConnectionsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        VirtualNetworkGatewayConnectionsInner client = this.inner();
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
    public PagedList<VirtualNetworkGatewayConnection> listByResourceGroup(String resourceGroupName) {
        VirtualNetworkGatewayConnectionsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<VirtualNetworkGatewayConnection> listByResourceGroupAsync(String resourceGroupName) {
        VirtualNetworkGatewayConnectionsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<VirtualNetworkGatewayConnectionInner>, Iterable<VirtualNetworkGatewayConnectionInner>>() {
            @Override
            public Iterable<VirtualNetworkGatewayConnectionInner> call(Page<VirtualNetworkGatewayConnectionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualNetworkGatewayConnectionInner, VirtualNetworkGatewayConnection>() {
            @Override
            public VirtualNetworkGatewayConnection call(VirtualNetworkGatewayConnectionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public VirtualNetworkGatewayConnectionImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<ConnectionSharedKey> setSharedKeyAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, ConnectionSharedKeyInner parameters) {
        VirtualNetworkGatewayConnectionsInner client = this.inner();
        return client.setSharedKeyAsync(resourceGroupName, virtualNetworkGatewayConnectionName, parameters)
        .map(new Func1<ConnectionSharedKeyInner, ConnectionSharedKey>() {
            @Override
            public ConnectionSharedKey call(ConnectionSharedKeyInner inner) {
                return new ConnectionSharedKeyImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ConnectionSharedKey> getSharedKeyAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName) {
        VirtualNetworkGatewayConnectionsInner client = this.inner();
        return client.getSharedKeyAsync(resourceGroupName, virtualNetworkGatewayConnectionName)
        .map(new Func1<ConnectionSharedKeyInner, ConnectionSharedKey>() {
            @Override
            public ConnectionSharedKey call(ConnectionSharedKeyInner inner) {
                return new ConnectionSharedKeyImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ConnectionResetSharedKey> resetSharedKeyAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, int keyLength) {
        VirtualNetworkGatewayConnectionsInner client = this.inner();
        return client.resetSharedKeyAsync(resourceGroupName, virtualNetworkGatewayConnectionName, keyLength)
        .map(new Func1<ConnectionResetSharedKeyInner, ConnectionResetSharedKey>() {
            @Override
            public ConnectionResetSharedKey call(ConnectionResetSharedKeyInner inner) {
                return new ConnectionResetSharedKeyImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<String> startPacketCaptureAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName) {
        VirtualNetworkGatewayConnectionsInner client = this.inner();
        return client.startPacketCaptureAsync(resourceGroupName, virtualNetworkGatewayConnectionName)
    ;}

    @Override
    public Observable<String> stopPacketCaptureAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName) {
        VirtualNetworkGatewayConnectionsInner client = this.inner();
        return client.stopPacketCaptureAsync(resourceGroupName, virtualNetworkGatewayConnectionName)
    ;}

    @Override
    protected VirtualNetworkGatewayConnectionImpl wrapModel(VirtualNetworkGatewayConnectionInner inner) {
        return  new VirtualNetworkGatewayConnectionImpl(inner.name(), inner, manager());
    }

    @Override
    protected VirtualNetworkGatewayConnectionImpl wrapModel(String name) {
        return new VirtualNetworkGatewayConnectionImpl(name, new VirtualNetworkGatewayConnectionInner(), this.manager());
    }

}
