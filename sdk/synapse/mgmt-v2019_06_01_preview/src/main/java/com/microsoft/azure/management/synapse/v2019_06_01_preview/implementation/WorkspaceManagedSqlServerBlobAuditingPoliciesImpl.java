/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.WorkspaceManagedSqlServerBlobAuditingPolicies;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.ServerBlobAuditingPolicy;

class WorkspaceManagedSqlServerBlobAuditingPoliciesImpl extends WrapperImpl<WorkspaceManagedSqlServerBlobAuditingPoliciesInner> implements WorkspaceManagedSqlServerBlobAuditingPolicies {
    private final SynapseManager manager;

    WorkspaceManagedSqlServerBlobAuditingPoliciesImpl(SynapseManager manager) {
        super(manager.inner().workspaceManagedSqlServerBlobAuditingPolicies());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public ServerBlobAuditingPolicyImpl define(String name) {
        return wrapModel(name);
    }

    private ServerBlobAuditingPolicyImpl wrapModel(ServerBlobAuditingPolicyInner inner) {
        return  new ServerBlobAuditingPolicyImpl(inner, manager());
    }

    private ServerBlobAuditingPolicyImpl wrapModel(String name) {
        return new ServerBlobAuditingPolicyImpl(name, this.manager());
    }

    @Override
    public Observable<ServerBlobAuditingPolicy> listByWorkspaceAsync(final String resourceGroupName, final String workspaceName) {
        WorkspaceManagedSqlServerBlobAuditingPoliciesInner client = this.inner();
        return client.listByWorkspaceAsync(resourceGroupName, workspaceName)
        .flatMapIterable(new Func1<Page<ServerBlobAuditingPolicyInner>, Iterable<ServerBlobAuditingPolicyInner>>() {
            @Override
            public Iterable<ServerBlobAuditingPolicyInner> call(Page<ServerBlobAuditingPolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ServerBlobAuditingPolicyInner, ServerBlobAuditingPolicy>() {
            @Override
            public ServerBlobAuditingPolicy call(ServerBlobAuditingPolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ServerBlobAuditingPolicy> getAsync(String resourceGroupName, String workspaceName) {
        WorkspaceManagedSqlServerBlobAuditingPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName)
        .flatMap(new Func1<ServerBlobAuditingPolicyInner, Observable<ServerBlobAuditingPolicy>>() {
            @Override
            public Observable<ServerBlobAuditingPolicy> call(ServerBlobAuditingPolicyInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ServerBlobAuditingPolicy)wrapModel(inner));
                }
            }
       });
    }

}
