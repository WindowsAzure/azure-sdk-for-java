/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation;

import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.BackupFabricVaultProtectedItemResource;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.Map;

class BackupFabricVaultProtectedItemResourceImpl extends IndexableRefreshableWrapperImpl<BackupFabricVaultProtectedItemResource, ProtectedItemResourceInner> implements BackupFabricVaultProtectedItemResource {
    private final RecoveryServicesManager manager;
    private String vaultName;
    private String resourceGroupName;
    private String fabricName;
    private String containerName;
    private String protectedItemName;
    private String operationId;

    BackupFabricVaultProtectedItemResourceImpl(ProtectedItemResourceInner inner,  RecoveryServicesManager manager) {
        super(null, inner);
        this.manager = manager;
        this.vaultName = IdParsingUtils.getValueFromIdByName(inner.id(), "vaults");
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.fabricName = IdParsingUtils.getValueFromIdByName(inner.id(), "backupFabrics");
        this.containerName = IdParsingUtils.getValueFromIdByName(inner.id(), "protectionContainers");
        this.protectedItemName = IdParsingUtils.getValueFromIdByName(inner.id(), "protectedItems");
        this.operationId = IdParsingUtils.getValueFromIdByName(inner.id(), "operationResults");
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<ProtectedItemResourceInner> getInnerAsync() {
        ProtectedItemOperationResultsInner client = this.manager().inner().protectedItemOperationResults();
        return client.getAsync(this.vaultName, this.resourceGroupName, this.fabricName, this.containerName, this.protectedItemName, this.operationId);
    }



    @Override
    public String eTag() {
        return this.inner().eTag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ProtectedItemInner properties() {
        return this.inner().properties();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
