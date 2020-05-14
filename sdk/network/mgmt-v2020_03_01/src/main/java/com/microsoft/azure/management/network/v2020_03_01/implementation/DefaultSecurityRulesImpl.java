/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2020_03_01.DefaultSecurityRules;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2020_03_01.NetworkSecurityGroupSecurityRuleModel;

class DefaultSecurityRulesImpl extends WrapperImpl<DefaultSecurityRulesInner> implements DefaultSecurityRules {
    private final NetworkManager manager;

    DefaultSecurityRulesImpl(NetworkManager manager) {
        super(manager.inner().defaultSecurityRules());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    private NetworkSecurityGroupSecurityRuleModelImpl wrapModel(SecurityRuleInner inner) {
        return  new NetworkSecurityGroupSecurityRuleModelImpl(inner, manager());
    }

    @Override
    public Observable<NetworkSecurityGroupSecurityRuleModel> listAsync(final String resourceGroupName, final String networkSecurityGroupName) {
        DefaultSecurityRulesInner client = this.inner();
        return client.listAsync(resourceGroupName, networkSecurityGroupName)
        .flatMapIterable(new Func1<Page<SecurityRuleInner>, Iterable<SecurityRuleInner>>() {
            @Override
            public Iterable<SecurityRuleInner> call(Page<SecurityRuleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SecurityRuleInner, NetworkSecurityGroupSecurityRuleModel>() {
            @Override
            public NetworkSecurityGroupSecurityRuleModel call(SecurityRuleInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<NetworkSecurityGroupSecurityRuleModel> getAsync(String resourceGroupName, String networkSecurityGroupName, String defaultSecurityRuleName) {
        DefaultSecurityRulesInner client = this.inner();
        return client.getAsync(resourceGroupName, networkSecurityGroupName, defaultSecurityRuleName)
        .flatMap(new Func1<SecurityRuleInner, Observable<NetworkSecurityGroupSecurityRuleModel>>() {
            @Override
            public Observable<NetworkSecurityGroupSecurityRuleModel> call(SecurityRuleInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((NetworkSecurityGroupSecurityRuleModel)wrapModel(inner));
                }
            }
       });
    }

}
