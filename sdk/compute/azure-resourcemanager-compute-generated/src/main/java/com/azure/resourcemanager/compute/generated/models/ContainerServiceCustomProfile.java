// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties to configure a custom container service cluster. */
@Fluent
public final class ContainerServiceCustomProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerServiceCustomProfile.class);

    /*
     * The name of the custom orchestrator to use.
     */
    @JsonProperty(value = "orchestrator", required = true)
    private String orchestrator;

    /**
     * Get the orchestrator property: The name of the custom orchestrator to use.
     *
     * @return the orchestrator value.
     */
    public String orchestrator() {
        return this.orchestrator;
    }

    /**
     * Set the orchestrator property: The name of the custom orchestrator to use.
     *
     * @param orchestrator the orchestrator value to set.
     * @return the ContainerServiceCustomProfile object itself.
     */
    public ContainerServiceCustomProfile withOrchestrator(String orchestrator) {
        this.orchestrator = orchestrator;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (orchestrator() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property orchestrator in model ContainerServiceCustomProfile"));
        }
    }
}
