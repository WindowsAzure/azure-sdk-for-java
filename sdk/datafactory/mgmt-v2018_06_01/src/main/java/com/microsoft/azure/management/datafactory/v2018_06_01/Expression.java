/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure Data Factory expression definition.
 */
public class Expression {
    /**
     * Expression type.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Expression value.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Creates an instance of Expression class.
     */
    public Expression() {
        type = "Expression";
    }

    /**
     * Get expression type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set expression type.
     *
     * @param type the type value to set
     * @return the Expression object itself.
     */
    public Expression withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get expression value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set expression value.
     *
     * @param value the value value to set
     * @return the Expression object itself.
     */
    public Expression withValue(String value) {
        this.value = value;
        return this;
    }

}
