// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.compute.generated.fluent.models.AccessUriInner;
import com.azure.resourcemanager.compute.generated.fluent.models.SnapshotInner;
import com.azure.resourcemanager.compute.generated.models.GrantAccessData;
import com.azure.resourcemanager.compute.generated.models.SnapshotUpdate;

/** An instance of this class provides access to all the operations defined in SnapshotsClient. */
public interface SnapshotsClient {
    /**
     * Creates or updates a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @param snapshot Snapshot resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return snapshot resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SnapshotInner>, SnapshotInner> beginCreateOrUpdate(
        String resourceGroupName, String snapshotName, SnapshotInner snapshot);

    /**
     * Creates or updates a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @param snapshot Snapshot resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return snapshot resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SnapshotInner>, SnapshotInner> beginCreateOrUpdate(
        String resourceGroupName, String snapshotName, SnapshotInner snapshot, Context context);

    /**
     * Creates or updates a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @param snapshot Snapshot resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return snapshot resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SnapshotInner createOrUpdate(String resourceGroupName, String snapshotName, SnapshotInner snapshot);

    /**
     * Creates or updates a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @param snapshot Snapshot resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return snapshot resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SnapshotInner createOrUpdate(
        String resourceGroupName, String snapshotName, SnapshotInner snapshot, Context context);

    /**
     * Updates (patches) a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @param snapshot Snapshot update resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return snapshot resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SnapshotInner>, SnapshotInner> beginUpdate(
        String resourceGroupName, String snapshotName, SnapshotUpdate snapshot);

    /**
     * Updates (patches) a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @param snapshot Snapshot update resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return snapshot resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SnapshotInner>, SnapshotInner> beginUpdate(
        String resourceGroupName, String snapshotName, SnapshotUpdate snapshot, Context context);

    /**
     * Updates (patches) a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @param snapshot Snapshot update resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return snapshot resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SnapshotInner update(String resourceGroupName, String snapshotName, SnapshotUpdate snapshot);

    /**
     * Updates (patches) a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @param snapshot Snapshot update resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return snapshot resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SnapshotInner update(String resourceGroupName, String snapshotName, SnapshotUpdate snapshot, Context context);

    /**
     * Gets information about a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a snapshot.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SnapshotInner getByResourceGroup(String resourceGroupName, String snapshotName);

    /**
     * Gets information about a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a snapshot.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SnapshotInner> getByResourceGroupWithResponse(
        String resourceGroupName, String snapshotName, Context context);

    /**
     * Deletes a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String snapshotName);

    /**
     * Deletes a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String snapshotName, Context context);

    /**
     * Deletes a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String snapshotName);

    /**
     * Deletes a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String snapshotName, Context context);

    /**
     * Lists snapshots under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Snapshots operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SnapshotInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists snapshots under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Snapshots operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SnapshotInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists snapshots under a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Snapshots operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SnapshotInner> list();

    /**
     * Lists snapshots under a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Snapshots operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SnapshotInner> list(Context context);

    /**
     * Grants access to a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @param grantAccessData Data used for requesting a SAS.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AccessUriInner>, AccessUriInner> beginGrantAccess(
        String resourceGroupName, String snapshotName, GrantAccessData grantAccessData);

    /**
     * Grants access to a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @param grantAccessData Data used for requesting a SAS.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AccessUriInner>, AccessUriInner> beginGrantAccess(
        String resourceGroupName, String snapshotName, GrantAccessData grantAccessData, Context context);

    /**
     * Grants access to a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @param grantAccessData Data used for requesting a SAS.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessUriInner grantAccess(String resourceGroupName, String snapshotName, GrantAccessData grantAccessData);

    /**
     * Grants access to a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @param grantAccessData Data used for requesting a SAS.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessUriInner grantAccess(
        String resourceGroupName, String snapshotName, GrantAccessData grantAccessData, Context context);

    /**
     * Revokes access to a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginRevokeAccess(String resourceGroupName, String snapshotName);

    /**
     * Revokes access to a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginRevokeAccess(
        String resourceGroupName, String snapshotName, Context context);

    /**
     * Revokes access to a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void revokeAccess(String resourceGroupName, String snapshotName);

    /**
     * Revokes access to a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot
     *     is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void revokeAccess(String resourceGroupName, String snapshotName, Context context);
}
