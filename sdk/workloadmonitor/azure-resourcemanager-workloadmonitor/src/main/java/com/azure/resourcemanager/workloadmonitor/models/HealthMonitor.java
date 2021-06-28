// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadmonitor.models;

import com.azure.resourcemanager.workloadmonitor.fluent.models.HealthMonitorInner;

/** An immutable client-side representation of HealthMonitor. */
public interface HealthMonitor {
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
     * Gets the monitorName property: Human-readable name of the monitor.
     *
     * @return the monitorName value.
     */
    String monitorName();

    /**
     * Gets the monitorType property: Type of the monitor.
     *
     * @return the monitorType value.
     */
    String monitorType();

    /**
     * Gets the monitoredObject property: Dynamic monitored object of the monitor.
     *
     * @return the monitoredObject value.
     */
    String monitoredObject();

    /**
     * Gets the parentMonitorName property: Name of the parent monitor.
     *
     * @return the parentMonitorName value.
     */
    String parentMonitorName();

    /**
     * Gets the previousMonitorState property: Previous health state of the monitor.
     *
     * @return the previousMonitorState value.
     */
    HealthState previousMonitorState();

    /**
     * Gets the currentMonitorState property: Current health state of the monitor.
     *
     * @return the currentMonitorState value.
     */
    HealthState currentMonitorState();

    /**
     * Gets the evaluationTimestamp property: Timestamp of the monitor's last health evaluation.
     *
     * @return the evaluationTimestamp value.
     */
    String evaluationTimestamp();

    /**
     * Gets the currentStateFirstObservedTimestamp property: Timestamp of the monitor's last health state change.
     *
     * @return the currentStateFirstObservedTimestamp value.
     */
    String currentStateFirstObservedTimestamp();

    /**
     * Gets the lastReportedTimestamp property: Timestamp of the monitor's last reported health state.
     *
     * @return the lastReportedTimestamp value.
     */
    String lastReportedTimestamp();

    /**
     * Gets the evidence property: Evidence validating the monitor's current health state.
     *
     * @return the evidence value.
     */
    Object evidence();

    /**
     * Gets the monitorConfiguration property: The configuration settings at the time of the monitor's health
     * evaluation.
     *
     * @return the monitorConfiguration value.
     */
    Object monitorConfiguration();

    /**
     * Gets the inner com.azure.resourcemanager.workloadmonitor.fluent.models.HealthMonitorInner object.
     *
     * @return the inner object.
     */
    HealthMonitorInner innerModel();
}
