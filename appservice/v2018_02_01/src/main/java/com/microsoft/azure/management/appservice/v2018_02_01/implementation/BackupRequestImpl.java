/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.BackupRequest;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2018_02_01.BackupSchedule;
import java.util.List;
import com.microsoft.azure.management.appservice.v2018_02_01.DatabaseBackupSetting;

class BackupRequestImpl extends WrapperImpl<BackupRequestInner> implements BackupRequest {
    private final AppServiceManager manager;
    BackupRequestImpl(BackupRequestInner inner, AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public BackupSchedule backupSchedule() {
        return this.inner().backupSchedule();
    }

    @Override
    public List<DatabaseBackupSetting> databases() {
        return this.inner().databases();
    }

    @Override
    public Boolean enabled() {
        return this.inner().enabled();
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
    public String name() {
        return this.inner().name();
    }

    @Override
    public String storageAccountUrl() {
        return this.inner().storageAccountUrl();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
