/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for FirewallPolicyFilterRuleCollectionActionType.
 */
public final class FirewallPolicyFilterRuleCollectionActionType extends ExpandableStringEnum<FirewallPolicyFilterRuleCollectionActionType> {
    /** Static value Allow for FirewallPolicyFilterRuleCollectionActionType. */
    public static final FirewallPolicyFilterRuleCollectionActionType ALLOW = fromString("Allow");

    /** Static value Deny for FirewallPolicyFilterRuleCollectionActionType. */
    public static final FirewallPolicyFilterRuleCollectionActionType DENY = fromString("Deny");

    /**
     * Creates or finds a FirewallPolicyFilterRuleCollectionActionType from its string representation.
     * @param name a name to look for
     * @return the corresponding FirewallPolicyFilterRuleCollectionActionType
     */
    @JsonCreator
    public static FirewallPolicyFilterRuleCollectionActionType fromString(String name) {
        return fromString(name, FirewallPolicyFilterRuleCollectionActionType.class);
    }

    /**
     * @return known FirewallPolicyFilterRuleCollectionActionType values
     */
    public static Collection<FirewallPolicyFilterRuleCollectionActionType> values() {
        return values(FirewallPolicyFilterRuleCollectionActionType.class);
    }
}
