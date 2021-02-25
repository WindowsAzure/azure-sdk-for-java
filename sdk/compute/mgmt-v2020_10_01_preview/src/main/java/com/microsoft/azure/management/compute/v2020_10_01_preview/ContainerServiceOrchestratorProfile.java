/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Profile for the container service orchestrator.
 */
public class ContainerServiceOrchestratorProfile {
    /**
     * The orchestrator to use to manage container service cluster resources.
     * Valid values are Swarm, DCOS, and Custom. Possible values include:
     * 'Swarm', 'DCOS', 'Custom', 'Kubernetes'.
     */
    @JsonProperty(value = "orchestratorType", required = true)
    private ContainerServiceOrchestratorTypes orchestratorType;

    /**
     * Get the orchestrator to use to manage container service cluster resources. Valid values are Swarm, DCOS, and Custom. Possible values include: 'Swarm', 'DCOS', 'Custom', 'Kubernetes'.
     *
     * @return the orchestratorType value
     */
    public ContainerServiceOrchestratorTypes orchestratorType() {
        return this.orchestratorType;
    }

    /**
     * Set the orchestrator to use to manage container service cluster resources. Valid values are Swarm, DCOS, and Custom. Possible values include: 'Swarm', 'DCOS', 'Custom', 'Kubernetes'.
     *
     * @param orchestratorType the orchestratorType value to set
     * @return the ContainerServiceOrchestratorProfile object itself.
     */
    public ContainerServiceOrchestratorProfile withOrchestratorType(ContainerServiceOrchestratorTypes orchestratorType) {
        this.orchestratorType = orchestratorType;
        return this;
    }

}
