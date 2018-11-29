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

/**
 * Health policies to evaluate cluster health.
 */
public class ClusterHealthPolicies {
    /**
     * Defines a map that contains specific application health policies for
     * different applications.
     * Each entry specifies as key the application name and as value an
     * ApplicationHealthPolicy used to evaluate the application health.
     * If an application is not specified in the map, the application health
     * evaluation uses the ApplicationHealthPolicy found in its application
     * manifest or the default application health policy (if no health policy
     * is defined in the manifest).
     * The map is empty by default.
     */
    @JsonProperty(value = "ApplicationHealthPolicyMap")
    private List<ApplicationHealthPolicyMapItem> applicationHealthPolicyMap;

    /**
     * Defines a health policy used to evaluate the health of the cluster or of
     * a cluster node.
     */
    @JsonProperty(value = "ClusterHealthPolicy")
    private ClusterHealthPolicy clusterHealthPolicy;

    /**
     * Get defines a map that contains specific application health policies for different applications.
     Each entry specifies as key the application name and as value an ApplicationHealthPolicy used to evaluate the application health.
     If an application is not specified in the map, the application health evaluation uses the ApplicationHealthPolicy found in its application manifest or the default application health policy (if no health policy is defined in the manifest).
     The map is empty by default.
     *
     * @return the applicationHealthPolicyMap value
     */
    public List<ApplicationHealthPolicyMapItem> applicationHealthPolicyMap() {
        return this.applicationHealthPolicyMap;
    }

    /**
     * Set defines a map that contains specific application health policies for different applications.
     Each entry specifies as key the application name and as value an ApplicationHealthPolicy used to evaluate the application health.
     If an application is not specified in the map, the application health evaluation uses the ApplicationHealthPolicy found in its application manifest or the default application health policy (if no health policy is defined in the manifest).
     The map is empty by default.
     *
     * @param applicationHealthPolicyMap the applicationHealthPolicyMap value to set
     * @return the ClusterHealthPolicies object itself.
     */
    public ClusterHealthPolicies withApplicationHealthPolicyMap(List<ApplicationHealthPolicyMapItem> applicationHealthPolicyMap) {
        this.applicationHealthPolicyMap = applicationHealthPolicyMap;
        return this;
    }

    /**
     * Get defines a health policy used to evaluate the health of the cluster or of a cluster node.
     *
     * @return the clusterHealthPolicy value
     */
    public ClusterHealthPolicy clusterHealthPolicy() {
        return this.clusterHealthPolicy;
    }

    /**
     * Set defines a health policy used to evaluate the health of the cluster or of a cluster node.
     *
     * @param clusterHealthPolicy the clusterHealthPolicy value to set
     * @return the ClusterHealthPolicies object itself.
     */
    public ClusterHealthPolicies withClusterHealthPolicy(ClusterHealthPolicy clusterHealthPolicy) {
        this.clusterHealthPolicy = clusterHealthPolicy;
        return this;
    }

}
