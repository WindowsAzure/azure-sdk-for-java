// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Specification of data sources that will be collected. */
@Fluent
public class DataSourcesSpec {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataSourcesSpec.class);

    /*
     * The list of performance counter data source configurations.
     */
    @JsonProperty(value = "performanceCounters")
    private List<PerfCounterDataSource> performanceCounters;

    /*
     * The list of Windows Event Log data source configurations.
     */
    @JsonProperty(value = "windowsEventLogs")
    private List<WindowsEventLogDataSource> windowsEventLogs;

    /*
     * The list of Syslog data source configurations.
     */
    @JsonProperty(value = "syslog")
    private List<SyslogDataSource> syslog;

    /*
     * The list of Azure VM extension data source configurations.
     */
    @JsonProperty(value = "extensions")
    private List<ExtensionDataSource> extensions;

    /**
     * Get the performanceCounters property: The list of performance counter data source configurations.
     *
     * @return the performanceCounters value.
     */
    public List<PerfCounterDataSource> performanceCounters() {
        return this.performanceCounters;
    }

    /**
     * Set the performanceCounters property: The list of performance counter data source configurations.
     *
     * @param performanceCounters the performanceCounters value to set.
     * @return the DataSourcesSpec object itself.
     */
    public DataSourcesSpec withPerformanceCounters(List<PerfCounterDataSource> performanceCounters) {
        this.performanceCounters = performanceCounters;
        return this;
    }

    /**
     * Get the windowsEventLogs property: The list of Windows Event Log data source configurations.
     *
     * @return the windowsEventLogs value.
     */
    public List<WindowsEventLogDataSource> windowsEventLogs() {
        return this.windowsEventLogs;
    }

    /**
     * Set the windowsEventLogs property: The list of Windows Event Log data source configurations.
     *
     * @param windowsEventLogs the windowsEventLogs value to set.
     * @return the DataSourcesSpec object itself.
     */
    public DataSourcesSpec withWindowsEventLogs(List<WindowsEventLogDataSource> windowsEventLogs) {
        this.windowsEventLogs = windowsEventLogs;
        return this;
    }

    /**
     * Get the syslog property: The list of Syslog data source configurations.
     *
     * @return the syslog value.
     */
    public List<SyslogDataSource> syslog() {
        return this.syslog;
    }

    /**
     * Set the syslog property: The list of Syslog data source configurations.
     *
     * @param syslog the syslog value to set.
     * @return the DataSourcesSpec object itself.
     */
    public DataSourcesSpec withSyslog(List<SyslogDataSource> syslog) {
        this.syslog = syslog;
        return this;
    }

    /**
     * Get the extensions property: The list of Azure VM extension data source configurations.
     *
     * @return the extensions value.
     */
    public List<ExtensionDataSource> extensions() {
        return this.extensions;
    }

    /**
     * Set the extensions property: The list of Azure VM extension data source configurations.
     *
     * @param extensions the extensions value to set.
     * @return the DataSourcesSpec object itself.
     */
    public DataSourcesSpec withExtensions(List<ExtensionDataSource> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (performanceCounters() != null) {
            performanceCounters().forEach(e -> e.validate());
        }
        if (windowsEventLogs() != null) {
            windowsEventLogs().forEach(e -> e.validate());
        }
        if (syslog() != null) {
            syslog().forEach(e -> e.validate());
        }
        if (extensions() != null) {
            extensions().forEach(e -> e.validate());
        }
    }
}
