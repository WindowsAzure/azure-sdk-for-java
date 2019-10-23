/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for FirewallPolicyNatRuleActionType.
 */
public final class FirewallPolicyNatRuleActionType extends ExpandableStringEnum<FirewallPolicyNatRuleActionType> {
    /** Static value DNAT for FirewallPolicyNatRuleActionType. */
    public static final FirewallPolicyNatRuleActionType DNAT = fromString("DNAT");

    /**
     * Creates or finds a FirewallPolicyNatRuleActionType from its string representation.
     * @param name a name to look for
     * @return the corresponding FirewallPolicyNatRuleActionType
     */
    @JsonCreator
    public static FirewallPolicyNatRuleActionType fromString(String name) {
        return fromString(name, FirewallPolicyNatRuleActionType.class);
    }

    /**
     * @return known FirewallPolicyNatRuleActionType values
     */
    public static Collection<FirewallPolicyNatRuleActionType> values() {
        return values(FirewallPolicyNatRuleActionType.class);
    }
}
