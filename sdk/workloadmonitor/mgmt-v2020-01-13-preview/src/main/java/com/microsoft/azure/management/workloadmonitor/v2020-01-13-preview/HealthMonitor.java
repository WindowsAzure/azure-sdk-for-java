/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.workloadmonitor.v2020-01-13-preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.workloadmonitor.v2020-01-13-preview.implementation.WorkloadMonitorManager;
import com.microsoft.azure.management.workloadmonitor.v2020-01-13-preview.implementation.HealthMonitorInner;

/**
 * Type representing HealthMonitor.
 */
public interface HealthMonitor extends HasInner<HealthMonitorInner>, HasManager<WorkloadMonitorManager> {
    /**
     * @return the currentMonitorState value.
     */
    HealthState currentMonitorState();

    /**
     * @return the currentStateFirstObservedTimestamp value.
     */
    String currentStateFirstObservedTimestamp();

    /**
     * @return the evaluationTimestamp value.
     */
    String evaluationTimestamp();

    /**
     * @return the evidence value.
     */
    Object evidence();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastReportedTimestamp value.
     */
    String lastReportedTimestamp();

    /**
     * @return the monitorConfiguration value.
     */
    Object monitorConfiguration();

    /**
     * @return the monitoredObject value.
     */
    String monitoredObject();

    /**
     * @return the monitorName value.
     */
    String monitorName();

    /**
     * @return the monitorType value.
     */
    String monitorType();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the parentMonitorName value.
     */
    String parentMonitorName();

    /**
     * @return the previousMonitorState value.
     */
    HealthState previousMonitorState();

    /**
     * @return the type value.
     */
    String type();

}
