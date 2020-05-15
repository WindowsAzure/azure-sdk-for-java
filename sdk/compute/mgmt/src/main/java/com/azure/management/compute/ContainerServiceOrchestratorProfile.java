// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContainerServiceOrchestratorProfile model. */
@Fluent
public final class ContainerServiceOrchestratorProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerServiceOrchestratorProfile.class);

    /*
     * The orchestrator to use to manage container service cluster resources.
     * Valid values are Swarm, DCOS, and Custom.
     */
    @JsonProperty(value = "orchestratorType", required = true)
    private ContainerServiceOrchestratorTypes orchestratorType;

    /**
     * Get the orchestratorType property: The orchestrator to use to manage container service cluster resources. Valid
     * values are Swarm, DCOS, and Custom.
     *
     * @return the orchestratorType value.
     */
    public ContainerServiceOrchestratorTypes orchestratorType() {
        return this.orchestratorType;
    }

    /**
     * Set the orchestratorType property: The orchestrator to use to manage container service cluster resources. Valid
     * values are Swarm, DCOS, and Custom.
     *
     * @param orchestratorType the orchestratorType value to set.
     * @return the ContainerServiceOrchestratorProfile object itself.
     */
    public ContainerServiceOrchestratorProfile withOrchestratorType(
        ContainerServiceOrchestratorTypes orchestratorType) {
        this.orchestratorType = orchestratorType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (orchestratorType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property orchestratorType in model ContainerServiceOrchestratorProfile"));
        }
    }
}
