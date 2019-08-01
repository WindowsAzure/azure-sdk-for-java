/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.costmanagement.v2018_05_31;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The comparison expression to be used in the report.
 */
public class ReportConfigComparisonExpression {
    /**
     * The name of the column to use in comparison.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The operator to use for comparison.
     */
    @JsonProperty(value = "operator", required = true)
    private String operator;

    /**
     * Array of values to use for comparison.
     */
    @JsonProperty(value = "values", required = true)
    private List<String> values;

    /**
     * Creates an instance of ReportConfigComparisonExpression class.
     * @param name the name of the column to use in comparison.
     * @param values array of values to use for comparison.
     */
    public ReportConfigComparisonExpression() {
        operator = "In";
    }

    /**
     * Get the name of the column to use in comparison.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the column to use in comparison.
     *
     * @param name the name value to set
     * @return the ReportConfigComparisonExpression object itself.
     */
    public ReportConfigComparisonExpression withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the operator to use for comparison.
     *
     * @return the operator value
     */
    public String operator() {
        return this.operator;
    }

    /**
     * Set the operator to use for comparison.
     *
     * @param operator the operator value to set
     * @return the ReportConfigComparisonExpression object itself.
     */
    public ReportConfigComparisonExpression withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get array of values to use for comparison.
     *
     * @return the values value
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Set array of values to use for comparison.
     *
     * @param values the values value to set
     * @return the ReportConfigComparisonExpression object itself.
     */
    public ReportConfigComparisonExpression withValues(List<String> values) {
        this.values = values;
        return this;
    }

}
