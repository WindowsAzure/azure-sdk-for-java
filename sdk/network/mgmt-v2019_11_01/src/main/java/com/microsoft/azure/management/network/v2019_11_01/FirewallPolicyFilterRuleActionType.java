/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for FirewallPolicyFilterRuleActionType.
 */
public final class FirewallPolicyFilterRuleActionType extends ExpandableStringEnum<FirewallPolicyFilterRuleActionType> {
    /** Static value Allow for FirewallPolicyFilterRuleActionType. */
    public static final FirewallPolicyFilterRuleActionType ALLOW = fromString("Allow");

    /** Static value Deny for FirewallPolicyFilterRuleActionType. */
    public static final FirewallPolicyFilterRuleActionType DENY = fromString("Deny");

    /**
     * Creates or finds a FirewallPolicyFilterRuleActionType from its string representation.
     * @param name a name to look for
     * @return the corresponding FirewallPolicyFilterRuleActionType
     */
    @JsonCreator
    public static FirewallPolicyFilterRuleActionType fromString(String name) {
        return fromString(name, FirewallPolicyFilterRuleActionType.class);
    }

    /**
     * @return known FirewallPolicyFilterRuleActionType values
     */
    public static Collection<FirewallPolicyFilterRuleActionType> values() {
        return values(FirewallPolicyFilterRuleActionType.class);
    }
}
