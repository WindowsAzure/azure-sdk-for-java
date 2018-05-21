/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2018_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2018_05_01.ExpressRouteCircuitPeerings;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2018_05_01.ExpressRouteCircuitPeering;

class ExpressRouteCircuitPeeringsImpl extends WrapperImpl<ExpressRouteCircuitPeeringsInner> implements ExpressRouteCircuitPeerings {
    private final NetworkManager manager;

    ExpressRouteCircuitPeeringsImpl(NetworkManager manager) {
        super(manager.inner().expressRouteCircuitPeerings());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public ExpressRouteCircuitPeeringImpl define(String name) {
        return wrapModel(name);
    }

    private ExpressRouteCircuitPeeringImpl wrapModel(ExpressRouteCircuitPeeringInner inner) {
        return  new ExpressRouteCircuitPeeringImpl(inner, manager());
    }

    private ExpressRouteCircuitPeeringImpl wrapModel(String name) {
        return new ExpressRouteCircuitPeeringImpl(name, this.manager());
    }

    private Observable<Page<ExpressRouteCircuitPeeringInner>> listNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        ExpressRouteCircuitPeeringsInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<ExpressRouteCircuitPeeringInner>, Observable<Page<ExpressRouteCircuitPeeringInner>>>() {
            @Override
            public Observable<Page<ExpressRouteCircuitPeeringInner>> call(Page<ExpressRouteCircuitPeeringInner> page) {
                return Observable.just(page).concatWith(listNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<ExpressRouteCircuitPeering> listAsync(final String resourceGroupName, final String circuitName) {
        ExpressRouteCircuitPeeringsInner client = this.inner();
        return client.listAsync(resourceGroupName, circuitName)
        .flatMap(new Func1<Page<ExpressRouteCircuitPeeringInner>, Observable<Page<ExpressRouteCircuitPeeringInner>>>() {
            @Override
            public Observable<Page<ExpressRouteCircuitPeeringInner>> call(Page<ExpressRouteCircuitPeeringInner> page) {
                return listNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<ExpressRouteCircuitPeeringInner>, Iterable<ExpressRouteCircuitPeeringInner>>() {
            @Override
            public Iterable<ExpressRouteCircuitPeeringInner> call(Page<ExpressRouteCircuitPeeringInner> page) {
                return page.items();
            }
       })
        .map(new Func1<ExpressRouteCircuitPeeringInner, ExpressRouteCircuitPeering>() {
            @Override
            public ExpressRouteCircuitPeering call(ExpressRouteCircuitPeeringInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Observable<ExpressRouteCircuitPeering> getAsync(String resourceGroupName, String circuitName, String peeringName) {
        ExpressRouteCircuitPeeringsInner client = this.inner();
        return client.getAsync(resourceGroupName, circuitName, peeringName)
        .map(new Func1<ExpressRouteCircuitPeeringInner, ExpressRouteCircuitPeering>() {
            @Override
            public ExpressRouteCircuitPeering call(ExpressRouteCircuitPeeringInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String circuitName, String peeringName) {
        ExpressRouteCircuitPeeringsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, circuitName, peeringName).toCompletable();
    }

}
