// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Operations Management Suite (OMS) status response. */
@Fluent
public final class ClusterMonitoringResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterMonitoringResponseInner.class);

    /*
     * The status of the Operations Management Suite (OMS) on the HDInsight
     * cluster.
     */
    @JsonProperty(value = "clusterMonitoringEnabled")
    private Boolean clusterMonitoringEnabled;

    /*
     * The workspace ID of the Operations Management Suite (OMS) on the
     * HDInsight cluster.
     */
    @JsonProperty(value = "workspaceId")
    private String workspaceId;

    /**
     * Get the clusterMonitoringEnabled property: The status of the Operations Management Suite (OMS) on the HDInsight
     * cluster.
     *
     * @return the clusterMonitoringEnabled value.
     */
    public Boolean clusterMonitoringEnabled() {
        return this.clusterMonitoringEnabled;
    }

    /**
     * Set the clusterMonitoringEnabled property: The status of the Operations Management Suite (OMS) on the HDInsight
     * cluster.
     *
     * @param clusterMonitoringEnabled the clusterMonitoringEnabled value to set.
     * @return the ClusterMonitoringResponseInner object itself.
     */
    public ClusterMonitoringResponseInner withClusterMonitoringEnabled(Boolean clusterMonitoringEnabled) {
        this.clusterMonitoringEnabled = clusterMonitoringEnabled;
        return this;
    }

    /**
     * Get the workspaceId property: The workspace ID of the Operations Management Suite (OMS) on the HDInsight cluster.
     *
     * @return the workspaceId value.
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    /**
     * Set the workspaceId property: The workspace ID of the Operations Management Suite (OMS) on the HDInsight cluster.
     *
     * @param workspaceId the workspaceId value to set.
     * @return the ClusterMonitoringResponseInner object itself.
     */
    public ClusterMonitoringResponseInner withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
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
