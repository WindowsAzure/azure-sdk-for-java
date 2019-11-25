/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Matched rule.
 */
public class MatchedRule {
    /**
     * Name of the matched network security rule.
     */
    @JsonProperty(value = "ruleName")
    private String ruleName;

    /**
     * The network traffic is allowed or denied. Possible values are 'Allow'
     * and 'Deny'.
     */
    @JsonProperty(value = "action")
    private String action;

    /**
     * Get name of the matched network security rule.
     *
     * @return the ruleName value
     */
    public String ruleName() {
        return this.ruleName;
    }

    /**
     * Set name of the matched network security rule.
     *
     * @param ruleName the ruleName value to set
     * @return the MatchedRule object itself.
     */
    public MatchedRule withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * Get the network traffic is allowed or denied. Possible values are 'Allow' and 'Deny'.
     *
     * @return the action value
     */
    public String action() {
        return this.action;
    }

    /**
     * Set the network traffic is allowed or denied. Possible values are 'Allow' and 'Deny'.
     *
     * @param action the action value to set
     * @return the MatchedRule object itself.
     */
    public MatchedRule withAction(String action) {
        this.action = action;
        return this;
    }

}
