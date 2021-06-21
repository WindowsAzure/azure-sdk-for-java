// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Log Analytics destination. */
@Fluent
public final class LogAnalyticsDestination {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LogAnalyticsDestination.class);

    /*
     * The resource ID of the Log Analytics workspace.
     */
    @JsonProperty(value = "workspaceResourceId")
    private String workspaceResourceId;

    /*
     * The Customer ID of the Log Analytics workspace.
     */
    @JsonProperty(value = "workspaceId", access = JsonProperty.Access.WRITE_ONLY)
    private String workspaceId;

    /*
     * A friendly name for the destination.
     * This name should be unique across all destinations (regardless of type)
     * within the data collection rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the workspaceResourceId property: The resource ID of the Log Analytics workspace.
     *
     * @return the workspaceResourceId value.
     */
    public String workspaceResourceId() {
        return this.workspaceResourceId;
    }

    /**
     * Set the workspaceResourceId property: The resource ID of the Log Analytics workspace.
     *
     * @param workspaceResourceId the workspaceResourceId value to set.
     * @return the LogAnalyticsDestination object itself.
     */
    public LogAnalyticsDestination withWorkspaceResourceId(String workspaceResourceId) {
        this.workspaceResourceId = workspaceResourceId;
        return this;
    }

    /**
     * Get the workspaceId property: The Customer ID of the Log Analytics workspace.
     *
     * @return the workspaceId value.
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    /**
     * Get the name property: A friendly name for the destination. This name should be unique across all destinations
     * (regardless of type) within the data collection rule.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: A friendly name for the destination. This name should be unique across all destinations
     * (regardless of type) within the data collection rule.
     *
     * @param name the name value to set.
     * @return the LogAnalyticsDestination object itself.
     */
    public LogAnalyticsDestination withName(String name) {
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
