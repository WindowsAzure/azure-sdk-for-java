/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2017_05_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.monitor.v2017_05_01_preview.implementation.DiagnosticSettingsResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.monitor.v2017_05_01_preview.implementation.MonitorManager;
import java.util.List;

/**
 * Type representing DiagnosticSettingsResource.
 */
public interface DiagnosticSettingsResource extends HasInner<DiagnosticSettingsResourceInner>, Indexable, Updatable<DiagnosticSettingsResource.Update>, Refreshable<DiagnosticSettingsResource>, HasManager<MonitorManager> {
    /**
     * @return the eventHubAuthorizationRuleId value.
     */
    String eventHubAuthorizationRuleId();

    /**
     * @return the eventHubName value.
     */
    String eventHubName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the logs value.
     */
    List<LogSettings> logs();

    /**
     * @return the metrics value.
     */
    List<MetricSettings> metrics();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the serviceBusRuleId value.
     */
    String serviceBusRuleId();

    /**
     * @return the storageAccountId value.
     */
    String storageAccountId();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the workspaceId value.
     */
    String workspaceId();

    /**
     * The entirety of the DiagnosticSettingsResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithResourceUri, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DiagnosticSettingsResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DiagnosticSettingsResource definition.
         */
        interface Blank extends WithResourceUri {
        }

        /**
         * The stage of the diagnosticsettingsresource definition allowing to specify ResourceUri.
         */
        interface WithResourceUri {
           /**
            * Specifies resourceUri.
            * @param resourceUri The identifier of the resource
            * @return the next definition stage
            */
            WithCreate withResourceUri(String resourceUri);
        }

        /**
         * The stage of the diagnosticsettingsresource definition allowing to specify EventHubAuthorizationRuleId.
         */
        interface WithEventHubAuthorizationRuleId {
            /**
             * Specifies eventHubAuthorizationRuleId.
             * @param eventHubAuthorizationRuleId The resource Id for the event hub authorization rule
             * @return the next definition stage
             */
            WithCreate withEventHubAuthorizationRuleId(String eventHubAuthorizationRuleId);
        }

        /**
         * The stage of the diagnosticsettingsresource definition allowing to specify EventHubName.
         */
        interface WithEventHubName {
            /**
             * Specifies eventHubName.
             * @param eventHubName The name of the event hub. If none is specified, the default event hub will be selected
             * @return the next definition stage
             */
            WithCreate withEventHubName(String eventHubName);
        }

        /**
         * The stage of the diagnosticsettingsresource definition allowing to specify Logs.
         */
        interface WithLogs {
            /**
             * Specifies logs.
             * @param logs the list of logs settings
             * @return the next definition stage
             */
            WithCreate withLogs(List<LogSettings> logs);
        }

        /**
         * The stage of the diagnosticsettingsresource definition allowing to specify Metrics.
         */
        interface WithMetrics {
            /**
             * Specifies metrics.
             * @param metrics the list of metric settings
             * @return the next definition stage
             */
            WithCreate withMetrics(List<MetricSettings> metrics);
        }

        /**
         * The stage of the diagnosticsettingsresource definition allowing to specify ServiceBusRuleId.
         */
        interface WithServiceBusRuleId {
            /**
             * Specifies serviceBusRuleId.
             * @param serviceBusRuleId The service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility
             * @return the next definition stage
             */
            WithCreate withServiceBusRuleId(String serviceBusRuleId);
        }

        /**
         * The stage of the diagnosticsettingsresource definition allowing to specify StorageAccountId.
         */
        interface WithStorageAccountId {
            /**
             * Specifies storageAccountId.
             * @param storageAccountId The resource ID of the storage account to which you would like to send Diagnostic Logs
             * @return the next definition stage
             */
            WithCreate withStorageAccountId(String storageAccountId);
        }

        /**
         * The stage of the diagnosticsettingsresource definition allowing to specify WorkspaceId.
         */
        interface WithWorkspaceId {
            /**
             * Specifies workspaceId.
             * @param workspaceId The workspace ID (resource ID of a Log Analytics workspace) for a Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2
             * @return the next definition stage
             */
            WithCreate withWorkspaceId(String workspaceId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DiagnosticSettingsResource>, DefinitionStages.WithEventHubAuthorizationRuleId, DefinitionStages.WithEventHubName, DefinitionStages.WithLogs, DefinitionStages.WithMetrics, DefinitionStages.WithServiceBusRuleId, DefinitionStages.WithStorageAccountId, DefinitionStages.WithWorkspaceId {
        }
    }
    /**
     * The template for a DiagnosticSettingsResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DiagnosticSettingsResource>, UpdateStages.WithEventHubAuthorizationRuleId, UpdateStages.WithEventHubName, UpdateStages.WithLogs, UpdateStages.WithMetrics, UpdateStages.WithServiceBusRuleId, UpdateStages.WithStorageAccountId, UpdateStages.WithWorkspaceId {
    }

    /**
     * Grouping of DiagnosticSettingsResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the diagnosticsettingsresource update allowing to specify EventHubAuthorizationRuleId.
         */
        interface WithEventHubAuthorizationRuleId {
            /**
             * Specifies eventHubAuthorizationRuleId.
             * @param eventHubAuthorizationRuleId The resource Id for the event hub authorization rule
             * @return the next update stage
             */
            Update withEventHubAuthorizationRuleId(String eventHubAuthorizationRuleId);
        }

        /**
         * The stage of the diagnosticsettingsresource update allowing to specify EventHubName.
         */
        interface WithEventHubName {
            /**
             * Specifies eventHubName.
             * @param eventHubName The name of the event hub. If none is specified, the default event hub will be selected
             * @return the next update stage
             */
            Update withEventHubName(String eventHubName);
        }

        /**
         * The stage of the diagnosticsettingsresource update allowing to specify Logs.
         */
        interface WithLogs {
            /**
             * Specifies logs.
             * @param logs the list of logs settings
             * @return the next update stage
             */
            Update withLogs(List<LogSettings> logs);
        }

        /**
         * The stage of the diagnosticsettingsresource update allowing to specify Metrics.
         */
        interface WithMetrics {
            /**
             * Specifies metrics.
             * @param metrics the list of metric settings
             * @return the next update stage
             */
            Update withMetrics(List<MetricSettings> metrics);
        }

        /**
         * The stage of the diagnosticsettingsresource update allowing to specify ServiceBusRuleId.
         */
        interface WithServiceBusRuleId {
            /**
             * Specifies serviceBusRuleId.
             * @param serviceBusRuleId The service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility
             * @return the next update stage
             */
            Update withServiceBusRuleId(String serviceBusRuleId);
        }

        /**
         * The stage of the diagnosticsettingsresource update allowing to specify StorageAccountId.
         */
        interface WithStorageAccountId {
            /**
             * Specifies storageAccountId.
             * @param storageAccountId The resource ID of the storage account to which you would like to send Diagnostic Logs
             * @return the next update stage
             */
            Update withStorageAccountId(String storageAccountId);
        }

        /**
         * The stage of the diagnosticsettingsresource update allowing to specify WorkspaceId.
         */
        interface WithWorkspaceId {
            /**
             * Specifies workspaceId.
             * @param workspaceId The workspace ID (resource ID of a Log Analytics workspace) for a Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2
             * @return the next update stage
             */
            Update withWorkspaceId(String workspaceId);
        }

    }
}
