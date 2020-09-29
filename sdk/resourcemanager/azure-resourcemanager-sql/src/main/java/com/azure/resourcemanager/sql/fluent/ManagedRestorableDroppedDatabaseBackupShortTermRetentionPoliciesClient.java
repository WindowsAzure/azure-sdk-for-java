// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.sql.fluent.models.ManagedBackupShortTermRetentionPolicyInner;
import com.azure.resourcemanager.sql.models.ManagedShortTermRetentionPolicyName;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ManagedRestorableDroppedDatabaseBackupShortTermRetentionPoliciesClient.
 */
public interface ManagedRestorableDroppedDatabaseBackupShortTermRetentionPoliciesClient {
    /**
     * Gets a dropped database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dropped database's short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ManagedBackupShortTermRetentionPolicyInner>> getWithResponseAsync(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName);

    /**
     * Gets a dropped database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dropped database's short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ManagedBackupShortTermRetentionPolicyInner> getAsync(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName);

    /**
     * Gets a dropped database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dropped database's short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedBackupShortTermRetentionPolicyInner get(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName);

    /**
     * Gets a dropped database's short term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dropped database's short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagedBackupShortTermRetentionPolicyInner> getWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName,
        Context context);

    /**
     * Sets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @param retentionDays The backup retention period in days. This is how many days Point-in-Time Restore will be
     *     supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName,
        Integer retentionDays);

    /**
     * Sets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @param retentionDays The backup retention period in days. This is how many days Point-in-Time Restore will be
     *     supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<ManagedBackupShortTermRetentionPolicyInner>, ManagedBackupShortTermRetentionPolicyInner>
        beginCreateOrUpdateAsync(
            String resourceGroupName,
            String managedInstanceName,
            String restorableDroppedDatabaseId,
            ManagedShortTermRetentionPolicyName policyName,
            Integer retentionDays);

    /**
     * Sets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @param retentionDays The backup retention period in days. This is how many days Point-in-Time Restore will be
     *     supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ManagedBackupShortTermRetentionPolicyInner>, ManagedBackupShortTermRetentionPolicyInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String managedInstanceName,
            String restorableDroppedDatabaseId,
            ManagedShortTermRetentionPolicyName policyName,
            Integer retentionDays);

    /**
     * Sets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @param retentionDays The backup retention period in days. This is how many days Point-in-Time Restore will be
     *     supported.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ManagedBackupShortTermRetentionPolicyInner>, ManagedBackupShortTermRetentionPolicyInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String managedInstanceName,
            String restorableDroppedDatabaseId,
            ManagedShortTermRetentionPolicyName policyName,
            Integer retentionDays,
            Context context);

    /**
     * Sets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @param retentionDays The backup retention period in days. This is how many days Point-in-Time Restore will be
     *     supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ManagedBackupShortTermRetentionPolicyInner> createOrUpdateAsync(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName,
        Integer retentionDays);

    /**
     * Sets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ManagedBackupShortTermRetentionPolicyInner> createOrUpdateAsync(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName);

    /**
     * Sets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @param retentionDays The backup retention period in days. This is how many days Point-in-Time Restore will be
     *     supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedBackupShortTermRetentionPolicyInner createOrUpdate(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName,
        Integer retentionDays);

    /**
     * Sets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @param retentionDays The backup retention period in days. This is how many days Point-in-Time Restore will be
     *     supported.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedBackupShortTermRetentionPolicyInner createOrUpdate(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName,
        Integer retentionDays,
        Context context);

    /**
     * Sets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedBackupShortTermRetentionPolicyInner createOrUpdate(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName);

    /**
     * Sets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @param retentionDays The backup retention period in days. This is how many days Point-in-Time Restore will be
     *     supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName,
        Integer retentionDays);

    /**
     * Sets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @param retentionDays The backup retention period in days. This is how many days Point-in-Time Restore will be
     *     supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<ManagedBackupShortTermRetentionPolicyInner>, ManagedBackupShortTermRetentionPolicyInner>
        beginUpdateAsync(
            String resourceGroupName,
            String managedInstanceName,
            String restorableDroppedDatabaseId,
            ManagedShortTermRetentionPolicyName policyName,
            Integer retentionDays);

    /**
     * Sets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @param retentionDays The backup retention period in days. This is how many days Point-in-Time Restore will be
     *     supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ManagedBackupShortTermRetentionPolicyInner>, ManagedBackupShortTermRetentionPolicyInner>
        beginUpdate(
            String resourceGroupName,
            String managedInstanceName,
            String restorableDroppedDatabaseId,
            ManagedShortTermRetentionPolicyName policyName,
            Integer retentionDays);

    /**
     * Sets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @param retentionDays The backup retention period in days. This is how many days Point-in-Time Restore will be
     *     supported.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ManagedBackupShortTermRetentionPolicyInner>, ManagedBackupShortTermRetentionPolicyInner>
        beginUpdate(
            String resourceGroupName,
            String managedInstanceName,
            String restorableDroppedDatabaseId,
            ManagedShortTermRetentionPolicyName policyName,
            Integer retentionDays,
            Context context);

    /**
     * Sets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @param retentionDays The backup retention period in days. This is how many days Point-in-Time Restore will be
     *     supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ManagedBackupShortTermRetentionPolicyInner> updateAsync(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName,
        Integer retentionDays);

    /**
     * Sets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ManagedBackupShortTermRetentionPolicyInner> updateAsync(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName);

    /**
     * Sets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @param retentionDays The backup retention period in days. This is how many days Point-in-Time Restore will be
     *     supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedBackupShortTermRetentionPolicyInner update(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName,
        Integer retentionDays);

    /**
     * Sets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @param retentionDays The backup retention period in days. This is how many days Point-in-Time Restore will be
     *     supported.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedBackupShortTermRetentionPolicyInner update(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName,
        Integer retentionDays,
        Context context);

    /**
     * Sets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param policyName The policy name. Should always be "default".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a short term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedBackupShortTermRetentionPolicyInner update(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName);

    /**
     * Gets a dropped database's short term retention policy list.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dropped database's short term retention policy list.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ManagedBackupShortTermRetentionPolicyInner> listByRestorableDroppedDatabaseAsync(
        String resourceGroupName, String managedInstanceName, String restorableDroppedDatabaseId);

    /**
     * Gets a dropped database's short term retention policy list.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dropped database's short term retention policy list.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedBackupShortTermRetentionPolicyInner> listByRestorableDroppedDatabase(
        String resourceGroupName, String managedInstanceName, String restorableDroppedDatabaseId);

    /**
     * Gets a dropped database's short term retention policy list.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dropped database's short term retention policy list.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedBackupShortTermRetentionPolicyInner> listByRestorableDroppedDatabase(
        String resourceGroupName, String managedInstanceName, String restorableDroppedDatabaseId, Context context);
}
