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

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.ProtectionContainers;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.BackupFabricVaultProtectionContainerResource;
import java.util.List;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.ProtectionContainerResource;
import rx.Completable;

class ProtectionContainersImpl extends WrapperImpl<ProtectionContainersInner> implements ProtectionContainers {
    private final RecoveryServicesManager manager;

    ProtectionContainersImpl(RecoveryServicesManager manager) {
        super(manager.inner().protectionContainers());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private BackupFabricVaultProtectionContainerResourceImpl wrapModel(ProtectionContainerResourceInner inner) {
        return  new BackupFabricVaultProtectionContainerResourceImpl(inner, manager());
    }

    @Override
    public Observable<BackupFabricVaultProtectionContainerResource> getAsync(String vaultName, String resourceGroupName, String fabricName, String containerName) {
        ProtectionContainersInner client = this.inner();
        return client.getAsync(vaultName, resourceGroupName, fabricName, containerName)
        .map(new Func1<ProtectionContainerResourceInner, BackupFabricVaultProtectionContainerResource>() {
            @Override
            public BackupFabricVaultProtectionContainerResource call(ProtectionContainerResourceInner inner) {
                return wrapModel(inner);
            }
       });
    }

    private ProtectionContainerResourceImpl wrapProtectionContainerResourceModel(ProtectionContainerResourceInner inner) {
        return  new ProtectionContainerResourceImpl(inner, manager());
    }

    @Override
    public Observable<ProtectionContainerResource> listAsync(String vaultName, String resourceGroupName) {
        ProtectionContainersInner client = this.inner();
        return client.listAsync(vaultName, resourceGroupName)
        .flatMap(new Func1<List<ProtectionContainerResourceInner>, Observable<ProtectionContainerResourceInner>>() {
            @Override
            public Observable<ProtectionContainerResourceInner> call(List<ProtectionContainerResourceInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ProtectionContainerResourceInner, ProtectionContainerResource>() {
            @Override
            public ProtectionContainerResource call(ProtectionContainerResourceInner inner) {
                return wrapProtectionContainerResourceModel(inner);
            }
        });
    }

    @Override
    public Completable refreshAsync(String vaultName, String resourceGroupName, String fabricName) {
        ProtectionContainersInner client = this.inner();
        return client.refreshAsync(vaultName, resourceGroupName, fabricName).toCompletable();
    }

    @Override
    public Completable unregisterAsync(String resourceGroupName, String vaultName, String identityName) {
        ProtectionContainersInner client = this.inner();
        return client.unregisterAsync(resourceGroupName, vaultName, identityName).toCompletable();
    }

}
