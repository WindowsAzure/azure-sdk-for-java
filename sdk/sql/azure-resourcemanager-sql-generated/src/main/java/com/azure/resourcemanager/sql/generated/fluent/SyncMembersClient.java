// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.sql.generated.fluent.models.SyncFullSchemaPropertiesInner;
import com.azure.resourcemanager.sql.generated.fluent.models.SyncMemberInner;

/** An instance of this class provides access to all the operations defined in SyncMembersClient. */
public interface SyncMembersClient {
    /**
     * Gets a sync member.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sync member.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncMemberInner get(
        String resourceGroupName, String serverName, String databaseName, String syncGroupName, String syncMemberName);

    /**
     * Gets a sync member.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sync member.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SyncMemberInner> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String syncGroupName,
        String syncMemberName,
        Context context);

    /**
     * Creates or updates a sync member.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @param parameters An Azure SQL Database sync member.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database sync member.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SyncMemberInner>, SyncMemberInner> beginCreateOrUpdate(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String syncGroupName,
        String syncMemberName,
        SyncMemberInner parameters);

    /**
     * Creates or updates a sync member.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @param parameters An Azure SQL Database sync member.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database sync member.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SyncMemberInner>, SyncMemberInner> beginCreateOrUpdate(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String syncGroupName,
        String syncMemberName,
        SyncMemberInner parameters,
        Context context);

    /**
     * Creates or updates a sync member.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @param parameters An Azure SQL Database sync member.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database sync member.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncMemberInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String syncGroupName,
        String syncMemberName,
        SyncMemberInner parameters);

    /**
     * Creates or updates a sync member.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @param parameters An Azure SQL Database sync member.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database sync member.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncMemberInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String syncGroupName,
        String syncMemberName,
        SyncMemberInner parameters,
        Context context);

    /**
     * Deletes a sync member.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String serverName, String databaseName, String syncGroupName, String syncMemberName);

    /**
     * Deletes a sync member.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String syncGroupName,
        String syncMemberName,
        Context context);

    /**
     * Deletes a sync member.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName, String serverName, String databaseName, String syncGroupName, String syncMemberName);

    /**
     * Deletes a sync member.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String syncGroupName,
        String syncMemberName,
        Context context);

    /**
     * Updates an existing sync member.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @param parameters An Azure SQL Database sync member.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database sync member.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SyncMemberInner>, SyncMemberInner> beginUpdate(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String syncGroupName,
        String syncMemberName,
        SyncMemberInner parameters);

    /**
     * Updates an existing sync member.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @param parameters An Azure SQL Database sync member.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database sync member.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SyncMemberInner>, SyncMemberInner> beginUpdate(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String syncGroupName,
        String syncMemberName,
        SyncMemberInner parameters,
        Context context);

    /**
     * Updates an existing sync member.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @param parameters An Azure SQL Database sync member.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database sync member.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncMemberInner update(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String syncGroupName,
        String syncMemberName,
        SyncMemberInner parameters);

    /**
     * Updates an existing sync member.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @param parameters An Azure SQL Database sync member.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database sync member.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncMemberInner update(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String syncGroupName,
        String syncMemberName,
        SyncMemberInner parameters,
        Context context);

    /**
     * Lists sync members in the given sync group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Azure SQL Database sync members.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SyncMemberInner> listBySyncGroup(
        String resourceGroupName, String serverName, String databaseName, String syncGroupName);

    /**
     * Lists sync members in the given sync group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Azure SQL Database sync members.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SyncMemberInner> listBySyncGroup(
        String resourceGroupName, String serverName, String databaseName, String syncGroupName, Context context);

    /**
     * Gets a sync member database schema.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sync member database schema.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SyncFullSchemaPropertiesInner> listMemberSchemas(
        String resourceGroupName, String serverName, String databaseName, String syncGroupName, String syncMemberName);

    /**
     * Gets a sync member database schema.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sync member database schema.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SyncFullSchemaPropertiesInner> listMemberSchemas(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String syncGroupName,
        String syncMemberName,
        Context context);

    /**
     * Refreshes a sync member database schema.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginRefreshMemberSchema(
        String resourceGroupName, String serverName, String databaseName, String syncGroupName, String syncMemberName);

    /**
     * Refreshes a sync member database schema.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginRefreshMemberSchema(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String syncGroupName,
        String syncMemberName,
        Context context);

    /**
     * Refreshes a sync member database schema.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void refreshMemberSchema(
        String resourceGroupName, String serverName, String databaseName, String syncGroupName, String syncMemberName);

    /**
     * Refreshes a sync member database schema.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void refreshMemberSchema(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String syncGroupName,
        String syncMemberName,
        Context context);
}
