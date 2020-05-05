/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import java.util.Map;
import com.microsoft.azure.management.network.v2020_03_01.ConnectionMonitorSource;
import com.microsoft.azure.management.network.v2020_03_01.ConnectionMonitorDestination;
import java.util.List;
import com.microsoft.azure.management.network.v2020_03_01.ConnectionMonitorEndpoint;
import com.microsoft.azure.management.network.v2020_03_01.ConnectionMonitorTestConfiguration;
import com.microsoft.azure.management.network.v2020_03_01.ConnectionMonitorTestGroup;
import com.microsoft.azure.management.network.v2020_03_01.ConnectionMonitorOutput;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters that define the operation to create a connection monitor.
 */
@JsonFlatten
public class ConnectionMonitorInner {
    /**
     * Connection monitor location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Connection monitor tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Describes the source of connection monitor.
     */
    @JsonProperty(value = "properties.source")
    private ConnectionMonitorSource source;

    /**
     * Describes the destination of connection monitor.
     */
    @JsonProperty(value = "properties.destination")
    private ConnectionMonitorDestination destination;

    /**
     * Determines if the connection monitor will start automatically once
     * created.
     */
    @JsonProperty(value = "properties.autoStart")
    private Boolean autoStart;

    /**
     * Monitoring interval in seconds.
     */
    @JsonProperty(value = "properties.monitoringIntervalInSeconds")
    private Integer monitoringIntervalInSeconds;

    /**
     * List of connection monitor endpoints.
     */
    @JsonProperty(value = "properties.endpoints")
    private List<ConnectionMonitorEndpoint> endpoints;

    /**
     * List of connection monitor test configurations.
     */
    @JsonProperty(value = "properties.testConfigurations")
    private List<ConnectionMonitorTestConfiguration> testConfigurations;

    /**
     * List of connection monitor test groups.
     */
    @JsonProperty(value = "properties.testGroups")
    private List<ConnectionMonitorTestGroup> testGroups;

    /**
     * List of connection monitor outputs.
     */
    @JsonProperty(value = "properties.outputs")
    private List<ConnectionMonitorOutput> outputs;

    /**
     * Optional notes to be associated with the connection monitor.
     */
    @JsonProperty(value = "properties.notes")
    private String notes;

    /**
     * Get connection monitor location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set connection monitor location.
     *
     * @param location the location value to set
     * @return the ConnectionMonitorInner object itself.
     */
    public ConnectionMonitorInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get connection monitor tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set connection monitor tags.
     *
     * @param tags the tags value to set
     * @return the ConnectionMonitorInner object itself.
     */
    public ConnectionMonitorInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get describes the source of connection monitor.
     *
     * @return the source value
     */
    public ConnectionMonitorSource source() {
        return this.source;
    }

    /**
     * Set describes the source of connection monitor.
     *
     * @param source the source value to set
     * @return the ConnectionMonitorInner object itself.
     */
    public ConnectionMonitorInner withSource(ConnectionMonitorSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get describes the destination of connection monitor.
     *
     * @return the destination value
     */
    public ConnectionMonitorDestination destination() {
        return this.destination;
    }

    /**
     * Set describes the destination of connection monitor.
     *
     * @param destination the destination value to set
     * @return the ConnectionMonitorInner object itself.
     */
    public ConnectionMonitorInner withDestination(ConnectionMonitorDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get determines if the connection monitor will start automatically once created.
     *
     * @return the autoStart value
     */
    public Boolean autoStart() {
        return this.autoStart;
    }

    /**
     * Set determines if the connection monitor will start automatically once created.
     *
     * @param autoStart the autoStart value to set
     * @return the ConnectionMonitorInner object itself.
     */
    public ConnectionMonitorInner withAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }

    /**
     * Get monitoring interval in seconds.
     *
     * @return the monitoringIntervalInSeconds value
     */
    public Integer monitoringIntervalInSeconds() {
        return this.monitoringIntervalInSeconds;
    }

    /**
     * Set monitoring interval in seconds.
     *
     * @param monitoringIntervalInSeconds the monitoringIntervalInSeconds value to set
     * @return the ConnectionMonitorInner object itself.
     */
    public ConnectionMonitorInner withMonitoringIntervalInSeconds(Integer monitoringIntervalInSeconds) {
        this.monitoringIntervalInSeconds = monitoringIntervalInSeconds;
        return this;
    }

    /**
     * Get list of connection monitor endpoints.
     *
     * @return the endpoints value
     */
    public List<ConnectionMonitorEndpoint> endpoints() {
        return this.endpoints;
    }

    /**
     * Set list of connection monitor endpoints.
     *
     * @param endpoints the endpoints value to set
     * @return the ConnectionMonitorInner object itself.
     */
    public ConnectionMonitorInner withEndpoints(List<ConnectionMonitorEndpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Get list of connection monitor test configurations.
     *
     * @return the testConfigurations value
     */
    public List<ConnectionMonitorTestConfiguration> testConfigurations() {
        return this.testConfigurations;
    }

    /**
     * Set list of connection monitor test configurations.
     *
     * @param testConfigurations the testConfigurations value to set
     * @return the ConnectionMonitorInner object itself.
     */
    public ConnectionMonitorInner withTestConfigurations(List<ConnectionMonitorTestConfiguration> testConfigurations) {
        this.testConfigurations = testConfigurations;
        return this;
    }

    /**
     * Get list of connection monitor test groups.
     *
     * @return the testGroups value
     */
    public List<ConnectionMonitorTestGroup> testGroups() {
        return this.testGroups;
    }

    /**
     * Set list of connection monitor test groups.
     *
     * @param testGroups the testGroups value to set
     * @return the ConnectionMonitorInner object itself.
     */
    public ConnectionMonitorInner withTestGroups(List<ConnectionMonitorTestGroup> testGroups) {
        this.testGroups = testGroups;
        return this;
    }

    /**
     * Get list of connection monitor outputs.
     *
     * @return the outputs value
     */
    public List<ConnectionMonitorOutput> outputs() {
        return this.outputs;
    }

    /**
     * Set list of connection monitor outputs.
     *
     * @param outputs the outputs value to set
     * @return the ConnectionMonitorInner object itself.
     */
    public ConnectionMonitorInner withOutputs(List<ConnectionMonitorOutput> outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * Get optional notes to be associated with the connection monitor.
     *
     * @return the notes value
     */
    public String notes() {
        return this.notes;
    }

    /**
     * Set optional notes to be associated with the connection monitor.
     *
     * @param notes the notes value to set
     * @return the ConnectionMonitorInner object itself.
     */
    public ConnectionMonitorInner withNotes(String notes) {
        this.notes = notes;
        return this;
    }

}
