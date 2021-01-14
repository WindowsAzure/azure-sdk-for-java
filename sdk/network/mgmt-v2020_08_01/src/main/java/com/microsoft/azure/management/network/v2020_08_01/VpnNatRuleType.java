/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for VpnNatRuleType.
 */
public final class VpnNatRuleType extends ExpandableStringEnum<VpnNatRuleType> {
    /** Static value Static for VpnNatRuleType. */
    public static final VpnNatRuleType STATIC = fromString("Static");

    /** Static value Dynamic for VpnNatRuleType. */
    public static final VpnNatRuleType DYNAMIC = fromString("Dynamic");

    /**
     * Creates or finds a VpnNatRuleType from its string representation.
     * @param name a name to look for
     * @return the corresponding VpnNatRuleType
     */
    @JsonCreator
    public static VpnNatRuleType fromString(String name) {
        return fromString(name, VpnNatRuleType.class);
    }

    /**
     * @return known VpnNatRuleType values
     */
    public static Collection<VpnNatRuleType> values() {
        return values(VpnNatRuleType.class);
    }
}
