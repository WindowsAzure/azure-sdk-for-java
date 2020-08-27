/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.redis.v2017_10_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.redis.v2017_10_01.FirewallRules;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.redis.v2017_10_01.RedisFirewallRule;

class FirewallRulesImpl extends WrapperImpl<FirewallRulesInner> implements FirewallRules {
    private final CacheManager manager;

    FirewallRulesImpl(CacheManager manager) {
        super(manager.inner().firewallRules());
        this.manager = manager;
    }

    public CacheManager manager() {
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

    @Override
    public Observable<RedisFirewallRule> listByRedisResourceAsync(final String resourceGroupName, final String cacheName) {
        FirewallRulesInner client = this.inner();
        return client.listByRedisResourceAsync(resourceGroupName, cacheName)
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
        .flatMap(new Func1<RedisFirewallRuleInner, Observable<RedisFirewallRule>>() {
            @Override
            public Observable<RedisFirewallRule> call(RedisFirewallRuleInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((RedisFirewallRule)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String cacheName, String ruleName) {
        FirewallRulesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, cacheName, ruleName).toCompletable();
    }

}
