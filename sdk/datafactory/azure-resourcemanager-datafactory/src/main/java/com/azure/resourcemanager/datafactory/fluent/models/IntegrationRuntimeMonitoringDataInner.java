// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeNodeMonitoringData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Get monitoring data response. */
@Fluent
public final class IntegrationRuntimeMonitoringDataInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IntegrationRuntimeMonitoringDataInner.class);

    /*
     * Integration runtime name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Integration runtime node monitoring data.
     */
    @JsonProperty(value = "nodes")
    private List<IntegrationRuntimeNodeMonitoringData> nodes;

    /**
     * Get the name property: Integration runtime name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Integration runtime name.
     *
     * @param name the name value to set.
     * @return the IntegrationRuntimeMonitoringDataInner object itself.
     */
    public IntegrationRuntimeMonitoringDataInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the nodes property: Integration runtime node monitoring data.
     *
     * @return the nodes value.
     */
    public List<IntegrationRuntimeNodeMonitoringData> nodes() {
        return this.nodes;
    }

    /**
     * Set the nodes property: Integration runtime node monitoring data.
     *
     * @param nodes the nodes value to set.
     * @return the IntegrationRuntimeMonitoringDataInner object itself.
     */
    public IntegrationRuntimeMonitoringDataInner withNodes(List<IntegrationRuntimeNodeMonitoringData> nodes) {
        this.nodes = nodes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (nodes() != null) {
            nodes().forEach(e -> e.validate());
        }
    }
}
