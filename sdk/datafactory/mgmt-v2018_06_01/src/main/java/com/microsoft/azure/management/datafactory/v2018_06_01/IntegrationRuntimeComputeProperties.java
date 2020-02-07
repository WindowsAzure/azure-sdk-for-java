/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The compute resource properties for managed integration runtime.
 */
public class IntegrationRuntimeComputeProperties {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * The location for managed integration runtime. The supported regions
     * could be found on
     * https://docs.microsoft.com/en-us/azure/data-factory/data-factory-data-movement-activities.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * The node size requirement to managed integration runtime.
     */
    @JsonProperty(value = "nodeSize")
    private String nodeSize;

    /**
     * The required number of nodes for managed integration runtime.
     */
    @JsonProperty(value = "numberOfNodes")
    private Integer numberOfNodes;

    /**
     * Maximum parallel executions count per node for managed integration
     * runtime.
     */
    @JsonProperty(value = "maxParallelExecutionsPerNode")
    private Integer maxParallelExecutionsPerNode;

    /**
     * Data flow properties for managed integration runtime.
     */
    @JsonProperty(value = "dataFlowProperties")
    private IntegrationRuntimeDataFlowProperties dataFlowProperties;

    /**
     * VNet properties for managed integration runtime.
     */
    @JsonProperty(value = "vNetProperties")
    private IntegrationRuntimeVNetProperties vNetProperties;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the IntegrationRuntimeComputeProperties object itself.
     */
    public IntegrationRuntimeComputeProperties withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the location for managed integration runtime. The supported regions could be found on https://docs.microsoft.com/en-us/azure/data-factory/data-factory-data-movement-activities.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location for managed integration runtime. The supported regions could be found on https://docs.microsoft.com/en-us/azure/data-factory/data-factory-data-movement-activities.
     *
     * @param location the location value to set
     * @return the IntegrationRuntimeComputeProperties object itself.
     */
    public IntegrationRuntimeComputeProperties withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the node size requirement to managed integration runtime.
     *
     * @return the nodeSize value
     */
    public String nodeSize() {
        return this.nodeSize;
    }

    /**
     * Set the node size requirement to managed integration runtime.
     *
     * @param nodeSize the nodeSize value to set
     * @return the IntegrationRuntimeComputeProperties object itself.
     */
    public IntegrationRuntimeComputeProperties withNodeSize(String nodeSize) {
        this.nodeSize = nodeSize;
        return this;
    }

    /**
     * Get the required number of nodes for managed integration runtime.
     *
     * @return the numberOfNodes value
     */
    public Integer numberOfNodes() {
        return this.numberOfNodes;
    }

    /**
     * Set the required number of nodes for managed integration runtime.
     *
     * @param numberOfNodes the numberOfNodes value to set
     * @return the IntegrationRuntimeComputeProperties object itself.
     */
    public IntegrationRuntimeComputeProperties withNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        return this;
    }

    /**
     * Get maximum parallel executions count per node for managed integration runtime.
     *
     * @return the maxParallelExecutionsPerNode value
     */
    public Integer maxParallelExecutionsPerNode() {
        return this.maxParallelExecutionsPerNode;
    }

    /**
     * Set maximum parallel executions count per node for managed integration runtime.
     *
     * @param maxParallelExecutionsPerNode the maxParallelExecutionsPerNode value to set
     * @return the IntegrationRuntimeComputeProperties object itself.
     */
    public IntegrationRuntimeComputeProperties withMaxParallelExecutionsPerNode(Integer maxParallelExecutionsPerNode) {
        this.maxParallelExecutionsPerNode = maxParallelExecutionsPerNode;
        return this;
    }

    /**
     * Get data flow properties for managed integration runtime.
     *
     * @return the dataFlowProperties value
     */
    public IntegrationRuntimeDataFlowProperties dataFlowProperties() {
        return this.dataFlowProperties;
    }

    /**
     * Set data flow properties for managed integration runtime.
     *
     * @param dataFlowProperties the dataFlowProperties value to set
     * @return the IntegrationRuntimeComputeProperties object itself.
     */
    public IntegrationRuntimeComputeProperties withDataFlowProperties(IntegrationRuntimeDataFlowProperties dataFlowProperties) {
        this.dataFlowProperties = dataFlowProperties;
        return this;
    }

    /**
     * Get vNet properties for managed integration runtime.
     *
     * @return the vNetProperties value
     */
    public IntegrationRuntimeVNetProperties vNetProperties() {
        return this.vNetProperties;
    }

    /**
     * Set vNet properties for managed integration runtime.
     *
     * @param vNetProperties the vNetProperties value to set
     * @return the IntegrationRuntimeComputeProperties object itself.
     */
    public IntegrationRuntimeComputeProperties withVNetProperties(IntegrationRuntimeVNetProperties vNetProperties) {
        this.vNetProperties = vNetProperties;
        return this;
    }

}
