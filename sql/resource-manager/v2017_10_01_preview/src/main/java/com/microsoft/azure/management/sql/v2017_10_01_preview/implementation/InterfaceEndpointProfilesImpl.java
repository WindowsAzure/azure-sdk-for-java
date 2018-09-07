/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2017_10_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2017_10_01_preview.InterfaceEndpointProfiles;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.sql.v2017_10_01_preview.InterfaceEndpointProfile;

class InterfaceEndpointProfilesImpl extends WrapperImpl<InterfaceEndpointProfilesInner> implements InterfaceEndpointProfiles {
    private final SqlManager manager;

    InterfaceEndpointProfilesImpl(SqlManager manager) {
        super(manager.inner().interfaceEndpointProfiles());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public InterfaceEndpointProfileImpl define(String name) {
        return wrapModel(name);
    }

    private InterfaceEndpointProfileImpl wrapModel(InterfaceEndpointProfileInner inner) {
        return  new InterfaceEndpointProfileImpl(inner, manager());
    }

    private InterfaceEndpointProfileImpl wrapModel(String name) {
        return new InterfaceEndpointProfileImpl(name, this.manager());
    }

    @Override
    public Observable<InterfaceEndpointProfile> listByServerAsync(final String resourceGroupName, final String serverName) {
        InterfaceEndpointProfilesInner client = this.inner();
        return client.listByServerAsync(resourceGroupName, serverName)
        .flatMapIterable(new Func1<Page<InterfaceEndpointProfileInner>, Iterable<InterfaceEndpointProfileInner>>() {
            @Override
            public Iterable<InterfaceEndpointProfileInner> call(Page<InterfaceEndpointProfileInner> page) {
                return page.items();
            }
        })
        .map(new Func1<InterfaceEndpointProfileInner, InterfaceEndpointProfile>() {
            @Override
            public InterfaceEndpointProfile call(InterfaceEndpointProfileInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<InterfaceEndpointProfile> getAsync(String resourceGroupName, String serverName, String interfaceEndpointProfileName) {
        InterfaceEndpointProfilesInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, interfaceEndpointProfileName)
        .map(new Func1<InterfaceEndpointProfileInner, InterfaceEndpointProfile>() {
            @Override
            public InterfaceEndpointProfile call(InterfaceEndpointProfileInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serverName, String interfaceEndpointProfileName) {
        InterfaceEndpointProfilesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serverName, interfaceEndpointProfileName).toCompletable();
    }

}
