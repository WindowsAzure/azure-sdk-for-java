// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Definition of which Windows Event Log events will be collected and how they will be collected. Only collected from
 * Windows machines.
 */
@Fluent
public final class WindowsEventLogDataSource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WindowsEventLogDataSource.class);

    /*
     * List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually
     * what table in Log Analytics the data will be sent to.
     */
    @JsonProperty(value = "streams")
    private List<KnownWindowsEventLogDataSourceStreams> streams;

    /*
     * A list of Windows Event Log queries in XPATH format.
     */
    @JsonProperty(value = "xPathQueries")
    private List<String> xPathQueries;

    /*
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type)
     * within the data collection rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the streams property: List of streams that this data source will be sent to. A stream indicates what schema
     * will be used for this data and usually what table in Log Analytics the data will be sent to.
     *
     * @return the streams value.
     */
    public List<KnownWindowsEventLogDataSourceStreams> streams() {
        return this.streams;
    }

    /**
     * Set the streams property: List of streams that this data source will be sent to. A stream indicates what schema
     * will be used for this data and usually what table in Log Analytics the data will be sent to.
     *
     * @param streams the streams value to set.
     * @return the WindowsEventLogDataSource object itself.
     */
    public WindowsEventLogDataSource withStreams(List<KnownWindowsEventLogDataSourceStreams> streams) {
        this.streams = streams;
        return this;
    }

    /**
     * Get the xPathQueries property: A list of Windows Event Log queries in XPATH format.
     *
     * @return the xPathQueries value.
     */
    public List<String> xPathQueries() {
        return this.xPathQueries;
    }

    /**
     * Set the xPathQueries property: A list of Windows Event Log queries in XPATH format.
     *
     * @param xPathQueries the xPathQueries value to set.
     * @return the WindowsEventLogDataSource object itself.
     */
    public WindowsEventLogDataSource withXPathQueries(List<String> xPathQueries) {
        this.xPathQueries = xPathQueries;
        return this;
    }

    /**
     * Get the name property: A friendly name for the data source. This name should be unique across all data sources
     * (regardless of type) within the data collection rule.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: A friendly name for the data source. This name should be unique across all data sources
     * (regardless of type) within the data collection rule.
     *
     * @param name the name value to set.
     * @return the WindowsEventLogDataSource object itself.
     */
    public WindowsEventLogDataSource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
