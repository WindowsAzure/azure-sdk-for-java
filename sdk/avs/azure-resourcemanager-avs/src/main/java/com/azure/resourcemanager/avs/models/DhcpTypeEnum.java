// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DhcpTypeEnum. */
public final class DhcpTypeEnum extends ExpandableStringEnum<DhcpTypeEnum> {
    /** Static value SERVER for DhcpTypeEnum. */
    public static final DhcpTypeEnum SERVER = fromString("SERVER");

    /** Static value RELAY for DhcpTypeEnum. */
    public static final DhcpTypeEnum RELAY = fromString("RELAY");

    /**
     * Creates or finds a DhcpTypeEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DhcpTypeEnum.
     */
    @JsonCreator
    public static DhcpTypeEnum fromString(String name) {
        return fromString(name, DhcpTypeEnum.class);
    }

    /** @return known DhcpTypeEnum values. */
    public static Collection<DhcpTypeEnum> values() {
        return values(DhcpTypeEnum.class);
    }
}
