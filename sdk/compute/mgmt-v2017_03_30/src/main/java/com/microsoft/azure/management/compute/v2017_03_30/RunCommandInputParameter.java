/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the properties of a run command parameter.
 */
public class RunCommandInputParameter {
    /**
     * The run command parameter name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The run command parameter value.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the RunCommandInputParameter object itself.
     */
    public RunCommandInputParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the RunCommandInputParameter object itself.
     */
    public RunCommandInputParameter withValue(String value) {
        this.value = value;
        return this;
    }

}
