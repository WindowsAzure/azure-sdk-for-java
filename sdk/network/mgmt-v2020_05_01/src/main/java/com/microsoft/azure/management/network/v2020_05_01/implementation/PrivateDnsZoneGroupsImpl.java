/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2020_05_01.PrivateDnsZoneGroups;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2020_05_01.PrivateDnsZoneGroup;

class PrivateDnsZoneGroupsImpl extends WrapperImpl<PrivateDnsZoneGroupsInner> implements PrivateDnsZoneGroups {
    private final NetworkManager manager;

    PrivateDnsZoneGroupsImpl(NetworkManager manager) {
        super(manager.inner().privateDnsZoneGroups());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public PrivateDnsZoneGroupImpl define(String name) {
        return wrapModel(name);
    }

    private PrivateDnsZoneGroupImpl wrapModel(PrivateDnsZoneGroupInner inner) {
        return  new PrivateDnsZoneGroupImpl(inner, manager());
    }

    private PrivateDnsZoneGroupImpl wrapModel(String name) {
        return new PrivateDnsZoneGroupImpl(name, this.manager());
    }

    @Override
    public Observable<PrivateDnsZoneGroup> listAsync(final String privateEndpointName, final String resourceGroupName) {
        PrivateDnsZoneGroupsInner client = this.inner();
        return client.listAsync(privateEndpointName, resourceGroupName)
        .flatMapIterable(new Func1<Page<PrivateDnsZoneGroupInner>, Iterable<PrivateDnsZoneGroupInner>>() {
            @Override
            public Iterable<PrivateDnsZoneGroupInner> call(Page<PrivateDnsZoneGroupInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PrivateDnsZoneGroupInner, PrivateDnsZoneGroup>() {
            @Override
            public PrivateDnsZoneGroup call(PrivateDnsZoneGroupInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<PrivateDnsZoneGroup> getAsync(String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName) {
        PrivateDnsZoneGroupsInner client = this.inner();
        return client.getAsync(resourceGroupName, privateEndpointName, privateDnsZoneGroupName)
        .flatMap(new Func1<PrivateDnsZoneGroupInner, Observable<PrivateDnsZoneGroup>>() {
            @Override
            public Observable<PrivateDnsZoneGroup> call(PrivateDnsZoneGroupInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((PrivateDnsZoneGroup)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName) {
        PrivateDnsZoneGroupsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, privateEndpointName, privateDnsZoneGroupName).toCompletable();
    }

}
