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
import com.microsoft.azure.management.synapse.v2020_12_01.SqlPoolMaintenanceWindows;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2020_12_01.MaintenanceWindows;
import rx.Completable;

class SqlPoolMaintenanceWindowsImpl extends WrapperImpl<SqlPoolMaintenanceWindowsInner> implements SqlPoolMaintenanceWindows {
    private final SynapseManager manager;

    SqlPoolMaintenanceWindowsImpl(SynapseManager manager) {
        super(manager.inner().sqlPoolMaintenanceWindows());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public Observable<MaintenanceWindows> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String maintenanceWindowName) {
        SqlPoolMaintenanceWindowsInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, sqlPoolName, maintenanceWindowName)
        .map(new Func1<MaintenanceWindowsInner, MaintenanceWindows>() {
            @Override
            public MaintenanceWindows call(MaintenanceWindowsInner inner) {
                return new MaintenanceWindowsImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable createOrUpdateAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String maintenanceWindowName) {
        SqlPoolMaintenanceWindowsInner client = this.inner();
        return client.createOrUpdateAsync(resourceGroupName, workspaceName, sqlPoolName, maintenanceWindowName).toCompletable();
    }

}
