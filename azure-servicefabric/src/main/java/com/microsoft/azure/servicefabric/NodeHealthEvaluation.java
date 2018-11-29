/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents health evaluation for a node, containing information about the
 * data and the algorithm used by health store to evaluate health. The
 * evaluation is returned only when the aggregated health state is either Error
 * or Warning.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Node")
public class NodeHealthEvaluation extends HealthEvaluation {
    /**
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "NodeName")
    private String nodeName;

    /**
     * List of unhealthy evaluations that led to the current aggregated health
     * state of the node. The types of the unhealthy evaluations can be
     * EventHealthEvaluation.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /**
     * Get the name of a Service Fabric node.
     *
     * @return the nodeName value
     */
    public String nodeName() {
        return this.nodeName;
    }

    /**
     * Set the name of a Service Fabric node.
     *
     * @param nodeName the nodeName value to set
     * @return the NodeHealthEvaluation object itself.
     */
    public NodeHealthEvaluation withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get list of unhealthy evaluations that led to the current aggregated health state of the node. The types of the unhealthy evaluations can be EventHealthEvaluation.
     *
     * @return the unhealthyEvaluations value
     */
    public List<HealthEvaluationWrapper> unhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set list of unhealthy evaluations that led to the current aggregated health state of the node. The types of the unhealthy evaluations can be EventHealthEvaluation.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set
     * @return the NodeHealthEvaluation object itself.
     */
    public NodeHealthEvaluation withUnhealthyEvaluations(List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }

}
