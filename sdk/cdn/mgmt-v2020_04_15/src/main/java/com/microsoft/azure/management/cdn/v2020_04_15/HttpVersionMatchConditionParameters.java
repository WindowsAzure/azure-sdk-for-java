/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the parameters for HttpVersion match conditions.
 */
public class HttpVersionMatchConditionParameters {
    /**
     * The odatatype property.
     */
    @JsonProperty(value = "@odata\\.type", required = true)
    private String odatatype;

    /**
     * Describes operator to be matched.
     */
    @JsonProperty(value = "operator", required = true)
    private String operator;

    /**
     * Describes if this is negate condition or not.
     */
    @JsonProperty(value = "negateCondition")
    private Boolean negateCondition;

    /**
     * The match value for the condition of the delivery rule.
     */
    @JsonProperty(value = "matchValues")
    private List<String> matchValues;

    /**
     * Creates an instance of HttpVersionMatchConditionParameters class.
     */
    public HttpVersionMatchConditionParameters() {
        odatatype = "#Microsoft.Azure.Cdn.Models.DeliveryRuleHttpVersionConditionParameters";
        operator = "Equal";
    }

    /**
     * Get the odatatype value.
     *
     * @return the odatatype value
     */
    public String odatatype() {
        return this.odatatype;
    }

    /**
     * Set the odatatype value.
     *
     * @param odatatype the odatatype value to set
     * @return the HttpVersionMatchConditionParameters object itself.
     */
    public HttpVersionMatchConditionParameters withOdatatype(String odatatype) {
        this.odatatype = odatatype;
        return this;
    }

    /**
     * Get describes operator to be matched.
     *
     * @return the operator value
     */
    public String operator() {
        return this.operator;
    }

    /**
     * Set describes operator to be matched.
     *
     * @param operator the operator value to set
     * @return the HttpVersionMatchConditionParameters object itself.
     */
    public HttpVersionMatchConditionParameters withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get describes if this is negate condition or not.
     *
     * @return the negateCondition value
     */
    public Boolean negateCondition() {
        return this.negateCondition;
    }

    /**
     * Set describes if this is negate condition or not.
     *
     * @param negateCondition the negateCondition value to set
     * @return the HttpVersionMatchConditionParameters object itself.
     */
    public HttpVersionMatchConditionParameters withNegateCondition(Boolean negateCondition) {
        this.negateCondition = negateCondition;
        return this;
    }

    /**
     * Get the match value for the condition of the delivery rule.
     *
     * @return the matchValues value
     */
    public List<String> matchValues() {
        return this.matchValues;
    }

    /**
     * Set the match value for the condition of the delivery rule.
     *
     * @param matchValues the matchValues value to set
     * @return the HttpVersionMatchConditionParameters object itself.
     */
    public HttpVersionMatchConditionParameters withMatchValues(List<String> matchValues) {
        this.matchValues = matchValues;
        return this;
    }

}
