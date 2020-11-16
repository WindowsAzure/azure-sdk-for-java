/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the criteria for converting log to metric.
 */
public class Dimension {
    /**
     * Name of the dimension.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Operator for dimension values.
     */
    @JsonProperty(value = "operator", required = true)
    private String operator;

    /**
     * List of dimension values.
     */
    @JsonProperty(value = "values", required = true)
    private List<String> values;

    /**
     * Creates an instance of Dimension class.
     * @param name name of the dimension.
     * @param values list of dimension values.
     */
    public Dimension() {
        operator = "Include";
    }

    /**
     * Get name of the dimension.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the dimension.
     *
     * @param name the name value to set
     * @return the Dimension object itself.
     */
    public Dimension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get operator for dimension values.
     *
     * @return the operator value
     */
    public String operator() {
        return this.operator;
    }

    /**
     * Set operator for dimension values.
     *
     * @param operator the operator value to set
     * @return the Dimension object itself.
     */
    public Dimension withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get list of dimension values.
     *
     * @return the values value
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Set list of dimension values.
     *
     * @param values the values value to set
     * @return the Dimension object itself.
     */
    public Dimension withValues(List<String> values) {
        this.values = values;
        return this;
    }

}
