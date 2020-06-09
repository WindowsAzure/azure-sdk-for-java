// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SecurityRuleAccess. */
public final class SecurityRuleAccess extends ExpandableStringEnum<SecurityRuleAccess> {
    /** Static value Allow for SecurityRuleAccess. */
    public static final SecurityRuleAccess ALLOW = fromString("Allow");

    /** Static value Deny for SecurityRuleAccess. */
    public static final SecurityRuleAccess DENY = fromString("Deny");

    /**
     * Creates or finds a SecurityRuleAccess from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SecurityRuleAccess.
     */
    @JsonCreator
    public static SecurityRuleAccess fromString(String name) {
        return fromString(name, SecurityRuleAccess.class);
    }

    /** @return known SecurityRuleAccess values. */
    public static Collection<SecurityRuleAccess> values() {
        return values(SecurityRuleAccess.class);
    }
}
