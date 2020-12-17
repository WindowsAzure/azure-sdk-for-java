// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Backups. */
public interface Backups {
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
    PagedIterable<Backup> list(String resourceGroupName, String accountName, String poolName, String volumeName);

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
    PagedIterable<Backup> list(
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
    Backup get(String resourceGroupName, String accountName, String poolName, String volumeName, String backupName);

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
    Response<Backup> getWithResponse(
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
    void delete(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String backupName,
        Context context);

    /**
     * Get a particular backup of the volume.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a particular backup of the volume.
     */
    Backup getById(String id);

    /**
     * Get a particular backup of the volume.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a particular backup of the volume.
     */
    Response<Backup> getByIdWithResponse(String id, Context context);

    /**
     * Delete a backup of the volume.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a backup of the volume.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Backup resource.
     *
     * @param name resource name.
     * @return the first stage of the new Backup definition.
     */
    Backup.DefinitionStages.Blank define(String name);
}
