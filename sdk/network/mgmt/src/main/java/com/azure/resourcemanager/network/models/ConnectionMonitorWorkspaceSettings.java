// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ConnectionMonitorWorkspaceSettings model. */
@Fluent
public final class ConnectionMonitorWorkspaceSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionMonitorWorkspaceSettings.class);

    /*
     * Log analytics workspace resource ID.
     */
    @JsonProperty(value = "workspaceResourceId")
    private String workspaceResourceId;

    /**
     * Get the workspaceResourceId property: Log analytics workspace resource ID.
     *
     * @return the workspaceResourceId value.
     */
    public String workspaceResourceId() {
        return this.workspaceResourceId;
    }

    /**
     * Set the workspaceResourceId property: Log analytics workspace resource ID.
     *
     * @param workspaceResourceId the workspaceResourceId value to set.
     * @return the ConnectionMonitorWorkspaceSettings object itself.
     */
    public ConnectionMonitorWorkspaceSettings withWorkspaceResourceId(String workspaceResourceId) {
        this.workspaceResourceId = workspaceResourceId;
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
