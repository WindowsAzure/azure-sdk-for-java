// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.compute.fluent.models.AccessUriInner;
import com.azure.resourcemanager.compute.fluent.models.DiskRestorePointInner;
import com.azure.resourcemanager.compute.models.GrantAccessData;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DiskRestorePointsClient. */
public interface DiskRestorePointsClient {
    /**
     * Get disk restorePoint resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     *     Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs. Supported
     *     characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param diskRestorePointName The name of the disk restore point created. Supported characters for the name are
     *     a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk restorePoint resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DiskRestorePointInner>> getWithResponseAsync(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName);

    /**
     * Get disk restorePoint resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     *     Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs. Supported
     *     characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param diskRestorePointName The name of the disk restore point created. Supported characters for the name are
     *     a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk restorePoint resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DiskRestorePointInner> getAsync(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName);

    /**
     * Get disk restorePoint resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     *     Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs. Supported
     *     characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param diskRestorePointName The name of the disk restore point created. Supported characters for the name are
     *     a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk restorePoint resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiskRestorePointInner get(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName);

    /**
     * Get disk restorePoint resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     *     Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs. Supported
     *     characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param diskRestorePointName The name of the disk restore point created. Supported characters for the name are
     *     a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk restorePoint resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DiskRestorePointInner> getWithResponse(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName,
        Context context);

    /**
     * Lists diskRestorePoints under a vmRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     *     Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs. Supported
     *     characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Disk Restore Points operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DiskRestorePointInner> listByRestorePointAsync(
        String resourceGroupName, String restorePointCollectionName, String vmRestorePointName);

    /**
     * Lists diskRestorePoints under a vmRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     *     Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs. Supported
     *     characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Disk Restore Points operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DiskRestorePointInner> listByRestorePoint(
        String resourceGroupName, String restorePointCollectionName, String vmRestorePointName);

    /**
     * Lists diskRestorePoints under a vmRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     *     Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs. Supported
     *     characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Disk Restore Points operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DiskRestorePointInner> listByRestorePoint(
        String resourceGroupName, String restorePointCollectionName, String vmRestorePointName, Context context);

    /**
     * Grants access to a diskRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     *     Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs. Supported
     *     characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param diskRestorePointName The name of the disk restore point created. Supported characters for the name are
     *     a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param grantAccessData Access data object supplied in the body of the get disk access operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> grantAccessWithResponseAsync(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName,
        GrantAccessData grantAccessData);

    /**
     * Grants access to a diskRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     *     Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs. Supported
     *     characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param diskRestorePointName The name of the disk restore point created. Supported characters for the name are
     *     a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param grantAccessData Access data object supplied in the body of the get disk access operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<AccessUriInner>, AccessUriInner> beginGrantAccessAsync(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName,
        GrantAccessData grantAccessData);

    /**
     * Grants access to a diskRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     *     Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs. Supported
     *     characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param diskRestorePointName The name of the disk restore point created. Supported characters for the name are
     *     a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param grantAccessData Access data object supplied in the body of the get disk access operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AccessUriInner>, AccessUriInner> beginGrantAccess(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName,
        GrantAccessData grantAccessData);

    /**
     * Grants access to a diskRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     *     Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs. Supported
     *     characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param diskRestorePointName The name of the disk restore point created. Supported characters for the name are
     *     a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param grantAccessData Access data object supplied in the body of the get disk access operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AccessUriInner>, AccessUriInner> beginGrantAccess(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName,
        GrantAccessData grantAccessData,
        Context context);

    /**
     * Grants access to a diskRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     *     Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs. Supported
     *     characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param diskRestorePointName The name of the disk restore point created. Supported characters for the name are
     *     a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param grantAccessData Access data object supplied in the body of the get disk access operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AccessUriInner> grantAccessAsync(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName,
        GrantAccessData grantAccessData);

    /**
     * Grants access to a diskRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     *     Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs. Supported
     *     characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param diskRestorePointName The name of the disk restore point created. Supported characters for the name are
     *     a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param grantAccessData Access data object supplied in the body of the get disk access operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessUriInner grantAccess(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName,
        GrantAccessData grantAccessData);

    /**
     * Grants access to a diskRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     *     Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs. Supported
     *     characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param diskRestorePointName The name of the disk restore point created. Supported characters for the name are
     *     a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param grantAccessData Access data object supplied in the body of the get disk access operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessUriInner grantAccess(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName,
        GrantAccessData grantAccessData,
        Context context);

    /**
     * Revokes access to a diskRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     *     Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs. Supported
     *     characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param diskRestorePointName The name of the disk restore point created. Supported characters for the name are
     *     a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> revokeAccessWithResponseAsync(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName);

    /**
     * Revokes access to a diskRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     *     Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs. Supported
     *     characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param diskRestorePointName The name of the disk restore point created. Supported characters for the name are
     *     a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginRevokeAccessAsync(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName);

    /**
     * Revokes access to a diskRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     *     Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs. Supported
     *     characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param diskRestorePointName The name of the disk restore point created. Supported characters for the name are
     *     a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginRevokeAccess(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName);

    /**
     * Revokes access to a diskRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     *     Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs. Supported
     *     characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param diskRestorePointName The name of the disk restore point created. Supported characters for the name are
     *     a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginRevokeAccess(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName,
        Context context);

    /**
     * Revokes access to a diskRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     *     Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs. Supported
     *     characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param diskRestorePointName The name of the disk restore point created. Supported characters for the name are
     *     a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> revokeAccessAsync(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName);

    /**
     * Revokes access to a diskRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     *     Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs. Supported
     *     characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param diskRestorePointName The name of the disk restore point created. Supported characters for the name are
     *     a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void revokeAccess(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName);

    /**
     * Revokes access to a diskRestorePoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection that the disk restore point belongs.
     *     Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param vmRestorePointName The name of the vm restore point that the disk disk restore point belongs. Supported
     *     characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param diskRestorePointName The name of the disk restore point created. Supported characters for the name are
     *     a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void revokeAccess(
        String resourceGroupName,
        String restorePointCollectionName,
        String vmRestorePointName,
        String diskRestorePointName,
        Context context);
}
