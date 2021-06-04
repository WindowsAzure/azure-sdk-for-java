// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of BackupEngines. */
public interface BackupEngines {
    /**
     * Backup management servers registered to Recovery Services Vault. Returns a pageable list of servers.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of BackupEngineBase resources.
     */
    PagedIterable<BackupEngineBaseResource> list(String vaultName, String resourceGroupName);

    /**
     * Backup management servers registered to Recovery Services Vault. Returns a pageable list of servers.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of BackupEngineBase resources.
     */
    PagedIterable<BackupEngineBaseResource> list(
        String vaultName, String resourceGroupName, String filter, String skipToken, Context context);

    /**
     * Returns backup management server registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param backupEngineName Name of the backup management server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the base backup engine class.
     */
    BackupEngineBaseResource get(String vaultName, String resourceGroupName, String backupEngineName);

    /**
     * Returns backup management server registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param backupEngineName Name of the backup management server.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the base backup engine class.
     */
    Response<BackupEngineBaseResource> getWithResponse(
        String vaultName,
        String resourceGroupName,
        String backupEngineName,
        String filter,
        String skipToken,
        Context context);
}
