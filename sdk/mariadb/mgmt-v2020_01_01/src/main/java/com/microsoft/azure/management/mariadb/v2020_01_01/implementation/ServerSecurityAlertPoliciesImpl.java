/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.mariadb.v2020_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mariadb.v2020_01_01.ServerSecurityAlertPolicies;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.mariadb.v2020_01_01.ServerSecurityAlertPolicy;

class ServerSecurityAlertPoliciesImpl extends WrapperImpl<ServerSecurityAlertPoliciesInner> implements ServerSecurityAlertPolicies {
    private final MariaDBManager manager;

    ServerSecurityAlertPoliciesImpl(MariaDBManager manager) {
        super(manager.inner().serverSecurityAlertPolicies());
        this.manager = manager;
    }

    public MariaDBManager manager() {
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
