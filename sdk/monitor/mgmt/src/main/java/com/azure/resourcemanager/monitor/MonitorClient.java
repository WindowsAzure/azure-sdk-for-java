// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.AzureServiceClient;
import com.azure.resourcemanager.monitor.fluent.ActionGroupsClient;
import com.azure.resourcemanager.monitor.fluent.ActivityLogAlertsClient;
import com.azure.resourcemanager.monitor.fluent.ActivityLogsClient;
import com.azure.resourcemanager.monitor.fluent.AlertRuleIncidentsClient;
import com.azure.resourcemanager.monitor.fluent.AlertRulesClient;
import com.azure.resourcemanager.monitor.fluent.AutoscaleSettingsClient;
import com.azure.resourcemanager.monitor.fluent.BaselinesClient;
import com.azure.resourcemanager.monitor.fluent.DiagnosticSettingsCategorysClient;
import com.azure.resourcemanager.monitor.fluent.DiagnosticSettingsClient;
import com.azure.resourcemanager.monitor.fluent.EventCategoriesClient;
import com.azure.resourcemanager.monitor.fluent.LogProfilesClient;
import com.azure.resourcemanager.monitor.fluent.MetricAlertsClient;
import com.azure.resourcemanager.monitor.fluent.MetricAlertsStatusClient;
import com.azure.resourcemanager.monitor.fluent.MetricBaselinesClient;
import com.azure.resourcemanager.monitor.fluent.MetricDefinitionsClient;
import com.azure.resourcemanager.monitor.fluent.MetricNamespacesClient;
import com.azure.resourcemanager.monitor.fluent.MetricsClient;
import com.azure.resourcemanager.monitor.fluent.OperationsClient;
import com.azure.resourcemanager.monitor.fluent.ScheduledQueryRulesClient;
import com.azure.resourcemanager.monitor.fluent.TenantActivityLogsClient;
import com.azure.resourcemanager.monitor.fluent.VMInsightsClient;

/** Initializes a new instance of the MonitorClient type. */
@ServiceClient(builder = MonitorClientBuilder.class)
public final class MonitorClient extends AzureServiceClient {
    private final ClientLogger logger = new ClientLogger(MonitorClient.class);

    /** The Azure subscription Id. */
    private final String subscriptionId;

    /**
     * Gets The Azure subscription Id.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The AutoscaleSettingsClient object to access its operations. */
    private final AutoscaleSettingsClient autoscaleSettings;

