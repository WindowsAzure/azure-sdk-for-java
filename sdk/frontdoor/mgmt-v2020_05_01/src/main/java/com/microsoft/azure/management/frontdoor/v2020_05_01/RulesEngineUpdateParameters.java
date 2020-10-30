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
 * Rules Engine Configuration to apply to a Routing Rule.
 */
public class RulesEngineUpdateParameters {
    /**
     * A list of rules that define a particular Rules Engine Configuration.
     */
    @JsonProperty(value = "rules")
    private List<RulesEngineRule> rules;

    /**
     * Get a list of rules that define a particular Rules Engine Configuration.
     *
     * @return the rules value
     */
    public List<RulesEngineRule> rules() {
        return this.rules;
    }

    /**
     * Set a list of rules that define a particular Rules Engine Configuration.
     *
     * @param rules the rules value to set
     * @return the RulesEngineUpdateParameters object itself.
     */
    public RulesEngineUpdateParameters withRules(List<RulesEngineRule> rules) {
        this.rules = rules;
        return this;
    }

}
