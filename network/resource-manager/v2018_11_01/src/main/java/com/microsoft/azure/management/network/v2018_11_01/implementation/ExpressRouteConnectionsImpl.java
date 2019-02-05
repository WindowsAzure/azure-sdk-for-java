/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2018_11_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2018_11_01.ExpressRouteConnections;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.network.v2018_11_01.ExpressRouteConnectionList;
import com.microsoft.azure.management.network.v2018_11_01.ExpressRouteConnection;

class ExpressRouteConnectionsImpl extends WrapperImpl<ExpressRouteConnectionsInner> implements ExpressRouteConnections {
    private final NetworkManager manager;

    ExpressRouteConnectionsImpl(NetworkManager manager) {
        super(manager.inner().expressRouteConnections());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public ExpressRouteConnectionImpl define(String name) {
        return wrapModel(name);
    }

    private ExpressRouteConnectionImpl wrapModel(ExpressRouteConnectionInner inner) {
        return  new ExpressRouteConnectionImpl(inner, manager());
    }

    private ExpressRouteConnectionImpl wrapModel(String name) {
        return new ExpressRouteConnectionImpl(name, this.manager());
    }

    @Override
    public Observable<ExpressRouteConnectionList> listAsync(String resourceGroupName, String expressRouteGatewayName) {
        ExpressRouteConnectionsInner client = this.inner();
        return client.listAsync(resourceGroupName, expressRouteGatewayName)
        .map(new Func1<ExpressRouteConnectionListInner, ExpressRouteConnectionList>() {
            @Override
            public ExpressRouteConnectionList call(ExpressRouteConnectionListInner inner) {
                return new ExpressRouteConnectionListImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ExpressRouteConnection> getAsync(String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        ExpressRouteConnectionsInner client = this.inner();
        return client.getAsync(resourceGroupName, expressRouteGatewayName, connectionName)
        .map(new Func1<ExpressRouteConnectionInner, ExpressRouteConnection>() {
            @Override
            public ExpressRouteConnection call(ExpressRouteConnectionInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        ExpressRouteConnectionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, expressRouteGatewayName, connectionName).toCompletable();
    }

}
