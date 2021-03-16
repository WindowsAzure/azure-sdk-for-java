// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.apimanagement.fluent.models.ApiManagementServiceGetDomainOwnershipIdentifierResultInner;
import com.azure.resourcemanager.apimanagement.fluent.models.ApiManagementServiceGetSsoTokenResultInner;
import com.azure.resourcemanager.apimanagement.fluent.models.ApiManagementServiceNameAvailabilityResultInner;
import com.azure.resourcemanager.apimanagement.fluent.models.ApiManagementServiceResourceInner;
import com.azure.resourcemanager.apimanagement.models.ApiManagementServiceApplyNetworkConfigurationParameters;
import com.azure.resourcemanager.apimanagement.models.ApiManagementServiceBackupRestoreParameters;
import com.azure.resourcemanager.apimanagement.models.ApiManagementServiceCheckNameAvailabilityParameters;
import com.azure.resourcemanager.apimanagement.models.ApiManagementServiceUpdateParameters;

/** An instance of this class provides access to all the operations defined in ApiManagementServicesClient. */
public interface ApiManagementServicesClient {
    /**
     * Restores a backup of an API Management service created using the ApiManagementService_Backup operation on the
     * current service. This is a long running operation and could take several minutes to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Parameters supplied to the Restore API Management service from backup operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single API Management service resource in List or Get response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApiManagementServiceResourceInner>, ApiManagementServiceResourceInner> beginRestore(
        String resourceGroupName, String serviceName, ApiManagementServiceBackupRestoreParameters parameters);

    /**
     * Restores a backup of an API Management service created using the ApiManagementService_Backup operation on the
     * current service. This is a long running operation and could take several minutes to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Parameters supplied to the Restore API Management service from backup operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single API Management service resource in List or Get response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApiManagementServiceResourceInner>, ApiManagementServiceResourceInner> beginRestore(
        String resourceGroupName,
        String serviceName,
        ApiManagementServiceBackupRestoreParameters parameters,
        Context context);

    /**
     * Restores a backup of an API Management service created using the ApiManagementService_Backup operation on the
     * current service. This is a long running operation and could take several minutes to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Parameters supplied to the Restore API Management service from backup operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single API Management service resource in List or Get response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiManagementServiceResourceInner restore(
        String resourceGroupName, String serviceName, ApiManagementServiceBackupRestoreParameters parameters);

    /**
     * Restores a backup of an API Management service created using the ApiManagementService_Backup operation on the
     * current service. This is a long running operation and could take several minutes to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Parameters supplied to the Restore API Management service from backup operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single API Management service resource in List or Get response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiManagementServiceResourceInner restore(
        String resourceGroupName,
        String serviceName,
        ApiManagementServiceBackupRestoreParameters parameters,
        Context context);

    /**
     * Creates a backup of the API Management service to the given Azure Storage Account. This is long running operation
     * and could take several minutes to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Parameters supplied to the ApiManagementService_Backup operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single API Management service resource in List or Get response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApiManagementServiceResourceInner>, ApiManagementServiceResourceInner> beginBackup(
        String resourceGroupName, String serviceName, ApiManagementServiceBackupRestoreParameters parameters);

    /**
     * Creates a backup of the API Management service to the given Azure Storage Account. This is long running operation
     * and could take several minutes to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Parameters supplied to the ApiManagementService_Backup operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single API Management service resource in List or Get response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApiManagementServiceResourceInner>, ApiManagementServiceResourceInner> beginBackup(
        String resourceGroupName,
        String serviceName,
        ApiManagementServiceBackupRestoreParameters parameters,
        Context context);

    /**
     * Creates a backup of the API Management service to the given Azure Storage Account. This is long running operation
     * and could take several minutes to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Parameters supplied to the ApiManagementService_Backup operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single API Management service resource in List or Get response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiManagementServiceResourceInner backup(
        String resourceGroupName, String serviceName, ApiManagementServiceBackupRestoreParameters parameters);

    /**
     * Creates a backup of the API Management service to the given Azure Storage Account. This is long running operation
     * and could take several minutes to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Parameters supplied to the ApiManagementService_Backup operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single API Management service resource in List or Get response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiManagementServiceResourceInner backup(
        String resourceGroupName,
        String serviceName,
        ApiManagementServiceBackupRestoreParameters parameters,
        Context context);

    /**
     * Creates or updates an API Management service. This is long running operation and could take several minutes to
     * complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Parameters supplied to the CreateOrUpdate API Management service operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single API Management service resource in List or Get response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApiManagementServiceResourceInner>, ApiManagementServiceResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String serviceName, ApiManagementServiceResourceInner parameters);

    /**
     * Creates or updates an API Management service. This is long running operation and could take several minutes to
     * complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Parameters supplied to the CreateOrUpdate API Management service operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single API Management service resource in List or Get response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApiManagementServiceResourceInner>, ApiManagementServiceResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String serviceName, ApiManagementServiceResourceInner parameters, Context context);

    /**
     * Creates or updates an API Management service. This is long running operation and could take several minutes to
     * complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Parameters supplied to the CreateOrUpdate API Management service operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single API Management service resource in List or Get response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiManagementServiceResourceInner createOrUpdate(
        String resourceGroupName, String serviceName, ApiManagementServiceResourceInner parameters);

    /**
     * Creates or updates an API Management service. This is long running operation and could take several minutes to
     * complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Parameters supplied to the CreateOrUpdate API Management service operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single API Management service resource in List or Get response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiManagementServiceResourceInner createOrUpdate(
        String resourceGroupName, String serviceName, ApiManagementServiceResourceInner parameters, Context context);

    /**
     * Updates an existing API Management service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Parameters supplied to the CreateOrUpdate API Management service operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single API Management service resource in List or Get response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApiManagementServiceResourceInner>, ApiManagementServiceResourceInner> beginUpdate(
        String resourceGroupName, String serviceName, ApiManagementServiceUpdateParameters parameters);

    /**
     * Updates an existing API Management service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Parameters supplied to the CreateOrUpdate API Management service operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single API Management service resource in List or Get response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApiManagementServiceResourceInner>, ApiManagementServiceResourceInner> beginUpdate(
        String resourceGroupName, String serviceName, ApiManagementServiceUpdateParameters parameters, Context context);

    /**
     * Updates an existing API Management service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Parameters supplied to the CreateOrUpdate API Management service operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single API Management service resource in List or Get response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiManagementServiceResourceInner update(
        String resourceGroupName, String serviceName, ApiManagementServiceUpdateParameters parameters);

    /**
     * Updates an existing API Management service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Parameters supplied to the CreateOrUpdate API Management service operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single API Management service resource in List or Get response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiManagementServiceResourceInner update(
        String resourceGroupName, String serviceName, ApiManagementServiceUpdateParameters parameters, Context context);

    /**
     * Gets an API Management service resource description.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an API Management service resource description.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiManagementServiceResourceInner getByResourceGroup(String resourceGroupName, String serviceName);

    /**
     * Gets an API Management service resource description.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an API Management service resource description.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApiManagementServiceResourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String serviceName, Context context);

    /**
     * Deletes an existing API Management service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApiManagementServiceResourceInner>, ApiManagementServiceResourceInner> beginDelete(
        String resourceGroupName, String serviceName);

    /**
     * Deletes an existing API Management service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApiManagementServiceResourceInner>, ApiManagementServiceResourceInner> beginDelete(
        String resourceGroupName, String serviceName, Context context);

    /**
     * Deletes an existing API Management service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiManagementServiceResourceInner delete(String resourceGroupName, String serviceName);

    /**
     * Deletes an existing API Management service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiManagementServiceResourceInner delete(String resourceGroupName, String serviceName, Context context);

    /**
     * List all API Management services within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List API Management services operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApiManagementServiceResourceInner> listByResourceGroup(String resourceGroupName);

    /**
     * List all API Management services within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List API Management services operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApiManagementServiceResourceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all API Management services within an Azure subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List API Management services operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApiManagementServiceResourceInner> list();

    /**
     * Lists all API Management services within an Azure subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List API Management services operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApiManagementServiceResourceInner> list(Context context);

    /**
     * Gets the Single-Sign-On token for the API Management Service which is valid for 5 Minutes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Single-Sign-On token for the API Management Service which is valid for 5 Minutes.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiManagementServiceGetSsoTokenResultInner getSsoToken(String resourceGroupName, String serviceName);

    /**
     * Gets the Single-Sign-On token for the API Management Service which is valid for 5 Minutes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Single-Sign-On token for the API Management Service which is valid for 5 Minutes.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApiManagementServiceGetSsoTokenResultInner> getSsoTokenWithResponse(
        String resourceGroupName, String serviceName, Context context);

    /**
     * Checks availability and correctness of a name for an API Management service.
     *
     * @param parameters Parameters supplied to the CheckNameAvailability operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of the CheckNameAvailability operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiManagementServiceNameAvailabilityResultInner checkNameAvailability(
        ApiManagementServiceCheckNameAvailabilityParameters parameters);

    /**
     * Checks availability and correctness of a name for an API Management service.
     *
     * @param parameters Parameters supplied to the CheckNameAvailability operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of the CheckNameAvailability operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApiManagementServiceNameAvailabilityResultInner> checkNameAvailabilityWithResponse(
        ApiManagementServiceCheckNameAvailabilityParameters parameters, Context context);

    /**
     * Get the custom domain ownership identifier for an API Management service.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the custom domain ownership identifier for an API Management service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiManagementServiceGetDomainOwnershipIdentifierResultInner getDomainOwnershipIdentifier();

    /**
     * Get the custom domain ownership identifier for an API Management service.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the custom domain ownership identifier for an API Management service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApiManagementServiceGetDomainOwnershipIdentifierResultInner> getDomainOwnershipIdentifierWithResponse(
        Context context);

    /**
     * Updates the Microsoft.ApiManagement resource running in the Virtual network to pick the updated DNS changes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Parameters supplied to the Apply Network Configuration operation. If the parameters are empty,
     *     all the regions in which the Api Management service is deployed will be updated sequentially without
     *     incurring downtime in the region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single API Management service resource in List or Get response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApiManagementServiceResourceInner>, ApiManagementServiceResourceInner>
        beginApplyNetworkConfigurationUpdates(
            String resourceGroupName,
            String serviceName,
            ApiManagementServiceApplyNetworkConfigurationParameters parameters);

    /**
     * Updates the Microsoft.ApiManagement resource running in the Virtual network to pick the updated DNS changes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Parameters supplied to the Apply Network Configuration operation. If the parameters are empty,
     *     all the regions in which the Api Management service is deployed will be updated sequentially without
     *     incurring downtime in the region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single API Management service resource in List or Get response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApiManagementServiceResourceInner>, ApiManagementServiceResourceInner>
        beginApplyNetworkConfigurationUpdates(
            String resourceGroupName,
            String serviceName,
            ApiManagementServiceApplyNetworkConfigurationParameters parameters,
            Context context);

    /**
     * Updates the Microsoft.ApiManagement resource running in the Virtual network to pick the updated DNS changes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Parameters supplied to the Apply Network Configuration operation. If the parameters are empty,
     *     all the regions in which the Api Management service is deployed will be updated sequentially without
     *     incurring downtime in the region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single API Management service resource in List or Get response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiManagementServiceResourceInner applyNetworkConfigurationUpdates(
        String resourceGroupName,
        String serviceName,
        ApiManagementServiceApplyNetworkConfigurationParameters parameters);

    /**
     * Updates the Microsoft.ApiManagement resource running in the Virtual network to pick the updated DNS changes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single API Management service resource in List or Get response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiManagementServiceResourceInner applyNetworkConfigurationUpdates(String resourceGroupName, String serviceName);

    /**
     * Updates the Microsoft.ApiManagement resource running in the Virtual network to pick the updated DNS changes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param parameters Parameters supplied to the Apply Network Configuration operation. If the parameters are empty,
     *     all the regions in which the Api Management service is deployed will be updated sequentially without
     *     incurring downtime in the region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single API Management service resource in List or Get response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiManagementServiceResourceInner applyNetworkConfigurationUpdates(
        String resourceGroupName,
        String serviceName,
        ApiManagementServiceApplyNetworkConfigurationParameters parameters,
        Context context);
}
