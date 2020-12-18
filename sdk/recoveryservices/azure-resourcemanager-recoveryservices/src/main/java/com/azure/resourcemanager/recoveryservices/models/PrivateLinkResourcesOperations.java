// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PrivateLinkResourcesOperations. */
public interface PrivateLinkResourcesOperations {
    /**
     * Returns the list of private link resources that need to be created for Backup and SiteRecovery.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class which represent the stamps associated with the vault.
     */
    PagedIterable<PrivateLinkResource> list(String resourceGroupName, String vaultName);

    /**
     * Returns the list of private link resources that need to be created for Backup and SiteRecovery.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class which represent the stamps associated with the vault.
     */
    PagedIterable<PrivateLinkResource> list(String resourceGroupName, String vaultName, Context context);

    /**
     * Returns a specified private link resource that need to be created for Backup and SiteRecovery.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param privateLinkResourceName The privateLinkResourceName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information of the private link resource.
     */
    PrivateLinkResource get(String resourceGroupName, String vaultName, String privateLinkResourceName);

    /**
     * Returns a specified private link resource that need to be created for Backup and SiteRecovery.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param privateLinkResourceName The privateLinkResourceName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information of the private link resource.
     */
    Response<PrivateLinkResource> getWithResponse(
        String resourceGroupName, String vaultName, String privateLinkResourceName, Context context);
}
