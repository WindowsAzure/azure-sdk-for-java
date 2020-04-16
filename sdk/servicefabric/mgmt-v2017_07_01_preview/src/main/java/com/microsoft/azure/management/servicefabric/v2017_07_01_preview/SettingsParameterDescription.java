/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a parameter in fabric settings of the cluster.
 */
public class SettingsParameterDescription {
    /**
     * The parameter name of fabric setting.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The parameter value of fabric setting.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the parameter name of fabric setting.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the parameter name of fabric setting.
     *
     * @param name the name value to set
     * @return the SettingsParameterDescription object itself.
     */
    public SettingsParameterDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the parameter value of fabric setting.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the parameter value of fabric setting.
     *
     * @param value the value value to set
     * @return the SettingsParameterDescription object itself.
     */
    public SettingsParameterDescription withValue(String value) {
        this.value = value;
        return this;
    }

}
