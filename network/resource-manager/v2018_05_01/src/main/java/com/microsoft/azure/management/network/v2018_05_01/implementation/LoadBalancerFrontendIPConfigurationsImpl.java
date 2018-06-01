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
import com.microsoft.azure.management.network.v2018_05_01.LoadBalancerFrontendIPConfigurations;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2018_05_01.FrontendIPConfiguration;

class LoadBalancerFrontendIPConfigurationsImpl extends WrapperImpl<LoadBalancerFrontendIPConfigurationsInner> implements LoadBalancerFrontendIPConfigurations {
    private final NetworkManager manager;

    LoadBalancerFrontendIPConfigurationsImpl(NetworkManager manager) {
        super(manager.inner().loadBalancerFrontendIPConfigurations());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    private FrontendIPConfigurationImpl wrapModel(FrontendIPConfigurationInner inner) {
        return  new FrontendIPConfigurationImpl(inner, manager());
    }

    private Observable<Page<FrontendIPConfigurationInner>> listNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        LoadBalancerFrontendIPConfigurationsInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<FrontendIPConfigurationInner>, Observable<Page<FrontendIPConfigurationInner>>>() {
            @Override
            public Observable<Page<FrontendIPConfigurationInner>> call(Page<FrontendIPConfigurationInner> page) {
                return Observable.just(page).concatWith(listNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<FrontendIPConfiguration> listAsync(final String resourceGroupName, final String loadBalancerName) {
        LoadBalancerFrontendIPConfigurationsInner client = this.inner();
        return client.listAsync(resourceGroupName, loadBalancerName)
        .flatMap(new Func1<Page<FrontendIPConfigurationInner>, Observable<Page<FrontendIPConfigurationInner>>>() {
            @Override
            public Observable<Page<FrontendIPConfigurationInner>> call(Page<FrontendIPConfigurationInner> page) {
                return listNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<FrontendIPConfigurationInner>, Iterable<FrontendIPConfigurationInner>>() {
            @Override
            public Iterable<FrontendIPConfigurationInner> call(Page<FrontendIPConfigurationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<FrontendIPConfigurationInner, FrontendIPConfiguration>() {
            @Override
            public FrontendIPConfiguration call(FrontendIPConfigurationInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<FrontendIPConfiguration> getAsync(String resourceGroupName, String loadBalancerName, String frontendIPConfigurationName) {
        LoadBalancerFrontendIPConfigurationsInner client = this.inner();
        return client.getAsync(resourceGroupName, loadBalancerName, frontendIPConfigurationName)
        .map(new Func1<FrontendIPConfigurationInner, FrontendIPConfiguration>() {
            @Override
            public FrontendIPConfiguration call(FrontendIPConfigurationInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
