/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2019_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2019_06_01.RouteFilterRules;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2019_06_01.RouteFilterRule;

class RouteFilterRulesImpl extends WrapperImpl<RouteFilterRulesInner> implements RouteFilterRules {
    private final NetworkManager manager;

    RouteFilterRulesImpl(NetworkManager manager) {
        super(manager.inner().routeFilterRules());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public RouteFilterRuleImpl define(String name) {
        return wrapModel(name);
    }

    private RouteFilterRuleImpl wrapModel(RouteFilterRuleInner inner) {
        return  new RouteFilterRuleImpl(inner, manager());
    }

    private RouteFilterRuleImpl wrapModel(String name) {
        return new RouteFilterRuleImpl(name, this.manager());
    }

    @Override
    public Observable<RouteFilterRule> listByRouteFilterAsync(final String resourceGroupName, final String routeFilterName) {
        RouteFilterRulesInner client = this.inner();
        return client.listByRouteFilterAsync(resourceGroupName, routeFilterName)
        .flatMapIterable(new Func1<Page<RouteFilterRuleInner>, Iterable<RouteFilterRuleInner>>() {
            @Override
            public Iterable<RouteFilterRuleInner> call(Page<RouteFilterRuleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RouteFilterRuleInner, RouteFilterRule>() {
            @Override
            public RouteFilterRule call(RouteFilterRuleInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<RouteFilterRule> getAsync(String resourceGroupName, String routeFilterName, String ruleName) {
        RouteFilterRulesInner client = this.inner();
        return client.getAsync(resourceGroupName, routeFilterName, ruleName)
        .flatMap(new Func1<RouteFilterRuleInner, Observable<RouteFilterRule>>() {
            @Override
            public Observable<RouteFilterRule> call(RouteFilterRuleInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((RouteFilterRule)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String routeFilterName, String ruleName) {
        RouteFilterRulesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, routeFilterName, ruleName).toCompletable();
    }

}
