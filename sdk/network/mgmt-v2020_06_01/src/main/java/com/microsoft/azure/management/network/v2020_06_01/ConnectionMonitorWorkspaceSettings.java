/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the settings for producing output into a log analytics workspace.
 */
public class ConnectionMonitorWorkspaceSettings {
    /**
     * Log analytics workspace resource ID.
     */
    @JsonProperty(value = "workspaceResourceId")
    private String workspaceResourceId;

    /**
     * Get log analytics workspace resource ID.
     *
     * @return the workspaceResourceId value
     */
    public String workspaceResourceId() {
        return this.workspaceResourceId;
    }

    /**
     * Set log analytics workspace resource ID.
     *
     * @param workspaceResourceId the workspaceResourceId value to set
     * @return the ConnectionMonitorWorkspaceSettings object itself.
     */
    public ConnectionMonitorWorkspaceSettings withWorkspaceResourceId(String workspaceResourceId) {
        this.workspaceResourceId = workspaceResourceId;
        return this;
    }

}
