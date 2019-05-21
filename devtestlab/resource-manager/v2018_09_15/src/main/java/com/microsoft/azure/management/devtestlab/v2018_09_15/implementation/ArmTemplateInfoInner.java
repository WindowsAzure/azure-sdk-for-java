/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about a generated ARM template.
 */
public class ArmTemplateInfoInner {
    /**
     * The template's contents.
     */
    @JsonProperty(value = "template")
    private Object template;

    /**
     * The parameters of the ARM template.
     */
    @JsonProperty(value = "parameters")
    private Object parameters;

    /**
     * Get the template's contents.
     *
     * @return the template value
     */
    public Object template() {
        return this.template;
    }

    /**
     * Set the template's contents.
     *
     * @param template the template value to set
     * @return the ArmTemplateInfoInner object itself.
     */
    public ArmTemplateInfoInner withTemplate(Object template) {
        this.template = template;
        return this;
    }

    /**
     * Get the parameters of the ARM template.
     *
     * @return the parameters value
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters of the ARM template.
     *
     * @param parameters the parameters value to set
     * @return the ArmTemplateInfoInner object itself.
     */
    public ArmTemplateInfoInner withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

}
