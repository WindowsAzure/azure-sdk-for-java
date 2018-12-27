/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Protocol.
 */
public final class Protocol extends ExpandableStringEnum<Protocol> {
    /** Static value Tcp for Protocol. */
    public static final Protocol TCP = fromString("Tcp");

    /** Static value Http for Protocol. */
    public static final Protocol HTTP = fromString("Http");

    /** Static value Https for Protocol. */
    public static final Protocol HTTPS = fromString("Https");

    /** Static value Icmp for Protocol. */
    public static final Protocol ICMP = fromString("Icmp");

    /**
     * Creates or finds a Protocol from its string representation.
     * @param name a name to look for
     * @return the corresponding Protocol
     */
    @JsonCreator
    public static Protocol fromString(String name) {
        return fromString(name, Protocol.class);
    }

    /**
     * @return known Protocol values
     */
    public static Collection<Protocol> values() {
        return values(Protocol.class);
    }
}
