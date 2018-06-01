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
import com.microsoft.azure.management.network.v2018_05_01.LoadBalancerLoadBalancingRules;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2018_05_01.LoadBalancingRule;

class LoadBalancerLoadBalancingRulesImpl extends WrapperImpl<LoadBalancerLoadBalancingRulesInner> implements LoadBalancerLoadBalancingRules {
    private final NetworkManager manager;

    LoadBalancerLoadBalancingRulesImpl(NetworkManager manager) {
        super(manager.inner().loadBalancerLoadBalancingRules());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    private LoadBalancingRuleImpl wrapModel(LoadBalancingRuleInner inner) {
        return  new LoadBalancingRuleImpl(inner, manager());
    }

    private Observable<Page<LoadBalancingRuleInner>> listNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        LoadBalancerLoadBalancingRulesInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<LoadBalancingRuleInner>, Observable<Page<LoadBalancingRuleInner>>>() {
            @Override
            public Observable<Page<LoadBalancingRuleInner>> call(Page<LoadBalancingRuleInner> page) {
                return Observable.just(page).concatWith(listNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<LoadBalancingRule> listAsync(final String resourceGroupName, final String loadBalancerName) {
        LoadBalancerLoadBalancingRulesInner client = this.inner();
        return client.listAsync(resourceGroupName, loadBalancerName)
        .flatMap(new Func1<Page<LoadBalancingRuleInner>, Observable<Page<LoadBalancingRuleInner>>>() {
            @Override
            public Observable<Page<LoadBalancingRuleInner>> call(Page<LoadBalancingRuleInner> page) {
                return listNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<LoadBalancingRuleInner>, Iterable<LoadBalancingRuleInner>>() {
            @Override
            public Iterable<LoadBalancingRuleInner> call(Page<LoadBalancingRuleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<LoadBalancingRuleInner, LoadBalancingRule>() {
            @Override
            public LoadBalancingRule call(LoadBalancingRuleInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<LoadBalancingRule> getAsync(String resourceGroupName, String loadBalancerName, String loadBalancingRuleName) {
        LoadBalancerLoadBalancingRulesInner client = this.inner();
        return client.getAsync(resourceGroupName, loadBalancerName, loadBalancingRuleName)
        .map(new Func1<LoadBalancingRuleInner, LoadBalancingRule>() {
            @Override
            public LoadBalancingRule call(LoadBalancingRuleInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
