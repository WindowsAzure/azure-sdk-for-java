/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AzureFirewallThreatIntelMode.
 */
public final class AzureFirewallThreatIntelMode extends ExpandableStringEnum<AzureFirewallThreatIntelMode> {
    /** Static value Alert for AzureFirewallThreatIntelMode. */
    public static final AzureFirewallThreatIntelMode ALERT = fromString("Alert");

    /** Static value Deny for AzureFirewallThreatIntelMode. */
    public static final AzureFirewallThreatIntelMode DENY = fromString("Deny");

    /** Static value Off for AzureFirewallThreatIntelMode. */
    public static final AzureFirewallThreatIntelMode OFF = fromString("Off");

    /**
     * Creates or finds a AzureFirewallThreatIntelMode from its string representation.
     * @param name a name to look for
     * @return the corresponding AzureFirewallThreatIntelMode
     */
    @JsonCreator
    public static AzureFirewallThreatIntelMode fromString(String name) {
        return fromString(name, AzureFirewallThreatIntelMode.class);
    }

    /**
     * @return known AzureFirewallThreatIntelMode values
     */
    public static Collection<AzureFirewallThreatIntelMode> values() {
        return values(AzureFirewallThreatIntelMode.class);
    }
}
