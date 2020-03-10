/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties to configure a custom container service cluster.
 */
public class ContainerServiceCustomProfile {
    /**
     * The name of the custom orchestrator to use.
     */
    @JsonProperty(value = "orchestrator", required = true)
    private String orchestrator;

    /**
     * Get the name of the custom orchestrator to use.
     *
     * @return the orchestrator value
     */
    public String orchestrator() {
        return this.orchestrator;
    }

    /**
     * Set the name of the custom orchestrator to use.
     *
     * @param orchestrator the orchestrator value to set
     * @return the ContainerServiceCustomProfile object itself.
     */
    public ContainerServiceCustomProfile withOrchestrator(String orchestrator) {
        this.orchestrator = orchestrator;
        return this;
    }

}
