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
 * Defines the common attributes for a custom rule that can be included in a
 * waf policy.
 */
public class CustomRule {
    /**
     * Defines the name of the custom rule.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Describes if the custom rule is in enabled or disabled state. Defaults
     * to Enabled if not specified. Possible values include: 'Disabled',
     * 'Enabled'.
     */
    @JsonProperty(value = "enabledState")
    private CustomRuleEnabledState enabledState;

    /**
     * Defines in what order this rule be evaluated in the overall list of
     * custom rules.
     */
    @JsonProperty(value = "priority", required = true)
    private int priority;

    /**
     * List of match conditions.
     */
    @JsonProperty(value = "matchConditions", required = true)
    private List<MatchCondition> matchConditions;

    /**
     * Describes what action to be applied when rule matches.
     */
    @JsonProperty(value = "action", required = true)
    private ActionType action;

    /**
     * Get defines the name of the custom rule.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set defines the name of the custom rule.
     *
     * @param name the name value to set
     * @return the CustomRule object itself.
     */
    public CustomRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not specified. Possible values include: 'Disabled', 'Enabled'.
     *
     * @return the enabledState value
     */
    public CustomRuleEnabledState enabledState() {
        return this.enabledState;
    }

    /**
     * Set describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not specified. Possible values include: 'Disabled', 'Enabled'.
     *
     * @param enabledState the enabledState value to set
     * @return the CustomRule object itself.
     */
    public CustomRule withEnabledState(CustomRuleEnabledState enabledState) {
        this.enabledState = enabledState;
        return this;
    }

    /**
     * Get defines in what order this rule be evaluated in the overall list of custom rules.
     *
     * @return the priority value
     */
    public int priority() {
        return this.priority;
    }

    /**
     * Set defines in what order this rule be evaluated in the overall list of custom rules.
     *
     * @param priority the priority value to set
     * @return the CustomRule object itself.
     */
    public CustomRule withPriority(int priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get list of match conditions.
     *
     * @return the matchConditions value
     */
    public List<MatchCondition> matchConditions() {
        return this.matchConditions;
    }

    /**
     * Set list of match conditions.
     *
     * @param matchConditions the matchConditions value to set
     * @return the CustomRule object itself.
     */
    public CustomRule withMatchConditions(List<MatchCondition> matchConditions) {
        this.matchConditions = matchConditions;
        return this;
    }

    /**
     * Get describes what action to be applied when rule matches.
     *
     * @return the action value
     */
    public ActionType action() {
        return this.action;
    }

    /**
     * Set describes what action to be applied when rule matches.
     *
     * @param action the action value to set
     * @return the CustomRule object itself.
     */
    public CustomRule withAction(ActionType action) {
        this.action = action;
        return this;
    }

}
