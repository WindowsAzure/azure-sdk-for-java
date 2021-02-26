// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ResourceProviders. */
public interface ResourceProviders {
    /**
     * Gets the operation status for a resource.
     *
     * @param location The location parameter.
     * @param operationId The operationId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation status for a resource.
     */
    OperationResource getOperationStatus(String location, String operationId);

    /**
     * Gets the operation status for a resource.
     *
     * @param location The location parameter.
     * @param operationId The operationId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation status for a resource.
     */
    Response<OperationResource> getOperationStatusWithResponse(String location, String operationId, Context context);

    /**
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param operationId The operationId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup Vault Resource.
     */
    BackupVaultResource getOperationResultPatch(String vaultName, String resourceGroupName, String operationId);

    /**
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param operationId The operationId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup Vault Resource.
     */
    Response<BackupVaultResource> getOperationResultPatchWithResponse(
        String vaultName, String resourceGroupName, String operationId, Context context);

    /**
     * Validates if a feature is supported.
     *
     * @param location The location parameter.
     * @param parameters Feature support request object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for Backup Feature support.
     */
    FeatureValidationResponseBase checkFeatureSupport(String location, FeatureValidationRequestBase parameters);

    /**
     * Validates if a feature is supported.
     *
     * @param location The location parameter.
     * @param parameters Feature support request object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for Backup Feature support.
     */
    Response<FeatureValidationResponseBase> checkFeatureSupportWithResponse(
        String location, FeatureValidationRequestBase parameters, Context context);
}
