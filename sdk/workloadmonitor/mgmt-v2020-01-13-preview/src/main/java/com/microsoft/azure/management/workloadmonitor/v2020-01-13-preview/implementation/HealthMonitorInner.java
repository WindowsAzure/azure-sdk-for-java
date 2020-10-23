/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.workloadmonitor.v2020-01-13-preview.implementation;

import com.microsoft.azure.management.workloadmonitor.v2020-01-13-preview.HealthState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Information about the monitor’s current health status.
 */
@JsonFlatten
public class HealthMonitorInner extends ProxyResource {
    /**
     * Human-readable name of the monitor.
     */
    @JsonProperty(value = "properties.monitorName")
    private String monitorName;

    /**
     * Type of the monitor.
     */
    @JsonProperty(value = "properties.monitorType")
    private String monitorType;

    /**
     * Dynamic monitored object of the monitor.
     */
    @JsonProperty(value = "properties.monitoredObject")
    private String monitoredObject;

    /**
     * Name of the parent monitor.
     */
    @JsonProperty(value = "properties.parentMonitorName")
    private String parentMonitorName;

    /**
     * Previous health state of the monitor. Possible values include:
     * 'Healthy', 'Critical', 'Warning', 'Unknown', 'Disabled', 'None'.
     */
    @JsonProperty(value = "properties.previousMonitorState")
    private HealthState previousMonitorState;

    /**
     * Current health state of the monitor. Possible values include: 'Healthy',
     * 'Critical', 'Warning', 'Unknown', 'Disabled', 'None'.
     */
    @JsonProperty(value = "properties.currentMonitorState")
    private HealthState currentMonitorState;

    /**
     * Timestamp of the monitor's last health evaluation.
     */
    @JsonProperty(value = "properties.evaluationTimestamp")
    private String evaluationTimestamp;

    /**
     * Timestamp of the monitor's last health state change.
     */
    @JsonProperty(value = "properties.currentStateFirstObservedTimestamp")
    private String currentStateFirstObservedTimestamp;

    /**
     * Timestamp of the monitor's last reported health state.
     */
    @JsonProperty(value = "properties.lastReportedTimestamp")
    private String lastReportedTimestamp;

    /**
     * Evidence validating the monitor's current health state.
     */
    @JsonProperty(value = "properties.evidence")
    private Object evidence;

    /**
     * The configuration settings at the time of the monitor's health
     * evaluation.
     */
    @JsonProperty(value = "properties.monitorConfiguration")
    private Object monitorConfiguration;

    /**
     * Get human-readable name of the monitor.
     *
     * @return the monitorName value
     */
    public String monitorName() {
        return this.monitorName;
    }

    /**
     * Set human-readable name of the monitor.
     *
     * @param monitorName the monitorName value to set
     * @return the HealthMonitorInner object itself.
     */
    public HealthMonitorInner withMonitorName(String monitorName) {
        this.monitorName = monitorName;
        return this;
    }

    /**
     * Get type of the monitor.
     *
     * @return the monitorType value
     */
    public String monitorType() {
        return this.monitorType;
    }

    /**
     * Set type of the monitor.
     *
     * @param monitorType the monitorType value to set
     * @return the HealthMonitorInner object itself.
     */
    public HealthMonitorInner withMonitorType(String monitorType) {
        this.monitorType = monitorType;
        return this;
    }

    /**
     * Get dynamic monitored object of the monitor.
     *
     * @return the monitoredObject value
     */
    public String monitoredObject() {
        return this.monitoredObject;
    }

    /**
     * Set dynamic monitored object of the monitor.
     *
     * @param monitoredObject the monitoredObject value to set
     * @return the HealthMonitorInner object itself.
     */
    public HealthMonitorInner withMonitoredObject(String monitoredObject) {
        this.monitoredObject = monitoredObject;
        return this;
    }

    /**
     * Get name of the parent monitor.
     *
     * @return the parentMonitorName value
     */
    public String parentMonitorName() {
        return this.parentMonitorName;
    }

    /**
     * Set name of the parent monitor.
     *
     * @param parentMonitorName the parentMonitorName value to set
     * @return the HealthMonitorInner object itself.
     */
    public HealthMonitorInner withParentMonitorName(String parentMonitorName) {
        this.parentMonitorName = parentMonitorName;
        return this;
    }

