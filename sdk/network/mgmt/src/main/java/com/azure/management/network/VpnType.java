// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VpnType. */
public final class VpnType extends ExpandableStringEnum<VpnType> {
    /** Static value PolicyBased for VpnType. */
    public static final VpnType POLICY_BASED = fromString("PolicyBased");

    /** Static value RouteBased for VpnType. */
    public static final VpnType ROUTE_BASED = fromString("RouteBased");

    /**
     * Creates or finds a VpnType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VpnType.
     */
    @JsonCreator
    public static VpnType fromString(String name) {
        return fromString(name, VpnType.class);
    }

    /** @return known VpnType values. */
    public static Collection<VpnType> values() {
        return values(VpnType.class);
    }
}
