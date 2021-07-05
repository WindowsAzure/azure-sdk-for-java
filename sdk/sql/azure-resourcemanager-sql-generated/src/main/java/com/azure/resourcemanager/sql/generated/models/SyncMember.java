// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.SyncMemberInner;
import java.util.UUID;

/** An immutable client-side representation of SyncMember. */
public interface SyncMember {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the databaseType property: Database type of the sync member.
     *
     * @return the databaseType value.
     */
    SyncMemberDbType databaseType();

    /**
     * Gets the syncAgentId property: ARM resource id of the sync agent in the sync member.
     *
     * @return the syncAgentId value.
     */
    String syncAgentId();

    /**
     * Gets the sqlServerDatabaseId property: SQL Server database id of the sync member.
     *
     * @return the sqlServerDatabaseId value.
     */
    UUID sqlServerDatabaseId();

    /**
     * Gets the syncMemberAzureDatabaseResourceId property: ARM resource id of the sync member logical database, for
     * sync members in Azure.
     *
     * @return the syncMemberAzureDatabaseResourceId value.
     */
    String syncMemberAzureDatabaseResourceId();

    /**
     * Gets the usePrivateLinkConnection property: Whether to use private link connection.
     *
     * @return the usePrivateLinkConnection value.
     */
    Boolean usePrivateLinkConnection();

    /**
     * Gets the privateEndpointName property: Private endpoint name of the sync member if use private link connection is
     * enabled, for sync members in Azure.
     *
     * @return the privateEndpointName value.
     */
    String privateEndpointName();

    /**
     * Gets the serverName property: Server name of the member database in the sync member.
     *
     * @return the serverName value.
     */
    String serverName();

    /**
     * Gets the databaseName property: Database name of the member database in the sync member.
     *
     * @return the databaseName value.
     */
    String databaseName();

    /**
     * Gets the username property: User name of the member database in the sync member.
     *
     * @return the username value.
     */
    String username();

    /**
     * Gets the password property: Password of the member database in the sync member.
     *
     * @return the password value.
     */
    String password();

    /**
     * Gets the syncDirection property: Sync direction of the sync member.
     *
     * @return the syncDirection value.
     */
    SyncDirection syncDirection();

    /**
     * Gets the syncState property: Sync state of the sync member.
     *
     * @return the syncState value.
     */
    SyncMemberState syncState();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.SyncMemberInner object.
     *
     * @return the inner object.
     */
    SyncMemberInner innerModel();

