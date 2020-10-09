/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for InboundSecurityRulesProtocol.
 */
public final class InboundSecurityRulesProtocol extends ExpandableStringEnum<InboundSecurityRulesProtocol> {
    /** Static value TCP for InboundSecurityRulesProtocol. */
    public static final InboundSecurityRulesProtocol TCP = fromString("TCP");

    /** Static value UDP for InboundSecurityRulesProtocol. */
    public static final InboundSecurityRulesProtocol UDP = fromString("UDP");

    /**
     * Creates or finds a InboundSecurityRulesProtocol from its string representation.
     * @param name a name to look for
     * @return the corresponding InboundSecurityRulesProtocol
     */
    @JsonCreator
    public static InboundSecurityRulesProtocol fromString(String name) {
        return fromString(name, InboundSecurityRulesProtocol.class);
    }

    /**
     * @return known InboundSecurityRulesProtocol values
     */
    public static Collection<InboundSecurityRulesProtocol> values() {
        return values(InboundSecurityRulesProtocol.class);
    }
}
