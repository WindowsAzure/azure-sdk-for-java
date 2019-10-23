/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AzureFirewallApplicationRuleProtocolType.
 */
public final class AzureFirewallApplicationRuleProtocolType extends ExpandableStringEnum<AzureFirewallApplicationRuleProtocolType> {
    /** Static value Http for AzureFirewallApplicationRuleProtocolType. */
    public static final AzureFirewallApplicationRuleProtocolType HTTP = fromString("Http");

    /** Static value Https for AzureFirewallApplicationRuleProtocolType. */
    public static final AzureFirewallApplicationRuleProtocolType HTTPS = fromString("Https");

    /** Static value Mssql for AzureFirewallApplicationRuleProtocolType. */
    public static final AzureFirewallApplicationRuleProtocolType MSSQL = fromString("Mssql");

    /**
     * Creates or finds a AzureFirewallApplicationRuleProtocolType from its string representation.
     * @param name a name to look for
     * @return the corresponding AzureFirewallApplicationRuleProtocolType
     */
    @JsonCreator
    public static AzureFirewallApplicationRuleProtocolType fromString(String name) {
        return fromString(name, AzureFirewallApplicationRuleProtocolType.class);
    }

    /**
     * @return known AzureFirewallApplicationRuleProtocolType values
     */
    public static Collection<AzureFirewallApplicationRuleProtocolType> values() {
        return values(AzureFirewallApplicationRuleProtocolType.class);
    }
}
