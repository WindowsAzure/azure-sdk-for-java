/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for LoadBalancerOutboundRuleProtocol.
 */
public final class LoadBalancerOutboundRuleProtocol extends ExpandableStringEnum<LoadBalancerOutboundRuleProtocol> {
    /** Static value Tcp for LoadBalancerOutboundRuleProtocol. */
    public static final LoadBalancerOutboundRuleProtocol TCP = fromString("Tcp");

    /** Static value Udp for LoadBalancerOutboundRuleProtocol. */
    public static final LoadBalancerOutboundRuleProtocol UDP = fromString("Udp");

    /** Static value All for LoadBalancerOutboundRuleProtocol. */
    public static final LoadBalancerOutboundRuleProtocol ALL = fromString("All");

    /**
     * Creates or finds a LoadBalancerOutboundRuleProtocol from its string representation.
     * @param name a name to look for
     * @return the corresponding LoadBalancerOutboundRuleProtocol
     */
    @JsonCreator
    public static LoadBalancerOutboundRuleProtocol fromString(String name) {
        return fromString(name, LoadBalancerOutboundRuleProtocol.class);
    }

    /**
     * @return known LoadBalancerOutboundRuleProtocol values
     */
    public static Collection<LoadBalancerOutboundRuleProtocol> values() {
        return values(LoadBalancerOutboundRuleProtocol.class);
    }
}
