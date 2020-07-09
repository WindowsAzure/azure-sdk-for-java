/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PublicNetworkAccess.
 */
public final class PublicNetworkAccess extends ExpandableStringEnum<PublicNetworkAccess> {
    /** Static value InboundAndOutbound for PublicNetworkAccess. */
    public static final PublicNetworkAccess INBOUND_AND_OUTBOUND = fromString("InboundAndOutbound");

    /** Static value OutboundOnly for PublicNetworkAccess. */
    public static final PublicNetworkAccess OUTBOUND_ONLY = fromString("OutboundOnly");

    /**
     * Creates or finds a PublicNetworkAccess from its string representation.
     * @param name a name to look for
     * @return the corresponding PublicNetworkAccess
     */
    @JsonCreator
    public static PublicNetworkAccess fromString(String name) {
        return fromString(name, PublicNetworkAccess.class);
    }

    /**
     * @return known PublicNetworkAccess values
     */
    public static Collection<PublicNetworkAccess> values() {
        return values(PublicNetworkAccess.class);
    }
}
