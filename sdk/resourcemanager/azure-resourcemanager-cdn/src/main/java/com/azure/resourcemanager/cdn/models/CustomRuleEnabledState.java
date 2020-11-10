// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CustomRuleEnabledState. */
public final class CustomRuleEnabledState extends ExpandableStringEnum<CustomRuleEnabledState> {
    /** Static value Disabled for CustomRuleEnabledState. */
    public static final CustomRuleEnabledState DISABLED = fromString("Disabled");

    /** Static value Enabled for CustomRuleEnabledState. */
    public static final CustomRuleEnabledState ENABLED = fromString("Enabled");

    /**
     * Creates or finds a CustomRuleEnabledState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CustomRuleEnabledState.
     */
    @JsonCreator
    public static CustomRuleEnabledState fromString(String name) {
        return fromString(name, CustomRuleEnabledState.class);
    }

    /** @return known CustomRuleEnabledState values. */
    public static Collection<CustomRuleEnabledState> values() {
        return values(CustomRuleEnabledState.class);
    }
}
