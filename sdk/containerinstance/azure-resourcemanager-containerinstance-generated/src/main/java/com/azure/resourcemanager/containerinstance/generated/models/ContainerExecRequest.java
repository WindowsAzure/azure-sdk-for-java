// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The container exec request. */
@Fluent
public final class ContainerExecRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerExecRequest.class);

    /*
     * The command to be executed.
     */
    @JsonProperty(value = "command")
    private String command;

    /*
     * The size of the terminal.
     */
    @JsonProperty(value = "terminalSize")
    private ContainerExecRequestTerminalSize terminalSize;

    /**
     * Get the command property: The command to be executed.
     *
     * @return the command value.
     */
    public String command() {
        return this.command;
    }

    /**
     * Set the command property: The command to be executed.
     *
     * @param command the command value to set.
     * @return the ContainerExecRequest object itself.
     */
    public ContainerExecRequest withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * Get the terminalSize property: The size of the terminal.
     *
     * @return the terminalSize value.
     */
    public ContainerExecRequestTerminalSize terminalSize() {
        return this.terminalSize;
    }

    /**
     * Set the terminalSize property: The size of the terminal.
     *
     * @param terminalSize the terminalSize value to set.
     * @return the ContainerExecRequest object itself.
     */
    public ContainerExecRequest withTerminalSize(ContainerExecRequestTerminalSize terminalSize) {
        this.terminalSize = terminalSize;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (terminalSize() != null) {
            terminalSize().validate();
        }
    }
}
