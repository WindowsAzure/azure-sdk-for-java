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
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.ProtectionPolicyOperationResults;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.BackupPolicyVaultProtectionPolicyResource;

class ProtectionPolicyOperationResultsImpl extends WrapperImpl<ProtectionPolicyOperationResultsInner> implements ProtectionPolicyOperationResults {
    private final RecoveryServicesManager manager;

    ProtectionPolicyOperationResultsImpl(RecoveryServicesManager manager) {
        super(manager.inner().protectionPolicyOperationResults());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private BackupPolicyVaultProtectionPolicyResourceImpl wrapModel(ProtectionPolicyResourceInner inner) {
        return  new BackupPolicyVaultProtectionPolicyResourceImpl(inner, manager());
    }

    @Override
    public Observable<BackupPolicyVaultProtectionPolicyResource> getAsync(String vaultName, String resourceGroupName, String policyName, String operationId) {
        ProtectionPolicyOperationResultsInner client = this.inner();
        return client.getAsync(vaultName, resourceGroupName, policyName, operationId)
        .flatMap(new Func1<ProtectionPolicyResourceInner, Observable<BackupPolicyVaultProtectionPolicyResource>>() {
            @Override
            public Observable<BackupPolicyVaultProtectionPolicyResource> call(ProtectionPolicyResourceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((BackupPolicyVaultProtectionPolicyResource)wrapModel(inner));
                }
            }
       });
    }

}
