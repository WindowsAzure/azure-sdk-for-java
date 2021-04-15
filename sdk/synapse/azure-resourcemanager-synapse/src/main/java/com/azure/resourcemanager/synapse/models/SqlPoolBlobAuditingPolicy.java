// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.SqlPoolBlobAuditingPolicyInner;
import java.util.List;
import java.util.UUID;

/** An immutable client-side representation of SqlPoolBlobAuditingPolicy. */
public interface SqlPoolBlobAuditingPolicy {
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
     * Gets the kind property: Resource kind.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the state property: Specifies the state of the policy. If state is Enabled, storageEndpoint or
     * isAzureMonitorTargetEnabled are required.
     *
     * @return the state value.
     */
    BlobAuditingPolicyState state();

    /**
     * Gets the storageEndpoint property: Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint is required.
     *
     * @return the storageEndpoint value.
     */
    String storageEndpoint();

    /**
     * Gets the storageAccountAccessKey property: Specifies the identifier key of the auditing storage account. If state
     * is Enabled and storageEndpoint is specified, storageAccountAccessKey is required.
     *
     * @return the storageAccountAccessKey value.
     */
    String storageAccountAccessKey();

    /**
     * Gets the retentionDays property: Specifies the number of days to keep in the audit logs in the storage account.
     *
     * @return the retentionDays value.
     */
    Integer retentionDays();

    /**
     * Gets the auditActionsAndGroups property: Specifies the Actions-Groups and Actions to audit.
     *
     * <p>The recommended set of action groups to use is the following combination - this will audit all the queries and
     * stored procedures executed against the database, as well as successful and failed logins:
     *
     * <p>BATCH_COMPLETED_GROUP, SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP, FAILED_DATABASE_AUTHENTICATION_GROUP.
     *
     * <p>This above combination is also the set that is configured by default when enabling auditing from the Azure
     * portal.
     *
     * <p>The supported action groups to audit are (note: choose only specific groups that cover your auditing needs.
     * Using unnecessary groups could lead to very large quantities of audit records):
     *
     * <p>APPLICATION_ROLE_CHANGE_PASSWORD_GROUP BACKUP_RESTORE_GROUP DATABASE_LOGOUT_GROUP DATABASE_OBJECT_CHANGE_GROUP
     * DATABASE_OBJECT_OWNERSHIP_CHANGE_GROUP DATABASE_OBJECT_PERMISSION_CHANGE_GROUP DATABASE_OPERATION_GROUP
     * DATABASE_PERMISSION_CHANGE_GROUP DATABASE_PRINCIPAL_CHANGE_GROUP DATABASE_PRINCIPAL_IMPERSONATION_GROUP
     * DATABASE_ROLE_MEMBER_CHANGE_GROUP FAILED_DATABASE_AUTHENTICATION_GROUP SCHEMA_OBJECT_ACCESS_GROUP
     * SCHEMA_OBJECT_CHANGE_GROUP SCHEMA_OBJECT_OWNERSHIP_CHANGE_GROUP SCHEMA_OBJECT_PERMISSION_CHANGE_GROUP
     * SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP USER_CHANGE_PASSWORD_GROUP BATCH_STARTED_GROUP BATCH_COMPLETED_GROUP
     *
     * <p>These are groups that cover all sql statements and stored procedures executed against the database, and should
     * not be used in combination with other groups as this will result in duplicate audit logs.
     *
     * <p>For more information, see [Database-Level Audit Action
     * Groups](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-action-groups).
     *
     * <p>For Database auditing policy, specific Actions can also be specified (note that Actions cannot be specified
     * for Server auditing policy). The supported actions to audit are: SELECT UPDATE INSERT DELETE EXECUTE RECEIVE
     * REFERENCES
     *
     * <p>The general form for defining an action to be audited is: {action} ON {object} BY {principal}
     *
     * <p>Note that &lt;object&gt; in the above format can refer to an object like a table, view, or stored procedure,
     * or an entire database or schema. For the latter cases, the forms DATABASE::{db_name} and SCHEMA::{schema_name}
     * are used, respectively.
     *
     * <p>For example: SELECT on dbo.myTable by public SELECT on DATABASE::myDatabase by public SELECT on
     * SCHEMA::mySchema by public
     *
     * <p>For more information, see [Database-Level Audit
     * Actions](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-actions).
     *
     * @return the auditActionsAndGroups value.
     */
    List<String> auditActionsAndGroups();

