/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Allow to exclude some variable satisfy the condition for the WAF check.
 */
public class ManagedRulesDefinition {
    /**
     * Describes the Exclusions that are applied on the policy.
     */
    @JsonProperty(value = "exclusions")
    private List<OwaspCrsExclusionEntry> exclusions;

    /**
     * Describes the ruleSets that are associated with the policy.
     */
    @JsonProperty(value = "managedRuleSets", required = true)
    private List<ManagedRuleSet> managedRuleSets;

    /**
     * Get describes the Exclusions that are applied on the policy.
     *
     * @return the exclusions value
     */
    public List<OwaspCrsExclusionEntry> exclusions() {
        return this.exclusions;
    }

    /**
     * Set describes the Exclusions that are applied on the policy.
     *
     * @param exclusions the exclusions value to set
     * @return the ManagedRulesDefinition object itself.
     */
    public ManagedRulesDefinition withExclusions(List<OwaspCrsExclusionEntry> exclusions) {
        this.exclusions = exclusions;
        return this;
    }

    /**
     * Get describes the ruleSets that are associated with the policy.
     *
     * @return the managedRuleSets value
     */
    public List<ManagedRuleSet> managedRuleSets() {
        return this.managedRuleSets;
    }

    /**
     * Set describes the ruleSets that are associated with the policy.
     *
     * @param managedRuleSets the managedRuleSets value to set
     * @return the ManagedRulesDefinition object itself.
     */
    public ManagedRulesDefinition withManagedRuleSets(List<ManagedRuleSet> managedRuleSets) {
        this.managedRuleSets = managedRuleSets;
        return this;
    }

}
