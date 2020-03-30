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
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.ProtectionContainerOperationResults;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.ProtectionContainerBackupFabricVaultProtectionContainerResource;

class ProtectionContainerOperationResultsImpl extends WrapperImpl<ProtectionContainerOperationResultsInner> implements ProtectionContainerOperationResults {
    private final RecoveryServicesManager manager;

    ProtectionContainerOperationResultsImpl(RecoveryServicesManager manager) {
        super(manager.inner().protectionContainerOperationResults());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private ProtectionContainerBackupFabricVaultProtectionContainerResourceImpl wrapModel(ProtectionContainerResourceInner inner) {
        return  new ProtectionContainerBackupFabricVaultProtectionContainerResourceImpl(inner, manager());
    }

    @Override
    public Observable<ProtectionContainerBackupFabricVaultProtectionContainerResource> getAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String operationId) {
        ProtectionContainerOperationResultsInner client = this.inner();
        return client.getAsync(vaultName, resourceGroupName, fabricName, containerName, operationId)
        .flatMap(new Func1<ProtectionContainerResourceInner, Observable<ProtectionContainerBackupFabricVaultProtectionContainerResource>>() {
            @Override
            public Observable<ProtectionContainerBackupFabricVaultProtectionContainerResource> call(ProtectionContainerResourceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ProtectionContainerBackupFabricVaultProtectionContainerResource)wrapModel(inner));
                }
            }
       });
    }

}
