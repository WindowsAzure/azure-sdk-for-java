// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A rule that specifies a set of actions and conditions. */
@Fluent
public final class DeliveryRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeliveryRule.class);

    /*
     * The order in which the rules are applied for the endpoint. Possible
     * values {0,1,2,3,………}. A rule with a lesser order will be applied before
     * a rule with a greater order. Rule with order 0 is a special rule. It
     * does not require any condition and actions listed in it will always be
     * applied.
     */
    @JsonProperty(value = "order", required = true)
    private int order;

    /*
     * A list of actions that are executed when all the conditions of a rule
     * are satisfied.
     */
    @JsonProperty(value = "actions", required = true)
    private List<DeliveryRuleAction> actions;

    /*
     * A list of conditions that must be matched for the actions to be executed
     */
    @JsonProperty(value = "conditions")
    private List<DeliveryRuleCondition> conditions;

    /**
     * Get the order property: The order in which the rules are applied for the endpoint. Possible values {0,1,2,3,………}.
     * A rule with a lesser order will be applied before a rule with a greater order. Rule with order 0 is a special
     * rule. It does not require any condition and actions listed in it will always be applied.
     *
     * @return the order value.
     */
    public int order() {
        return this.order;
    }

    /**
     * Set the order property: The order in which the rules are applied for the endpoint. Possible values {0,1,2,3,………}.
     * A rule with a lesser order will be applied before a rule with a greater order. Rule with order 0 is a special
     * rule. It does not require any condition and actions listed in it will always be applied.
     *
     * @param order the order value to set.
     * @return the DeliveryRule object itself.
     */
    public DeliveryRule withOrder(int order) {
        this.order = order;
        return this;
    }

    /**
     * Get the actions property: A list of actions that are executed when all the conditions of a rule are satisfied.
     *
     * @return the actions value.
     */
    public List<DeliveryRuleAction> actions() {
        return this.actions;
    }

    /**
     * Set the actions property: A list of actions that are executed when all the conditions of a rule are satisfied.
     *
     * @param actions the actions value to set.
     * @return the DeliveryRule object itself.
     */
    public DeliveryRule withActions(List<DeliveryRuleAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the conditions property: A list of conditions that must be matched for the actions to be executed.
     *
     * @return the conditions value.
     */
    public List<DeliveryRuleCondition> conditions() {
        return this.conditions;
    }

    /**
     * Set the conditions property: A list of conditions that must be matched for the actions to be executed.
     *
     * @param conditions the conditions value to set.
     * @return the DeliveryRule object itself.
     */
    public DeliveryRule withConditions(List<DeliveryRuleCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (actions() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property actions in model DeliveryRule"));
        } else {
            actions().forEach(e -> e.validate());
        }
        if (conditions() != null) {
            conditions().forEach(e -> e.validate());
        }
    }
}
