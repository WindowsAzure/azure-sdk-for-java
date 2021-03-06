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
import com.microsoft.azure.management.synapse.v2019_06_01_preview.WorkspaceManagedSqlServerUsages;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.ServerUsage;

class WorkspaceManagedSqlServerUsagesImpl extends WrapperImpl<WorkspaceManagedSqlServerUsagesInner> implements WorkspaceManagedSqlServerUsages {
    private final SynapseManager manager;

    WorkspaceManagedSqlServerUsagesImpl(SynapseManager manager) {
        super(manager.inner().workspaceManagedSqlServerUsages());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    private ServerUsageImpl wrapModel(ServerUsageInner inner) {
        return  new ServerUsageImpl(inner, manager());
    }

    @Override
    public Observable<ServerUsage> listAsync(final String resourceGroupName, final String workspaceName) {
        WorkspaceManagedSqlServerUsagesInner client = this.inner();
        return client.listAsync(resourceGroupName, workspaceName)
        .flatMapIterable(new Func1<Page<ServerUsageInner>, Iterable<ServerUsageInner>>() {
            @Override
            public Iterable<ServerUsageInner> call(Page<ServerUsageInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ServerUsageInner, ServerUsage>() {
            @Override
            public ServerUsage call(ServerUsageInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
