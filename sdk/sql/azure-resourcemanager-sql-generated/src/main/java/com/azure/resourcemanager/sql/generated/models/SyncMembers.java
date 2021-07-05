// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of SyncMembers. */
public interface SyncMembers {
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
    SyncMember get(
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
    Response<SyncMember> getWithResponse(
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
    void delete(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String syncGroupName,
        String syncMemberName,
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
    PagedIterable<SyncMember> listBySyncGroup(
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
    PagedIterable<SyncMember> listBySyncGroup(
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
    PagedIterable<SyncFullSchemaProperties> listMemberSchemas(
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
    PagedIterable<SyncFullSchemaProperties> listMemberSchemas(
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
    void refreshMemberSchema(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String syncGroupName,
        String syncMemberName,
        Context context);

    /**
     * Gets a sync member.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sync member.
     */
    SyncMember getById(String id);

    /**
     * Gets a sync member.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sync member.
     */
    Response<SyncMember> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a sync member.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a sync member.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new SyncMember resource.
     *
     * @param name resource name.
     * @return the first stage of the new SyncMember definition.
     */
    SyncMember.DefinitionStages.Blank define(String name);
}
