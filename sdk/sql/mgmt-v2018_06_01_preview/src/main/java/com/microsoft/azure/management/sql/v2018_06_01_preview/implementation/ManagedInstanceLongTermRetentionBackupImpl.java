/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.sql.v2018_06_01_preview.ManagedInstanceLongTermRetentionBackup;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;

class ManagedInstanceLongTermRetentionBackupImpl extends IndexableRefreshableWrapperImpl<ManagedInstanceLongTermRetentionBackup, ManagedInstanceLongTermRetentionBackupInner> implements ManagedInstanceLongTermRetentionBackup {
    private final SqlManager manager;
    private String locationName;
    private String managedInstanceName;
    private String databaseName;
    private String backupName;

    ManagedInstanceLongTermRetentionBackupImpl(ManagedInstanceLongTermRetentionBackupInner inner,  SqlManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.locationName = IdParsingUtils.getValueFromIdByName(inner.id(), "locations");
        this.managedInstanceName = IdParsingUtils.getValueFromIdByName(inner.id(), "longTermRetentionManagedInstances");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "longTermRetentionDatabases");
        this.backupName = IdParsingUtils.getValueFromIdByName(inner.id(), "longTermRetentionManagedInstanceBackups");
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<ManagedInstanceLongTermRetentionBackupInner> getInnerAsync() {
        LongTermRetentionManagedInstanceBackupsInner client = this.manager().inner().longTermRetentionManagedInstanceBackups();
        return client.getAsync(this.locationName, this.managedInstanceName, this.databaseName, this.backupName);
    }



    @Override
    public DateTime backupExpirationTime() {
        return this.inner().backupExpirationTime();
    }

    @Override
    public DateTime backupTime() {
        return this.inner().backupTime();
    }

    @Override
    public DateTime databaseDeletionTime() {
        return this.inner().databaseDeletionTime();
    }

    @Override
    public String databaseName() {
        return this.inner().databaseName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public DateTime managedInstanceCreateTime() {
        return this.inner().managedInstanceCreateTime();
    }

    @Override
    public String managedInstanceName() {
        return this.inner().managedInstanceName();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
