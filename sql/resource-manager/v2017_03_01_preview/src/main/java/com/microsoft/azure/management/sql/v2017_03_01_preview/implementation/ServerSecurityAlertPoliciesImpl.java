/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ServerSecurityAlertPolicies;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ServerSecurityAlertPolicy;

class ServerSecurityAlertPoliciesImpl extends WrapperImpl<ServerSecurityAlertPoliciesInner> implements ServerSecurityAlertPolicies {
    private final SqlManager manager;

    ServerSecurityAlertPoliciesImpl(SqlManager manager) {
        super(manager.inner().serverSecurityAlertPolicies());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public ServerSecurityAlertPolicyImpl define(String name) {
        return wrapModel(name);
    }

    private ServerSecurityAlertPolicyImpl wrapModel(ServerSecurityAlertPolicyInner inner) {
        return  new ServerSecurityAlertPolicyImpl(inner, manager());
    }

    private ServerSecurityAlertPolicyImpl wrapModel(String name) {
        return new ServerSecurityAlertPolicyImpl(name, this.manager());
    }

    @Override
    public Observable<ServerSecurityAlertPolicy> listByServerAsync(final String resourceGroupName, final String serverName) {
        ServerSecurityAlertPoliciesInner client = this.inner();
        return client.listByServerAsync(resourceGroupName, serverName)
        .flatMapIterable(new Func1<Page<ServerSecurityAlertPolicyInner>, Iterable<ServerSecurityAlertPolicyInner>>() {
            @Override
            public Iterable<ServerSecurityAlertPolicyInner> call(Page<ServerSecurityAlertPolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ServerSecurityAlertPolicyInner, ServerSecurityAlertPolicy>() {
            @Override
            public ServerSecurityAlertPolicy call(ServerSecurityAlertPolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ServerSecurityAlertPolicy> getAsync(String resourceGroupName, String serverName) {
        ServerSecurityAlertPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName)
        .flatMap(new Func1<ServerSecurityAlertPolicyInner, Observable<ServerSecurityAlertPolicy>>() {
            @Override
            public Observable<ServerSecurityAlertPolicy> call(ServerSecurityAlertPolicyInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ServerSecurityAlertPolicy)wrapModel(inner));
                }
            }
       });
    }

}
