/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2020_12_01.WorkspaceManagedSqlServerEncryptionProtectors;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.synapse.v2020_12_01.EncryptionProtector;

class WorkspaceManagedSqlServerEncryptionProtectorsImpl extends WrapperImpl<WorkspaceManagedSqlServerEncryptionProtectorsInner> implements WorkspaceManagedSqlServerEncryptionProtectors {
    private final SynapseManager manager;

    WorkspaceManagedSqlServerEncryptionProtectorsImpl(SynapseManager manager) {
        super(manager.inner().workspaceManagedSqlServerEncryptionProtectors());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public Observable<EncryptionProtector> getAsync(String resourceGroupName, String workspaceName) {
        WorkspaceManagedSqlServerEncryptionProtectorsInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName)
        .map(new Func1<EncryptionProtectorInner, EncryptionProtector>() {
            @Override
            public EncryptionProtector call(EncryptionProtectorInner inner) {
                return new EncryptionProtectorImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EncryptionProtector> createOrUpdateAsync(String resourceGroupName, String workspaceName, EncryptionProtectorInner parameters) {
        WorkspaceManagedSqlServerEncryptionProtectorsInner client = this.inner();
        return client.createOrUpdateAsync(resourceGroupName, workspaceName, parameters)
        .map(new Func1<EncryptionProtectorInner, EncryptionProtector>() {
            @Override
            public EncryptionProtector call(EncryptionProtectorInner inner) {
                return new EncryptionProtectorImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EncryptionProtector> listAsync(final String resourceGroupName, final String workspaceName) {
        WorkspaceManagedSqlServerEncryptionProtectorsInner client = this.inner();
        return client.listAsync(resourceGroupName, workspaceName)
        .flatMapIterable(new Func1<Page<EncryptionProtectorInner>, Iterable<EncryptionProtectorInner>>() {
            @Override
            public Iterable<EncryptionProtectorInner> call(Page<EncryptionProtectorInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EncryptionProtectorInner, EncryptionProtector>() {
            @Override
            public EncryptionProtector call(EncryptionProtectorInner inner) {
                return new EncryptionProtectorImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable revalidateAsync(String resourceGroupName, String workspaceName) {
        WorkspaceManagedSqlServerEncryptionProtectorsInner client = this.inner();
        return client.revalidateAsync(resourceGroupName, workspaceName).toCompletable();
    }

}
