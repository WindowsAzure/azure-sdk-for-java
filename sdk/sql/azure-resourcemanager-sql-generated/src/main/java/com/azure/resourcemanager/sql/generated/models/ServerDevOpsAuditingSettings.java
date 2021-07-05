// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerDevOpsAuditingSettingsInner;
import java.util.UUID;

/** An immutable client-side representation of ServerDevOpsAuditingSettings. */
public interface ServerDevOpsAuditingSettings {
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
     * Gets the systemData property: SystemData of ServerDevOpsAuditSettingsResource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the isAzureMonitorTargetEnabled property: Specifies whether DevOps audit events are sent to Azure Monitor.
     * In order to send the events to Azure Monitor, specify 'State' as 'Enabled' and 'IsAzureMonitorTargetEnabled' as
     * true.
     *
     * <p>When using REST API to configure DevOps audit, Diagnostic Settings with 'DevOpsOperationsAudit' diagnostic
     * logs category on the master database should be also created.
     *
     * <p>Diagnostic Settings URI format: PUT
     * https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/master/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
     *
     * <p>For more information, see [Diagnostic Settings REST API](https://go.microsoft.com/fwlink/?linkid=2033207) or
     * [Diagnostic Settings PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043).
     *
     * @return the isAzureMonitorTargetEnabled value.
     */
    Boolean isAzureMonitorTargetEnabled();

    /**
     * Gets the state property: Specifies the state of the audit. If state is Enabled, storageEndpoint or
     * isAzureMonitorTargetEnabled are required.
     *
     * @return the state value.
     */
    BlobAuditingPolicyState state();

    /**
     * Gets the storageEndpoint property: Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled is
     * required.
     *
     * @return the storageEndpoint value.
     */
    String storageEndpoint();

    /**
     * Gets the storageAccountAccessKey property: Specifies the identifier key of the auditing storage account. If state
     * is Enabled and storageEndpoint is specified, not specifying the storageAccountAccessKey will use SQL server
     * system-assigned managed identity to access the storage. Prerequisites for using managed identity authentication:
     * 1. Assign SQL Server a system-assigned managed identity in Azure Active Directory (AAD). 2. Grant SQL Server
     * identity access to the storage account by adding 'Storage Blob Data Contributor' RBAC role to the server
     * identity. For more information, see [Auditing to storage using Managed Identity
     * authentication](https://go.microsoft.com/fwlink/?linkid=2114355).
     *
     * @return the storageAccountAccessKey value.
     */
    String storageAccountAccessKey();

    /**
     * Gets the storageAccountSubscriptionId property: Specifies the blob storage subscription Id.
     *
     * @return the storageAccountSubscriptionId value.
     */
    UUID storageAccountSubscriptionId();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.ServerDevOpsAuditingSettingsInner object.
     *
     * @return the inner object.
     */
    ServerDevOpsAuditingSettingsInner innerModel();

    /** The entirety of the ServerDevOpsAuditingSettings definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ServerDevOpsAuditingSettings definition stages. */
    interface DefinitionStages {
        /** The first stage of the ServerDevOpsAuditingSettings definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ServerDevOpsAuditingSettings definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serverName.
             *
             * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this
             *     value from the Azure Resource Manager API or the portal.
             * @param serverName The name of the server.
             * @return the next definition stage.
             */
            WithCreate withExistingServer(String resourceGroupName, String serverName);
        }
        /**
         * The stage of the ServerDevOpsAuditingSettings definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithIsAzureMonitorTargetEnabled,
                DefinitionStages.WithState,
                DefinitionStages.WithStorageEndpoint,
                DefinitionStages.WithStorageAccountAccessKey,
                DefinitionStages.WithStorageAccountSubscriptionId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ServerDevOpsAuditingSettings create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ServerDevOpsAuditingSettings create(Context context);
        }
        /** The stage of the ServerDevOpsAuditingSettings definition allowing to specify isAzureMonitorTargetEnabled. */
        interface WithIsAzureMonitorTargetEnabled {
            /**
             * Specifies the isAzureMonitorTargetEnabled property: Specifies whether DevOps audit events are sent to
             * Azure Monitor. In order to send the events to Azure Monitor, specify 'State' as 'Enabled' and
             * 'IsAzureMonitorTargetEnabled' as true.
             *
             * <p>When using REST API to configure DevOps audit, Diagnostic Settings with 'DevOpsOperationsAudit'
             * diagnostic logs category on the master database should be also created.
             *
             * <p>Diagnostic Settings URI format: PUT
             * https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/master/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
             *
             * <p>For more information, see [Diagnostic Settings REST
             * API](https://go.microsoft.com/fwlink/?linkid=2033207) or [Diagnostic Settings
             * PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043) .
             *
             * @param isAzureMonitorTargetEnabled Specifies whether DevOps audit events are sent to Azure Monitor. In
             *     order to send the events to Azure Monitor, specify 'State' as 'Enabled' and
             *     'IsAzureMonitorTargetEnabled' as true.
             *     <p>When using REST API to configure DevOps audit, Diagnostic Settings with 'DevOpsOperationsAudit'
             *     diagnostic logs category on the master database should be also created.
             *     <p>Diagnostic Settings URI format: PUT
             *     https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/master/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
             *     <p>For more information, see [Diagnostic Settings REST
             *     API](https://go.microsoft.com/fwlink/?linkid=2033207) or [Diagnostic Settings
             *     PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043).
             * @return the next definition stage.
             */
            WithCreate withIsAzureMonitorTargetEnabled(Boolean isAzureMonitorTargetEnabled);
        }
        /** The stage of the ServerDevOpsAuditingSettings definition allowing to specify state. */
        interface WithState {
            /**
             * Specifies the state property: Specifies the state of the audit. If state is Enabled, storageEndpoint or
             * isAzureMonitorTargetEnabled are required..
             *
             * @param state Specifies the state of the audit. If state is Enabled, storageEndpoint or
             *     isAzureMonitorTargetEnabled are required.
             * @return the next definition stage.
             */
            WithCreate withState(BlobAuditingPolicyState state);
        }
        /** The stage of the ServerDevOpsAuditingSettings definition allowing to specify storageEndpoint. */
        interface WithStorageEndpoint {
            /**
             * Specifies the storageEndpoint property: Specifies the blob storage endpoint (e.g.
             * https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint or
             * isAzureMonitorTargetEnabled is required..
             *
             * @param storageEndpoint Specifies the blob storage endpoint (e.g.
             *     https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint or
             *     isAzureMonitorTargetEnabled is required.
             * @return the next definition stage.
             */
            WithCreate withStorageEndpoint(String storageEndpoint);
        }
        /** The stage of the ServerDevOpsAuditingSettings definition allowing to specify storageAccountAccessKey. */
        interface WithStorageAccountAccessKey {
            /**
             * Specifies the storageAccountAccessKey property: Specifies the identifier key of the auditing storage
             * account. If state is Enabled and storageEndpoint is specified, not specifying the storageAccountAccessKey
             * will use SQL server system-assigned managed identity to access the storage. Prerequisites for using
             * managed identity authentication: 1. Assign SQL Server a system-assigned managed identity in Azure Active
             * Directory (AAD). 2. Grant SQL Server identity access to the storage account by adding 'Storage Blob Data
             * Contributor' RBAC role to the server identity. For more information, see [Auditing to storage using
             * Managed Identity authentication](https://go.microsoft.com/fwlink/?linkid=2114355).
             *
             * @param storageAccountAccessKey Specifies the identifier key of the auditing storage account. If state is
             *     Enabled and storageEndpoint is specified, not specifying the storageAccountAccessKey will use SQL
             *     server system-assigned managed identity to access the storage. Prerequisites for using managed
             *     identity authentication: 1. Assign SQL Server a system-assigned managed identity in Azure Active
             *     Directory (AAD). 2. Grant SQL Server identity access to the storage account by adding 'Storage Blob
             *     Data Contributor' RBAC role to the server identity. For more information, see [Auditing to storage
             *     using Managed Identity authentication](https://go.microsoft.com/fwlink/?linkid=2114355).
             * @return the next definition stage.
             */
            WithCreate withStorageAccountAccessKey(String storageAccountAccessKey);
        }
        /**
         * The stage of the ServerDevOpsAuditingSettings definition allowing to specify storageAccountSubscriptionId.
         */
        interface WithStorageAccountSubscriptionId {
            /**
             * Specifies the storageAccountSubscriptionId property: Specifies the blob storage subscription Id..
             *
             * @param storageAccountSubscriptionId Specifies the blob storage subscription Id.
             * @return the next definition stage.
             */
            WithCreate withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId);
        }
    }
    /**
     * Begins update for the ServerDevOpsAuditingSettings resource.
     *
     * @return the stage of resource update.
     */
    ServerDevOpsAuditingSettings.Update update();

    /** The template for ServerDevOpsAuditingSettings update. */
    interface Update
        extends UpdateStages.WithIsAzureMonitorTargetEnabled,
            UpdateStages.WithState,
            UpdateStages.WithStorageEndpoint,
            UpdateStages.WithStorageAccountAccessKey,
            UpdateStages.WithStorageAccountSubscriptionId {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ServerDevOpsAuditingSettings apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ServerDevOpsAuditingSettings apply(Context context);
    }
    /** The ServerDevOpsAuditingSettings update stages. */
    interface UpdateStages {
        /** The stage of the ServerDevOpsAuditingSettings update allowing to specify isAzureMonitorTargetEnabled. */
        interface WithIsAzureMonitorTargetEnabled {
            /**
             * Specifies the isAzureMonitorTargetEnabled property: Specifies whether DevOps audit events are sent to
             * Azure Monitor. In order to send the events to Azure Monitor, specify 'State' as 'Enabled' and
             * 'IsAzureMonitorTargetEnabled' as true.
             *
             * <p>When using REST API to configure DevOps audit, Diagnostic Settings with 'DevOpsOperationsAudit'
             * diagnostic logs category on the master database should be also created.
             *
             * <p>Diagnostic Settings URI format: PUT
             * https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/master/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
             *
             * <p>For more information, see [Diagnostic Settings REST
             * API](https://go.microsoft.com/fwlink/?linkid=2033207) or [Diagnostic Settings
             * PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043) .
             *
             * @param isAzureMonitorTargetEnabled Specifies whether DevOps audit events are sent to Azure Monitor. In
             *     order to send the events to Azure Monitor, specify 'State' as 'Enabled' and
             *     'IsAzureMonitorTargetEnabled' as true.
             *     <p>When using REST API to configure DevOps audit, Diagnostic Settings with 'DevOpsOperationsAudit'
             *     diagnostic logs category on the master database should be also created.
             *     <p>Diagnostic Settings URI format: PUT
             *     https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/master/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
             *     <p>For more information, see [Diagnostic Settings REST
             *     API](https://go.microsoft.com/fwlink/?linkid=2033207) or [Diagnostic Settings
             *     PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043).
             * @return the next definition stage.
             */
            Update withIsAzureMonitorTargetEnabled(Boolean isAzureMonitorTargetEnabled);
        }
        /** The stage of the ServerDevOpsAuditingSettings update allowing to specify state. */
        interface WithState {
            /**
             * Specifies the state property: Specifies the state of the audit. If state is Enabled, storageEndpoint or
             * isAzureMonitorTargetEnabled are required..
             *
             * @param state Specifies the state of the audit. If state is Enabled, storageEndpoint or
             *     isAzureMonitorTargetEnabled are required.
             * @return the next definition stage.
             */
            Update withState(BlobAuditingPolicyState state);
        }
        /** The stage of the ServerDevOpsAuditingSettings update allowing to specify storageEndpoint. */
        interface WithStorageEndpoint {
            /**
             * Specifies the storageEndpoint property: Specifies the blob storage endpoint (e.g.
             * https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint or
             * isAzureMonitorTargetEnabled is required..
             *
             * @param storageEndpoint Specifies the blob storage endpoint (e.g.
             *     https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint or
             *     isAzureMonitorTargetEnabled is required.
             * @return the next definition stage.
             */
            Update withStorageEndpoint(String storageEndpoint);
        }
        /** The stage of the ServerDevOpsAuditingSettings update allowing to specify storageAccountAccessKey. */
        interface WithStorageAccountAccessKey {
            /**
             * Specifies the storageAccountAccessKey property: Specifies the identifier key of the auditing storage
             * account. If state is Enabled and storageEndpoint is specified, not specifying the storageAccountAccessKey
             * will use SQL server system-assigned managed identity to access the storage. Prerequisites for using
             * managed identity authentication: 1. Assign SQL Server a system-assigned managed identity in Azure Active
             * Directory (AAD). 2. Grant SQL Server identity access to the storage account by adding 'Storage Blob Data
             * Contributor' RBAC role to the server identity. For more information, see [Auditing to storage using
             * Managed Identity authentication](https://go.microsoft.com/fwlink/?linkid=2114355).
             *
             * @param storageAccountAccessKey Specifies the identifier key of the auditing storage account. If state is
             *     Enabled and storageEndpoint is specified, not specifying the storageAccountAccessKey will use SQL
             *     server system-assigned managed identity to access the storage. Prerequisites for using managed
             *     identity authentication: 1. Assign SQL Server a system-assigned managed identity in Azure Active
             *     Directory (AAD). 2. Grant SQL Server identity access to the storage account by adding 'Storage Blob
             *     Data Contributor' RBAC role to the server identity. For more information, see [Auditing to storage
             *     using Managed Identity authentication](https://go.microsoft.com/fwlink/?linkid=2114355).
             * @return the next definition stage.
             */
            Update withStorageAccountAccessKey(String storageAccountAccessKey);
        }
        /** The stage of the ServerDevOpsAuditingSettings update allowing to specify storageAccountSubscriptionId. */
        interface WithStorageAccountSubscriptionId {
            /**
             * Specifies the storageAccountSubscriptionId property: Specifies the blob storage subscription Id..
             *
             * @param storageAccountSubscriptionId Specifies the blob storage subscription Id.
             * @return the next definition stage.
             */
            Update withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ServerDevOpsAuditingSettings refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ServerDevOpsAuditingSettings refresh(Context context);
}
