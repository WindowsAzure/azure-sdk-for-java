/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ManagedRuleEnabledState.
 */
public final class ManagedRuleEnabledState extends ExpandableStringEnum<ManagedRuleEnabledState> {
    /** Static value Disabled for ManagedRuleEnabledState. */
    public static final ManagedRuleEnabledState DISABLED = fromString("Disabled");

    /**
     * Creates or finds a ManagedRuleEnabledState from its string representation.
     * @param name a name to look for
     * @return the corresponding ManagedRuleEnabledState
     */
    @JsonCreator
    public static ManagedRuleEnabledState fromString(String name) {
        return fromString(name, ManagedRuleEnabledState.class);
    }

    /**
     * @return known ManagedRuleEnabledState values
     */
    public static Collection<ManagedRuleEnabledState> values() {
        return values(ManagedRuleEnabledState.class);
    }
}
