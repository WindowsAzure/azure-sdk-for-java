/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2019_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2019_08_01.LoadBalancerOutboundRules;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2019_08_01.OutboundRule;

class LoadBalancerOutboundRulesImpl extends WrapperImpl<LoadBalancerOutboundRulesInner> implements LoadBalancerOutboundRules {
    private final NetworkManager manager;

    LoadBalancerOutboundRulesImpl(NetworkManager manager) {
        super(manager.inner().loadBalancerOutboundRules());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    private OutboundRuleImpl wrapModel(OutboundRuleInner inner) {
        return  new OutboundRuleImpl(inner, manager());
    }

    @Override
    public Observable<OutboundRule> listAsync(final String resourceGroupName, final String loadBalancerName) {
        LoadBalancerOutboundRulesInner client = this.inner();
        return client.listAsync(resourceGroupName, loadBalancerName)
        .flatMapIterable(new Func1<Page<OutboundRuleInner>, Iterable<OutboundRuleInner>>() {
            @Override
            public Iterable<OutboundRuleInner> call(Page<OutboundRuleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<OutboundRuleInner, OutboundRule>() {
            @Override
            public OutboundRule call(OutboundRuleInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<OutboundRule> getAsync(String resourceGroupName, String loadBalancerName, String outboundRuleName) {
        LoadBalancerOutboundRulesInner client = this.inner();
        return client.getAsync(resourceGroupName, loadBalancerName, outboundRuleName)
        .flatMap(new Func1<OutboundRuleInner, Observable<OutboundRule>>() {
            @Override
            public Observable<OutboundRule> call(OutboundRuleInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((OutboundRule)wrapModel(inner));
                }
            }
       });
    }

}
