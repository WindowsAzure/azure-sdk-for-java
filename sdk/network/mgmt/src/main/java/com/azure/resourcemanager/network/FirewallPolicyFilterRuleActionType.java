// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FirewallPolicyFilterRuleActionType. */
public final class FirewallPolicyFilterRuleActionType extends ExpandableStringEnum<FirewallPolicyFilterRuleActionType> {
    /** Static value Allow for FirewallPolicyFilterRuleActionType. */
    public static final FirewallPolicyFilterRuleActionType ALLOW = fromString("Allow");

    /** Static value Deny for FirewallPolicyFilterRuleActionType. */
    public static final FirewallPolicyFilterRuleActionType DENY = fromString("Deny");

    /** Static value Alert for FirewallPolicyFilterRuleActionType. */
    public static final FirewallPolicyFilterRuleActionType ALERT = fromString("Alert ");

    /**
     * Creates or finds a FirewallPolicyFilterRuleActionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FirewallPolicyFilterRuleActionType.
     */
    @JsonCreator
    public static FirewallPolicyFilterRuleActionType fromString(String name) {
        return fromString(name, FirewallPolicyFilterRuleActionType.class);
    }

    /** @return known FirewallPolicyFilterRuleActionType values. */
    public static Collection<FirewallPolicyFilterRuleActionType> values() {
        return values(FirewallPolicyFilterRuleActionType.class);
    }
}
