// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Request body structure for creating data flow debug session. */
@Fluent
public final class CreateDataFlowDebugSessionRequest {
    /*
     * The name of the data flow.
     */
    @JsonProperty(value = "dataFlowName")
    private String dataFlowName;

    /*
     * The ID of existing Databricks cluster.
     */
    @JsonProperty(value = "existingClusterId")
    private String existingClusterId;

    /*
     * Timeout setting for Databricks cluster.
     */
    @JsonProperty(value = "clusterTimeout")
    private Integer clusterTimeout;

    /*
     * The name of new Databricks cluster.
     */
    @JsonProperty(value = "newClusterName")
    private String newClusterName;

    /*
     * The type of new Databricks cluster.
     */
    @JsonProperty(value = "newClusterNodeType")
    private String newClusterNodeType;

    /*
     * Data bricks linked service.
     */
    @JsonProperty(value = "dataBricksLinkedService")
    private LinkedServiceResource dataBricksLinkedService;

    /**
     * Get the dataFlowName property: The name of the data flow.
     *
     * @return the dataFlowName value.
     */
    public String getDataFlowName() {
        return this.dataFlowName;
    }

    /**
     * Set the dataFlowName property: The name of the data flow.
     *
     * @param dataFlowName the dataFlowName value to set.
     * @return the CreateDataFlowDebugSessionRequest object itself.
     */
    public CreateDataFlowDebugSessionRequest setDataFlowName(String dataFlowName) {
        this.dataFlowName = dataFlowName;
        return this;
    }

    /**
     * Get the existingClusterId property: The ID of existing Databricks cluster.
     *
     * @return the existingClusterId value.
     */
    public String getExistingClusterId() {
        return this.existingClusterId;
    }

    /**
     * Set the existingClusterId property: The ID of existing Databricks cluster.
     *
     * @param existingClusterId the existingClusterId value to set.
     * @return the CreateDataFlowDebugSessionRequest object itself.
     */
    public CreateDataFlowDebugSessionRequest setExistingClusterId(String existingClusterId) {
        this.existingClusterId = existingClusterId;
        return this;
    }

    /**
     * Get the clusterTimeout property: Timeout setting for Databricks cluster.
     *
     * @return the clusterTimeout value.
     */
    public Integer getClusterTimeout() {
        return this.clusterTimeout;
    }

    /**
     * Set the clusterTimeout property: Timeout setting for Databricks cluster.
     *
     * @param clusterTimeout the clusterTimeout value to set.
     * @return the CreateDataFlowDebugSessionRequest object itself.
     */
    public CreateDataFlowDebugSessionRequest setClusterTimeout(Integer clusterTimeout) {
        this.clusterTimeout = clusterTimeout;
        return this;
    }

    /**
     * Get the newClusterName property: The name of new Databricks cluster.
     *
     * @return the newClusterName value.
     */
    public String getNewClusterName() {
        return this.newClusterName;
    }

    /**
     * Set the newClusterName property: The name of new Databricks cluster.
     *
     * @param newClusterName the newClusterName value to set.
     * @return the CreateDataFlowDebugSessionRequest object itself.
     */
    public CreateDataFlowDebugSessionRequest setNewClusterName(String newClusterName) {
        this.newClusterName = newClusterName;
        return this;
    }

    /**
     * Get the newClusterNodeType property: The type of new Databricks cluster.
     *
     * @return the newClusterNodeType value.
     */
    public String getNewClusterNodeType() {
        return this.newClusterNodeType;
    }

    /**
     * Set the newClusterNodeType property: The type of new Databricks cluster.
     *
     * @param newClusterNodeType the newClusterNodeType value to set.
     * @return the CreateDataFlowDebugSessionRequest object itself.
     */
    public CreateDataFlowDebugSessionRequest setNewClusterNodeType(String newClusterNodeType) {
        this.newClusterNodeType = newClusterNodeType;
        return this;
    }

    /**
     * Get the dataBricksLinkedService property: Data bricks linked service.
     *
     * @return the dataBricksLinkedService value.
     */
    public LinkedServiceResource getDataBricksLinkedService() {
        return this.dataBricksLinkedService;
    }

    /**
     * Set the dataBricksLinkedService property: Data bricks linked service.
     *
     * @param dataBricksLinkedService the dataBricksLinkedService value to set.
     * @return the CreateDataFlowDebugSessionRequest object itself.
     */
    public CreateDataFlowDebugSessionRequest setDataBricksLinkedService(LinkedServiceResource dataBricksLinkedService) {
        this.dataBricksLinkedService = dataBricksLinkedService;
        return this;
    }
}
