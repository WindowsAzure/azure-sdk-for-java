// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OutboundType. */
public final class OutboundType extends ExpandableStringEnum<OutboundType> {
    /** Static value loadBalancer for OutboundType. */
    public static final OutboundType LOAD_BALANCER = fromString("loadBalancer");

    /** Static value userDefinedRouting for OutboundType. */
    public static final OutboundType USER_DEFINED_ROUTING = fromString("userDefinedRouting");

    /**
     * Creates or finds a OutboundType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OutboundType.
     */
    @JsonCreator
    public static OutboundType fromString(String name) {
        return fromString(name, OutboundType.class);
    }

    /** @return known OutboundType values. */
    public static Collection<OutboundType> values() {
        return values(OutboundType.class);
    }
}
