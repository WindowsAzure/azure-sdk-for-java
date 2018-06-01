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
import com.microsoft.azure.management.network.v2018_05_01.LoadBalancerProbes;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2018_05_01.Probe;

class LoadBalancerProbesImpl extends WrapperImpl<LoadBalancerProbesInner> implements LoadBalancerProbes {
    private final NetworkManager manager;

    LoadBalancerProbesImpl(NetworkManager manager) {
        super(manager.inner().loadBalancerProbes());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    private ProbeImpl wrapModel(ProbeInner inner) {
        return  new ProbeImpl(inner, manager());
    }

    private Observable<Page<ProbeInner>> listNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        LoadBalancerProbesInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<ProbeInner>, Observable<Page<ProbeInner>>>() {
            @Override
            public Observable<Page<ProbeInner>> call(Page<ProbeInner> page) {
                return Observable.just(page).concatWith(listNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<Probe> listAsync(final String resourceGroupName, final String loadBalancerName) {
        LoadBalancerProbesInner client = this.inner();
        return client.listAsync(resourceGroupName, loadBalancerName)
        .flatMap(new Func1<Page<ProbeInner>, Observable<Page<ProbeInner>>>() {
            @Override
            public Observable<Page<ProbeInner>> call(Page<ProbeInner> page) {
                return listNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<ProbeInner>, Iterable<ProbeInner>>() {
            @Override
            public Iterable<ProbeInner> call(Page<ProbeInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProbeInner, Probe>() {
            @Override
            public Probe call(ProbeInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Probe> getAsync(String resourceGroupName, String loadBalancerName, String probeName) {
        LoadBalancerProbesInner client = this.inner();
        return client.getAsync(resourceGroupName, loadBalancerName, probeName)
        .map(new Func1<ProbeInner, Probe>() {
            @Override
            public Probe call(ProbeInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
