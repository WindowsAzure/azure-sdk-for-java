/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.PrivateEndpointConnections;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.PrivateEndpointConnection;

class PrivateEndpointConnectionsImpl extends WrapperImpl<PrivateEndpointConnectionsInner> implements PrivateEndpointConnections {
    private final ContainerRegistryManager manager;

    PrivateEndpointConnectionsImpl(ContainerRegistryManager manager) {
        super(manager.inner().privateEndpointConnections());
        this.manager = manager;
    }

    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public PrivateEndpointConnectionImpl define(String name) {
        return wrapModel(name);
    }

    private PrivateEndpointConnectionImpl wrapModel(PrivateEndpointConnectionInner inner) {
        return  new PrivateEndpointConnectionImpl(inner, manager());
    }

    private PrivateEndpointConnectionImpl wrapModel(String name) {
        return new PrivateEndpointConnectionImpl(name, this.manager());
    }

    @Override
    public Observable<PrivateEndpointConnection> listAsync(final String resourceGroupName, final String registryName) {
        PrivateEndpointConnectionsInner client = this.inner();
        return client.listAsync(resourceGroupName, registryName)
        .flatMapIterable(new Func1<Page<PrivateEndpointConnectionInner>, Iterable<PrivateEndpointConnectionInner>>() {
            @Override
            public Iterable<PrivateEndpointConnectionInner> call(Page<PrivateEndpointConnectionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PrivateEndpointConnectionInner, PrivateEndpointConnection>() {
            @Override
            public PrivateEndpointConnection call(PrivateEndpointConnectionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<PrivateEndpointConnection> getAsync(String resourceGroupName, String registryName, String privateEndpointConnectionName) {
        PrivateEndpointConnectionsInner client = this.inner();
        return client.getAsync(resourceGroupName, registryName, privateEndpointConnectionName)
        .flatMap(new Func1<PrivateEndpointConnectionInner, Observable<PrivateEndpointConnection>>() {
            @Override
            public Observable<PrivateEndpointConnection> call(PrivateEndpointConnectionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((PrivateEndpointConnection)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String registryName, String privateEndpointConnectionName) {
        PrivateEndpointConnectionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, registryName, privateEndpointConnectionName).toCompletable();
    }

}
