/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 * abc
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.BackupOperationResults;
import rx.Completable;

class BackupOperationResultsImpl extends WrapperImpl<BackupOperationResultsInner> implements BackupOperationResults {
    private final RecoveryServicesManager manager;

    BackupOperationResultsImpl(RecoveryServicesManager manager) {
        super(manager.inner().backupOperationResults());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public Completable getAsync(String vaultName, String resourceGroupName, String operationId) {
        BackupOperationResultsInner client = this.inner();
        return client.getAsync(vaultName, resourceGroupName, operationId).toCompletable();
    }

}
