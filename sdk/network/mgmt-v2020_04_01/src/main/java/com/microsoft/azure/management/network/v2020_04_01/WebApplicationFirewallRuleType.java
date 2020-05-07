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
 * Defines values for WebApplicationFirewallRuleType.
 */
public final class WebApplicationFirewallRuleType extends ExpandableStringEnum<WebApplicationFirewallRuleType> {
    /** Static value MatchRule for WebApplicationFirewallRuleType. */
    public static final WebApplicationFirewallRuleType MATCH_RULE = fromString("MatchRule");

    /** Static value Invalid for WebApplicationFirewallRuleType. */
    public static final WebApplicationFirewallRuleType INVALID = fromString("Invalid");

    /**
     * Creates or finds a WebApplicationFirewallRuleType from its string representation.
     * @param name a name to look for
     * @return the corresponding WebApplicationFirewallRuleType
     */
    @JsonCreator
    public static WebApplicationFirewallRuleType fromString(String name) {
        return fromString(name, WebApplicationFirewallRuleType.class);
    }

    /**
     * @return known WebApplicationFirewallRuleType values
     */
    public static Collection<WebApplicationFirewallRuleType> values() {
        return values(WebApplicationFirewallRuleType.class);
    }
}
