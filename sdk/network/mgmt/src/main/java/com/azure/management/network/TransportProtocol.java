// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TransportProtocol. */
public final class TransportProtocol extends ExpandableStringEnum<TransportProtocol> {
    /** Static value Udp for TransportProtocol. */
    public static final TransportProtocol UDP = fromString("Udp");

    /** Static value Tcp for TransportProtocol. */
    public static final TransportProtocol TCP = fromString("Tcp");

    /** Static value All for TransportProtocol. */
    public static final TransportProtocol ALL = fromString("All");

    /**
     * Creates or finds a TransportProtocol from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TransportProtocol.
     */
    @JsonCreator
    public static TransportProtocol fromString(String name) {
        return fromString(name, TransportProtocol.class);
    }

    /** @return known TransportProtocol values. */
    public static Collection<TransportProtocol> values() {
        return values(TransportProtocol.class);
    }
}
