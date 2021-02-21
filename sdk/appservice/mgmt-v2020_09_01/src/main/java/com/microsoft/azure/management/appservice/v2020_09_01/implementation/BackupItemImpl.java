/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import com.microsoft.azure.management.appservice.v2020_09_01.BackupItem;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.appservice.v2020_09_01.DatabaseBackupSetting;
import com.microsoft.azure.management.appservice.v2020_09_01.BackupItemStatus;
import com.microsoft.azure.management.appservice.v2020_09_01.SystemData;

class BackupItemImpl extends IndexableRefreshableWrapperImpl<BackupItem, BackupItemInner> implements BackupItem {
    private final AppServiceManager manager;
    private String resourceGroupName;
    private String name;
    private String backupId;

    BackupItemImpl(BackupItemInner inner,  AppServiceManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "sites");
        this.backupId = IdParsingUtils.getValueFromIdByName(inner.id(), "backups");
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<BackupItemInner> getInnerAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.getBackupStatusAsync(this.resourceGroupName, this.name, this.backupId);
    }



    @Override
    public Integer backupId() {
        return this.inner().backupId();
    }

    @Override
    public String backupItemName() {
        return this.inner().backupItemName();
    }

    @Override
    public String blobName() {
        return this.inner().blobName();
    }

    @Override
    public String correlationId() {
        return this.inner().correlationId();
    }

    @Override
    public DateTime created() {
        return this.inner().created();
    }

    @Override
    public List<DatabaseBackupSetting> databases() {
        return this.inner().databases();
    }

    @Override
    public DateTime finishedTimeStamp() {
        return this.inner().finishedTimeStamp();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public DateTime lastRestoreTimeStamp() {
        return this.inner().lastRestoreTimeStamp();
    }

    @Override
    public String log() {
        return this.inner().log();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Boolean scheduled() {
        return this.inner().scheduled();
    }

    @Override
    public Long sizeInBytes() {
        return this.inner().sizeInBytes();
    }

    @Override
    public BackupItemStatus status() {
        return this.inner().status();
    }

    @Override
    public String storageAccountUrl() {
        return this.inner().storageAccountUrl();
    }

    @Override
    public SystemData systemData() {
        return this.inner().systemData();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public Long websiteSizeInBytes() {
        return this.inner().websiteSizeInBytes();
    }

}
