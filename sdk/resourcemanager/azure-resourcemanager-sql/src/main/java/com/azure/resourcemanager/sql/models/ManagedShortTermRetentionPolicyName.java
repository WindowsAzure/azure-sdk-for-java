// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ManagedShortTermRetentionPolicyName. */
public final class ManagedShortTermRetentionPolicyName
    extends ExpandableStringEnum<ManagedShortTermRetentionPolicyName> {
    /** Static value default for ManagedShortTermRetentionPolicyName. */
    public static final ManagedShortTermRetentionPolicyName DEFAULT = fromString("default");

    /**
     * Creates or finds a ManagedShortTermRetentionPolicyName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ManagedShortTermRetentionPolicyName.
     */
    @JsonCreator
    public static ManagedShortTermRetentionPolicyName fromString(String name) {
        return fromString(name, ManagedShortTermRetentionPolicyName.class);
    }

    /** @return known ManagedShortTermRetentionPolicyName values. */
    public static Collection<ManagedShortTermRetentionPolicyName> values() {
        return values(ManagedShortTermRetentionPolicyName.class);
    }
}
