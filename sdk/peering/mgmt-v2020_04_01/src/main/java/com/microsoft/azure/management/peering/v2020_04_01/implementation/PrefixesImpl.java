/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.peering.v2020_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.peering.v2020_04_01.Prefixes;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.peering.v2020_04_01.PeeringServicePrefix;

class PrefixesImpl extends WrapperImpl<PrefixesInner> implements Prefixes {
    private final PeeringManager manager;

    PrefixesImpl(PeeringManager manager) {
        super(manager.inner().prefixes());
        this.manager = manager;
    }

    public PeeringManager manager() {
        return this.manager;
    }

    @Override
    public PeeringServicePrefixImpl define(String name) {
        return wrapModel(name);
    }

    private PeeringServicePrefixImpl wrapModel(PeeringServicePrefixInner inner) {
        return  new PeeringServicePrefixImpl(inner, manager());
    }

    private PeeringServicePrefixImpl wrapModel(String name) {
        return new PeeringServicePrefixImpl(name, this.manager());
    }

    @Override
    public Observable<PeeringServicePrefix> listByPeeringServiceAsync(final String resourceGroupName, final String peeringServiceName) {
        PrefixesInner client = this.inner();
        return client.listByPeeringServiceAsync(resourceGroupName, peeringServiceName)
        .flatMapIterable(new Func1<Page<PeeringServicePrefixInner>, Iterable<PeeringServicePrefixInner>>() {
            @Override
            public Iterable<PeeringServicePrefixInner> call(Page<PeeringServicePrefixInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PeeringServicePrefixInner, PeeringServicePrefix>() {
            @Override
            public PeeringServicePrefix call(PeeringServicePrefixInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<PeeringServicePrefix> getAsync(String resourceGroupName, String peeringServiceName, String prefixName) {
        PrefixesInner client = this.inner();
        return client.getAsync(resourceGroupName, peeringServiceName, prefixName)
        .flatMap(new Func1<PeeringServicePrefixInner, Observable<PeeringServicePrefix>>() {
            @Override
            public Observable<PeeringServicePrefix> call(PeeringServicePrefixInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((PeeringServicePrefix)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String peeringServiceName, String prefixName) {
        PrefixesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, peeringServiceName, prefixName).toCompletable();
    }

}
