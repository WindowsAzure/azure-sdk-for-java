// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for IPVersion. */
public final class IPVersion extends ExpandableStringEnum<IPVersion> {
    /** Static value IPv4 for IPVersion. */
    public static final IPVersion IPV4 = fromString("IPv4");

    /** Static value IPv6 for IPVersion. */
    public static final IPVersion IPV6 = fromString("IPv6");

    /**
     * Creates or finds a IPVersion from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IPVersion.
     */
    @JsonCreator
    public static IPVersion fromString(String name) {
        return fromString(name, IPVersion.class);
    }

    /** @return known IPVersion values. */
    public static Collection<IPVersion> values() {
        return values(IPVersion.class);
    }
}
