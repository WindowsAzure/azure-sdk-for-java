/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2018_10_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The container execution command, for liveness or readiness probe.
 */
public class ContainerExec {
    /**
     * The commands to execute within the container.
     */
    @JsonProperty(value = "command")
    private List<String> command;

    /**
     * Get the commands to execute within the container.
     *
     * @return the command value
     */
    public List<String> command() {
        return this.command;
    }

    /**
     * Set the commands to execute within the container.
     *
     * @param command the command value to set
     * @return the ContainerExec object itself.
     */
    public ContainerExec withCommand(List<String> command) {
        this.command = command;
        return this;
    }

}
