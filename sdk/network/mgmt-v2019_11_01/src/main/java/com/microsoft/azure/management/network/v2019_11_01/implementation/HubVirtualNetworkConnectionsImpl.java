/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2019_11_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2019_11_01.HubVirtualNetworkConnections;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2019_11_01.HubVirtualNetworkConnection;

class HubVirtualNetworkConnectionsImpl extends WrapperImpl<HubVirtualNetworkConnectionsInner> implements HubVirtualNetworkConnections {
    private final NetworkManager manager;

    HubVirtualNetworkConnectionsImpl(NetworkManager manager) {
        super(manager.inner().hubVirtualNetworkConnections());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    private HubVirtualNetworkConnectionImpl wrapModel(HubVirtualNetworkConnectionInner inner) {
        return  new HubVirtualNetworkConnectionImpl(inner, manager());
    }

    @Override
    public Observable<HubVirtualNetworkConnection> listAsync(final String resourceGroupName, final String virtualHubName) {
        HubVirtualNetworkConnectionsInner client = this.inner();
        return client.listAsync(resourceGroupName, virtualHubName)
        .flatMapIterable(new Func1<Page<HubVirtualNetworkConnectionInner>, Iterable<HubVirtualNetworkConnectionInner>>() {
            @Override
            public Iterable<HubVirtualNetworkConnectionInner> call(Page<HubVirtualNetworkConnectionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<HubVirtualNetworkConnectionInner, HubVirtualNetworkConnection>() {
            @Override
            public HubVirtualNetworkConnection call(HubVirtualNetworkConnectionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<HubVirtualNetworkConnection> getAsync(String resourceGroupName, String virtualHubName, String connectionName) {
        HubVirtualNetworkConnectionsInner client = this.inner();
        return client.getAsync(resourceGroupName, virtualHubName, connectionName)
        .flatMap(new Func1<HubVirtualNetworkConnectionInner, Observable<HubVirtualNetworkConnection>>() {
            @Override
            public Observable<HubVirtualNetworkConnection> call(HubVirtualNetworkConnectionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((HubVirtualNetworkConnection)wrapModel(inner));
                }
            }
       });
    }

}
