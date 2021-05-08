// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FlowType. */
public final class FlowType extends ExpandableStringEnum<FlowType> {
    /** Static value Bluefield for FlowType. */
    public static final FlowType BLUEFIELD = fromString("Bluefield");

    /**
     * Creates or finds a FlowType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FlowType.
     */
    @JsonCreator
    public static FlowType fromString(String name) {
        return fromString(name, FlowType.class);
    }

    /** @return known FlowType values. */
    public static Collection<FlowType> values() {
        return values(FlowType.class);
    }
}
