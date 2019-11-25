/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ApplicationGatewayRequestRoutingRuleType.
 */
public final class ApplicationGatewayRequestRoutingRuleType extends ExpandableStringEnum<ApplicationGatewayRequestRoutingRuleType> {
    /** Static value Basic for ApplicationGatewayRequestRoutingRuleType. */
    public static final ApplicationGatewayRequestRoutingRuleType BASIC = fromString("Basic");

    /** Static value PathBasedRouting for ApplicationGatewayRequestRoutingRuleType. */
    public static final ApplicationGatewayRequestRoutingRuleType PATH_BASED_ROUTING = fromString("PathBasedRouting");

    /**
     * Creates or finds a ApplicationGatewayRequestRoutingRuleType from its string representation.
     * @param name a name to look for
     * @return the corresponding ApplicationGatewayRequestRoutingRuleType
     */
    @JsonCreator
    public static ApplicationGatewayRequestRoutingRuleType fromString(String name) {
        return fromString(name, ApplicationGatewayRequestRoutingRuleType.class);
    }

    /**
     * @return known ApplicationGatewayRequestRoutingRuleType values
     */
    public static Collection<ApplicationGatewayRequestRoutingRuleType> values() {
        return values(ApplicationGatewayRequestRoutingRuleType.class);
    }
}
