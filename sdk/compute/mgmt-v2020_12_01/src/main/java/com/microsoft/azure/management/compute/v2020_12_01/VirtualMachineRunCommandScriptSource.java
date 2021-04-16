/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the script sources for run command.
 */
public class VirtualMachineRunCommandScriptSource {
    /**
     * Specifies the script content to be executed on the VM.
     */
    @JsonProperty(value = "script")
    private String script;

    /**
     * Specifies the script download location.
     */
    @JsonProperty(value = "scriptUri")
    private String scriptUri;

    /**
     * Specifies a commandId of predefined built-in script.
     */
    @JsonProperty(value = "commandId")
    private String commandId;

    /**
     * Get specifies the script content to be executed on the VM.
     *
     * @return the script value
     */
    public String script() {
        return this.script;
    }

    /**
     * Set specifies the script content to be executed on the VM.
     *
     * @param script the script value to set
     * @return the VirtualMachineRunCommandScriptSource object itself.
     */
    public VirtualMachineRunCommandScriptSource withScript(String script) {
        this.script = script;
        return this;
    }

    /**
     * Get specifies the script download location.
     *
     * @return the scriptUri value
     */
    public String scriptUri() {
        return this.scriptUri;
    }

    /**
     * Set specifies the script download location.
     *
     * @param scriptUri the scriptUri value to set
     * @return the VirtualMachineRunCommandScriptSource object itself.
     */
    public VirtualMachineRunCommandScriptSource withScriptUri(String scriptUri) {
        this.scriptUri = scriptUri;
        return this;
    }

    /**
     * Get specifies a commandId of predefined built-in script.
     *
     * @return the commandId value
     */
    public String commandId() {
        return this.commandId;
    }

    /**
     * Set specifies a commandId of predefined built-in script.
     *
     * @param commandId the commandId value to set
     * @return the VirtualMachineRunCommandScriptSource object itself.
     */
    public VirtualMachineRunCommandScriptSource withCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

}
