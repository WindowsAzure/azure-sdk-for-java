/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Custom action to be executed
 * when an auto heal rule is triggered.
 */
public class AutoHealCustomAction {
    /**
     * Executable to be run.
     */
    @JsonProperty(value = "exe")
    private String exe;

    /**
     * Parameters for the executable.
     */
    @JsonProperty(value = "parameters")
    private String parameters;

    /**
     * Get executable to be run.
     *
     * @return the exe value
     */
    public String exe() {
        return this.exe;
    }

    /**
     * Set executable to be run.
     *
     * @param exe the exe value to set
     * @return the AutoHealCustomAction object itself.
     */
    public AutoHealCustomAction withExe(String exe) {
        this.exe = exe;
        return this;
    }

    /**
     * Get parameters for the executable.
     *
     * @return the parameters value
     */
    public String parameters() {
        return this.parameters;
    }

    /**
     * Set parameters for the executable.
     *
     * @param parameters the parameters value to set
     * @return the AutoHealCustomAction object itself.
     */
    public AutoHealCustomAction withParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }

}
