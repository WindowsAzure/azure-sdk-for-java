// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.UUID;

/** The IncidentResult model. */
@Fluent
public final class IncidentResult {
    /*
     * metric unique id
     *
     * only return for alerting incident result
     */
    @JsonProperty(value = "metricId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID metricId;

    /*
     * anomaly detection configuration unique id
     *
     * only return for alerting incident result
     */
    @JsonProperty(value = "anomalyDetectionConfigurationId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID anomalyDetectionConfigurationId;

    /*
     * incident id
     */
    @JsonProperty(value = "incidentId", required = true)
    private String incidentId;

    /*
     * incident start time
     */
    @JsonProperty(value = "startTime", required = true)
    private OffsetDateTime startTime;

    /*
     * incident last time
     */
    @JsonProperty(value = "lastTime", required = true)
    private OffsetDateTime lastTime;

    /*
     * The rootNode property.
     */
    @JsonProperty(value = "rootNode", required = true)
    private SeriesIdentity rootNode;

    /*
     * The property property.
     */
    @JsonProperty(value = "property", required = true)
    private IncidentProperty property;

    /**
     * Get the metricId property: metric unique id
     *
     * <p>only return for alerting incident result.
     *
     * @return the metricId value.
     */
    public UUID getMetricId() {
        return this.metricId;
    }

    /**
     * Get the anomalyDetectionConfigurationId property: anomaly detection configuration unique id
     *
     * <p>only return for alerting incident result.
     *
     * @return the anomalyDetectionConfigurationId value.
     */
    public UUID getAnomalyDetectionConfigurationId() {
        return this.anomalyDetectionConfigurationId;
    }

    /**
     * Get the incidentId property: incident id.
     *
     * @return the incidentId value.
     */
    public String getIncidentId() {
        return this.incidentId;
    }

    /**
     * Set the incidentId property: incident id.
     *
     * @param incidentId the incidentId value to set.
     * @return the IncidentResult object itself.
     */
    public IncidentResult setIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }

    /**
     * Get the startTime property: incident start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: incident start time.
     *
     * @param startTime the startTime value to set.
     * @return the IncidentResult object itself.
     */
    public IncidentResult setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the lastTime property: incident last time.
     *
     * @return the lastTime value.
     */
    public OffsetDateTime getLastTime() {
        return this.lastTime;
    }

    /**
     * Set the lastTime property: incident last time.
     *
     * @param lastTime the lastTime value to set.
     * @return the IncidentResult object itself.
     */
    public IncidentResult setLastTime(OffsetDateTime lastTime) {
        this.lastTime = lastTime;
        return this;
    }

    /**
     * Get the rootNode property: The rootNode property.
     *
     * @return the rootNode value.
     */
    public SeriesIdentity getRootNode() {
        return this.rootNode;
    }

    /**
     * Set the rootNode property: The rootNode property.
     *
     * @param rootNode the rootNode value to set.
     * @return the IncidentResult object itself.
     */
    public IncidentResult setRootNode(SeriesIdentity rootNode) {
        this.rootNode = rootNode;
        return this;
    }

    /**
     * Get the property property: The property property.
     *
     * @return the property value.
     */
    public IncidentProperty getProperty() {
        return this.property;
    }

    /**
     * Set the property property: The property property.
     *
     * @param property the property value to set.
     * @return the IncidentResult object itself.
     */
    public IncidentResult setProperty(IncidentProperty property) {
        this.property = property;
        return this;
    }
}
