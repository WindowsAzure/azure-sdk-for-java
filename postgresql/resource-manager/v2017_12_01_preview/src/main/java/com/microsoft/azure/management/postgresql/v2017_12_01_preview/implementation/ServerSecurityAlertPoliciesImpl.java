/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.postgresql.v2017_12_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.postgresql.v2017_12_01_preview.ServerSecurityAlertPolicies;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.postgresql.v2017_12_01_preview.ServerSecurityAlertPolicy;

class ServerSecurityAlertPoliciesImpl extends WrapperImpl<ServerSecurityAlertPoliciesInner> implements ServerSecurityAlertPolicies {
    private final PostgreSQLManager manager;

    ServerSecurityAlertPoliciesImpl(PostgreSQLManager manager) {
        super(manager.inner().serverSecurityAlertPolicies());
        this.manager = manager;
    }

    public PostgreSQLManager manager() {
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
    public Observable<ServerSecurityAlertPolicy> getAsync(String resourceGroupName, String serverName) {
        ServerSecurityAlertPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName)
        .map(new Func1<ServerSecurityAlertPolicyInner, ServerSecurityAlertPolicy>() {
            @Override
            public ServerSecurityAlertPolicy call(ServerSecurityAlertPolicyInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
