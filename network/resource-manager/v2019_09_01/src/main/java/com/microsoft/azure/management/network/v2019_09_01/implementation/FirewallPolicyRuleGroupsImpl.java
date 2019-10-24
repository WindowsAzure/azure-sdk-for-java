/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2019_09_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2019_09_01.FirewallPolicyRuleGroups;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2019_09_01.FirewallPolicyRuleGroup;

class FirewallPolicyRuleGroupsImpl extends WrapperImpl<FirewallPolicyRuleGroupsInner> implements FirewallPolicyRuleGroups {
    private final NetworkManager manager;

    FirewallPolicyRuleGroupsImpl(NetworkManager manager) {
        super(manager.inner().firewallPolicyRuleGroups());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public FirewallPolicyRuleGroupImpl define(String name) {
        return wrapModel(name);
    }

    private FirewallPolicyRuleGroupImpl wrapModel(FirewallPolicyRuleGroupInner inner) {
        return  new FirewallPolicyRuleGroupImpl(inner, manager());
    }

    private FirewallPolicyRuleGroupImpl wrapModel(String name) {
        return new FirewallPolicyRuleGroupImpl(name, this.manager());
    }

    @Override
    public Observable<FirewallPolicyRuleGroup> listAsync(final String resourceGroupName, final String firewallPolicyName) {
        FirewallPolicyRuleGroupsInner client = this.inner();
        return client.listAsync(resourceGroupName, firewallPolicyName)
        .flatMapIterable(new Func1<Page<FirewallPolicyRuleGroupInner>, Iterable<FirewallPolicyRuleGroupInner>>() {
            @Override
            public Iterable<FirewallPolicyRuleGroupInner> call(Page<FirewallPolicyRuleGroupInner> page) {
                return page.items();
            }
        })
        .map(new Func1<FirewallPolicyRuleGroupInner, FirewallPolicyRuleGroup>() {
            @Override
            public FirewallPolicyRuleGroup call(FirewallPolicyRuleGroupInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<FirewallPolicyRuleGroup> getAsync(String resourceGroupName, String firewallPolicyName, String ruleGroupName) {
        FirewallPolicyRuleGroupsInner client = this.inner();
        return client.getAsync(resourceGroupName, firewallPolicyName, ruleGroupName)
        .flatMap(new Func1<FirewallPolicyRuleGroupInner, Observable<FirewallPolicyRuleGroup>>() {
            @Override
            public Observable<FirewallPolicyRuleGroup> call(FirewallPolicyRuleGroupInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((FirewallPolicyRuleGroup)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String firewallPolicyName, String ruleGroupName) {
        FirewallPolicyRuleGroupsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, firewallPolicyName, ruleGroupName).toCompletable();
    }

}
