/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameter to pass to ARM template.
 */
public class ArmTemplateParameter {
    /**
     * name of the parameter.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * value for the parameter. In Jtoken.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get name of the parameter.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the parameter.
     *
     * @param name the name value to set
     * @return the ArmTemplateParameter object itself.
     */
    public ArmTemplateParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get value for the parameter. In Jtoken.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set value for the parameter. In Jtoken.
     *
     * @param value the value value to set
     * @return the ArmTemplateParameter object itself.
     */
    public ArmTemplateParameter withValue(String value) {
        this.value = value;
        return this;
    }

}
