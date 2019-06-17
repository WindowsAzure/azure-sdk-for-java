/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Define match conditions.
 */
public class MatchCondition {
    /**
     * Match variable to compare against. Possible values include:
     * 'RemoteAddr', 'Country', 'RequestMethod', 'RequestHeader', 'RequestUri',
     * 'QueryString', 'RequestBody', 'Cookies', 'PostArgs'.
     */
    @JsonProperty(value = "matchVariable", required = true)
    private MatchVariable matchVariable;

    /**
     * Selector can used to match a specific key for QueryString, RequestUri,
     * RequestHeaders or RequestBody.
     */
    @JsonProperty(value = "selector")
    private String selector;

    /**
     * Describes operator to be matched. Possible values include: 'Any',
     * 'IPMatch', 'GeoMatch', 'Equal', 'Contains', 'LessThan', 'GreaterThan',
     * 'LessThanOrEqual', 'GreaterThanOrEqual', 'BeginsWith', 'EndsWith',
     * 'RegEx'.
     */
    @JsonProperty(value = "operator", required = true)
    private Operator operator;

    /**
     * Describes if the result of this condition should be negated.
     */
    @JsonProperty(value = "negateCondition")
    private Boolean negateCondition;

    /**
     * List of possible match values.
     */
    @JsonProperty(value = "matchValue", required = true)
    private List<String> matchValue;

    /**
     * Get match variable to compare against. Possible values include: 'RemoteAddr', 'Country', 'RequestMethod', 'RequestHeader', 'RequestUri', 'QueryString', 'RequestBody', 'Cookies', 'PostArgs'.
     *
     * @return the matchVariable value
     */
    public MatchVariable matchVariable() {
        return this.matchVariable;
    }

    /**
     * Set match variable to compare against. Possible values include: 'RemoteAddr', 'Country', 'RequestMethod', 'RequestHeader', 'RequestUri', 'QueryString', 'RequestBody', 'Cookies', 'PostArgs'.
     *
     * @param matchVariable the matchVariable value to set
     * @return the MatchCondition object itself.
     */
    public MatchCondition withMatchVariable(MatchVariable matchVariable) {
        this.matchVariable = matchVariable;
        return this;
    }

    /**
     * Get selector can used to match a specific key for QueryString, RequestUri, RequestHeaders or RequestBody.
     *
     * @return the selector value
     */
    public String selector() {
        return this.selector;
    }

    /**
     * Set selector can used to match a specific key for QueryString, RequestUri, RequestHeaders or RequestBody.
     *
     * @param selector the selector value to set
     * @return the MatchCondition object itself.
     */
    public MatchCondition withSelector(String selector) {
        this.selector = selector;
        return this;
    }

    /**
     * Get describes operator to be matched. Possible values include: 'Any', 'IPMatch', 'GeoMatch', 'Equal', 'Contains', 'LessThan', 'GreaterThan', 'LessThanOrEqual', 'GreaterThanOrEqual', 'BeginsWith', 'EndsWith', 'RegEx'.
     *
     * @return the operator value
     */
    public Operator operator() {
        return this.operator;
    }

    /**
     * Set describes operator to be matched. Possible values include: 'Any', 'IPMatch', 'GeoMatch', 'Equal', 'Contains', 'LessThan', 'GreaterThan', 'LessThanOrEqual', 'GreaterThanOrEqual', 'BeginsWith', 'EndsWith', 'RegEx'.
     *
     * @param operator the operator value to set
     * @return the MatchCondition object itself.
     */
    public MatchCondition withOperator(Operator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get describes if the result of this condition should be negated.
     *
     * @return the negateCondition value
     */
    public Boolean negateCondition() {
        return this.negateCondition;
    }

    /**
     * Set describes if the result of this condition should be negated.
     *
     * @param negateCondition the negateCondition value to set
     * @return the MatchCondition object itself.
     */
    public MatchCondition withNegateCondition(Boolean negateCondition) {
        this.negateCondition = negateCondition;
        return this;
    }

    /**
     * Get list of possible match values.
     *
     * @return the matchValue value
     */
    public List<String> matchValue() {
        return this.matchValue;
    }

    /**
     * Set list of possible match values.
     *
     * @param matchValue the matchValue value to set
     * @return the MatchCondition object itself.
     */
    public MatchCondition withMatchValue(List<String> matchValue) {
        this.matchValue = matchValue;
        return this;
    }

}
