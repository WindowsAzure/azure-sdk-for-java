// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.management.monitor.MetricAlertAction;
import com.azure.management.monitor.MetricAlertCriteria;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;

/** The MetricAlertResource model. */
@JsonFlatten
@Fluent
public class MetricAlertResourceInner extends Resource {
    /*
     * the description of the metric alert that will be included in the alert
     * email.
     */
    @JsonProperty(value = "properties.description", required = true)
    private String description;

    /*
     * Alert severity {0, 1, 2, 3, 4}
     */
    @JsonProperty(value = "properties.severity", required = true)
    private int severity;

    /*
     * the flag that indicates whether the metric alert is enabled.
     */
    @JsonProperty(value = "properties.enabled", required = true)
    private boolean enabled;

    /*
     * the list of resource id's that this metric alert is scoped to.
     */
    @JsonProperty(value = "properties.scopes")
    private List<String> scopes;

    /*
     * how often the metric alert is evaluated represented in ISO 8601 duration
     * format.
     */
    @JsonProperty(value = "properties.evaluationFrequency", required = true)
    private Duration evaluationFrequency;

    /*
     * the period of time (in ISO 8601 duration format) that is used to monitor
     * alert activity based on the threshold.
     */
    @JsonProperty(value = "properties.windowSize", required = true)
    private Duration windowSize;

    /*
     * the resource type of the target resource(s) on which the alert is
     * created/updated. Mandatory for MultipleResourceMultipleMetricCriteria.
     */
    @JsonProperty(value = "properties.targetResourceType")
    private String targetResourceType;

    /*
     * the region of the target resource(s) on which the alert is
     * created/updated. Mandatory for MultipleResourceMultipleMetricCriteria.
     */
    @JsonProperty(value = "properties.targetResourceRegion")
    private String targetResourceRegion;

    /*
     * defines the specific alert criteria information.
     */
    @JsonProperty(value = "properties.criteria", required = true)
    private MetricAlertCriteria criteria;

    /*
     * the flag that indicates whether the alert should be auto resolved or
     * not. The default is true.
     */
    @JsonProperty(value = "properties.autoMitigate")
    private Boolean autoMitigate;

    /*
     * the array of actions that are performed when the alert rule becomes
     * active, and when an alert condition is resolved.
     */
    @JsonProperty(value = "properties.actions")
    private List<MetricAlertAction> actions;

