/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.resourcemover.v2021_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resourcemover.v2021_01_01.OperationsDiscoverys;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.resourcemover.v2021_01_01.OperationsDiscoveryCollection;

class OperationsDiscoverysImpl extends WrapperImpl<OperationsDiscoverysInner> implements OperationsDiscoverys {
    private final ResourceMoverManager manager;

    OperationsDiscoverysImpl(ResourceMoverManager manager) {
        super(manager.inner().operationsDiscoverys());
        this.manager = manager;
    }

    public ResourceMoverManager manager() {
        return this.manager;
    }

    @Override
    public Observable<OperationsDiscoveryCollection> getAsync() {
        OperationsDiscoverysInner client = this.inner();
        return client.getAsync()
        .map(new Func1<OperationsDiscoveryCollectionInner, OperationsDiscoveryCollection>() {
            @Override
            public OperationsDiscoveryCollection call(OperationsDiscoveryCollectionInner inner) {
                return new OperationsDiscoveryCollectionImpl(inner, manager());
            }
        });
    }

}
