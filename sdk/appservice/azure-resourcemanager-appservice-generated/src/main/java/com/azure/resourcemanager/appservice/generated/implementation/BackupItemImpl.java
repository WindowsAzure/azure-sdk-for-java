// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.BackupItemInner;
import com.azure.resourcemanager.appservice.generated.models.BackupItem;
import com.azure.resourcemanager.appservice.generated.models.BackupItemStatus;
import com.azure.resourcemanager.appservice.generated.models.DatabaseBackupSetting;
import com.azure.resourcemanager.appservice.generated.models.SystemData;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class BackupItemImpl implements BackupItem {
    private BackupItemInner innerObject;

    private final WebSiteManager serviceManager;

    BackupItemImpl(BackupItemInner innerObject, WebSiteManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Integer backupId() {
        return this.innerModel().backupId();
    }

    public String storageAccountUrl() {
        return this.innerModel().storageAccountUrl();
    }

    public String blobName() {
        return this.innerModel().blobName();
    }

    public String namePropertiesName() {
        return this.innerModel().namePropertiesName();
    }

    public BackupItemStatus status() {
        return this.innerModel().status();
    }

    public Long sizeInBytes() {
        return this.innerModel().sizeInBytes();
    }

    public OffsetDateTime created() {
        return this.innerModel().created();
    }

    public String log() {
        return this.innerModel().log();
    }

    public List<DatabaseBackupSetting> databases() {
        List<DatabaseBackupSetting> inner = this.innerModel().databases();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean scheduled() {
        return this.innerModel().scheduled();
    }

    public OffsetDateTime lastRestoreTimestamp() {
        return this.innerModel().lastRestoreTimestamp();
    }

    public OffsetDateTime finishedTimestamp() {
        return this.innerModel().finishedTimestamp();
    }

    public String correlationId() {
        return this.innerModel().correlationId();
    }

    public Long websiteSizeInBytes() {
        return this.innerModel().websiteSizeInBytes();
    }

    public BackupItemInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
