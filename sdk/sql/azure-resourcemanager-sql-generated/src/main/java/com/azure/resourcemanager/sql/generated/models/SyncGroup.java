// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.SyncGroupInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of SyncGroup. */
public interface SyncGroup {
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
     * Gets the interval property: Sync interval of the sync group.
     *
     * @return the interval value.
     */
    Integer interval();

    /**
     * Gets the lastSyncTime property: Last sync time of the sync group.
     *
     * @return the lastSyncTime value.
     */
    OffsetDateTime lastSyncTime();

    /**
     * Gets the conflictResolutionPolicy property: Conflict resolution policy of the sync group.
     *
     * @return the conflictResolutionPolicy value.
     */
    SyncConflictResolutionPolicy conflictResolutionPolicy();

    /**
     * Gets the syncDatabaseId property: ARM resource id of the sync database in the sync group.
     *
     * @return the syncDatabaseId value.
     */
    String syncDatabaseId();

    /**
     * Gets the hubDatabaseUsername property: User name for the sync group hub database credential.
     *
     * @return the hubDatabaseUsername value.
     */
    String hubDatabaseUsername();

    /**
     * Gets the hubDatabasePassword property: Password for the sync group hub database credential.
     *
     * @return the hubDatabasePassword value.
     */
    String hubDatabasePassword();

    /**
     * Gets the syncState property: Sync state of the sync group.
     *
     * @return the syncState value.
     */
    SyncGroupState syncState();

    /**
     * Gets the schema property: Sync schema of the sync group.
     *
     * @return the schema value.
     */
    SyncGroupSchema schema();

    /**
     * Gets the usePrivateLinkConnection property: If use private link connection is enabled.
     *
     * @return the usePrivateLinkConnection value.
     */
    Boolean usePrivateLinkConnection();

    /**
     * Gets the privateEndpointName property: Private endpoint name of the sync group if use private link connection is
     * enabled.
     *
     * @return the privateEndpointName value.
     */
    String privateEndpointName();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.SyncGroupInner object.
     *
     * @return the inner object.
     */
    SyncGroupInner innerModel();

