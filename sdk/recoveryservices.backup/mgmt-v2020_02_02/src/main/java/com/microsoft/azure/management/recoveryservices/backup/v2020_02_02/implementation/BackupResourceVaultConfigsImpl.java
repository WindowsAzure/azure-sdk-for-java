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

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.BackupResourceVaultConfigs;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.BackupResourceVaultConfigResource;

class BackupResourceVaultConfigsImpl extends WrapperImpl<BackupResourceVaultConfigsInner> implements BackupResourceVaultConfigs {
    private final RecoveryServicesManager manager;

    BackupResourceVaultConfigsImpl(RecoveryServicesManager manager) {
        super(manager.inner().backupResourceVaultConfigs());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<BackupResourceVaultConfigResource> getAsync(String vaultName, String resourceGroupName) {
        BackupResourceVaultConfigsInner client = this.inner();
        return client.getAsync(vaultName, resourceGroupName)
        .map(new Func1<BackupResourceVaultConfigResourceInner, BackupResourceVaultConfigResource>() {
            @Override
            public BackupResourceVaultConfigResource call(BackupResourceVaultConfigResourceInner inner) {
                return new BackupResourceVaultConfigResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BackupResourceVaultConfigResource> updateAsync(String vaultName, String resourceGroupName, BackupResourceVaultConfigResourceInner parameters) {
        BackupResourceVaultConfigsInner client = this.inner();
        return client.updateAsync(vaultName, resourceGroupName, parameters)
        .map(new Func1<BackupResourceVaultConfigResourceInner, BackupResourceVaultConfigResource>() {
            @Override
            public BackupResourceVaultConfigResource call(BackupResourceVaultConfigResourceInner inner) {
                return new BackupResourceVaultConfigResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BackupResourceVaultConfigResource> putAsync(String vaultName, String resourceGroupName, BackupResourceVaultConfigResourceInner parameters) {
        BackupResourceVaultConfigsInner client = this.inner();
        return client.putAsync(vaultName, resourceGroupName, parameters)
        .map(new Func1<BackupResourceVaultConfigResourceInner, BackupResourceVaultConfigResource>() {
            @Override
            public BackupResourceVaultConfigResource call(BackupResourceVaultConfigResourceInner inner) {
                return new BackupResourceVaultConfigResourceImpl(inner, manager());
            }
        });
    }

}
