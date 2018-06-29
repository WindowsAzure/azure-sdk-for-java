/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.ProtectedItemOperationStatuses;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupFabricVaultOperationStatus;

class ProtectedItemOperationStatusesImpl extends WrapperImpl<ProtectedItemOperationStatusesInner> implements ProtectedItemOperationStatuses {
    private final RecoveryServicesManager manager;

    ProtectedItemOperationStatusesImpl(RecoveryServicesManager manager) {
        super(manager.inner().protectedItemOperationStatuses());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private BackupFabricVaultOperationStatusImpl wrapModel(OperationStatusInner inner) {
        return  new BackupFabricVaultOperationStatusImpl(inner, manager());
    }

    @Override
    public Observable<BackupFabricVaultOperationStatus> getAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String operationId) {
        ProtectedItemOperationStatusesInner client = this.inner();
        return client.getAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, operationId)
        .map(new Func1<OperationStatusInner, BackupFabricVaultOperationStatus>() {
            @Override
            public BackupFabricVaultOperationStatus call(OperationStatusInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
