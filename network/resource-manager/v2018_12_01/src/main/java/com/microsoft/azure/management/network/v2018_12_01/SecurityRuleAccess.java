/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SecurityRuleAccess.
 */
public final class SecurityRuleAccess extends ExpandableStringEnum<SecurityRuleAccess> {
    /** Static value Allow for SecurityRuleAccess. */
    public static final SecurityRuleAccess ALLOW = fromString("Allow");

    /** Static value Deny for SecurityRuleAccess. */
    public static final SecurityRuleAccess DENY = fromString("Deny");

    /**
     * Creates or finds a SecurityRuleAccess from its string representation.
     * @param name a name to look for
     * @return the corresponding SecurityRuleAccess
     */
    @JsonCreator
    public static SecurityRuleAccess fromString(String name) {
        return fromString(name, SecurityRuleAccess.class);
    }

    /**
     * @return known SecurityRuleAccess values
     */
    public static Collection<SecurityRuleAccess> values() {
        return values(SecurityRuleAccess.class);
    }
}
