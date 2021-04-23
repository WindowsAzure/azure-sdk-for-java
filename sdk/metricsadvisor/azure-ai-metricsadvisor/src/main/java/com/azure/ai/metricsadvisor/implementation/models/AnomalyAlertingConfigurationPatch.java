// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** The AnomalyAlertingConfigurationPatch model. */
@Fluent
public final class AnomalyAlertingConfigurationPatch {
    /*
     * Anomaly alerting configuration name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * anomaly alerting configuration description
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * cross metrics operator
     */
    @JsonProperty(value = "crossMetricsOperator")
    private AnomalyAlertingConfigurationLogicType crossMetricsOperator;

    /*
     * dimensions used to split alert
     */
    @JsonProperty(value = "splitAlertByDimensions")
    private List<String> splitAlertByDimensions;

    /*
     * hook unique ids
     */
    @JsonProperty(value = "hookIds")
    private List<UUID> hookIds;

    /*
     * Anomaly alerting configurations
     */
    @JsonProperty(value = "metricAlertingConfigurations")
    private List<MetricAlertingConfiguration> metricAlertingConfigurations;

    /**
     * Get the name property: Anomaly alerting configuration name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Anomaly alerting configuration name.
     *
     * @param name the name value to set.
     * @return the AnomalyAlertingConfigurationPatch object itself.
     */
    public AnomalyAlertingConfigurationPatch setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: anomaly alerting configuration description.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: anomaly alerting configuration description.
     *
     * @param description the description value to set.
     * @return the AnomalyAlertingConfigurationPatch object itself.
     */
    public AnomalyAlertingConfigurationPatch setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the crossMetricsOperator property: cross metrics operator.
     *
     * @return the crossMetricsOperator value.
     */
    public AnomalyAlertingConfigurationLogicType getCrossMetricsOperator() {
        return this.crossMetricsOperator;
    }

    /**
     * Set the crossMetricsOperator property: cross metrics operator.
     *
     * @param crossMetricsOperator the crossMetricsOperator value to set.
     * @return the AnomalyAlertingConfigurationPatch object itself.
     */
    public AnomalyAlertingConfigurationPatch setCrossMetricsOperator(
            AnomalyAlertingConfigurationLogicType crossMetricsOperator) {
        this.crossMetricsOperator = crossMetricsOperator;
        return this;
    }

    /**
     * Get the splitAlertByDimensions property: dimensions used to split alert.
     *
     * @return the splitAlertByDimensions value.
     */
    public List<String> getSplitAlertByDimensions() {
        return this.splitAlertByDimensions;
    }

    /**
     * Set the splitAlertByDimensions property: dimensions used to split alert.
     *
     * @param splitAlertByDimensions the splitAlertByDimensions value to set.
     * @return the AnomalyAlertingConfigurationPatch object itself.
     */
    public AnomalyAlertingConfigurationPatch setSplitAlertByDimensions(List<String> splitAlertByDimensions) {
        this.splitAlertByDimensions = splitAlertByDimensions;
        return this;
    }

    /**
     * Get the hookIds property: hook unique ids.
     *
     * @return the hookIds value.
     */
    public List<UUID> getHookIds() {
        return this.hookIds;
    }

    /**
     * Set the hookIds property: hook unique ids.
     *
     * @param hookIds the hookIds value to set.
     * @return the AnomalyAlertingConfigurationPatch object itself.
     */
    public AnomalyAlertingConfigurationPatch setHookIds(List<UUID> hookIds) {
        this.hookIds = hookIds;
        return this;
    }

    /**
     * Get the metricAlertingConfigurations property: Anomaly alerting configurations.
     *
     * @return the metricAlertingConfigurations value.
     */
    public List<MetricAlertingConfiguration> getMetricAlertingConfigurations() {
        return this.metricAlertingConfigurations;
    }

    /**
     * Set the metricAlertingConfigurations property: Anomaly alerting configurations.
     *
     * @param metricAlertingConfigurations the metricAlertingConfigurations value to set.
     * @return the AnomalyAlertingConfigurationPatch object itself.
     */
    public AnomalyAlertingConfigurationPatch setMetricAlertingConfigurations(
            List<MetricAlertingConfiguration> metricAlertingConfigurations) {
        this.metricAlertingConfigurations = metricAlertingConfigurations;
        return this;
    }
}