    /**
     * Gets the AutoscaleSettingsClient object to access its operations.
     *
     * @return the AutoscaleSettingsClient object.
     */
    public AutoscaleSettingsClient getAutoscaleSettings() {
        return this.autoscaleSettings;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The AlertRuleIncidentsClient object to access its operations. */
    private final AlertRuleIncidentsClient alertRuleIncidents;

    /**
     * Gets the AlertRuleIncidentsClient object to access its operations.
     *
     * @return the AlertRuleIncidentsClient object.
     */
    public AlertRuleIncidentsClient getAlertRuleIncidents() {
        return this.alertRuleIncidents;
    }

    /** The AlertRulesClient object to access its operations. */
    private final AlertRulesClient alertRules;

    /**
     * Gets the AlertRulesClient object to access its operations.
     *
     * @return the AlertRulesClient object.
     */
    public AlertRulesClient getAlertRules() {
        return this.alertRules;
    }

    /** The LogProfilesClient object to access its operations. */
    private final LogProfilesClient logProfiles;

    /**
     * Gets the LogProfilesClient object to access its operations.
     *
     * @return the LogProfilesClient object.
     */
    public LogProfilesClient getLogProfiles() {
        return this.logProfiles;
    }

    /** The DiagnosticSettingsClient object to access its operations. */
    private final DiagnosticSettingsClient diagnosticSettings;

    /**
     * Gets the DiagnosticSettingsClient object to access its operations.
     *
     * @return the DiagnosticSettingsClient object.
     */
    public DiagnosticSettingsClient getDiagnosticSettings() {
        return this.diagnosticSettings;
    }

    /** The DiagnosticSettingsCategorysClient object to access its operations. */
    private final DiagnosticSettingsCategorysClient diagnosticSettingsCategorys;

    /**
     * Gets the DiagnosticSettingsCategorysClient object to access its operations.
     *
     * @return the DiagnosticSettingsCategorysClient object.
     */
    public DiagnosticSettingsCategorysClient getDiagnosticSettingsCategorys() {
        return this.diagnosticSettingsCategorys;
    }

    /** The ActionGroupsClient object to access its operations. */
    private final ActionGroupsClient actionGroups;

    /**
     * Gets the ActionGroupsClient object to access its operations.
     *
     * @return the ActionGroupsClient object.
     */
    public ActionGroupsClient getActionGroups() {
        return this.actionGroups;
    }

    /** The ActivityLogAlertsClient object to access its operations. */
    private final ActivityLogAlertsClient activityLogAlerts;

    /**
     * Gets the ActivityLogAlertsClient object to access its operations.
     *
     * @return the ActivityLogAlertsClient object.
     */
    public ActivityLogAlertsClient getActivityLogAlerts() {
        return this.activityLogAlerts;
    }

    /** The ActivityLogsClient object to access its operations. */
    private final ActivityLogsClient activityLogs;

    /**
     * Gets the ActivityLogsClient object to access its operations.
     *
     * @return the ActivityLogsClient object.
     */
    public ActivityLogsClient getActivityLogs() {
        return this.activityLogs;
    }

    /** The EventCategoriesClient object to access its operations. */
    private final EventCategoriesClient eventCategories;

    /**
     * Gets the EventCategoriesClient object to access its operations.
     *
     * @return the EventCategoriesClient object.
     */
    public EventCategoriesClient getEventCategories() {
        return this.eventCategories;
    }

    /** The TenantActivityLogsClient object to access its operations. */
    private final TenantActivityLogsClient tenantActivityLogs;

    /**
     * Gets the TenantActivityLogsClient object to access its operations.
     *
     * @return the TenantActivityLogsClient object.
     */
    public TenantActivityLogsClient getTenantActivityLogs() {
        return this.tenantActivityLogs;
    }

    /** The MetricDefinitionsClient object to access its operations. */
    private final MetricDefinitionsClient metricDefinitions;

    /**
     * Gets the MetricDefinitionsClient object to access its operations.
     *
     * @return the MetricDefinitionsClient object.
     */
    public MetricDefinitionsClient getMetricDefinitions() {
        return this.metricDefinitions;
    }

    /** The MetricsClient object to access its operations. */
    private final MetricsClient metrics;

    /**
     * Gets the MetricsClient object to access its operations.
     *
     * @return the MetricsClient object.
     */
    public MetricsClient getMetrics() {
        return this.metrics;
    }

    /** The MetricBaselinesClient object to access its operations. */
    private final MetricBaselinesClient metricBaselines;

    /**
     * Gets the MetricBaselinesClient object to access its operations.
     *
     * @return the MetricBaselinesClient object.
     */
    public MetricBaselinesClient getMetricBaselines() {
        return this.metricBaselines;
    }

    /** The BaselinesClient object to access its operations. */
    private final BaselinesClient baselines;

    /**
     * Gets the BaselinesClient object to access its operations.
     *
     * @return the BaselinesClient object.
     */
    public BaselinesClient getBaselines() {
        return this.baselines;
    }

    /** The MetricAlertsClient object to access its operations. */
    private final MetricAlertsClient metricAlerts;

    /**
     * Gets the MetricAlertsClient object to access its operations.
     *
     * @return the MetricAlertsClient object.
     */
    public MetricAlertsClient getMetricAlerts() {
        return this.metricAlerts;
    }

    /** The MetricAlertsStatusClient object to access its operations. */
    private final MetricAlertsStatusClient metricAlertsStatus;

    /**
     * Gets the MetricAlertsStatusClient object to access its operations.
     *
     * @return the MetricAlertsStatusClient object.
     */
    public MetricAlertsStatusClient getMetricAlertsStatus() {
        return this.metricAlertsStatus;
    }

    /** The ScheduledQueryRulesClient object to access its operations. */
    private final ScheduledQueryRulesClient scheduledQueryRules;

    /**
     * Gets the ScheduledQueryRulesClient object to access its operations.
     *
     * @return the ScheduledQueryRulesClient object.
     */
    public ScheduledQueryRulesClient getScheduledQueryRules() {
        return this.scheduledQueryRules;
    }

    /** The MetricNamespacesClient object to access its operations. */
    private final MetricNamespacesClient metricNamespaces;

    /**
     * Gets the MetricNamespacesClient object to access its operations.
     *
     * @return the MetricNamespacesClient object.
     */
    public MetricNamespacesClient getMetricNamespaces() {
        return this.metricNamespaces;
    }

    /** The VMInsightsClient object to access its operations. */
    private final VMInsightsClient vMInsights;

    /**
     * Gets the VMInsightsClient object to access its operations.
     *
     * @return the VMInsightsClient object.
     */
    public VMInsightsClient getVMInsights() {
        return this.vMInsights;
    }

    /**
     * Initializes an instance of MonitorClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param environment The Azure environment.
     */
    MonitorClient(HttpPipeline httpPipeline, AzureEnvironment environment, String subscriptionId, String endpoint) {
        super(httpPipeline, environment);
        this.httpPipeline = httpPipeline;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.autoscaleSettings = new AutoscaleSettingsClient(this);
        this.operations = new OperationsClient(this);
        this.alertRuleIncidents = new AlertRuleIncidentsClient(this);
        this.alertRules = new AlertRulesClient(this);
        this.logProfiles = new LogProfilesClient(this);
        this.diagnosticSettings = new DiagnosticSettingsClient(this);
        this.diagnosticSettingsCategorys = new DiagnosticSettingsCategorysClient(this);
        this.actionGroups = new ActionGroupsClient(this);
        this.activityLogAlerts = new ActivityLogAlertsClient(this);
        this.activityLogs = new ActivityLogsClient(this);
        this.eventCategories = new EventCategoriesClient(this);
        this.tenantActivityLogs = new TenantActivityLogsClient(this);
        this.metricDefinitions = new MetricDefinitionsClient(this);
        this.metrics = new MetricsClient(this);
        this.metricBaselines = new MetricBaselinesClient(this);
        this.baselines = new BaselinesClient(this);
        this.metricAlerts = new MetricAlertsClient(this);
        this.metricAlertsStatus = new MetricAlertsStatusClient(this);
        this.scheduledQueryRules = new ScheduledQueryRulesClient(this);
        this.metricNamespaces = new MetricNamespacesClient(this);
        this.vMInsights = new VMInsightsClient(this);
    }
}
