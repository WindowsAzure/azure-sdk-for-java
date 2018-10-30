/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of an Azure Resource Manager template parameter.
 */
public class ArmTemplateParameterProperties {
    /**
     * The name of the template parameter.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The value of the template parameter.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the name of the template parameter.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the template parameter.
     *
     * @param name the name value to set
     * @return the ArmTemplateParameterProperties object itself.
     */
    public ArmTemplateParameterProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value of the template parameter.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value of the template parameter.
     *
     * @param value the value value to set
     * @return the ArmTemplateParameterProperties object itself.
     */
    public ArmTemplateParameterProperties withValue(String value) {
        this.value = value;
        return this;
    }

}
