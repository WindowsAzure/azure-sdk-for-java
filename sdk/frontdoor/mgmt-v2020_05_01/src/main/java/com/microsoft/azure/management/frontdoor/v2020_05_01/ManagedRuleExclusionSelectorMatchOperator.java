/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ManagedRuleExclusionSelectorMatchOperator.
 */
public final class ManagedRuleExclusionSelectorMatchOperator extends ExpandableStringEnum<ManagedRuleExclusionSelectorMatchOperator> {
    /** Static value Equals for ManagedRuleExclusionSelectorMatchOperator. */
    public static final ManagedRuleExclusionSelectorMatchOperator EQUALS = fromString("Equals");

    /** Static value Contains for ManagedRuleExclusionSelectorMatchOperator. */
    public static final ManagedRuleExclusionSelectorMatchOperator CONTAINS = fromString("Contains");

    /** Static value StartsWith for ManagedRuleExclusionSelectorMatchOperator. */
    public static final ManagedRuleExclusionSelectorMatchOperator STARTS_WITH = fromString("StartsWith");

    /** Static value EndsWith for ManagedRuleExclusionSelectorMatchOperator. */
    public static final ManagedRuleExclusionSelectorMatchOperator ENDS_WITH = fromString("EndsWith");

    /** Static value EqualsAny for ManagedRuleExclusionSelectorMatchOperator. */
    public static final ManagedRuleExclusionSelectorMatchOperator EQUALS_ANY = fromString("EqualsAny");

    /**
     * Creates or finds a ManagedRuleExclusionSelectorMatchOperator from its string representation.
     * @param name a name to look for
     * @return the corresponding ManagedRuleExclusionSelectorMatchOperator
     */
    @JsonCreator
    public static ManagedRuleExclusionSelectorMatchOperator fromString(String name) {
        return fromString(name, ManagedRuleExclusionSelectorMatchOperator.class);
    }

    /**
     * @return known ManagedRuleExclusionSelectorMatchOperator values
     */
    public static Collection<ManagedRuleExclusionSelectorMatchOperator> values() {
        return values(ManagedRuleExclusionSelectorMatchOperator.class);
    }
}
