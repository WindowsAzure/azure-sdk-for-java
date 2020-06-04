/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.eventgrid.v2020_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.eventgrid.v2020_06_01.PrivateEndpointConnections;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.eventgrid.v2020_06_01.PrivateEndpointConnection;

class PrivateEndpointConnectionsImpl extends WrapperImpl<PrivateEndpointConnectionsInner> implements PrivateEndpointConnections {
    private final EventGridManager manager;

    PrivateEndpointConnectionsImpl(EventGridManager manager) {
        super(manager.inner().privateEndpointConnections());
        this.manager = manager;
    }

    public EventGridManager manager() {
        return this.manager;
    }

    private PrivateEndpointConnectionImpl wrapModel(PrivateEndpointConnectionInner inner) {
        return  new PrivateEndpointConnectionImpl(inner, manager());
    }

    @Override
    public Observable<PrivateEndpointConnection> getAsync(String resourceGroupName, String parentType, String parentName, String privateEndpointConnectionName) {
        PrivateEndpointConnectionsInner client = this.inner();
        return client.getAsync(resourceGroupName, parentType, parentName, privateEndpointConnectionName)
        .map(new Func1<PrivateEndpointConnectionInner, PrivateEndpointConnection>() {
            @Override
            public PrivateEndpointConnection call(PrivateEndpointConnectionInner inner) {
                return new PrivateEndpointConnectionImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String parentType, String parentName, String privateEndpointConnectionName) {
        PrivateEndpointConnectionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, parentType, parentName, privateEndpointConnectionName).toCompletable();
    }

    @Override
    public Observable<PrivateEndpointConnection> listByResourceAsync(final String resourceGroupName, final String parentType, final String parentName) {
        PrivateEndpointConnectionsInner client = this.inner();
        return client.listByResourceAsync(resourceGroupName, parentType, parentName)
        .flatMapIterable(new Func1<Page<PrivateEndpointConnectionInner>, Iterable<PrivateEndpointConnectionInner>>() {
            @Override
            public Iterable<PrivateEndpointConnectionInner> call(Page<PrivateEndpointConnectionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PrivateEndpointConnectionInner, PrivateEndpointConnection>() {
            @Override
            public PrivateEndpointConnection call(PrivateEndpointConnectionInner inner) {
                return new PrivateEndpointConnectionImpl(inner, manager());
            }
        });
    }

}
