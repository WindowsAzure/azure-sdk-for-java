/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devspaces;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The KubernetesConnectionDetails model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("Kubernetes")
public class KubernetesConnectionDetails extends OrchestratorSpecificConnectionDetails {
    /**
     * Gets the kubeconfig for the cluster.
     */
    @JsonProperty(value = "kubeConfig")
    private String kubeConfig;

    /**
     * Get gets the kubeconfig for the cluster.
     *
     * @return the kubeConfig value
     */
    public String kubeConfig() {
        return this.kubeConfig;
    }

    /**
     * Set gets the kubeconfig for the cluster.
     *
     * @param kubeConfig the kubeConfig value to set
     * @return the KubernetesConnectionDetails object itself.
     */
    public KubernetesConnectionDetails withKubeConfig(String kubeConfig) {
        this.kubeConfig = kubeConfig;
        return this;
    }

}
