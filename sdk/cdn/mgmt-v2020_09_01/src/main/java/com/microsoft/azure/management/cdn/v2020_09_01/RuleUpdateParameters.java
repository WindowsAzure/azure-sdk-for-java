/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The domain JSON object required for domain creation or update.
 */
@JsonFlatten
public class RuleUpdateParameters {
    /**
     * The order in which the rules are applied for the endpoint. Possible
     * values {0,1,2,3,………}. A rule with a lesser order will be applied before
     * a rule with a greater order. Rule with order 0 is a special rule. It
     * does not require any condition and actions listed in it will always be
     * applied.
     */
    @JsonProperty(value = "properties.order")
    private Integer order;

    /**
     * A list of conditions that must be matched for the actions to be
     * executed.
     */
    @JsonProperty(value = "properties.conditions")
    private List<DeliveryRuleCondition> conditions;

    /**
     * A list of actions that are executed when all the conditions of a rule
     * are satisfied.
     */
    @JsonProperty(value = "properties.actions")
    private List<DeliveryRuleAction> actions;

    /**
     * If this rule is a match should the rules engine continue running the
     * remaining rules or stop. If not present, defaults to Continue. Possible
     * values include: 'Continue', 'Stop'.
     */
    @JsonProperty(value = "properties.matchProcessingBehavior")
    private MatchProcessingBehavior matchProcessingBehavior;

    /**
     * Get the order in which the rules are applied for the endpoint. Possible values {0,1,2,3,………}. A rule with a lesser order will be applied before a rule with a greater order. Rule with order 0 is a special rule. It does not require any condition and actions listed in it will always be applied.
     *
     * @return the order value
     */
    public Integer order() {
        return this.order;
    }

    /**
     * Set the order in which the rules are applied for the endpoint. Possible values {0,1,2,3,………}. A rule with a lesser order will be applied before a rule with a greater order. Rule with order 0 is a special rule. It does not require any condition and actions listed in it will always be applied.
     *
     * @param order the order value to set
     * @return the RuleUpdateParameters object itself.
     */
    public RuleUpdateParameters withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * Get a list of conditions that must be matched for the actions to be executed.
     *
     * @return the conditions value
     */
    public List<DeliveryRuleCondition> conditions() {
        return this.conditions;
    }

    /**
     * Set a list of conditions that must be matched for the actions to be executed.
     *
     * @param conditions the conditions value to set
     * @return the RuleUpdateParameters object itself.
     */
    public RuleUpdateParameters withConditions(List<DeliveryRuleCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Get a list of actions that are executed when all the conditions of a rule are satisfied.
     *
     * @return the actions value
     */
    public List<DeliveryRuleAction> actions() {
        return this.actions;
    }

    /**
     * Set a list of actions that are executed when all the conditions of a rule are satisfied.
     *
     * @param actions the actions value to set
     * @return the RuleUpdateParameters object itself.
     */
    public RuleUpdateParameters withActions(List<DeliveryRuleAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get if this rule is a match should the rules engine continue running the remaining rules or stop. If not present, defaults to Continue. Possible values include: 'Continue', 'Stop'.
     *
     * @return the matchProcessingBehavior value
     */
    public MatchProcessingBehavior matchProcessingBehavior() {
        return this.matchProcessingBehavior;
    }

    /**
     * Set if this rule is a match should the rules engine continue running the remaining rules or stop. If not present, defaults to Continue. Possible values include: 'Continue', 'Stop'.
     *
     * @param matchProcessingBehavior the matchProcessingBehavior value to set
     * @return the RuleUpdateParameters object itself.
     */
    public RuleUpdateParameters withMatchProcessingBehavior(MatchProcessingBehavior matchProcessingBehavior) {
        this.matchProcessingBehavior = matchProcessingBehavior;
        return this;
    }

}
