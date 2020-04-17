// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.management.monitor.LogSettings;
import com.azure.management.monitor.MetricSettings;
import com.azure.management.monitor.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DiagnosticSettingsResource model. */
@JsonFlatten
@Fluent
public class DiagnosticSettingsResourceInner extends ProxyOnlyResource {
    /*
     * The resource ID of the storage account to which you would like to send
     * Diagnostic Logs.
     */
    @JsonProperty(value = "properties.storageAccountId")
    private String storageAccountId;

    /*
     * The service bus rule Id of the diagnostic setting. This is here to
     * maintain backwards compatibility.
     */
    @JsonProperty(value = "properties.serviceBusRuleId")
    private String serviceBusRuleId;

    /*
     * The resource Id for the event hub authorization rule.
     */
    @JsonProperty(value = "properties.eventHubAuthorizationRuleId")
    private String eventHubAuthorizationRuleId;

    /*
     * The name of the event hub. If none is specified, the default event hub
     * will be selected.
     */
    @JsonProperty(value = "properties.eventHubName")
    private String eventHubName;

    /*
     * The list of metric settings.
     */
    @JsonProperty(value = "properties.metrics")
    private List<MetricSettings> metrics;

    /*
     * The list of logs settings.
     */
    @JsonProperty(value = "properties.logs")
    private List<LogSettings> logs;

    /*
     * The full ARM resource ID of the Log Analytics workspace to which you
     * would like to send Diagnostic Logs. Example:
     * /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2
     */
    @JsonProperty(value = "properties.workspaceId")
    private String workspaceId;

    /*
     * A string indicating whether the export to Log Analytics should use the
     * default destination type, i.e. AzureDiagnostics, or use a destination
     * type constructed as follows: <normalized service identity>_<normalized
     * category name>. Possible values are: Dedicated and null (null is
     * default.)
     */
    @JsonProperty(value = "properties.logAnalyticsDestinationType")
    private String logAnalyticsDestinationType;

    /**
     * Get the storageAccountId property: The resource ID of the storage account to which you would like to send
     * Diagnostic Logs.
     *
     * @return the storageAccountId value.
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * Set the storageAccountId property: The resource ID of the storage account to which you would like to send
     * Diagnostic Logs.
     *
     * @param storageAccountId the storageAccountId value to set.
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withStorageAccountId(String storageAccountId) {
        this.storageAccountId = storageAccountId;
        return this;
    }

    /**
     * Get the serviceBusRuleId property: The service bus rule Id of the diagnostic setting. This is here to maintain
     * backwards compatibility.
     *
     * @return the serviceBusRuleId value.
     */
    public String serviceBusRuleId() {
        return this.serviceBusRuleId;
    }

    /**
     * Set the serviceBusRuleId property: The service bus rule Id of the diagnostic setting. This is here to maintain
     * backwards compatibility.
     *
     * @param serviceBusRuleId the serviceBusRuleId value to set.
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withServiceBusRuleId(String serviceBusRuleId) {
        this.serviceBusRuleId = serviceBusRuleId;
        return this;
    }

    /**
     * Get the eventHubAuthorizationRuleId property: The resource Id for the event hub authorization rule.
     *
     * @return the eventHubAuthorizationRuleId value.
     */
    public String eventHubAuthorizationRuleId() {
        return this.eventHubAuthorizationRuleId;
    }

    /**
     * Set the eventHubAuthorizationRuleId property: The resource Id for the event hub authorization rule.
     *
     * @param eventHubAuthorizationRuleId the eventHubAuthorizationRuleId value to set.
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withEventHubAuthorizationRuleId(String eventHubAuthorizationRuleId) {
        this.eventHubAuthorizationRuleId = eventHubAuthorizationRuleId;
        return this;
    }

    /**
     * Get the eventHubName property: The name of the event hub. If none is specified, the default event hub will be
     * selected.
     *
     * @return the eventHubName value.
     */
    public String eventHubName() {
        return this.eventHubName;
    }

    /**
     * Set the eventHubName property: The name of the event hub. If none is specified, the default event hub will be
     * selected.
     *
     * @param eventHubName the eventHubName value to set.
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withEventHubName(String eventHubName) {
        this.eventHubName = eventHubName;
        return this;
    }

    /**
     * Get the metrics property: The list of metric settings.
     *
     * @return the metrics value.
     */
    public List<MetricSettings> metrics() {
        return this.metrics;
    }

    /**
     * Set the metrics property: The list of metric settings.
     *
     * @param metrics the metrics value to set.
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withMetrics(List<MetricSettings> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Get the logs property: The list of logs settings.
     *
     * @return the logs value.
     */
    public List<LogSettings> logs() {
        return this.logs;
    }

    /**
     * Set the logs property: The list of logs settings.
     *
     * @param logs the logs value to set.
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withLogs(List<LogSettings> logs) {
        this.logs = logs;
        return this;
    }

    /**
     * Get the workspaceId property: The full ARM resource ID of the Log Analytics workspace to which you would like to
     * send Diagnostic Logs. Example:
     * /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2.
     *
     * @return the workspaceId value.
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    /**
     * Set the workspaceId property: The full ARM resource ID of the Log Analytics workspace to which you would like to
     * send Diagnostic Logs. Example:
     * /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2.
     *
     * @param workspaceId the workspaceId value to set.
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * Get the logAnalyticsDestinationType property: A string indicating whether the export to Log Analytics should use
     * the default destination type, i.e. AzureDiagnostics, or use a destination type constructed as follows:
     * &lt;normalized service identity&gt;_&lt;normalized category name&gt;. Possible values are: Dedicated and null
     * (null is default.).
     *
     * @return the logAnalyticsDestinationType value.
     */
    public String logAnalyticsDestinationType() {
        return this.logAnalyticsDestinationType;
    }

    /**
     * Set the logAnalyticsDestinationType property: A string indicating whether the export to Log Analytics should use
     * the default destination type, i.e. AzureDiagnostics, or use a destination type constructed as follows:
     * &lt;normalized service identity&gt;_&lt;normalized category name&gt;. Possible values are: Dedicated and null
     * (null is default.).
     *
     * @param logAnalyticsDestinationType the logAnalyticsDestinationType value to set.
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withLogAnalyticsDestinationType(String logAnalyticsDestinationType) {
        this.logAnalyticsDestinationType = logAnalyticsDestinationType;
        return this;
    }
}
