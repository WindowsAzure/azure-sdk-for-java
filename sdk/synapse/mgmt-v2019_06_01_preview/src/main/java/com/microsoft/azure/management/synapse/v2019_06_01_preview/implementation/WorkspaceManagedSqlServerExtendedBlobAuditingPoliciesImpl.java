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
import com.microsoft.azure.management.synapse.v2019_06_01_preview.WorkspaceManagedSqlServerExtendedBlobAuditingPolicies;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.ExtendedServerBlobAuditingPolicy;

class WorkspaceManagedSqlServerExtendedBlobAuditingPoliciesImpl extends WrapperImpl<WorkspaceManagedSqlServerExtendedBlobAuditingPoliciesInner> implements WorkspaceManagedSqlServerExtendedBlobAuditingPolicies {
    private final SynapseManager manager;

    WorkspaceManagedSqlServerExtendedBlobAuditingPoliciesImpl(SynapseManager manager) {
        super(manager.inner().workspaceManagedSqlServerExtendedBlobAuditingPolicies());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public ExtendedServerBlobAuditingPolicyImpl define(String name) {
        return wrapModel(name);
    }

    private ExtendedServerBlobAuditingPolicyImpl wrapModel(ExtendedServerBlobAuditingPolicyInner inner) {
        return  new ExtendedServerBlobAuditingPolicyImpl(inner, manager());
    }

    private ExtendedServerBlobAuditingPolicyImpl wrapModel(String name) {
        return new ExtendedServerBlobAuditingPolicyImpl(name, this.manager());
    }

    @Override
    public Observable<ExtendedServerBlobAuditingPolicy> listByWorkspaceAsync(final String resourceGroupName, final String workspaceName) {
        WorkspaceManagedSqlServerExtendedBlobAuditingPoliciesInner client = this.inner();
        return client.listByWorkspaceAsync(resourceGroupName, workspaceName)
        .flatMapIterable(new Func1<Page<ExtendedServerBlobAuditingPolicyInner>, Iterable<ExtendedServerBlobAuditingPolicyInner>>() {
            @Override
            public Iterable<ExtendedServerBlobAuditingPolicyInner> call(Page<ExtendedServerBlobAuditingPolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ExtendedServerBlobAuditingPolicyInner, ExtendedServerBlobAuditingPolicy>() {
            @Override
            public ExtendedServerBlobAuditingPolicy call(ExtendedServerBlobAuditingPolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ExtendedServerBlobAuditingPolicy> getAsync(String resourceGroupName, String workspaceName) {
        WorkspaceManagedSqlServerExtendedBlobAuditingPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName)
        .flatMap(new Func1<ExtendedServerBlobAuditingPolicyInner, Observable<ExtendedServerBlobAuditingPolicy>>() {
            @Override
            public Observable<ExtendedServerBlobAuditingPolicy> call(ExtendedServerBlobAuditingPolicyInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ExtendedServerBlobAuditingPolicy)wrapModel(inner));
                }
            }
       });
    }

}
