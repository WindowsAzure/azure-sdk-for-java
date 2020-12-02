/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.relay.v2016_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Relaytype.
 */
public final class Relaytype extends ExpandableStringEnum<Relaytype> {
    /** Static value NetTcp for Relaytype. */
    public static final Relaytype NET_TCP = fromString("NetTcp");

    /** Static value Http for Relaytype. */
    public static final Relaytype HTTP = fromString("Http");

    /**
     * Creates or finds a Relaytype from its string representation.
     * @param name a name to look for
     * @return the corresponding Relaytype
     */
    @JsonCreator
    public static Relaytype fromString(String name) {
        return fromString(name, Relaytype.class);
    }

    /**
     * @return known Relaytype values
     */
    public static Collection<Relaytype> values() {
        return values(Relaytype.class);
    }
}
