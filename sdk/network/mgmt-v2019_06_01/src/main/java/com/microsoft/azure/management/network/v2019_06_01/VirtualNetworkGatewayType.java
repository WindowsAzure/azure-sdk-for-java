/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for VirtualNetworkGatewayType.
 */
public final class VirtualNetworkGatewayType extends ExpandableStringEnum<VirtualNetworkGatewayType> {
    /** Static value Vpn for VirtualNetworkGatewayType. */
    public static final VirtualNetworkGatewayType VPN = fromString("Vpn");

    /** Static value ExpressRoute for VirtualNetworkGatewayType. */
    public static final VirtualNetworkGatewayType EXPRESS_ROUTE = fromString("ExpressRoute");

    /**
     * Creates or finds a VirtualNetworkGatewayType from its string representation.
     * @param name a name to look for
     * @return the corresponding VirtualNetworkGatewayType
     */
    @JsonCreator
    public static VirtualNetworkGatewayType fromString(String name) {
        return fromString(name, VirtualNetworkGatewayType.class);
    }

    /**
     * @return known VirtualNetworkGatewayType values
     */
    public static Collection<VirtualNetworkGatewayType> values() {
        return values(VirtualNetworkGatewayType.class);
    }
}
