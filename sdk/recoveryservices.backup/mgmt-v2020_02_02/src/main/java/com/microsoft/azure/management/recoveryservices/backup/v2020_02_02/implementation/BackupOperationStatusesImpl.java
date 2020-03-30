/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 *
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.BackupOperationStatuses;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.VaultOperationStatus;

class BackupOperationStatusesImpl extends WrapperImpl<BackupOperationStatusesInner> implements BackupOperationStatuses {
    private final RecoveryServicesManager manager;

    BackupOperationStatusesImpl(RecoveryServicesManager manager) {
        super(manager.inner().backupOperationStatuses());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private VaultOperationStatusImpl wrapModel(OperationStatusInner inner) {
        return  new VaultOperationStatusImpl(inner, manager());
    }

    @Override
    public Observable<VaultOperationStatus> getAsync(String vaultName, String resourceGroupName, String operationId) {
        BackupOperationStatusesInner client = this.inner();
        return client.getAsync(vaultName, resourceGroupName, operationId)
        .flatMap(new Func1<OperationStatusInner, Observable<VaultOperationStatus>>() {
            @Override
            public Observable<VaultOperationStatus> call(OperationStatusInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((VaultOperationStatus)wrapModel(inner));
                }
            }
       });
    }

}
