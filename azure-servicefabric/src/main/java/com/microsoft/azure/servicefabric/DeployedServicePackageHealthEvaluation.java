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
 * Represents health evaluation for a deployed service package, containing
 * information about the data and the algorithm used by health store to
 * evaluate health. The evaluation is returned only when the aggregated health
 * state is either Error or Warning.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("DeployedServicePackage")
public class DeployedServicePackageHealthEvaluation extends HealthEvaluation {
    /**
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "NodeName")
    private String nodeName;

    /**
     * The name of the application, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "ApplicationName")
    private String applicationName;

    /**
     * The name of the service manifest.
     */
    @JsonProperty(value = "ServiceManifestName")
    private String serviceManifestName;

    /**
     * List of unhealthy evaluations that led to the current aggregated health
     * state. The type of the unhealthy evaluations can be
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
     * @return the DeployedServicePackageHealthEvaluation object itself.
     */
    public DeployedServicePackageHealthEvaluation withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get the name of the application, including the 'fabric:' URI scheme.
     *
     * @return the applicationName value
     */
    public String applicationName() {
        return this.applicationName;
    }

    /**
     * Set the name of the application, including the 'fabric:' URI scheme.
     *
     * @param applicationName the applicationName value to set
     * @return the DeployedServicePackageHealthEvaluation object itself.
     */
    public DeployedServicePackageHealthEvaluation withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * Get the name of the service manifest.
     *
     * @return the serviceManifestName value
     */
    public String serviceManifestName() {
        return this.serviceManifestName;
    }

    /**
     * Set the name of the service manifest.
     *
     * @param serviceManifestName the serviceManifestName value to set
     * @return the DeployedServicePackageHealthEvaluation object itself.
     */
    public DeployedServicePackageHealthEvaluation withServiceManifestName(String serviceManifestName) {
        this.serviceManifestName = serviceManifestName;
        return this;
    }

    /**
     * Get list of unhealthy evaluations that led to the current aggregated health state. The type of the unhealthy evaluations can be EventHealthEvaluation.
     *
     * @return the unhealthyEvaluations value
     */
    public List<HealthEvaluationWrapper> unhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set list of unhealthy evaluations that led to the current aggregated health state. The type of the unhealthy evaluations can be EventHealthEvaluation.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set
     * @return the DeployedServicePackageHealthEvaluation object itself.
     */
    public DeployedServicePackageHealthEvaluation withUnhealthyEvaluations(List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }

}
