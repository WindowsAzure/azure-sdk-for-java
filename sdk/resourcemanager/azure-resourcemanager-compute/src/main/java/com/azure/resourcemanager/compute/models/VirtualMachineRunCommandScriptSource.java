// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the script sources for run command. */
@Fluent
public final class VirtualMachineRunCommandScriptSource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineRunCommandScriptSource.class);

    /*
     * Specifies the script content to be executed on the VM.
     */
    @JsonProperty(value = "script")
    private String script;

    /*
     * Specifies the script download location.
     */
    @JsonProperty(value = "scriptUri")
    private String scriptUri;

    /*
     * Specifies a commandId of predefined built-in script.
     */
    @JsonProperty(value = "commandId")
    private String commandId;

    /**
     * Get the script property: Specifies the script content to be executed on the VM.
     *
     * @return the script value.
     */
    public String script() {
        return this.script;
    }

    /**
     * Set the script property: Specifies the script content to be executed on the VM.
     *
     * @param script the script value to set.
     * @return the VirtualMachineRunCommandScriptSource object itself.
     */
    public VirtualMachineRunCommandScriptSource withScript(String script) {
        this.script = script;
        return this;
    }

    /**
     * Get the scriptUri property: Specifies the script download location.
     *
     * @return the scriptUri value.
     */
    public String scriptUri() {
        return this.scriptUri;
    }

    /**
     * Set the scriptUri property: Specifies the script download location.
     *
     * @param scriptUri the scriptUri value to set.
     * @return the VirtualMachineRunCommandScriptSource object itself.
     */
    public VirtualMachineRunCommandScriptSource withScriptUri(String scriptUri) {
        this.scriptUri = scriptUri;
        return this;
    }

    /**
     * Get the commandId property: Specifies a commandId of predefined built-in script.
     *
     * @return the commandId value.
     */
    public String commandId() {
        return this.commandId;
    }

    /**
     * Set the commandId property: Specifies a commandId of predefined built-in script.
     *
     * @param commandId the commandId value to set.
     * @return the VirtualMachineRunCommandScriptSource object itself.
     */
    public VirtualMachineRunCommandScriptSource withCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