    /*
     * Last time the rule was updated in ISO8601 format.
     */
    @JsonProperty(value = "properties.lastUpdatedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedTime;

    /**
     * Get the description property: the description of the metric alert that will be included in the alert email.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: the description of the metric alert that will be included in the alert email.
     *
     * @param description the description value to set.
     * @return the MetricAlertResourceInner object itself.
     */
    public MetricAlertResourceInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the severity property: Alert severity {0, 1, 2, 3, 4}.
     *
     * @return the severity value.
     */
    public int severity() {
        return this.severity;
    }

    /**
     * Set the severity property: Alert severity {0, 1, 2, 3, 4}.
     *
     * @param severity the severity value to set.
     * @return the MetricAlertResourceInner object itself.
     */
    public MetricAlertResourceInner withSeverity(int severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the enabled property: the flag that indicates whether the metric alert is enabled.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: the flag that indicates whether the metric alert is enabled.
     *
     * @param enabled the enabled value to set.
     * @return the MetricAlertResourceInner object itself.
     */
    public MetricAlertResourceInner withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the scopes property: the list of resource id's that this metric alert is scoped to.
     *
     * @return the scopes value.
     */
    public List<String> scopes() {
        return this.scopes;
    }

    /**
     * Set the scopes property: the list of resource id's that this metric alert is scoped to.
     *
     * @param scopes the scopes value to set.
     * @return the MetricAlertResourceInner object itself.
     */
    public MetricAlertResourceInner withScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    /**
     * Get the evaluationFrequency property: how often the metric alert is evaluated represented in ISO 8601 duration
     * format.
     *
     * @return the evaluationFrequency value.
     */
    public Duration evaluationFrequency() {
        return this.evaluationFrequency;
    }

    /**
     * Set the evaluationFrequency property: how often the metric alert is evaluated represented in ISO 8601 duration
     * format.
     *
     * @param evaluationFrequency the evaluationFrequency value to set.
     * @return the MetricAlertResourceInner object itself.
     */
    public MetricAlertResourceInner withEvaluationFrequency(Duration evaluationFrequency) {
        this.evaluationFrequency = evaluationFrequency;
        return this;
    }

    /**
     * Get the windowSize property: the period of time (in ISO 8601 duration format) that is used to monitor alert
     * activity based on the threshold.
     *
     * @return the windowSize value.
     */
    public Duration windowSize() {
        return this.windowSize;
    }

    /**
     * Set the windowSize property: the period of time (in ISO 8601 duration format) that is used to monitor alert
     * activity based on the threshold.
     *
     * @param windowSize the windowSize value to set.
     * @return the MetricAlertResourceInner object itself.
     */
    public MetricAlertResourceInner withWindowSize(Duration windowSize) {
        this.windowSize = windowSize;
        return this;
    }

    /**
     * Get the targetResourceType property: the resource type of the target resource(s) on which the alert is
     * created/updated. Mandatory for MultipleResourceMultipleMetricCriteria.
     *
     * @return the targetResourceType value.
     */
    public String targetResourceType() {
        return this.targetResourceType;
    }

    /**
     * Set the targetResourceType property: the resource type of the target resource(s) on which the alert is
     * created/updated. Mandatory for MultipleResourceMultipleMetricCriteria.
     *
     * @param targetResourceType the targetResourceType value to set.
     * @return the MetricAlertResourceInner object itself.
     */
    public MetricAlertResourceInner withTargetResourceType(String targetResourceType) {
        this.targetResourceType = targetResourceType;
        return this;
    }

    /**
     * Get the targetResourceRegion property: the region of the target resource(s) on which the alert is
     * created/updated. Mandatory for MultipleResourceMultipleMetricCriteria.
     *
     * @return the targetResourceRegion value.
     */
    public String targetResourceRegion() {
        return this.targetResourceRegion;
    }

    /**
     * Set the targetResourceRegion property: the region of the target resource(s) on which the alert is
     * created/updated. Mandatory for MultipleResourceMultipleMetricCriteria.
     *
     * @param targetResourceRegion the targetResourceRegion value to set.
     * @return the MetricAlertResourceInner object itself.
     */
    public MetricAlertResourceInner withTargetResourceRegion(String targetResourceRegion) {
        this.targetResourceRegion = targetResourceRegion;
        return this;
    }

    /**
     * Get the criteria property: defines the specific alert criteria information.
     *
     * @return the criteria value.
     */
    public MetricAlertCriteria criteria() {
        return this.criteria;
    }

    /**
     * Set the criteria property: defines the specific alert criteria information.
     *
     * @param criteria the criteria value to set.
     * @return the MetricAlertResourceInner object itself.
     */
    public MetricAlertResourceInner withCriteria(MetricAlertCriteria criteria) {
        this.criteria = criteria;
        return this;
    }

    /**
     * Get the autoMitigate property: the flag that indicates whether the alert should be auto resolved or not. The
     * default is true.
     *
     * @return the autoMitigate value.
     */
    public Boolean autoMitigate() {
        return this.autoMitigate;
    }

    /**
     * Set the autoMitigate property: the flag that indicates whether the alert should be auto resolved or not. The
     * default is true.
     *
     * @param autoMitigate the autoMitigate value to set.
     * @return the MetricAlertResourceInner object itself.
     */
    public MetricAlertResourceInner withAutoMitigate(Boolean autoMitigate) {
        this.autoMitigate = autoMitigate;
        return this;
    }

    /**
     * Get the actions property: the array of actions that are performed when the alert rule becomes active, and when an
     * alert condition is resolved.
     *
     * @return the actions value.
     */
    public List<MetricAlertAction> actions() {
        return this.actions;
    }

    /**
     * Set the actions property: the array of actions that are performed when the alert rule becomes active, and when an
     * alert condition is resolved.
     *
     * @param actions the actions value to set.
     * @return the MetricAlertResourceInner object itself.
     */
    public MetricAlertResourceInner withActions(List<MetricAlertAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the lastUpdatedTime property: Last time the rule was updated in ISO8601 format.
     *
     * @return the lastUpdatedTime value.
     */
    public OffsetDateTime lastUpdatedTime() {
        return this.lastUpdatedTime;
    }
}
