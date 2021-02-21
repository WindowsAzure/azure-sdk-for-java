// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.netapp.fluent.models.BackupInner;
import com.azure.resourcemanager.netapp.models.BackupPatch;

/** An instance of this class provides access to all the operations defined in BackupsClient. */
public interface BackupsClient {
    /**
     * List all backups for a volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Backups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BackupInner> list(String resourceGroupName, String accountName, String poolName, String volumeName);

    /**
     * List all backups for a volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Backups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BackupInner> list(
        String resourceGroupName, String accountName, String poolName, String volumeName, Context context);

    /**
     * Get a particular backup of the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param backupName The name of the backup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a particular backup of the volume.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupInner get(
        String resourceGroupName, String accountName, String poolName, String volumeName, String backupName);

    /**
     * Get a particular backup of the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param backupName The name of the backup.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a particular backup of the volume.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BackupInner> getWithResponse(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String backupName,
        Context context);

    /**
     * Create a backup for the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param backupName The name of the backup.
     * @param body Backup object supplied in the body of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup of a Volume.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<BackupInner>, BackupInner> beginCreate(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String backupName,
        BackupInner body);

    /**
     * Create a backup for the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param backupName The name of the backup.
     * @param body Backup object supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup of a Volume.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<BackupInner>, BackupInner> beginCreate(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String backupName,
        BackupInner body,
        Context context);

    /**
     * Create a backup for the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param backupName The name of the backup.
     * @param body Backup object supplied in the body of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup of a Volume.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupInner create(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String backupName,
        BackupInner body);

    /**
     * Create a backup for the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param backupName The name of the backup.
     * @param body Backup object supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup of a Volume.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupInner create(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String backupName,
        BackupInner body,
        Context context);

    /**
     * Patch a backup for the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param backupName The name of the backup.
     * @param body Backup object supplied in the body of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup of a Volume.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<BackupInner>, BackupInner> beginUpdate(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String backupName,
        BackupPatch body);

    /**
     * Patch a backup for the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param backupName The name of the backup.
     * @param body Backup object supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup of a Volume.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<BackupInner>, BackupInner> beginUpdate(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String backupName,
        BackupPatch body,
        Context context);

    /**
     * Patch a backup for the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param backupName The name of the backup.
     * @param body Backup object supplied in the body of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup of a Volume.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupInner update(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String backupName,
        BackupPatch body);

    /**
     * Patch a backup for the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param backupName The name of the backup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup of a Volume.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupInner update(
        String resourceGroupName, String accountName, String poolName, String volumeName, String backupName);

    /**
     * Patch a backup for the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param backupName The name of the backup.
     * @param body Backup object supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup of a Volume.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackupInner update(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String backupName,
        BackupPatch body,
        Context context);

    /**
     * Delete a backup of the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param backupName The name of the backup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String accountName, String poolName, String volumeName, String backupName);

    /**
     * Delete a backup of the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param backupName The name of the backup.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String backupName,
        Context context);

    /**
     * Delete a backup of the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param backupName The name of the backup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String poolName, String volumeName, String backupName);

    /**
     * Delete a backup of the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param backupName The name of the backup.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String backupName,
        Context context);
}
