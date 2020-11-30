/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AzureFirewallNetworkRuleProtocol.
 */
public final class AzureFirewallNetworkRuleProtocol extends ExpandableStringEnum<AzureFirewallNetworkRuleProtocol> {
    /** Static value TCP for AzureFirewallNetworkRuleProtocol. */
    public static final AzureFirewallNetworkRuleProtocol TCP = fromString("TCP");

    /** Static value UDP for AzureFirewallNetworkRuleProtocol. */
    public static final AzureFirewallNetworkRuleProtocol UDP = fromString("UDP");

    /** Static value Any for AzureFirewallNetworkRuleProtocol. */
    public static final AzureFirewallNetworkRuleProtocol ANY = fromString("Any");

    /** Static value ICMP for AzureFirewallNetworkRuleProtocol. */
    public static final AzureFirewallNetworkRuleProtocol ICMP = fromString("ICMP");

    /**
     * Creates or finds a AzureFirewallNetworkRuleProtocol from its string representation.
     * @param name a name to look for
     * @return the corresponding AzureFirewallNetworkRuleProtocol
     */
    @JsonCreator
    public static AzureFirewallNetworkRuleProtocol fromString(String name) {
        return fromString(name, AzureFirewallNetworkRuleProtocol.class);
    }

    /**
     * @return known AzureFirewallNetworkRuleProtocol values
     */
    public static Collection<AzureFirewallNetworkRuleProtocol> values() {
        return values(AzureFirewallNetworkRuleProtocol.class);
    }
}