    /**
     * Gets the storageAccountSubscriptionId property: Specifies the blob storage subscription Id.
     *
     * @return the storageAccountSubscriptionId value.
     */
    UUID storageAccountSubscriptionId();

    /**
     * Gets the isStorageSecondaryKeyInUse property: Specifies whether storageAccountAccessKey value is the storage's
     * secondary key.
     *
     * @return the isStorageSecondaryKeyInUse value.
     */
    Boolean isStorageSecondaryKeyInUse();

    /**
     * Gets the isAzureMonitorTargetEnabled property: Specifies whether audit events are sent to Azure Monitor. In order
     * to send the events to Azure Monitor, specify 'state' as 'Enabled' and 'isAzureMonitorTargetEnabled' as true.
     *
     * <p>When using REST API to configure auditing, Diagnostic Settings with 'SQLSecurityAuditEvents' diagnostic logs
     * category on the database should be also created. Note that for server level audit you should use the 'master'
     * database as {databaseName}.
     *
     * <p>Diagnostic Settings URI format: PUT
     * https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
     *
     * <p>For more information, see [Diagnostic Settings REST API](https://go.microsoft.com/fwlink/?linkid=2033207) or
     * [Diagnostic Settings PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043).
     *
     * @return the isAzureMonitorTargetEnabled value.
     */
    Boolean isAzureMonitorTargetEnabled();

    /**
     * Gets the inner com.azure.resourcemanager.synapse.fluent.models.SqlPoolBlobAuditingPolicyInner object.
     *
     * @return the inner object.
     */
    SqlPoolBlobAuditingPolicyInner innerModel();

