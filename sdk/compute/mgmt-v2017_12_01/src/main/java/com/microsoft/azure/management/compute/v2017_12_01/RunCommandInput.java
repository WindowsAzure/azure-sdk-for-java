/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Capture Virtual Machine parameters.
 */
public class RunCommandInput {
    /**
     * The run command id.
     */
    @JsonProperty(value = "commandId", required = true)
    private String commandId;

    /**
     * Optional. The script to be executed.  When this value is given, the
     * given script will override the default script of the command.
     */
    @JsonProperty(value = "script")
    private List<String> script;

    /**
     * The run command parameters.
     */
    @JsonProperty(value = "parameters")
    private List<RunCommandInputParameter> parameters;

    /**
     * Get the commandId value.
     *
     * @return the commandId value
     */
    public String commandId() {
        return this.commandId;
    }

    /**
     * Set the commandId value.
     *
     * @param commandId the commandId value to set
     * @return the RunCommandInput object itself.
     */
    public RunCommandInput withCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

    /**
     * Get the script value.
     *
     * @return the script value
     */
    public List<String> script() {
        return this.script;
    }

    /**
     * Set the script value.
     *
     * @param script the script value to set
     * @return the RunCommandInput object itself.
     */
    public RunCommandInput withScript(List<String> script) {
        this.script = script;
        return this;
    }

    /**
     * Get the parameters value.
     *
     * @return the parameters value
     */
    public List<RunCommandInputParameter> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters value.
     *
     * @param parameters the parameters value to set
     * @return the RunCommandInput object itself.
     */
    public RunCommandInput withParameters(List<RunCommandInputParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

}
