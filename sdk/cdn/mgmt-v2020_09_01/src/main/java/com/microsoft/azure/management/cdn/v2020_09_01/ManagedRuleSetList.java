/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import java.util.List;
import com.microsoft.azure.management.cdn.v2020_09_01.implementation.ManagedRuleSetInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the list of managed rule sets for the policy.
 */
public class ManagedRuleSetList {
    /**
     * List of rule sets.
     */
    @JsonProperty(value = "managedRuleSets")
    private List<ManagedRuleSetInner> managedRuleSets;

    /**
     * Get list of rule sets.
     *
     * @return the managedRuleSets value
     */
    public List<ManagedRuleSetInner> managedRuleSets() {
        return this.managedRuleSets;
    }

    /**
     * Set list of rule sets.
     *
     * @param managedRuleSets the managedRuleSets value to set
     * @return the ManagedRuleSetList object itself.
     */
    public ManagedRuleSetList withManagedRuleSets(List<ManagedRuleSetInner> managedRuleSets) {
        this.managedRuleSets = managedRuleSets;
        return this;
    }

}
