// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.fluent.models.ObjectReplicationPolicyInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ObjectReplicationPoliciesOperationsClient.
 */
public interface ObjectReplicationPoliciesOperationsClient {
    /**
     * List the object replication policies associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list storage account object replication policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ObjectReplicationPolicyInner> listAsync(String resourceGroupName, String accountName);

    /**
     * List the object replication policies associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list storage account object replication policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ObjectReplicationPolicyInner> list(String resourceGroupName, String accountName);

    /**
     * List the object replication policies associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list storage account object replication policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ObjectReplicationPolicyInner> list(String resourceGroupName, String accountName, Context context);

    /**
     * Get the object replication policy of the storage account by policy ID.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param objectReplicationPolicyId The ID of object replication policy or 'default' if the policy ID is unknown.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the object replication policy of the storage account by policy ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ObjectReplicationPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String accountName, String objectReplicationPolicyId);

    /**
     * Get the object replication policy of the storage account by policy ID.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param objectReplicationPolicyId The ID of object replication policy or 'default' if the policy ID is unknown.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the object replication policy of the storage account by policy ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ObjectReplicationPolicyInner> getAsync(
        String resourceGroupName, String accountName, String objectReplicationPolicyId);

    /**
     * Get the object replication policy of the storage account by policy ID.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param objectReplicationPolicyId The ID of object replication policy or 'default' if the policy ID is unknown.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the object replication policy of the storage account by policy ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ObjectReplicationPolicyInner get(String resourceGroupName, String accountName, String objectReplicationPolicyId);

    /**
     * Get the object replication policy of the storage account by policy ID.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param objectReplicationPolicyId The ID of object replication policy or 'default' if the policy ID is unknown.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the object replication policy of the storage account by policy ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ObjectReplicationPolicyInner> getWithResponse(
        String resourceGroupName, String accountName, String objectReplicationPolicyId, Context context);

    /**
     * Create or update the object replication policy of the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param objectReplicationPolicyId The ID of object replication policy or 'default' if the policy ID is unknown.
     * @param properties The replication policy between two storage accounts. Multiple rules can be defined in one
     *     policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the replication policy between two storage accounts.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ObjectReplicationPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String accountName,
        String objectReplicationPolicyId,
        ObjectReplicationPolicyInner properties);

    /**
     * Create or update the object replication policy of the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param objectReplicationPolicyId The ID of object replication policy or 'default' if the policy ID is unknown.
     * @param properties The replication policy between two storage accounts. Multiple rules can be defined in one
     *     policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the replication policy between two storage accounts.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ObjectReplicationPolicyInner> createOrUpdateAsync(
        String resourceGroupName,
        String accountName,
        String objectReplicationPolicyId,
        ObjectReplicationPolicyInner properties);

    /**
     * Create or update the object replication policy of the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param objectReplicationPolicyId The ID of object replication policy or 'default' if the policy ID is unknown.
     * @param properties The replication policy between two storage accounts. Multiple rules can be defined in one
     *     policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the replication policy between two storage accounts.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ObjectReplicationPolicyInner createOrUpdate(
        String resourceGroupName,
        String accountName,
        String objectReplicationPolicyId,
        ObjectReplicationPolicyInner properties);

    /**
     * Create or update the object replication policy of the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param objectReplicationPolicyId The ID of object replication policy or 'default' if the policy ID is unknown.
     * @param properties The replication policy between two storage accounts. Multiple rules can be defined in one
     *     policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the replication policy between two storage accounts.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ObjectReplicationPolicyInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String accountName,
        String objectReplicationPolicyId,
        ObjectReplicationPolicyInner properties,
        Context context);

    /**
     * Deletes the object replication policy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param objectReplicationPolicyId The ID of object replication policy or 'default' if the policy ID is unknown.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String accountName, String objectReplicationPolicyId);

    /**
     * Deletes the object replication policy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param objectReplicationPolicyId The ID of object replication policy or 'default' if the policy ID is unknown.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String accountName, String objectReplicationPolicyId);

    /**
     * Deletes the object replication policy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param objectReplicationPolicyId The ID of object replication policy or 'default' if the policy ID is unknown.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String objectReplicationPolicyId);

    /**
     * Deletes the object replication policy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param objectReplicationPolicyId The ID of object replication policy or 'default' if the policy ID is unknown.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String objectReplicationPolicyId, Context context);
}