    /** The entirety of the SyncGroup definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The SyncGroup definition stages. */
    interface DefinitionStages {
        /** The first stage of the SyncGroup definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the SyncGroup definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serverName, databaseName.
             *
             * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this
             *     value from the Azure Resource Manager API or the portal.
             * @param serverName The name of the server.
             * @param databaseName The name of the database on which the sync group is hosted.
             * @return the next definition stage.
             */
            WithCreate withExistingDatabase(String resourceGroupName, String serverName, String databaseName);
        }
        /**
         * The stage of the SyncGroup definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithInterval,
                DefinitionStages.WithConflictResolutionPolicy,
                DefinitionStages.WithSyncDatabaseId,
                DefinitionStages.WithHubDatabaseUsername,
                DefinitionStages.WithHubDatabasePassword,
                DefinitionStages.WithSchema,
                DefinitionStages.WithUsePrivateLinkConnection {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SyncGroup create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SyncGroup create(Context context);
        }
        /** The stage of the SyncGroup definition allowing to specify interval. */
        interface WithInterval {
            /**
             * Specifies the interval property: Sync interval of the sync group..
             *
             * @param interval Sync interval of the sync group.
             * @return the next definition stage.
             */
            WithCreate withInterval(Integer interval);
        }
        /** The stage of the SyncGroup definition allowing to specify conflictResolutionPolicy. */
        interface WithConflictResolutionPolicy {
            /**
             * Specifies the conflictResolutionPolicy property: Conflict resolution policy of the sync group..
             *
             * @param conflictResolutionPolicy Conflict resolution policy of the sync group.
             * @return the next definition stage.
             */
            WithCreate withConflictResolutionPolicy(SyncConflictResolutionPolicy conflictResolutionPolicy);
        }
        /** The stage of the SyncGroup definition allowing to specify syncDatabaseId. */
        interface WithSyncDatabaseId {
            /**
             * Specifies the syncDatabaseId property: ARM resource id of the sync database in the sync group..
             *
             * @param syncDatabaseId ARM resource id of the sync database in the sync group.
             * @return the next definition stage.
             */
            WithCreate withSyncDatabaseId(String syncDatabaseId);
        }
        /** The stage of the SyncGroup definition allowing to specify hubDatabaseUsername. */
        interface WithHubDatabaseUsername {
            /**
             * Specifies the hubDatabaseUsername property: User name for the sync group hub database credential..
             *
             * @param hubDatabaseUsername User name for the sync group hub database credential.
             * @return the next definition stage.
             */
            WithCreate withHubDatabaseUsername(String hubDatabaseUsername);
        }
        /** The stage of the SyncGroup definition allowing to specify hubDatabasePassword. */
        interface WithHubDatabasePassword {
            /**
             * Specifies the hubDatabasePassword property: Password for the sync group hub database credential..
             *
             * @param hubDatabasePassword Password for the sync group hub database credential.
             * @return the next definition stage.
             */
            WithCreate withHubDatabasePassword(String hubDatabasePassword);
        }
        /** The stage of the SyncGroup definition allowing to specify schema. */
        interface WithSchema {
            /**
             * Specifies the schema property: Sync schema of the sync group..
             *
             * @param schema Sync schema of the sync group.
             * @return the next definition stage.
             */
            WithCreate withSchema(SyncGroupSchema schema);
        }
        /** The stage of the SyncGroup definition allowing to specify usePrivateLinkConnection. */
        interface WithUsePrivateLinkConnection {
            /**
             * Specifies the usePrivateLinkConnection property: If use private link connection is enabled..
             *
             * @param usePrivateLinkConnection If use private link connection is enabled.
             * @return the next definition stage.
             */
            WithCreate withUsePrivateLinkConnection(Boolean usePrivateLinkConnection);
        }
    }
    /**
     * Begins update for the SyncGroup resource.
     *
     * @return the stage of resource update.
     */
    SyncGroup.Update update();

    /** The template for SyncGroup update. */
    interface Update
        extends UpdateStages.WithInterval,
            UpdateStages.WithConflictResolutionPolicy,
            UpdateStages.WithSyncDatabaseId,
            UpdateStages.WithHubDatabaseUsername,
            UpdateStages.WithHubDatabasePassword,
            UpdateStages.WithSchema,
            UpdateStages.WithUsePrivateLinkConnection {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        SyncGroup apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SyncGroup apply(Context context);
    }
    /** The SyncGroup update stages. */
    interface UpdateStages {
        /** The stage of the SyncGroup update allowing to specify interval. */
        interface WithInterval {
            /**
             * Specifies the interval property: Sync interval of the sync group..
             *
             * @param interval Sync interval of the sync group.
             * @return the next definition stage.
             */
            Update withInterval(Integer interval);
        }
        /** The stage of the SyncGroup update allowing to specify conflictResolutionPolicy. */
        interface WithConflictResolutionPolicy {
            /**
             * Specifies the conflictResolutionPolicy property: Conflict resolution policy of the sync group..
             *
             * @param conflictResolutionPolicy Conflict resolution policy of the sync group.
             * @return the next definition stage.
             */
            Update withConflictResolutionPolicy(SyncConflictResolutionPolicy conflictResolutionPolicy);
        }
        /** The stage of the SyncGroup update allowing to specify syncDatabaseId. */
        interface WithSyncDatabaseId {
            /**
             * Specifies the syncDatabaseId property: ARM resource id of the sync database in the sync group..
             *
             * @param syncDatabaseId ARM resource id of the sync database in the sync group.
             * @return the next definition stage.
             */
            Update withSyncDatabaseId(String syncDatabaseId);
        }
        /** The stage of the SyncGroup update allowing to specify hubDatabaseUsername. */
        interface WithHubDatabaseUsername {
            /**
             * Specifies the hubDatabaseUsername property: User name for the sync group hub database credential..
             *
             * @param hubDatabaseUsername User name for the sync group hub database credential.
             * @return the next definition stage.
             */
            Update withHubDatabaseUsername(String hubDatabaseUsername);
        }
        /** The stage of the SyncGroup update allowing to specify hubDatabasePassword. */
        interface WithHubDatabasePassword {
            /**
             * Specifies the hubDatabasePassword property: Password for the sync group hub database credential..
             *
             * @param hubDatabasePassword Password for the sync group hub database credential.
             * @return the next definition stage.
             */
            Update withHubDatabasePassword(String hubDatabasePassword);
        }
        /** The stage of the SyncGroup update allowing to specify schema. */
        interface WithSchema {
            /**
             * Specifies the schema property: Sync schema of the sync group..
             *
             * @param schema Sync schema of the sync group.
             * @return the next definition stage.
             */
            Update withSchema(SyncGroupSchema schema);
        }
        /** The stage of the SyncGroup update allowing to specify usePrivateLinkConnection. */
        interface WithUsePrivateLinkConnection {
            /**
             * Specifies the usePrivateLinkConnection property: If use private link connection is enabled..
             *
             * @param usePrivateLinkConnection If use private link connection is enabled.
             * @return the next definition stage.
             */
            Update withUsePrivateLinkConnection(Boolean usePrivateLinkConnection);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SyncGroup refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SyncGroup refresh(Context context);
}