    /**
     * Get previous health state of the monitor. Possible values include: 'Healthy', 'Critical', 'Warning', 'Unknown', 'Disabled', 'None'.
     *
     * @return the previousMonitorState value
     */
    public HealthState previousMonitorState() {
        return this.previousMonitorState;
    }

    /**
     * Set previous health state of the monitor. Possible values include: 'Healthy', 'Critical', 'Warning', 'Unknown', 'Disabled', 'None'.
     *
     * @param previousMonitorState the previousMonitorState value to set
     * @return the HealthMonitorInner object itself.
     */
    public HealthMonitorInner withPreviousMonitorState(HealthState previousMonitorState) {
        this.previousMonitorState = previousMonitorState;
        return this;
    }

    /**
     * Get current health state of the monitor. Possible values include: 'Healthy', 'Critical', 'Warning', 'Unknown', 'Disabled', 'None'.
     *
     * @return the currentMonitorState value
     */
    public HealthState currentMonitorState() {
        return this.currentMonitorState;
    }

    /**
     * Set current health state of the monitor. Possible values include: 'Healthy', 'Critical', 'Warning', 'Unknown', 'Disabled', 'None'.
     *
     * @param currentMonitorState the currentMonitorState value to set
     * @return the HealthMonitorInner object itself.
     */
    public HealthMonitorInner withCurrentMonitorState(HealthState currentMonitorState) {
        this.currentMonitorState = currentMonitorState;
        return this;
    }

    /**
     * Get timestamp of the monitor's last health evaluation.
     *
     * @return the evaluationTimestamp value
     */
    public String evaluationTimestamp() {
        return this.evaluationTimestamp;
    }

    /**
     * Set timestamp of the monitor's last health evaluation.
     *
     * @param evaluationTimestamp the evaluationTimestamp value to set
     * @return the HealthMonitorInner object itself.
     */
    public HealthMonitorInner withEvaluationTimestamp(String evaluationTimestamp) {
        this.evaluationTimestamp = evaluationTimestamp;
        return this;
    }

    /**
     * Get timestamp of the monitor's last health state change.
     *
     * @return the currentStateFirstObservedTimestamp value
     */
    public String currentStateFirstObservedTimestamp() {
        return this.currentStateFirstObservedTimestamp;
    }

    /**
     * Set timestamp of the monitor's last health state change.
     *
     * @param currentStateFirstObservedTimestamp the currentStateFirstObservedTimestamp value to set
     * @return the HealthMonitorInner object itself.
     */
    public HealthMonitorInner withCurrentStateFirstObservedTimestamp(String currentStateFirstObservedTimestamp) {
        this.currentStateFirstObservedTimestamp = currentStateFirstObservedTimestamp;
        return this;
    }

    /**
     * Get timestamp of the monitor's last reported health state.
     *
     * @return the lastReportedTimestamp value
     */
    public String lastReportedTimestamp() {
        return this.lastReportedTimestamp;
    }

    /**
     * Set timestamp of the monitor's last reported health state.
     *
     * @param lastReportedTimestamp the lastReportedTimestamp value to set
     * @return the HealthMonitorInner object itself.
     */
    public HealthMonitorInner withLastReportedTimestamp(String lastReportedTimestamp) {
        this.lastReportedTimestamp = lastReportedTimestamp;
        return this;
    }

    /**
     * Get evidence validating the monitor's current health state.
     *
     * @return the evidence value
     */
    public Object evidence() {
        return this.evidence;
    }

    /**
     * Set evidence validating the monitor's current health state.
     *
     * @param evidence the evidence value to set
     * @return the HealthMonitorInner object itself.
     */
    public HealthMonitorInner withEvidence(Object evidence) {
        this.evidence = evidence;
        return this;
    }

    /**
     * Get the configuration settings at the time of the monitor's health evaluation.
     *
     * @return the monitorConfiguration value
     */
    public Object monitorConfiguration() {
        return this.monitorConfiguration;
    }

    /**
     * Set the configuration settings at the time of the monitor's health evaluation.
     *
     * @param monitorConfiguration the monitorConfiguration value to set
     * @return the HealthMonitorInner object itself.
     */
    public HealthMonitorInner withMonitorConfiguration(Object monitorConfiguration) {
        this.monitorConfiguration = monitorConfiguration;
        return this;
    }

}
