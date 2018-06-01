/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for VirtualNetworkGatewaySkuTier.
 */
public final class VirtualNetworkGatewaySkuTier extends ExpandableStringEnum<VirtualNetworkGatewaySkuTier> {
    /** Static value Basic for VirtualNetworkGatewaySkuTier. */
    public static final VirtualNetworkGatewaySkuTier BASIC = fromString("Basic");

    /** Static value HighPerformance for VirtualNetworkGatewaySkuTier. */
    public static final VirtualNetworkGatewaySkuTier HIGH_PERFORMANCE = fromString("HighPerformance");

    /** Static value Standard for VirtualNetworkGatewaySkuTier. */
    public static final VirtualNetworkGatewaySkuTier STANDARD = fromString("Standard");

    /** Static value UltraPerformance for VirtualNetworkGatewaySkuTier. */
    public static final VirtualNetworkGatewaySkuTier ULTRA_PERFORMANCE = fromString("UltraPerformance");

    /** Static value VpnGw1 for VirtualNetworkGatewaySkuTier. */
    public static final VirtualNetworkGatewaySkuTier VPN_GW1 = fromString("VpnGw1");

    /** Static value VpnGw2 for VirtualNetworkGatewaySkuTier. */
    public static final VirtualNetworkGatewaySkuTier VPN_GW2 = fromString("VpnGw2");

    /** Static value VpnGw3 for VirtualNetworkGatewaySkuTier. */
    public static final VirtualNetworkGatewaySkuTier VPN_GW3 = fromString("VpnGw3");

    /**
     * Creates or finds a VirtualNetworkGatewaySkuTier from its string representation.
     * @param name a name to look for
     * @return the corresponding VirtualNetworkGatewaySkuTier
     */
    @JsonCreator
    public static VirtualNetworkGatewaySkuTier fromString(String name) {
        return fromString(name, VirtualNetworkGatewaySkuTier.class);
    }

    /**
     * @return known VirtualNetworkGatewaySkuTier values
     */
    public static Collection<VirtualNetworkGatewaySkuTier> values() {
        return values(VirtualNetworkGatewaySkuTier.class);
    }
}
