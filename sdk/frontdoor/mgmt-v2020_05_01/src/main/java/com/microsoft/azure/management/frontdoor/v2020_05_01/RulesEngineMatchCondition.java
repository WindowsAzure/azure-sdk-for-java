/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Define a match condition.
 */
public class RulesEngineMatchCondition {
    /**
     * Match Variable. Possible values include: 'IsMobile', 'RemoteAddr',
     * 'RequestMethod', 'QueryString', 'PostArgs', 'RequestUri', 'RequestPath',
     * 'RequestFilename', 'RequestFilenameExtension', 'RequestHeader',
     * 'RequestBody', 'RequestScheme'.
     */
    @JsonProperty(value = "rulesEngineMatchVariable", required = true)
    private RulesEngineMatchVariable rulesEngineMatchVariable;

    /**
     * Name of selector in RequestHeader or RequestBody to be matched.
     */
    @JsonProperty(value = "selector")
    private String selector;

    /**
     * Describes operator to apply to the match condition. Possible values
     * include: 'Any', 'IPMatch', 'GeoMatch', 'Equal', 'Contains', 'LessThan',
     * 'GreaterThan', 'LessThanOrEqual', 'GreaterThanOrEqual', 'BeginsWith',
     * 'EndsWith'.
     */
    @JsonProperty(value = "rulesEngineOperator", required = true)
    private RulesEngineOperator rulesEngineOperator;

    /**
     * Describes if this is negate condition or not.
     */
    @JsonProperty(value = "negateCondition")
    private Boolean negateCondition;

    /**
     * Match values to match against. The operator will apply to each value in
     * here with OR semantics. If any of them match the variable with the given
     * operator this match condition is considered a match.
     */
    @JsonProperty(value = "rulesEngineMatchValue", required = true)
    private List<String> rulesEngineMatchValue;

    /**
     * List of transforms.
     */
    @JsonProperty(value = "transforms")
    private List<Transform> transforms;

    /**
     * Get match Variable. Possible values include: 'IsMobile', 'RemoteAddr', 'RequestMethod', 'QueryString', 'PostArgs', 'RequestUri', 'RequestPath', 'RequestFilename', 'RequestFilenameExtension', 'RequestHeader', 'RequestBody', 'RequestScheme'.
     *
     * @return the rulesEngineMatchVariable value
     */
    public RulesEngineMatchVariable rulesEngineMatchVariable() {
        return this.rulesEngineMatchVariable;
    }

    /**
     * Set match Variable. Possible values include: 'IsMobile', 'RemoteAddr', 'RequestMethod', 'QueryString', 'PostArgs', 'RequestUri', 'RequestPath', 'RequestFilename', 'RequestFilenameExtension', 'RequestHeader', 'RequestBody', 'RequestScheme'.
     *
     * @param rulesEngineMatchVariable the rulesEngineMatchVariable value to set
     * @return the RulesEngineMatchCondition object itself.
     */
    public RulesEngineMatchCondition withRulesEngineMatchVariable(RulesEngineMatchVariable rulesEngineMatchVariable) {
        this.rulesEngineMatchVariable = rulesEngineMatchVariable;
        return this;
    }

    /**
     * Get name of selector in RequestHeader or RequestBody to be matched.
     *
     * @return the selector value
     */
    public String selector() {
        return this.selector;
    }

    /**
     * Set name of selector in RequestHeader or RequestBody to be matched.
     *
     * @param selector the selector value to set
     * @return the RulesEngineMatchCondition object itself.
     */
    public RulesEngineMatchCondition withSelector(String selector) {
        this.selector = selector;
        return this;
    }

    /**
     * Get describes operator to apply to the match condition. Possible values include: 'Any', 'IPMatch', 'GeoMatch', 'Equal', 'Contains', 'LessThan', 'GreaterThan', 'LessThanOrEqual', 'GreaterThanOrEqual', 'BeginsWith', 'EndsWith'.
     *
     * @return the rulesEngineOperator value
     */
    public RulesEngineOperator rulesEngineOperator() {
        return this.rulesEngineOperator;
    }

    /**
     * Set describes operator to apply to the match condition. Possible values include: 'Any', 'IPMatch', 'GeoMatch', 'Equal', 'Contains', 'LessThan', 'GreaterThan', 'LessThanOrEqual', 'GreaterThanOrEqual', 'BeginsWith', 'EndsWith'.
     *
     * @param rulesEngineOperator the rulesEngineOperator value to set
     * @return the RulesEngineMatchCondition object itself.
     */
    public RulesEngineMatchCondition withRulesEngineOperator(RulesEngineOperator rulesEngineOperator) {
        this.rulesEngineOperator = rulesEngineOperator;
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
     * @return the RulesEngineMatchCondition object itself.
     */
    public RulesEngineMatchCondition withNegateCondition(Boolean negateCondition) {
        this.negateCondition = negateCondition;
        return this;
    }

    /**
     * Get match values to match against. The operator will apply to each value in here with OR semantics. If any of them match the variable with the given operator this match condition is considered a match.
     *
     * @return the rulesEngineMatchValue value
     */
    public List<String> rulesEngineMatchValue() {
        return this.rulesEngineMatchValue;
    }

    /**
     * Set match values to match against. The operator will apply to each value in here with OR semantics. If any of them match the variable with the given operator this match condition is considered a match.
     *
     * @param rulesEngineMatchValue the rulesEngineMatchValue value to set
     * @return the RulesEngineMatchCondition object itself.
     */
    public RulesEngineMatchCondition withRulesEngineMatchValue(List<String> rulesEngineMatchValue) {
        this.rulesEngineMatchValue = rulesEngineMatchValue;
        return this;
    }

    /**
     * Get list of transforms.
     *
     * @return the transforms value
     */
    public List<Transform> transforms() {
        return this.transforms;
    }

    /**
     * Set list of transforms.
     *
     * @param transforms the transforms value to set
     * @return the RulesEngineMatchCondition object itself.
     */
    public RulesEngineMatchCondition withTransforms(List<Transform> transforms) {
        this.transforms = transforms;
        return this;
    }

}
