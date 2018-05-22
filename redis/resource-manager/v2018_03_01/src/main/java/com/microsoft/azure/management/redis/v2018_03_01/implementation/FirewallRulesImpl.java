/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.redis.v2018_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.redis.v2018_03_01.FirewallRules;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.redis.v2018_03_01.RedisFirewallRule;

class FirewallRulesImpl extends WrapperImpl<FirewallRulesInner> implements FirewallRules {
    private final RedisManager manager;

    FirewallRulesImpl(RedisManager manager) {
        super(manager.inner().firewallRules());
        this.manager = manager;
    }

    public RedisManager manager() {
        return this.manager;
    }

    @Override
    public RedisFirewallRuleImpl define(String name) {
        return wrapModel(name);
    }

    private RedisFirewallRuleImpl wrapModel(RedisFirewallRuleInner inner) {
        return  new RedisFirewallRuleImpl(inner, manager());
    }

    private RedisFirewallRuleImpl wrapModel(String name) {
        return new RedisFirewallRuleImpl(name, this.manager());
    }

    private Observable<Page<RedisFirewallRuleInner>> listByRedisResourceNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        FirewallRulesInner client = this.inner();
        return client.listByRedisResourceNextAsync(nextLink)
        .flatMap(new Func1<Page<RedisFirewallRuleInner>, Observable<Page<RedisFirewallRuleInner>>>() {
            @Override
            public Observable<Page<RedisFirewallRuleInner>> call(Page<RedisFirewallRuleInner> page) {
                return Observable.just(page).concatWith(listByRedisResourceNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<RedisFirewallRule> listByRedisResourceAsync(final String resourceGroupName, final String cacheName) {
        FirewallRulesInner client = this.inner();
        return client.listByRedisResourceAsync(resourceGroupName, cacheName)
        .flatMap(new Func1<Page<RedisFirewallRuleInner>, Observable<Page<RedisFirewallRuleInner>>>() {
            @Override
            public Observable<Page<RedisFirewallRuleInner>> call(Page<RedisFirewallRuleInner> page) {
                return listByRedisResourceNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<RedisFirewallRuleInner>, Iterable<RedisFirewallRuleInner>>() {
            @Override
            public Iterable<RedisFirewallRuleInner> call(Page<RedisFirewallRuleInner> page) {
                return page.items();
            }
       })
        .map(new Func1<RedisFirewallRuleInner, RedisFirewallRule>() {
            @Override
            public RedisFirewallRule call(RedisFirewallRuleInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Observable<RedisFirewallRule> getAsync(String resourceGroupName, String cacheName, String ruleName) {
        FirewallRulesInner client = this.inner();
        return client.getAsync(resourceGroupName, cacheName, ruleName)
        .map(new Func1<RedisFirewallRuleInner, RedisFirewallRule>() {
            @Override
            public RedisFirewallRule call(RedisFirewallRuleInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String cacheName, String ruleName) {
        FirewallRulesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, cacheName, ruleName).toCompletable();
    }

}
