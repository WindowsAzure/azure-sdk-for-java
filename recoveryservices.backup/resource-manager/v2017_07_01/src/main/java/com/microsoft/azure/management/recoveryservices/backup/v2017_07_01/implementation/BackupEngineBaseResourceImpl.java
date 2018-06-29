/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation;

import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupEngineBaseResource;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupEngineBase;
import java.util.Map;

class BackupEngineBaseResourceImpl extends IndexableRefreshableWrapperImpl<BackupEngineBaseResource, BackupEngineBaseResourceInner> implements BackupEngineBaseResource {
    private final RecoveryServicesManager manager;
    private String vaultName;
    private String resourceGroupName;
    private String backupEngineName;

    BackupEngineBaseResourceImpl(BackupEngineBaseResourceInner inner,  RecoveryServicesManager manager) {
        super(null, inner);
        this.manager = manager;
        this.vaultName = IdParsingUtils.getValueFromIdByName(inner.id(), "vaults");
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.backupEngineName = IdParsingUtils.getValueFromIdByName(inner.id(), "backupEngines");
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<BackupEngineBaseResourceInner> getInnerAsync() {
        BackupEnginesInner client = this.manager().inner().backupEngines();
        return client.getAsync(this.vaultName, this.resourceGroupName, this.backupEngineName);
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
    public BackupEngineBase properties() {
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