    /** The entirety of the SqlPoolBlobAuditingPolicy definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The SqlPoolBlobAuditingPolicy definition stages. */
    interface DefinitionStages {
        /** The first stage of the SqlPoolBlobAuditingPolicy definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the SqlPoolBlobAuditingPolicy definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName, sqlPoolName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName The name of the workspace.
             * @param sqlPoolName SQL pool name.
             * @return the next definition stage.
             */
            WithCreate withExistingSqlPool(String resourceGroupName, String workspaceName, String sqlPoolName);
        }
        /**
         * The stage of the SqlPoolBlobAuditingPolicy definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithState,
                DefinitionStages.WithStorageEndpoint,
                DefinitionStages.WithStorageAccountAccessKey,
                DefinitionStages.WithRetentionDays,
                DefinitionStages.WithAuditActionsAndGroups,
                DefinitionStages.WithStorageAccountSubscriptionId,
                DefinitionStages.WithIsStorageSecondaryKeyInUse,
                DefinitionStages.WithIsAzureMonitorTargetEnabled {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SqlPoolBlobAuditingPolicy create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SqlPoolBlobAuditingPolicy create(Context context);
        }
        /** The stage of the SqlPoolBlobAuditingPolicy definition allowing to specify state. */
        interface WithState {
            /**
             * Specifies the state property: Specifies the state of the policy. If state is Enabled, storageEndpoint or
             * isAzureMonitorTargetEnabled are required..
             *
             * @param state Specifies the state of the policy. If state is Enabled, storageEndpoint or
             *     isAzureMonitorTargetEnabled are required.
             * @return the next definition stage.
             */
            WithCreate withState(BlobAuditingPolicyState state);
        }
        /** The stage of the SqlPoolBlobAuditingPolicy definition allowing to specify storageEndpoint. */
        interface WithStorageEndpoint {
            /**
             * Specifies the storageEndpoint property: Specifies the blob storage endpoint (e.g.
             * https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint is required..
             *
             * @param storageEndpoint Specifies the blob storage endpoint (e.g.
             *     https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint is required.
             * @return the next definition stage.
             */
            WithCreate withStorageEndpoint(String storageEndpoint);
        }
        /** The stage of the SqlPoolBlobAuditingPolicy definition allowing to specify storageAccountAccessKey. */
        interface WithStorageAccountAccessKey {
            /**
             * Specifies the storageAccountAccessKey property: Specifies the identifier key of the auditing storage
             * account. If state is Enabled and storageEndpoint is specified, storageAccountAccessKey is required..
             *
             * @param storageAccountAccessKey Specifies the identifier key of the auditing storage account. If state is
             *     Enabled and storageEndpoint is specified, storageAccountAccessKey is required.
             * @return the next definition stage.
             */
            WithCreate withStorageAccountAccessKey(String storageAccountAccessKey);
        }
        /** The stage of the SqlPoolBlobAuditingPolicy definition allowing to specify retentionDays. */
        interface WithRetentionDays {
            /**
             * Specifies the retentionDays property: Specifies the number of days to keep in the audit logs in the
             * storage account..
             *
             * @param retentionDays Specifies the number of days to keep in the audit logs in the storage account.
             * @return the next definition stage.
             */
            WithCreate withRetentionDays(Integer retentionDays);
        }
        /** The stage of the SqlPoolBlobAuditingPolicy definition allowing to specify auditActionsAndGroups. */
        interface WithAuditActionsAndGroups {
            /**
             * Specifies the auditActionsAndGroups property: Specifies the Actions-Groups and Actions to audit.
             *
             * <p>The recommended set of action groups to use is the following combination - this will audit all the
             * queries and stored procedures executed against the database, as well as successful and failed logins:
             *
             * <p>BATCH_COMPLETED_GROUP, SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP, FAILED_DATABASE_AUTHENTICATION_GROUP.
             *
             * <p>This above combination is also the set that is configured by default when enabling auditing from the
             * Azure portal.
             *
             * <p>The supported action groups to audit are (note: choose only specific groups that cover your auditing
             * needs. Using unnecessary groups could lead to very large quantities of audit records):
             *
             * <p>APPLICATION_ROLE_CHANGE_PASSWORD_GROUP BACKUP_RESTORE_GROUP DATABASE_LOGOUT_GROUP
             * DATABASE_OBJECT_CHANGE_GROUP DATABASE_OBJECT_OWNERSHIP_CHANGE_GROUP
             * DATABASE_OBJECT_PERMISSION_CHANGE_GROUP DATABASE_OPERATION_GROUP DATABASE_PERMISSION_CHANGE_GROUP
             * DATABASE_PRINCIPAL_CHANGE_GROUP DATABASE_PRINCIPAL_IMPERSONATION_GROUP DATABASE_ROLE_MEMBER_CHANGE_GROUP
             * FAILED_DATABASE_AUTHENTICATION_GROUP SCHEMA_OBJECT_ACCESS_GROUP SCHEMA_OBJECT_CHANGE_GROUP
             * SCHEMA_OBJECT_OWNERSHIP_CHANGE_GROUP SCHEMA_OBJECT_PERMISSION_CHANGE_GROUP
             * SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP USER_CHANGE_PASSWORD_GROUP BATCH_STARTED_GROUP
             * BATCH_COMPLETED_GROUP
             *
             * <p>These are groups that cover all sql statements and stored procedures executed against the database,
             * and should not be used in combination with other groups as this will result in duplicate audit logs.
             *
             * <p>For more information, see [Database-Level Audit Action
             * Groups](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-action-groups).
             *
             * <p>For Database auditing policy, specific Actions can also be specified (note that Actions cannot be
             * specified for Server auditing policy). The supported actions to audit are: SELECT UPDATE INSERT DELETE
             * EXECUTE RECEIVE REFERENCES
             *
             * <p>The general form for defining an action to be audited is: {action} ON {object} BY {principal}
             *
             * <p>Note that &lt;object&gt; in the above format can refer to an object like a table, view, or stored
             * procedure, or an entire database or schema. For the latter cases, the forms DATABASE::{db_name} and
             * SCHEMA::{schema_name} are used, respectively.
             *
             * <p>For example: SELECT on dbo.myTable by public SELECT on DATABASE::myDatabase by public SELECT on
             * SCHEMA::mySchema by public
             *
             * <p>For more information, see [Database-Level Audit
             * Actions](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-actions).
             *
             * @param auditActionsAndGroups Specifies the Actions-Groups and Actions to audit.
             *     <p>The recommended set of action groups to use is the following combination - this will audit all the
             *     queries and stored procedures executed against the database, as well as successful and failed logins:
             *     <p>BATCH_COMPLETED_GROUP, SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP,
             *     FAILED_DATABASE_AUTHENTICATION_GROUP.
             *     <p>This above combination is also the set that is configured by default when enabling auditing from
             *     the Azure portal.
             *     <p>The supported action groups to audit are (note: choose only specific groups that cover your
             *     auditing needs. Using unnecessary groups could lead to very large quantities of audit records):
             *     <p>APPLICATION_ROLE_CHANGE_PASSWORD_GROUP BACKUP_RESTORE_GROUP DATABASE_LOGOUT_GROUP
             *     DATABASE_OBJECT_CHANGE_GROUP DATABASE_OBJECT_OWNERSHIP_CHANGE_GROUP
             *     DATABASE_OBJECT_PERMISSION_CHANGE_GROUP DATABASE_OPERATION_GROUP DATABASE_PERMISSION_CHANGE_GROUP
             *     DATABASE_PRINCIPAL_CHANGE_GROUP DATABASE_PRINCIPAL_IMPERSONATION_GROUP
             *     DATABASE_ROLE_MEMBER_CHANGE_GROUP FAILED_DATABASE_AUTHENTICATION_GROUP SCHEMA_OBJECT_ACCESS_GROUP
             *     SCHEMA_OBJECT_CHANGE_GROUP SCHEMA_OBJECT_OWNERSHIP_CHANGE_GROUP SCHEMA_OBJECT_PERMISSION_CHANGE_GROUP
             *     SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP USER_CHANGE_PASSWORD_GROUP BATCH_STARTED_GROUP
             *     BATCH_COMPLETED_GROUP
             *     <p>These are groups that cover all sql statements and stored procedures executed against the
             *     database, and should not be used in combination with other groups as this will result in duplicate
             *     audit logs.
             *     <p>For more information, see [Database-Level Audit Action
             *     Groups](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-action-groups).
             *     <p>For Database auditing policy, specific Actions can also be specified (note that Actions cannot be
             *     specified for Server auditing policy). The supported actions to audit are: SELECT UPDATE INSERT
             *     DELETE EXECUTE RECEIVE REFERENCES
             *     <p>The general form for defining an action to be audited is: {action} ON {object} BY {principal}
             *     <p>Note that &lt;object&gt; in the above format can refer to an object like a table, view, or stored
             *     procedure, or an entire database or schema. For the latter cases, the forms DATABASE::{db_name} and
             *     SCHEMA::{schema_name} are used, respectively.
             *     <p>For example: SELECT on dbo.myTable by public SELECT on DATABASE::myDatabase by public SELECT on
             *     SCHEMA::mySchema by public
             *     <p>For more information, see [Database-Level Audit
             *     Actions](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-actions).
             * @return the next definition stage.
             */
            WithCreate withAuditActionsAndGroups(List<String> auditActionsAndGroups);
        }
        /** The stage of the SqlPoolBlobAuditingPolicy definition allowing to specify storageAccountSubscriptionId. */
        interface WithStorageAccountSubscriptionId {
            /**
             * Specifies the storageAccountSubscriptionId property: Specifies the blob storage subscription Id..
             *
             * @param storageAccountSubscriptionId Specifies the blob storage subscription Id.
             * @return the next definition stage.
             */
            WithCreate withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId);
        }
        /** The stage of the SqlPoolBlobAuditingPolicy definition allowing to specify isStorageSecondaryKeyInUse. */
        interface WithIsStorageSecondaryKeyInUse {
            /**
             * Specifies the isStorageSecondaryKeyInUse property: Specifies whether storageAccountAccessKey value is the
             * storage's secondary key..
             *
             * @param isStorageSecondaryKeyInUse Specifies whether storageAccountAccessKey value is the storage's
             *     secondary key.
             * @return the next definition stage.
             */
            WithCreate withIsStorageSecondaryKeyInUse(Boolean isStorageSecondaryKeyInUse);
        }
        /** The stage of the SqlPoolBlobAuditingPolicy definition allowing to specify isAzureMonitorTargetEnabled. */
        interface WithIsAzureMonitorTargetEnabled {
            /**
             * Specifies the isAzureMonitorTargetEnabled property: Specifies whether audit events are sent to Azure
             * Monitor. In order to send the events to Azure Monitor, specify 'state' as 'Enabled' and
             * 'isAzureMonitorTargetEnabled' as true.
             *
             * <p>When using REST API to configure auditing, Diagnostic Settings with 'SQLSecurityAuditEvents'
             * diagnostic logs category on the database should be also created. Note that for server level audit you
             * should use the 'master' database as {databaseName}.
             *
             * <p>Diagnostic Settings URI format: PUT
             * https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
             *
             * <p>For more information, see [Diagnostic Settings REST
             * API](https://go.microsoft.com/fwlink/?linkid=2033207) or [Diagnostic Settings
             * PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043) .
             *
             * @param isAzureMonitorTargetEnabled Specifies whether audit events are sent to Azure Monitor. In order to
             *     send the events to Azure Monitor, specify 'state' as 'Enabled' and 'isAzureMonitorTargetEnabled' as
             *     true.
             *     <p>When using REST API to configure auditing, Diagnostic Settings with 'SQLSecurityAuditEvents'
             *     diagnostic logs category on the database should be also created. Note that for server level audit you
             *     should use the 'master' database as {databaseName}.
             *     <p>Diagnostic Settings URI format: PUT
             *     https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
             *     <p>For more information, see [Diagnostic Settings REST
             *     API](https://go.microsoft.com/fwlink/?linkid=2033207) or [Diagnostic Settings
             *     PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043).
             * @return the next definition stage.
             */
            WithCreate withIsAzureMonitorTargetEnabled(Boolean isAzureMonitorTargetEnabled);
        }
    }
    /**
     * Begins update for the SqlPoolBlobAuditingPolicy resource.
     *
     * @return the stage of resource update.
     */
    SqlPoolBlobAuditingPolicy.Update update();

    /** The template for SqlPoolBlobAuditingPolicy update. */
    interface Update
        extends UpdateStages.WithState,
            UpdateStages.WithStorageEndpoint,
            UpdateStages.WithStorageAccountAccessKey,
            UpdateStages.WithRetentionDays,
            UpdateStages.WithAuditActionsAndGroups,
            UpdateStages.WithStorageAccountSubscriptionId,
            UpdateStages.WithIsStorageSecondaryKeyInUse,
            UpdateStages.WithIsAzureMonitorTargetEnabled {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        SqlPoolBlobAuditingPolicy apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SqlPoolBlobAuditingPolicy apply(Context context);
    }
    /** The SqlPoolBlobAuditingPolicy update stages. */
    interface UpdateStages {
        /** The stage of the SqlPoolBlobAuditingPolicy update allowing to specify state. */
        interface WithState {
            /**
             * Specifies the state property: Specifies the state of the policy. If state is Enabled, storageEndpoint or
             * isAzureMonitorTargetEnabled are required..
             *
             * @param state Specifies the state of the policy. If state is Enabled, storageEndpoint or
             *     isAzureMonitorTargetEnabled are required.
             * @return the next definition stage.
             */
            Update withState(BlobAuditingPolicyState state);
        }
        /** The stage of the SqlPoolBlobAuditingPolicy update allowing to specify storageEndpoint. */
        interface WithStorageEndpoint {
            /**
             * Specifies the storageEndpoint property: Specifies the blob storage endpoint (e.g.
             * https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint is required..
             *
             * @param storageEndpoint Specifies the blob storage endpoint (e.g.
             *     https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint is required.
             * @return the next definition stage.
             */
            Update withStorageEndpoint(String storageEndpoint);
        }
        /** The stage of the SqlPoolBlobAuditingPolicy update allowing to specify storageAccountAccessKey. */
        interface WithStorageAccountAccessKey {
            /**
             * Specifies the storageAccountAccessKey property: Specifies the identifier key of the auditing storage
             * account. If state is Enabled and storageEndpoint is specified, storageAccountAccessKey is required..
             *
             * @param storageAccountAccessKey Specifies the identifier key of the auditing storage account. If state is
             *     Enabled and storageEndpoint is specified, storageAccountAccessKey is required.
             * @return the next definition stage.
             */
            Update withStorageAccountAccessKey(String storageAccountAccessKey);
        }
        /** The stage of the SqlPoolBlobAuditingPolicy update allowing to specify retentionDays. */
        interface WithRetentionDays {
            /**
             * Specifies the retentionDays property: Specifies the number of days to keep in the audit logs in the
             * storage account..
             *
             * @param retentionDays Specifies the number of days to keep in the audit logs in the storage account.
             * @return the next definition stage.
             */
            Update withRetentionDays(Integer retentionDays);
        }
        /** The stage of the SqlPoolBlobAuditingPolicy update allowing to specify auditActionsAndGroups. */
        interface WithAuditActionsAndGroups {
            /**
             * Specifies the auditActionsAndGroups property: Specifies the Actions-Groups and Actions to audit.
             *
             * <p>The recommended set of action groups to use is the following combination - this will audit all the
             * queries and stored procedures executed against the database, as well as successful and failed logins:
             *
             * <p>BATCH_COMPLETED_GROUP, SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP, FAILED_DATABASE_AUTHENTICATION_GROUP.
             *
             * <p>This above combination is also the set that is configured by default when enabling auditing from the
             * Azure portal.
             *
             * <p>The supported action groups to audit are (note: choose only specific groups that cover your auditing
             * needs. Using unnecessary groups could lead to very large quantities of audit records):
             *
             * <p>APPLICATION_ROLE_CHANGE_PASSWORD_GROUP BACKUP_RESTORE_GROUP DATABASE_LOGOUT_GROUP
             * DATABASE_OBJECT_CHANGE_GROUP DATABASE_OBJECT_OWNERSHIP_CHANGE_GROUP
             * DATABASE_OBJECT_PERMISSION_CHANGE_GROUP DATABASE_OPERATION_GROUP DATABASE_PERMISSION_CHANGE_GROUP
             * DATABASE_PRINCIPAL_CHANGE_GROUP DATABASE_PRINCIPAL_IMPERSONATION_GROUP DATABASE_ROLE_MEMBER_CHANGE_GROUP
             * FAILED_DATABASE_AUTHENTICATION_GROUP SCHEMA_OBJECT_ACCESS_GROUP SCHEMA_OBJECT_CHANGE_GROUP
             * SCHEMA_OBJECT_OWNERSHIP_CHANGE_GROUP SCHEMA_OBJECT_PERMISSION_CHANGE_GROUP
             * SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP USER_CHANGE_PASSWORD_GROUP BATCH_STARTED_GROUP
             * BATCH_COMPLETED_GROUP
             *
             * <p>These are groups that cover all sql statements and stored procedures executed against the database,
             * and should not be used in combination with other groups as this will result in duplicate audit logs.
             *
             * <p>For more information, see [Database-Level Audit Action
             * Groups](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-action-groups).
             *
             * <p>For Database auditing policy, specific Actions can also be specified (note that Actions cannot be
             * specified for Server auditing policy). The supported actions to audit are: SELECT UPDATE INSERT DELETE
             * EXECUTE RECEIVE REFERENCES
             *
             * <p>The general form for defining an action to be audited is: {action} ON {object} BY {principal}
             *
             * <p>Note that &lt;object&gt; in the above format can refer to an object like a table, view, or stored
             * procedure, or an entire database or schema. For the latter cases, the forms DATABASE::{db_name} and
             * SCHEMA::{schema_name} are used, respectively.
             *
             * <p>For example: SELECT on dbo.myTable by public SELECT on DATABASE::myDatabase by public SELECT on
             * SCHEMA::mySchema by public
             *
             * <p>For more information, see [Database-Level Audit
             * Actions](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-actions).
             *
             * @param auditActionsAndGroups Specifies the Actions-Groups and Actions to audit.
             *     <p>The recommended set of action groups to use is the following combination - this will audit all the
             *     queries and stored procedures executed against the database, as well as successful and failed logins:
             *     <p>BATCH_COMPLETED_GROUP, SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP,
             *     FAILED_DATABASE_AUTHENTICATION_GROUP.
             *     <p>This above combination is also the set that is configured by default when enabling auditing from
             *     the Azure portal.
             *     <p>The supported action groups to audit are (note: choose only specific groups that cover your
             *     auditing needs. Using unnecessary groups could lead to very large quantities of audit records):
             *     <p>APPLICATION_ROLE_CHANGE_PASSWORD_GROUP BACKUP_RESTORE_GROUP DATABASE_LOGOUT_GROUP
             *     DATABASE_OBJECT_CHANGE_GROUP DATABASE_OBJECT_OWNERSHIP_CHANGE_GROUP
             *     DATABASE_OBJECT_PERMISSION_CHANGE_GROUP DATABASE_OPERATION_GROUP DATABASE_PERMISSION_CHANGE_GROUP
             *     DATABASE_PRINCIPAL_CHANGE_GROUP DATABASE_PRINCIPAL_IMPERSONATION_GROUP
             *     DATABASE_ROLE_MEMBER_CHANGE_GROUP FAILED_DATABASE_AUTHENTICATION_GROUP SCHEMA_OBJECT_ACCESS_GROUP
             *     SCHEMA_OBJECT_CHANGE_GROUP SCHEMA_OBJECT_OWNERSHIP_CHANGE_GROUP SCHEMA_OBJECT_PERMISSION_CHANGE_GROUP
             *     SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP USER_CHANGE_PASSWORD_GROUP BATCH_STARTED_GROUP
             *     BATCH_COMPLETED_GROUP
             *     <p>These are groups that cover all sql statements and stored procedures executed against the
             *     database, and should not be used in combination with other groups as this will result in duplicate
             *     audit logs.
             *     <p>For more information, see [Database-Level Audit Action
             *     Groups](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-action-groups).
             *     <p>For Database auditing policy, specific Actions can also be specified (note that Actions cannot be
             *     specified for Server auditing policy). The supported actions to audit are: SELECT UPDATE INSERT
             *     DELETE EXECUTE RECEIVE REFERENCES
             *     <p>The general form for defining an action to be audited is: {action} ON {object} BY {principal}
             *     <p>Note that &lt;object&gt; in the above format can refer to an object like a table, view, or stored
             *     procedure, or an entire database or schema. For the latter cases, the forms DATABASE::{db_name} and
             *     SCHEMA::{schema_name} are used, respectively.
             *     <p>For example: SELECT on dbo.myTable by public SELECT on DATABASE::myDatabase by public SELECT on
             *     SCHEMA::mySchema by public
             *     <p>For more information, see [Database-Level Audit
             *     Actions](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-actions).
             * @return the next definition stage.
             */
            Update withAuditActionsAndGroups(List<String> auditActionsAndGroups);
        }
        /** The stage of the SqlPoolBlobAuditingPolicy update allowing to specify storageAccountSubscriptionId. */
        interface WithStorageAccountSubscriptionId {
            /**
             * Specifies the storageAccountSubscriptionId property: Specifies the blob storage subscription Id..
             *
             * @param storageAccountSubscriptionId Specifies the blob storage subscription Id.
             * @return the next definition stage.
             */
            Update withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId);
        }
        /** The stage of the SqlPoolBlobAuditingPolicy update allowing to specify isStorageSecondaryKeyInUse. */
        interface WithIsStorageSecondaryKeyInUse {
            /**
             * Specifies the isStorageSecondaryKeyInUse property: Specifies whether storageAccountAccessKey value is the
             * storage's secondary key..
             *
             * @param isStorageSecondaryKeyInUse Specifies whether storageAccountAccessKey value is the storage's
             *     secondary key.
             * @return the next definition stage.
             */
            Update withIsStorageSecondaryKeyInUse(Boolean isStorageSecondaryKeyInUse);
        }
        /** The stage of the SqlPoolBlobAuditingPolicy update allowing to specify isAzureMonitorTargetEnabled. */
        interface WithIsAzureMonitorTargetEnabled {
            /**
             * Specifies the isAzureMonitorTargetEnabled property: Specifies whether audit events are sent to Azure
             * Monitor. In order to send the events to Azure Monitor, specify 'state' as 'Enabled' and
             * 'isAzureMonitorTargetEnabled' as true.
             *
             * <p>When using REST API to configure auditing, Diagnostic Settings with 'SQLSecurityAuditEvents'
             * diagnostic logs category on the database should be also created. Note that for server level audit you
             * should use the 'master' database as {databaseName}.
             *
             * <p>Diagnostic Settings URI format: PUT
             * https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
             *
             * <p>For more information, see [Diagnostic Settings REST
             * API](https://go.microsoft.com/fwlink/?linkid=2033207) or [Diagnostic Settings
             * PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043) .
             *
             * @param isAzureMonitorTargetEnabled Specifies whether audit events are sent to Azure Monitor. In order to
             *     send the events to Azure Monitor, specify 'state' as 'Enabled' and 'isAzureMonitorTargetEnabled' as
             *     true.
             *     <p>When using REST API to configure auditing, Diagnostic Settings with 'SQLSecurityAuditEvents'
             *     diagnostic logs category on the database should be also created. Note that for server level audit you
             *     should use the 'master' database as {databaseName}.
             *     <p>Diagnostic Settings URI format: PUT
             *     https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
             *     <p>For more information, see [Diagnostic Settings REST
             *     API](https://go.microsoft.com/fwlink/?linkid=2033207) or [Diagnostic Settings
             *     PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043).
             * @return the next definition stage.
             */
            Update withIsAzureMonitorTargetEnabled(Boolean isAzureMonitorTargetEnabled);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SqlPoolBlobAuditingPolicy refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SqlPoolBlobAuditingPolicy refresh(Context context);
}
