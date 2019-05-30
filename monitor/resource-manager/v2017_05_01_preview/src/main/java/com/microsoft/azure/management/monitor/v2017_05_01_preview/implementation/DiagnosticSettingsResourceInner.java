/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2017_05_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.monitor.v2017_05_01_preview.MetricSettings;
import com.microsoft.azure.management.monitor.v2017_05_01_preview.LogSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.monitor.v2017_05_01_preview.ProxyOnlyResource;

/**
 * The diagnostic setting resource.
 */
@JsonFlatten
public class DiagnosticSettingsResourceInner extends ProxyOnlyResource {
    /**
     * The resource ID of the storage account to which you would like to send
     * Diagnostic Logs.
     */
    @JsonProperty(value = "properties.storageAccountId")
    private String storageAccountId;

    /**
     * The service bus rule Id of the diagnostic setting. This is here to
     * maintain backwards compatibility.
     */
    @JsonProperty(value = "properties.serviceBusRuleId")
    private String serviceBusRuleId;

    /**
     * The resource Id for the event hub authorization rule.
     */
    @JsonProperty(value = "properties.eventHubAuthorizationRuleId")
    private String eventHubAuthorizationRuleId;

    /**
     * The name of the event hub. If none is specified, the default event hub
     * will be selected.
     */
    @JsonProperty(value = "properties.eventHubName")
    private String eventHubName;

    /**
     * the list of metric settings.
     */
    @JsonProperty(value = "properties.metrics")
    private List<MetricSettings> metrics;

    /**
     * the list of logs settings.
     */
    @JsonProperty(value = "properties.logs")
    private List<LogSettings> logs;

    /**
     * The workspace ID (resource ID of a Log Analytics workspace) for a Log
     * Analytics workspace to which you would like to send Diagnostic Logs.
     * Example:
     * /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2.
     */
    @JsonProperty(value = "properties.workspaceId")
    private String workspaceId;

    /**
     * Get the resource ID of the storage account to which you would like to send Diagnostic Logs.
     *
     * @return the storageAccountId value
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * Set the resource ID of the storage account to which you would like to send Diagnostic Logs.
     *
     * @param storageAccountId the storageAccountId value to set
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withStorageAccountId(String storageAccountId) {
        this.storageAccountId = storageAccountId;
        return this;
    }

    /**
     * Get the service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility.
     *
     * @return the serviceBusRuleId value
     */
    public String serviceBusRuleId() {
        return this.serviceBusRuleId;
    }

    /**
     * Set the service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility.
     *
     * @param serviceBusRuleId the serviceBusRuleId value to set
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withServiceBusRuleId(String serviceBusRuleId) {
        this.serviceBusRuleId = serviceBusRuleId;
        return this;
    }

    /**
     * Get the resource Id for the event hub authorization rule.
     *
     * @return the eventHubAuthorizationRuleId value
     */
    public String eventHubAuthorizationRuleId() {
        return this.eventHubAuthorizationRuleId;
    }

    /**
     * Set the resource Id for the event hub authorization rule.
     *
     * @param eventHubAuthorizationRuleId the eventHubAuthorizationRuleId value to set
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withEventHubAuthorizationRuleId(String eventHubAuthorizationRuleId) {
        this.eventHubAuthorizationRuleId = eventHubAuthorizationRuleId;
        return this;
    }

    /**
     * Get the name of the event hub. If none is specified, the default event hub will be selected.
     *
     * @return the eventHubName value
     */
    public String eventHubName() {
        return this.eventHubName;
    }

    /**
     * Set the name of the event hub. If none is specified, the default event hub will be selected.
     *
     * @param eventHubName the eventHubName value to set
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withEventHubName(String eventHubName) {
        this.eventHubName = eventHubName;
        return this;
    }

    /**
     * Get the list of metric settings.
     *
     * @return the metrics value
     */
    public List<MetricSettings> metrics() {
        return this.metrics;
    }

    /**
     * Set the list of metric settings.
     *
     * @param metrics the metrics value to set
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withMetrics(List<MetricSettings> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Get the list of logs settings.
     *
     * @return the logs value
     */
    public List<LogSettings> logs() {
        return this.logs;
    }

    /**
     * Set the list of logs settings.
     *
     * @param logs the logs value to set
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withLogs(List<LogSettings> logs) {
        this.logs = logs;
        return this;
    }

    /**
     * Get the workspace ID (resource ID of a Log Analytics workspace) for a Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2.
     *
     * @return the workspaceId value
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    /**
     * Set the workspace ID (resource ID of a Log Analytics workspace) for a Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2.
     *
     * @param workspaceId the workspaceId value to set
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

}
