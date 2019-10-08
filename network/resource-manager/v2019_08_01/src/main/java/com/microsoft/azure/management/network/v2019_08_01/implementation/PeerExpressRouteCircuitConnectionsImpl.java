/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2019_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2019_08_01.PeerExpressRouteCircuitConnections;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2019_08_01.PeerExpressRouteCircuitConnection;

class PeerExpressRouteCircuitConnectionsImpl extends WrapperImpl<PeerExpressRouteCircuitConnectionsInner> implements PeerExpressRouteCircuitConnections {
    private final NetworkManager manager;

    PeerExpressRouteCircuitConnectionsImpl(NetworkManager manager) {
        super(manager.inner().peerExpressRouteCircuitConnections());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    private PeerExpressRouteCircuitConnectionImpl wrapModel(PeerExpressRouteCircuitConnectionInner inner) {
        return  new PeerExpressRouteCircuitConnectionImpl(inner, manager());
    }

    @Override
    public Observable<PeerExpressRouteCircuitConnection> listAsync(final String resourceGroupName, final String circuitName, final String peeringName) {
        PeerExpressRouteCircuitConnectionsInner client = this.inner();
        return client.listAsync(resourceGroupName, circuitName, peeringName)
        .flatMapIterable(new Func1<Page<PeerExpressRouteCircuitConnectionInner>, Iterable<PeerExpressRouteCircuitConnectionInner>>() {
            @Override
            public Iterable<PeerExpressRouteCircuitConnectionInner> call(Page<PeerExpressRouteCircuitConnectionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PeerExpressRouteCircuitConnectionInner, PeerExpressRouteCircuitConnection>() {
            @Override
            public PeerExpressRouteCircuitConnection call(PeerExpressRouteCircuitConnectionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<PeerExpressRouteCircuitConnection> getAsync(String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        PeerExpressRouteCircuitConnectionsInner client = this.inner();
        return client.getAsync(resourceGroupName, circuitName, peeringName, connectionName)
        .flatMap(new Func1<PeerExpressRouteCircuitConnectionInner, Observable<PeerExpressRouteCircuitConnection>>() {
            @Override
            public Observable<PeerExpressRouteCircuitConnection> call(PeerExpressRouteCircuitConnectionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((PeerExpressRouteCircuitConnection)wrapModel(inner));
                }
            }
       });
    }

}
