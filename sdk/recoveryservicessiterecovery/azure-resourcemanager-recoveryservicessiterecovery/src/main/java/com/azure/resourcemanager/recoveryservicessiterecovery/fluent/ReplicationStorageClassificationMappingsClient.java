// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.StorageClassificationMappingInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.StorageClassificationMappingInput;

/**
 * An instance of this class provides access to all the operations defined in
 * ReplicationStorageClassificationMappingsClient.
 */
public interface ReplicationStorageClassificationMappingsClient {
    /**
     * Lists the storage classification mappings for the fabric.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param storageClassificationName Storage classification name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of storage mapping details.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StorageClassificationMappingInner> listByReplicationStorageClassifications(
        String resourceName, String resourceGroupName, String fabricName, String storageClassificationName);

    /**
     * Lists the storage classification mappings for the fabric.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param storageClassificationName Storage classification name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of storage mapping details.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StorageClassificationMappingInner> listByReplicationStorageClassifications(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String storageClassificationName,
        Context context);

    /**
     * Gets the details of the specified storage classification mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param storageClassificationName Storage classification name.
     * @param storageClassificationMappingName Storage classification mapping name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the specified storage classification mapping.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StorageClassificationMappingInner get(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String storageClassificationName,
        String storageClassificationMappingName);

    /**
     * Gets the details of the specified storage classification mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param storageClassificationName Storage classification name.
     * @param storageClassificationMappingName Storage classification mapping name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the specified storage classification mapping.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<StorageClassificationMappingInner> getWithResponse(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String storageClassificationName,
        String storageClassificationMappingName,
        Context context);

    /**
     * The operation to create a storage classification mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param storageClassificationName Storage classification name.
     * @param storageClassificationMappingName Storage classification mapping name.
     * @param pairingInput Pairing input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return storage mapping object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<StorageClassificationMappingInner>, StorageClassificationMappingInner> beginCreate(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String storageClassificationName,
        String storageClassificationMappingName,
        StorageClassificationMappingInput pairingInput);

    /**
     * The operation to create a storage classification mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param storageClassificationName Storage classification name.
     * @param storageClassificationMappingName Storage classification mapping name.
     * @param pairingInput Pairing input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return storage mapping object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<StorageClassificationMappingInner>, StorageClassificationMappingInner> beginCreate(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String storageClassificationName,
        String storageClassificationMappingName,
        StorageClassificationMappingInput pairingInput,
        Context context);

    /**
     * The operation to create a storage classification mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param storageClassificationName Storage classification name.
     * @param storageClassificationMappingName Storage classification mapping name.
     * @param pairingInput Pairing input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return storage mapping object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StorageClassificationMappingInner create(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String storageClassificationName,
        String storageClassificationMappingName,
        StorageClassificationMappingInput pairingInput);

    /**
     * The operation to create a storage classification mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param storageClassificationName Storage classification name.
     * @param storageClassificationMappingName Storage classification mapping name.
     * @param pairingInput Pairing input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return storage mapping object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StorageClassificationMappingInner create(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String storageClassificationName,
        String storageClassificationMappingName,
        StorageClassificationMappingInput pairingInput,
        Context context);

    /**
     * The operation to delete a storage classification mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param storageClassificationName Storage classification name.
     * @param storageClassificationMappingName Storage classification mapping name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String storageClassificationName,
        String storageClassificationMappingName);

    /**
     * The operation to delete a storage classification mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param storageClassificationName Storage classification name.
     * @param storageClassificationMappingName Storage classification mapping name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String storageClassificationName,
        String storageClassificationMappingName,
        Context context);

    /**
     * The operation to delete a storage classification mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param storageClassificationName Storage classification name.
     * @param storageClassificationMappingName Storage classification mapping name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String storageClassificationName,
        String storageClassificationMappingName);

    /**
     * The operation to delete a storage classification mapping.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param storageClassificationName Storage classification name.
     * @param storageClassificationMappingName Storage classification mapping name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String storageClassificationName,
        String storageClassificationMappingName,
        Context context);

    /**
     * Lists the storage classification mappings in the vault.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of storage mapping details.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StorageClassificationMappingInner> list(String resourceName, String resourceGroupName);

    /**
     * Lists the storage classification mappings in the vault.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of storage mapping details.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StorageClassificationMappingInner> list(
        String resourceName, String resourceGroupName, Context context);
}
