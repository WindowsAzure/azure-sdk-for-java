/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.ProtectedItemOperationResults;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.BackupFabricVaultProtectedItemResource;

class ProtectedItemOperationResultsImpl extends WrapperImpl<ProtectedItemOperationResultsInner> implements ProtectedItemOperationResults {
    private final RecoveryServicesManager manager;

    ProtectedItemOperationResultsImpl(RecoveryServicesManager manager) {
        super(manager.inner().protectedItemOperationResults());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private BackupFabricVaultProtectedItemResourceImpl wrapModel(ProtectedItemResourceInner inner) {
        return  new BackupFabricVaultProtectedItemResourceImpl(inner, manager());
    }

    @Override
    public Observable<BackupFabricVaultProtectedItemResource> getAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String operationId) {
        ProtectedItemOperationResultsInner client = this.inner();
        return client.getAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, operationId)
        .map(new Func1<ProtectedItemResourceInner, BackupFabricVaultProtectedItemResource>() {
            @Override
            public BackupFabricVaultProtectedItemResource call(ProtectedItemResourceInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
