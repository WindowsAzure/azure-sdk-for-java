/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationNetworks;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.Network;

class ReplicationNetworksImpl extends WrapperImpl<ReplicationNetworksInner> implements ReplicationNetworks {
    private final RecoveryServicesManager manager;

    ReplicationNetworksImpl(RecoveryServicesManager manager) {
        super(manager.inner().replicationNetworks());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private NetworkImpl wrapModel(NetworkInner inner) {
        return  new NetworkImpl(inner, manager());
    }

    @Override
    public Observable<Network> listByReplicationFabricsAsync(final String fabricName) {
        ReplicationNetworksInner client = this.inner();
        return client.listByReplicationFabricsAsync(fabricName)
        .flatMapIterable(new Func1<Page<NetworkInner>, Iterable<NetworkInner>>() {
            @Override
            public Iterable<NetworkInner> call(Page<NetworkInner> page) {
                return page.items();
            }
        })
        .map(new Func1<NetworkInner, Network>() {
            @Override
            public Network call(NetworkInner inner) {
                return new NetworkImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Network> getAsync(String fabricName, String networkName) {
        ReplicationNetworksInner client = this.inner();
        return client.getAsync(fabricName, networkName)
        .map(new Func1<NetworkInner, Network>() {
            @Override
            public Network call(NetworkInner inner) {
                return new NetworkImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Network> listAsync() {
        ReplicationNetworksInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<NetworkInner>, Iterable<NetworkInner>>() {
            @Override
            public Iterable<NetworkInner> call(Page<NetworkInner> page) {
                return page.items();
            }
        })
        .map(new Func1<NetworkInner, Network>() {
            @Override
            public Network call(NetworkInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
