/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2014_04_01.BackupLongTermRetentionPolicies;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.sql.v2014_04_01.BackupLongTermRetentionPolicy;

class BackupLongTermRetentionPoliciesImpl extends WrapperImpl<BackupLongTermRetentionPoliciesInner> implements BackupLongTermRetentionPolicies {
    private final SqlManager manager;

    BackupLongTermRetentionPoliciesImpl(SqlManager manager) {
        super(manager.inner().backupLongTermRetentionPolicies());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public BackupLongTermRetentionPolicyImpl define(String name) {
        return wrapModel(name);
    }

    private BackupLongTermRetentionPolicyImpl wrapModel(BackupLongTermRetentionPolicyInner inner) {
        return  new BackupLongTermRetentionPolicyImpl(inner, manager());
    }

    private BackupLongTermRetentionPolicyImpl wrapModel(String name) {
        return new BackupLongTermRetentionPolicyImpl(name, this.manager());
    }

    @Override
    public Observable<BackupLongTermRetentionPolicy> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName) {
        BackupLongTermRetentionPoliciesInner client = this.inner();
        return client.listByDatabaseAsync(resourceGroupName, serverName, databaseName)
        .flatMap(new Func1<List<BackupLongTermRetentionPolicyInner>, Observable<BackupLongTermRetentionPolicyInner>>() {
            @Override
            public Observable<BackupLongTermRetentionPolicyInner> call(List<BackupLongTermRetentionPolicyInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<BackupLongTermRetentionPolicyInner, BackupLongTermRetentionPolicy>() {
            @Override
            public BackupLongTermRetentionPolicy call(BackupLongTermRetentionPolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<BackupLongTermRetentionPolicy> getAsync(String resourceGroupName, String serverName, String databaseName) {
        BackupLongTermRetentionPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, databaseName)
        .flatMap(new Func1<BackupLongTermRetentionPolicyInner, Observable<BackupLongTermRetentionPolicy>>() {
            @Override
            public Observable<BackupLongTermRetentionPolicy> call(BackupLongTermRetentionPolicyInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((BackupLongTermRetentionPolicy)wrapModel(inner));
                }
            }
       });
    }

}