    /** The entirety of the SyncMember definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The SyncMember definition stages. */
    interface DefinitionStages {
        /** The first stage of the SyncMember definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the SyncMember definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serverName, databaseName, syncGroupName.
             *
             * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this
             *     value from the Azure Resource Manager API or the portal.
             * @param serverName The name of the server.
             * @param databaseName The name of the database on which the sync group is hosted.
             * @param syncGroupName The name of the sync group on which the sync member is hosted.
             * @return the next definition stage.
             */
            WithCreate withExistingSyncGroup(
                String resourceGroupName, String serverName, String databaseName, String syncGroupName);
        }
        /**
         * The stage of the SyncMember definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithDatabaseType,
                DefinitionStages.WithSyncAgentId,
                DefinitionStages.WithSqlServerDatabaseId,
                DefinitionStages.WithSyncMemberAzureDatabaseResourceId,
                DefinitionStages.WithUsePrivateLinkConnection,
                DefinitionStages.WithServerName,
                DefinitionStages.WithDatabaseName,
                DefinitionStages.WithUsername,
                DefinitionStages.WithPassword,
                DefinitionStages.WithSyncDirection {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SyncMember create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SyncMember create(Context context);
        }
        /** The stage of the SyncMember definition allowing to specify databaseType. */
        interface WithDatabaseType {
            /**
             * Specifies the databaseType property: Database type of the sync member..
             *
             * @param databaseType Database type of the sync member.
             * @return the next definition stage.
             */
            WithCreate withDatabaseType(SyncMemberDbType databaseType);
        }
        /** The stage of the SyncMember definition allowing to specify syncAgentId. */
        interface WithSyncAgentId {
            /**
             * Specifies the syncAgentId property: ARM resource id of the sync agent in the sync member..
             *
             * @param syncAgentId ARM resource id of the sync agent in the sync member.
             * @return the next definition stage.
             */
            WithCreate withSyncAgentId(String syncAgentId);
        }
        /** The stage of the SyncMember definition allowing to specify sqlServerDatabaseId. */
        interface WithSqlServerDatabaseId {
            /**
             * Specifies the sqlServerDatabaseId property: SQL Server database id of the sync member..
             *
             * @param sqlServerDatabaseId SQL Server database id of the sync member.
             * @return the next definition stage.
             */
            WithCreate withSqlServerDatabaseId(UUID sqlServerDatabaseId);
        }
        /** The stage of the SyncMember definition allowing to specify syncMemberAzureDatabaseResourceId. */
        interface WithSyncMemberAzureDatabaseResourceId {
            /**
             * Specifies the syncMemberAzureDatabaseResourceId property: ARM resource id of the sync member logical
             * database, for sync members in Azure..
             *
             * @param syncMemberAzureDatabaseResourceId ARM resource id of the sync member logical database, for sync
             *     members in Azure.
             * @return the next definition stage.
             */
            WithCreate withSyncMemberAzureDatabaseResourceId(String syncMemberAzureDatabaseResourceId);
        }
        /** The stage of the SyncMember definition allowing to specify usePrivateLinkConnection. */
        interface WithUsePrivateLinkConnection {
            /**
             * Specifies the usePrivateLinkConnection property: Whether to use private link connection..
             *
             * @param usePrivateLinkConnection Whether to use private link connection.
             * @return the next definition stage.
             */
            WithCreate withUsePrivateLinkConnection(Boolean usePrivateLinkConnection);
        }
        /** The stage of the SyncMember definition allowing to specify serverName. */
        interface WithServerName {
            /**
             * Specifies the serverName property: Server name of the member database in the sync member.
             *
             * @param serverName Server name of the member database in the sync member.
             * @return the next definition stage.
             */
            WithCreate withServerName(String serverName);
        }
        /** The stage of the SyncMember definition allowing to specify databaseName. */
        interface WithDatabaseName {
            /**
             * Specifies the databaseName property: Database name of the member database in the sync member..
             *
             * @param databaseName Database name of the member database in the sync member.
             * @return the next definition stage.
             */
            WithCreate withDatabaseName(String databaseName);
        }
        /** The stage of the SyncMember definition allowing to specify username. */
        interface WithUsername {
            /**
             * Specifies the username property: User name of the member database in the sync member..
             *
             * @param username User name of the member database in the sync member.
             * @return the next definition stage.
             */
            WithCreate withUsername(String username);
        }
        /** The stage of the SyncMember definition allowing to specify password. */
        interface WithPassword {
            /**
             * Specifies the password property: Password of the member database in the sync member..
             *
             * @param password Password of the member database in the sync member.
             * @return the next definition stage.
             */
            WithCreate withPassword(String password);
        }
        /** The stage of the SyncMember definition allowing to specify syncDirection. */
        interface WithSyncDirection {
            /**
             * Specifies the syncDirection property: Sync direction of the sync member..
             *
             * @param syncDirection Sync direction of the sync member.
             * @return the next definition stage.
             */
            WithCreate withSyncDirection(SyncDirection syncDirection);
        }
    }
    /**
     * Begins update for the SyncMember resource.
     *
     * @return the stage of resource update.
     */
    SyncMember.Update update();

    /** The template for SyncMember update. */
    interface Update
        extends UpdateStages.WithDatabaseType,
            UpdateStages.WithSyncAgentId,
            UpdateStages.WithSqlServerDatabaseId,
            UpdateStages.WithSyncMemberAzureDatabaseResourceId,
            UpdateStages.WithUsePrivateLinkConnection,
            UpdateStages.WithServerName,
            UpdateStages.WithDatabaseName,
            UpdateStages.WithUsername,
            UpdateStages.WithPassword,
            UpdateStages.WithSyncDirection {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        SyncMember apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SyncMember apply(Context context);
    }
    /** The SyncMember update stages. */
    interface UpdateStages {
        /** The stage of the SyncMember update allowing to specify databaseType. */
        interface WithDatabaseType {
            /**
             * Specifies the databaseType property: Database type of the sync member..
             *
             * @param databaseType Database type of the sync member.
             * @return the next definition stage.
             */
            Update withDatabaseType(SyncMemberDbType databaseType);
        }
        /** The stage of the SyncMember update allowing to specify syncAgentId. */
        interface WithSyncAgentId {
            /**
             * Specifies the syncAgentId property: ARM resource id of the sync agent in the sync member..
             *
             * @param syncAgentId ARM resource id of the sync agent in the sync member.
             * @return the next definition stage.
             */
            Update withSyncAgentId(String syncAgentId);
        }
        /** The stage of the SyncMember update allowing to specify sqlServerDatabaseId. */
        interface WithSqlServerDatabaseId {
            /**
             * Specifies the sqlServerDatabaseId property: SQL Server database id of the sync member..
             *
             * @param sqlServerDatabaseId SQL Server database id of the sync member.
             * @return the next definition stage.
             */
            Update withSqlServerDatabaseId(UUID sqlServerDatabaseId);
        }
        /** The stage of the SyncMember update allowing to specify syncMemberAzureDatabaseResourceId. */
        interface WithSyncMemberAzureDatabaseResourceId {
            /**
             * Specifies the syncMemberAzureDatabaseResourceId property: ARM resource id of the sync member logical
             * database, for sync members in Azure..
             *
             * @param syncMemberAzureDatabaseResourceId ARM resource id of the sync member logical database, for sync
             *     members in Azure.
             * @return the next definition stage.
             */
            Update withSyncMemberAzureDatabaseResourceId(String syncMemberAzureDatabaseResourceId);
        }
        /** The stage of the SyncMember update allowing to specify usePrivateLinkConnection. */
        interface WithUsePrivateLinkConnection {
            /**
             * Specifies the usePrivateLinkConnection property: Whether to use private link connection..
             *
             * @param usePrivateLinkConnection Whether to use private link connection.
             * @return the next definition stage.
             */
            Update withUsePrivateLinkConnection(Boolean usePrivateLinkConnection);
        }
        /** The stage of the SyncMember update allowing to specify serverName. */
        interface WithServerName {
            /**
             * Specifies the serverName property: Server name of the member database in the sync member.
             *
             * @param serverName Server name of the member database in the sync member.
             * @return the next definition stage.
             */
            Update withServerName(String serverName);
        }
        /** The stage of the SyncMember update allowing to specify databaseName. */
        interface WithDatabaseName {
            /**
             * Specifies the databaseName property: Database name of the member database in the sync member..
             *
             * @param databaseName Database name of the member database in the sync member.
             * @return the next definition stage.
             */
            Update withDatabaseName(String databaseName);
        }
        /** The stage of the SyncMember update allowing to specify username. */
        interface WithUsername {
            /**
             * Specifies the username property: User name of the member database in the sync member..
             *
             * @param username User name of the member database in the sync member.
             * @return the next definition stage.
             */
            Update withUsername(String username);
        }
        /** The stage of the SyncMember update allowing to specify password. */
        interface WithPassword {
            /**
             * Specifies the password property: Password of the member database in the sync member..
             *
             * @param password Password of the member database in the sync member.
             * @return the next definition stage.
             */
            Update withPassword(String password);
        }
        /** The stage of the SyncMember update allowing to specify syncDirection. */
        interface WithSyncDirection {
            /**
             * Specifies the syncDirection property: Sync direction of the sync member..
             *
             * @param syncDirection Sync direction of the sync member.
             * @return the next definition stage.
             */
            Update withSyncDirection(SyncDirection syncDirection);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SyncMember refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SyncMember refresh(Context context);

    /**
     * Refreshes a sync member database schema.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void refreshMemberSchema();

    /**
     * Refreshes a sync member database schema.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void refreshMemberSchema(Context context);
}
