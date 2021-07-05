// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of LongTermRetentionBackups. */
public interface LongTermRetentionBackups {
    /**
     * Copy an existing long term retention backup.
     *
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @param parameters The parameters needed for long term retention copy request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a LongTermRetentionBackup operation result resource.
     */
    LongTermRetentionBackupOperationResult copy(
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName,
        CopyLongTermRetentionBackupParameters parameters);

    /**
     * Copy an existing long term retention backup.
     *
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @param parameters The parameters needed for long term retention copy request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a LongTermRetentionBackup operation result resource.
     */
    LongTermRetentionBackupOperationResult copy(
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName,
        CopyLongTermRetentionBackupParameters parameters,
        Context context);

    /**
     * Updates an existing long term retention backup.
     *
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @param parameters The requested backup resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a LongTermRetentionBackup operation result resource.
     */
    LongTermRetentionBackupOperationResult update(
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName,
        UpdateLongTermRetentionBackupParameters parameters);

    /**
     * Updates an existing long term retention backup.
     *
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @param parameters The requested backup resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a LongTermRetentionBackup operation result resource.
     */
    LongTermRetentionBackupOperationResult update(
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName,
        UpdateLongTermRetentionBackupParameters parameters,
        Context context);

    /**
     * Gets a long term retention backup.
     *
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a long term retention backup.
     */
    LongTermRetentionBackup get(
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName);

    /**
     * Gets a long term retention backup.
     *
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a long term retention backup.
     */
    Response<LongTermRetentionBackup> getWithResponse(
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName,
        Context context);

    /**
     * Deletes a long term retention backup.
     *
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName);

    /**
     * Deletes a long term retention backup.
     *
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName,
        Context context);

    /**
     * Lists all long term retention backups for a database.
     *
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    PagedIterable<LongTermRetentionBackup> listByDatabase(
        String locationName, String longTermRetentionServerName, String longTermRetentionDatabaseName);

    /**
     * Lists all long term retention backups for a database.
     *
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param onlyLatestPerDatabase Whether or not to only get the latest backup for each database.
     * @param databaseState Whether to query against just live databases, just deleted databases, or all databases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    PagedIterable<LongTermRetentionBackup> listByDatabase(
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        Boolean onlyLatestPerDatabase,
        DatabaseState databaseState,
        Context context);

    /**
     * Lists the long term retention backups for a given location.
     *
     * @param locationName The location of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    PagedIterable<LongTermRetentionBackup> listByLocation(String locationName);

    /**
     * Lists the long term retention backups for a given location.
     *
     * @param locationName The location of the database.
     * @param onlyLatestPerDatabase Whether or not to only get the latest backup for each database.
     * @param databaseState Whether to query against just live databases, just deleted databases, or all databases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    PagedIterable<LongTermRetentionBackup> listByLocation(
        String locationName, Boolean onlyLatestPerDatabase, DatabaseState databaseState, Context context);

    /**
     * Lists the long term retention backups for a given server.
     *
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    PagedIterable<LongTermRetentionBackup> listByServer(String locationName, String longTermRetentionServerName);

    /**
     * Lists the long term retention backups for a given server.
     *
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param onlyLatestPerDatabase Whether or not to only get the latest backup for each database.
     * @param databaseState Whether to query against just live databases, just deleted databases, or all databases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    PagedIterable<LongTermRetentionBackup> listByServer(
        String locationName,
        String longTermRetentionServerName,
        Boolean onlyLatestPerDatabase,
        DatabaseState databaseState,
        Context context);

    /**
     * Copy an existing long term retention backup to a different server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @param parameters The parameters needed for long term retention copy request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a LongTermRetentionBackup operation result resource.
     */
    LongTermRetentionBackupOperationResult copyByResourceGroup(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName,
        CopyLongTermRetentionBackupParameters parameters);

    /**
     * Copy an existing long term retention backup to a different server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @param parameters The parameters needed for long term retention copy request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a LongTermRetentionBackup operation result resource.
     */
    LongTermRetentionBackupOperationResult copyByResourceGroup(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName,
        CopyLongTermRetentionBackupParameters parameters,
        Context context);

    /**
     * Updates an existing long term retention backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @param parameters The requested backup resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a LongTermRetentionBackup operation result resource.
     */
    LongTermRetentionBackupOperationResult updateByResourceGroup(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName,
        UpdateLongTermRetentionBackupParameters parameters);

    /**
     * Updates an existing long term retention backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @param parameters The requested backup resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a LongTermRetentionBackup operation result resource.
     */
    LongTermRetentionBackupOperationResult updateByResourceGroup(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName,
        UpdateLongTermRetentionBackupParameters parameters,
        Context context);

    /**
     * Gets a long term retention backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a long term retention backup.
     */
    LongTermRetentionBackup getByResourceGroup(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName);

    /**
     * Gets a long term retention backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a long term retention backup.
     */
    Response<LongTermRetentionBackup> getByResourceGroupWithResponse(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName,
        Context context);

    /**
     * Deletes a long term retention backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName);

    /**
     * Deletes a long term retention backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param backupName The backup name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        String backupName,
        Context context);

    /**
     * Lists all long term retention backups for a database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    PagedIterable<LongTermRetentionBackup> listByResourceGroupDatabase(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName);

    /**
     * Lists all long term retention backups for a database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param longTermRetentionDatabaseName The name of the database.
     * @param onlyLatestPerDatabase Whether or not to only get the latest backup for each database.
     * @param databaseState Whether to query against just live databases, just deleted databases, or all databases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    PagedIterable<LongTermRetentionBackup> listByResourceGroupDatabase(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        String longTermRetentionDatabaseName,
        Boolean onlyLatestPerDatabase,
        DatabaseState databaseState,
        Context context);

    /**
     * Lists the long term retention backups for a given location.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    PagedIterable<LongTermRetentionBackup> listByResourceGroupLocation(String resourceGroupName, String locationName);

    /**
     * Lists the long term retention backups for a given location.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param onlyLatestPerDatabase Whether or not to only get the latest backup for each database.
     * @param databaseState Whether to query against just live databases, just deleted databases, or all databases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    PagedIterable<LongTermRetentionBackup> listByResourceGroupLocation(
        String resourceGroupName,
        String locationName,
        Boolean onlyLatestPerDatabase,
        DatabaseState databaseState,
        Context context);

    /**
     * Lists the long term retention backups for a given server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    PagedIterable<LongTermRetentionBackup> listByResourceGroupServer(
        String resourceGroupName, String locationName, String longTermRetentionServerName);

    /**
     * Lists the long term retention backups for a given server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The location of the database.
     * @param longTermRetentionServerName The name of the server.
     * @param onlyLatestPerDatabase Whether or not to only get the latest backup for each database.
     * @param databaseState Whether to query against just live databases, just deleted databases, or all databases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of long term retention backups.
     */
    PagedIterable<LongTermRetentionBackup> listByResourceGroupServer(
        String resourceGroupName,
        String locationName,
        String longTermRetentionServerName,
        Boolean onlyLatestPerDatabase,
        DatabaseState databaseState,
        Context context);
}
