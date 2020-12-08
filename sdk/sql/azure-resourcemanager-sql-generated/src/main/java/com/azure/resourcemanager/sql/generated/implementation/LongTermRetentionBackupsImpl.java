// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.LongTermRetentionBackupsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.LongTermRetentionBackupInner;
import com.azure.resourcemanager.sql.generated.models.LongTermRetentionBackup;
import com.azure.resourcemanager.sql.generated.models.LongTermRetentionBackups;
import com.azure.resourcemanager.sql.generated.models.LongTermRetentionDatabaseState;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class LongTermRetentionBackupsImpl implements LongTermRetentionBackups {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LongTermRetentionBackupsImpl.class);

    private final LongTermRetentionBackupsClient innerClient;

    private final SqlManager serviceManager;

    public LongTermRetentionBackupsImpl(LongTermRetentionBackupsClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public LongTermRetentionBackup getByResourceGroup(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName) {
        LongTermRetentionBackupInner inner =
            this
                .serviceClient()
                .getByResourceGroup(
                    resourceGroupName,
                    locationName,
                    longTermRetentionServerName,
                    longTermRetentionDatabaseName,
                    backupName);
        if (inner != null) {
            return new LongTermRetentionBackupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LongTermRetentionBackup> getByResourceGroupWithResponse(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName,
        Context context) {
        Response<LongTermRetentionBackupInner> inner =
            this
                .serviceClient()
                .getByResourceGroupWithResponse(
                    resourceGroupName,
                    locationName,
                    longTermRetentionServerName,
                    longTermRetentionDatabaseName,
                    backupName,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LongTermRetentionBackupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName) {
        this
            .serviceClient()
            .deleteByResourceGroup(
                resourceGroupName,
                locationName,
                longTermRetentionServerName,
                longTermRetentionDatabaseName,
                backupName);
    }

    public void deleteByResourceGroup(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName,
        Context context) {
        this
            .serviceClient()
            .deleteByResourceGroup(
                resourceGroupName,
                locationName,
                longTermRetentionServerName,
                longTermRetentionDatabaseName,
                backupName,
                context);
    }

    public PagedIterable<LongTermRetentionBackup> listByResourceGroupDatabase(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName) {
        PagedIterable<LongTermRetentionBackupInner> inner =
            this
                .serviceClient()
                .listByResourceGroupDatabase(
                    resourceGroupName, locationName, longTermRetentionServerName, longTermRetentionDatabaseName);
        return inner.mapPage(inner1 -> new LongTermRetentionBackupImpl(inner1, this.manager()));
    }

    public PagedIterable<LongTermRetentionBackup> listByResourceGroupDatabase(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        Boolean onlyLatestPerDatabase,
        LongTermRetentionDatabaseState databaseState,
        Context context) {
        PagedIterable<LongTermRetentionBackupInner> inner =
            this
                .serviceClient()
                .listByResourceGroupDatabase(
                    resourceGroupName,
                    locationName,
                    longTermRetentionServerName,
                    longTermRetentionDatabaseName,
                    onlyLatestPerDatabase,
                    databaseState,
                    context);
        return inner.mapPage(inner1 -> new LongTermRetentionBackupImpl(inner1, this.manager()));
    }

    public PagedIterable<LongTermRetentionBackup> listByResourceGroupLocation(
        String resourceGroupName, String locationName) {
        PagedIterable<LongTermRetentionBackupInner> inner =
            this.serviceClient().listByResourceGroupLocation(resourceGroupName, locationName);
        return inner.mapPage(inner1 -> new LongTermRetentionBackupImpl(inner1, this.manager()));
    }

    public PagedIterable<LongTermRetentionBackup> listByResourceGroupLocation(
        String resourceGroupName,
        String locationName,
        Boolean onlyLatestPerDatabase,
        LongTermRetentionDatabaseState databaseState,
        Context context) {
        PagedIterable<LongTermRetentionBackupInner> inner =
            this
                .serviceClient()
                .listByResourceGroupLocation(
                    resourceGroupName, locationName, onlyLatestPerDatabase, databaseState, context);
        return inner.mapPage(inner1 -> new LongTermRetentionBackupImpl(inner1, this.manager()));
    }

    public PagedIterable<LongTermRetentionBackup> listByResourceGroupServer(
        String resourceGroupName, String locationName, String longTermRetentionServerName) {
        PagedIterable<LongTermRetentionBackupInner> inner =
            this
                .serviceClient()
                .listByResourceGroupServer(resourceGroupName, locationName, longTermRetentionServerName);
        return inner.mapPage(inner1 -> new LongTermRetentionBackupImpl(inner1, this.manager()));
    }

    public PagedIterable<LongTermRetentionBackup> listByResourceGroupServer(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        Boolean onlyLatestPerDatabase,
        LongTermRetentionDatabaseState databaseState,
        Context context) {
        PagedIterable<LongTermRetentionBackupInner> inner =
            this
                .serviceClient()
                .listByResourceGroupServer(
                    resourceGroupName,
                    locationName,
                    longTermRetentionServerName,
                    onlyLatestPerDatabase,
                    databaseState,
                    context);
        return inner.mapPage(inner1 -> new LongTermRetentionBackupImpl(inner1, this.manager()));
    }

    public LongTermRetentionBackup get(
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName) {
        LongTermRetentionBackupInner inner =
            this
                .serviceClient()
                .get(locationName, longTermRetentionServerName, longTermRetentionDatabaseName, backupName);
        if (inner != null) {
            return new LongTermRetentionBackupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LongTermRetentionBackup> getWithResponse(
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName,
        Context context) {
        Response<LongTermRetentionBackupInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    locationName, longTermRetentionServerName, longTermRetentionDatabaseName, backupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LongTermRetentionBackupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName) {
        this
            .serviceClient()
            .delete(locationName, longTermRetentionServerName, longTermRetentionDatabaseName, backupName);
    }

    public void delete(
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName,
        Context context) {
        this
            .serviceClient()
            .delete(locationName, longTermRetentionServerName, longTermRetentionDatabaseName, backupName, context);
    }

    public PagedIterable<LongTermRetentionBackup> listByDatabase(
        String locationName, String longTermRetentionServerName, String longTermRetentionDatabaseName) {
        PagedIterable<LongTermRetentionBackupInner> inner =
            this
                .serviceClient()
                .listByDatabase(locationName, longTermRetentionServerName, longTermRetentionDatabaseName);
        return inner.mapPage(inner1 -> new LongTermRetentionBackupImpl(inner1, this.manager()));
    }

    public PagedIterable<LongTermRetentionBackup> listByDatabase(
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        Boolean onlyLatestPerDatabase,
        LongTermRetentionDatabaseState databaseState,
        Context context) {
        PagedIterable<LongTermRetentionBackupInner> inner =
            this
                .serviceClient()
                .listByDatabase(
                    locationName,
                    longTermRetentionServerName,
                    longTermRetentionDatabaseName,
                    onlyLatestPerDatabase,
                    databaseState,
                    context);
        return inner.mapPage(inner1 -> new LongTermRetentionBackupImpl(inner1, this.manager()));
    }

    public PagedIterable<LongTermRetentionBackup> listByLocation(String locationName) {
        PagedIterable<LongTermRetentionBackupInner> inner = this.serviceClient().listByLocation(locationName);
        return inner.mapPage(inner1 -> new LongTermRetentionBackupImpl(inner1, this.manager()));
    }

    public PagedIterable<LongTermRetentionBackup> listByLocation(
        String locationName,
        Boolean onlyLatestPerDatabase,
        LongTermRetentionDatabaseState databaseState,
        Context context) {
        PagedIterable<LongTermRetentionBackupInner> inner =
            this.serviceClient().listByLocation(locationName, onlyLatestPerDatabase, databaseState, context);
        return inner.mapPage(inner1 -> new LongTermRetentionBackupImpl(inner1, this.manager()));
    }

    public PagedIterable<LongTermRetentionBackup> listByServer(
        String locationName, String longTermRetentionServerName) {
        PagedIterable<LongTermRetentionBackupInner> inner =
            this.serviceClient().listByServer(locationName, longTermRetentionServerName);
        return inner.mapPage(inner1 -> new LongTermRetentionBackupImpl(inner1, this.manager()));
    }

    public PagedIterable<LongTermRetentionBackup> listByServer(
        String locationName,
        String longTermRetentionServerName,
        Boolean onlyLatestPerDatabase,
        LongTermRetentionDatabaseState databaseState,
        Context context) {
        PagedIterable<LongTermRetentionBackupInner> inner =
            this
                .serviceClient()
                .listByServer(locationName, longTermRetentionServerName, onlyLatestPerDatabase, databaseState, context);
        return inner.mapPage(inner1 -> new LongTermRetentionBackupImpl(inner1, this.manager()));
    }

    private LongTermRetentionBackupsClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}
