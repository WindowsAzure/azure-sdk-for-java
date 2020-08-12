// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SecurityAlertPolicyNameAutoGenerated. */
public final class SecurityAlertPolicyNameAutoGenerated
    extends ExpandableStringEnum<SecurityAlertPolicyNameAutoGenerated> {
    /** Static value Default for SecurityAlertPolicyNameAutoGenerated. */
    public static final SecurityAlertPolicyNameAutoGenerated DEFAULT = fromString("Default");

    /**
     * Creates or finds a SecurityAlertPolicyNameAutoGenerated from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SecurityAlertPolicyNameAutoGenerated.
     */
    @JsonCreator
    public static SecurityAlertPolicyNameAutoGenerated fromString(String name) {
        return fromString(name, SecurityAlertPolicyNameAutoGenerated.class);
    }

    /** @return known SecurityAlertPolicyNameAutoGenerated values. */
    public static Collection<SecurityAlertPolicyNameAutoGenerated> values() {
        return values(SecurityAlertPolicyNameAutoGenerated.class);
    }
}
