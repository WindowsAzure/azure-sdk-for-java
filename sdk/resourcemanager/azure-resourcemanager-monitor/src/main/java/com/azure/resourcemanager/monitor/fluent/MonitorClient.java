// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for MonitorClient class. */
public interface MonitorClient {
    /**
     * Gets The Azure subscription Id.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the AutoscaleSettingsClient object to access its operations.
     *
     * @return the AutoscaleSettingsClient object.
     */
    AutoscaleSettingsClient getAutoscaleSettings();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the AlertRuleIncidentsClient object to access its operations.
     *
     * @return the AlertRuleIncidentsClient object.
     */
    AlertRuleIncidentsClient getAlertRuleIncidents();

    /**
     * Gets the AlertRulesClient object to access its operations.
     *
     * @return the AlertRulesClient object.
     */
    AlertRulesClient getAlertRules();

    /**
     * Gets the LogProfilesClient object to access its operations.
     *
     * @return the LogProfilesClient object.
     */
    LogProfilesClient getLogProfiles();

    /**
     * Gets the DiagnosticSettingsClient object to access its operations.
     *
     * @return the DiagnosticSettingsClient object.
     */
    DiagnosticSettingsClient getDiagnosticSettings();

    /**
     * Gets the DiagnosticSettingsCategoriesClient object to access its operations.
     *
     * @return the DiagnosticSettingsCategoriesClient object.
     */
    DiagnosticSettingsCategoriesClient getDiagnosticSettingsCategories();

    /**
     * Gets the ActionGroupsClient object to access its operations.
     *
     * @return the ActionGroupsClient object.
     */
    ActionGroupsClient getActionGroups();

    /**
     * Gets the ActivityLogAlertsClient object to access its operations.
     *
     * @return the ActivityLogAlertsClient object.
     */
    ActivityLogAlertsClient getActivityLogAlerts();

    /**
     * Gets the ActivityLogsClient object to access its operations.
     *
     * @return the ActivityLogsClient object.
     */
    ActivityLogsClient getActivityLogs();

    /**
     * Gets the EventCategoriesClient object to access its operations.
     *
     * @return the EventCategoriesClient object.
     */
    EventCategoriesClient getEventCategories();

    /**
     * Gets the TenantActivityLogsClient object to access its operations.
     *
     * @return the TenantActivityLogsClient object.
     */
    TenantActivityLogsClient getTenantActivityLogs();

    /**
     * Gets the MetricDefinitionsClient object to access its operations.
     *
     * @return the MetricDefinitionsClient object.
     */
    MetricDefinitionsClient getMetricDefinitions();

    /**
     * Gets the MetricsClient object to access its operations.
     *
     * @return the MetricsClient object.
     */
    MetricsClient getMetrics();

    /**
     * Gets the MetricBaselinesClient object to access its operations.
     *
     * @return the MetricBaselinesClient object.
     */
    MetricBaselinesClient getMetricBaselines();

    /**
     * Gets the BaselinesClient object to access its operations.
     *
     * @return the BaselinesClient object.
     */
    BaselinesClient getBaselines();

    /**
     * Gets the MetricAlertsClient object to access its operations.
     *
     * @return the MetricAlertsClient object.
     */
    MetricAlertsClient getMetricAlerts();

    /**
     * Gets the MetricAlertsStatusClient object to access its operations.
     *
     * @return the MetricAlertsStatusClient object.
     */
    MetricAlertsStatusClient getMetricAlertsStatus();

    /**
     * Gets the ScheduledQueryRulesClient object to access its operations.
     *
     * @return the ScheduledQueryRulesClient object.
     */
    ScheduledQueryRulesClient getScheduledQueryRules();

    /**
     * Gets the MetricNamespacesClient object to access its operations.
     *
     * @return the MetricNamespacesClient object.
     */
    MetricNamespacesClient getMetricNamespaces();

    /**
     * Gets the VMInsightsClient object to access its operations.
     *
     * @return the VMInsightsClient object.
     */
    VMInsightsClient getVMInsights();
}
