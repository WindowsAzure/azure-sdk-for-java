/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.digitaltwins.v2020_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.digitaltwins.v2020_12_01.PrivateEndpointConnections;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.digitaltwins.v2020_12_01.PrivateEndpointConnectionsResponse;
import com.microsoft.azure.management.digitaltwins.v2020_12_01.PrivateEndpointConnection;

class PrivateEndpointConnectionsImpl extends WrapperImpl<PrivateEndpointConnectionsInner> implements PrivateEndpointConnections {
    private final DigitalTwinsManager manager;

    PrivateEndpointConnectionsImpl(DigitalTwinsManager manager) {
        super(manager.inner().privateEndpointConnections());
        this.manager = manager;
    }

    public DigitalTwinsManager manager() {
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
    public Observable<PrivateEndpointConnectionsResponse> listAsync(String resourceGroupName, String resourceName) {
        PrivateEndpointConnectionsInner client = this.inner();
        return client.listAsync(resourceGroupName, resourceName)
        .map(new Func1<PrivateEndpointConnectionsResponseInner, PrivateEndpointConnectionsResponse>() {
            @Override
            public PrivateEndpointConnectionsResponse call(PrivateEndpointConnectionsResponseInner inner) {
                return new PrivateEndpointConnectionsResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PrivateEndpointConnection> getAsync(String resourceGroupName, String resourceName, String privateEndpointConnectionName) {
        PrivateEndpointConnectionsInner client = this.inner();
        return client.getAsync(resourceGroupName, resourceName, privateEndpointConnectionName)
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
    public Completable deleteAsync(String resourceGroupName, String resourceName, String privateEndpointConnectionName) {
        PrivateEndpointConnectionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, resourceName, privateEndpointConnectionName).toCompletable();
    }

}
