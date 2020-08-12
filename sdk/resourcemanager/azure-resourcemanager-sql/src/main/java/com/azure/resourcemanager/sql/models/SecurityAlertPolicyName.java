// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SecurityAlertPolicyName. */
public final class SecurityAlertPolicyName extends ExpandableStringEnum<SecurityAlertPolicyName> {
    /** Static value default for SecurityAlertPolicyName. */
    public static final SecurityAlertPolicyName DEFAULT = fromString("default");

    /**
     * Creates or finds a SecurityAlertPolicyName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SecurityAlertPolicyName.
     */
    @JsonCreator
    public static SecurityAlertPolicyName fromString(String name) {
        return fromString(name, SecurityAlertPolicyName.class);
    }

    /** @return known SecurityAlertPolicyName values. */
    public static Collection<SecurityAlertPolicyName> values() {
        return values(SecurityAlertPolicyName.class);
    }
}
