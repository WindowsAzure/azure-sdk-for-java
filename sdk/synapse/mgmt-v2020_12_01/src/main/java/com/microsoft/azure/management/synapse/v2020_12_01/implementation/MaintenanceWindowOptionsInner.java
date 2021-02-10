/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import java.util.List;
import com.microsoft.azure.management.synapse.v2020_12_01.MaintenanceWindowTimeRange;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Maintenance window options.
 */
@JsonFlatten
public class MaintenanceWindowOptionsInner extends ProxyResource {
    /**
     * Whether maintenance windows are enabled for the database.
     */
    @JsonProperty(value = "properties.isEnabled")
    private Boolean isEnabled;

    /**
     * Available maintenance cycles e.g. {Saturday, 0, 48*60}, {Wednesday, 0,
     * 24*60}.
     */
    @JsonProperty(value = "properties.maintenanceWindowCycles")
    private List<MaintenanceWindowTimeRange> maintenanceWindowCycles;

    /**
     * Minimum duration of maintenance window.
     */
    @JsonProperty(value = "properties.minDurationInMinutes")
    private Integer minDurationInMinutes;

    /**
     * Default duration for maintenance window.
     */
    @JsonProperty(value = "properties.defaultDurationInMinutes")
    private Integer defaultDurationInMinutes;

    /**
     * Minimum number of maintenance windows cycles to be set on the database.
     */
    @JsonProperty(value = "properties.minCycles")
    private Integer minCycles;

    /**
     * Time granularity in minutes for maintenance windows.
     */
    @JsonProperty(value = "properties.timeGranularityInMinutes")
    private Integer timeGranularityInMinutes;

    /**
     * Whether we allow multiple maintenance windows per cycle.
     */
    @JsonProperty(value = "properties.allowMultipleMaintenanceWindowsPerCycle")
    private Boolean allowMultipleMaintenanceWindowsPerCycle;

    /**
     * Get whether maintenance windows are enabled for the database.
     *
     * @return the isEnabled value
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set whether maintenance windows are enabled for the database.
     *
     * @param isEnabled the isEnabled value to set
     * @return the MaintenanceWindowOptionsInner object itself.
     */
    public MaintenanceWindowOptionsInner withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get available maintenance cycles e.g. {Saturday, 0, 48*60}, {Wednesday, 0, 24*60}.
     *
     * @return the maintenanceWindowCycles value
     */
    public List<MaintenanceWindowTimeRange> maintenanceWindowCycles() {
        return this.maintenanceWindowCycles;
    }

    /**
     * Set available maintenance cycles e.g. {Saturday, 0, 48*60}, {Wednesday, 0, 24*60}.
     *
     * @param maintenanceWindowCycles the maintenanceWindowCycles value to set
     * @return the MaintenanceWindowOptionsInner object itself.
     */
    public MaintenanceWindowOptionsInner withMaintenanceWindowCycles(List<MaintenanceWindowTimeRange> maintenanceWindowCycles) {
        this.maintenanceWindowCycles = maintenanceWindowCycles;
        return this;
    }

    /**
     * Get minimum duration of maintenance window.
     *
     * @return the minDurationInMinutes value
     */
    public Integer minDurationInMinutes() {
        return this.minDurationInMinutes;
    }

    /**
     * Set minimum duration of maintenance window.
     *
     * @param minDurationInMinutes the minDurationInMinutes value to set
     * @return the MaintenanceWindowOptionsInner object itself.
     */
    public MaintenanceWindowOptionsInner withMinDurationInMinutes(Integer minDurationInMinutes) {
        this.minDurationInMinutes = minDurationInMinutes;
        return this;
    }

    /**
     * Get default duration for maintenance window.
     *
     * @return the defaultDurationInMinutes value
     */
    public Integer defaultDurationInMinutes() {
        return this.defaultDurationInMinutes;
    }

    /**
     * Set default duration for maintenance window.
     *
     * @param defaultDurationInMinutes the defaultDurationInMinutes value to set
     * @return the MaintenanceWindowOptionsInner object itself.
     */
    public MaintenanceWindowOptionsInner withDefaultDurationInMinutes(Integer defaultDurationInMinutes) {
        this.defaultDurationInMinutes = defaultDurationInMinutes;
        return this;
    }

    /**
     * Get minimum number of maintenance windows cycles to be set on the database.
     *
     * @return the minCycles value
     */
    public Integer minCycles() {
        return this.minCycles;
    }

    /**
     * Set minimum number of maintenance windows cycles to be set on the database.
     *
     * @param minCycles the minCycles value to set
     * @return the MaintenanceWindowOptionsInner object itself.
     */
    public MaintenanceWindowOptionsInner withMinCycles(Integer minCycles) {
        this.minCycles = minCycles;
        return this;
    }

    /**
     * Get time granularity in minutes for maintenance windows.
     *
     * @return the timeGranularityInMinutes value
     */
    public Integer timeGranularityInMinutes() {
        return this.timeGranularityInMinutes;
    }

    /**
     * Set time granularity in minutes for maintenance windows.
     *
     * @param timeGranularityInMinutes the timeGranularityInMinutes value to set
     * @return the MaintenanceWindowOptionsInner object itself.
     */
    public MaintenanceWindowOptionsInner withTimeGranularityInMinutes(Integer timeGranularityInMinutes) {
        this.timeGranularityInMinutes = timeGranularityInMinutes;
        return this;
    }

    /**
     * Get whether we allow multiple maintenance windows per cycle.
     *
     * @return the allowMultipleMaintenanceWindowsPerCycle value
     */
    public Boolean allowMultipleMaintenanceWindowsPerCycle() {
        return this.allowMultipleMaintenanceWindowsPerCycle;
    }

    /**
     * Set whether we allow multiple maintenance windows per cycle.
     *
     * @param allowMultipleMaintenanceWindowsPerCycle the allowMultipleMaintenanceWindowsPerCycle value to set
     * @return the MaintenanceWindowOptionsInner object itself.
     */
    public MaintenanceWindowOptionsInner withAllowMultipleMaintenanceWindowsPerCycle(Boolean allowMultipleMaintenanceWindowsPerCycle) {
        this.allowMultipleMaintenanceWindowsPerCycle = allowMultipleMaintenanceWindowsPerCycle;
        return this;
    }

}
