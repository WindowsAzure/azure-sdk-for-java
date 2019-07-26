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
 * Defines values for ExpressRouteCircuitSkuTier.
 */
public final class ExpressRouteCircuitSkuTier extends ExpandableStringEnum<ExpressRouteCircuitSkuTier> {
    /** Static value Standard for ExpressRouteCircuitSkuTier. */
    public static final ExpressRouteCircuitSkuTier STANDARD = fromString("Standard");

    /** Static value Premium for ExpressRouteCircuitSkuTier. */
    public static final ExpressRouteCircuitSkuTier PREMIUM = fromString("Premium");

    /** Static value Basic for ExpressRouteCircuitSkuTier. */
    public static final ExpressRouteCircuitSkuTier BASIC = fromString("Basic");

    /** Static value Local for ExpressRouteCircuitSkuTier. */
    public static final ExpressRouteCircuitSkuTier LOCAL = fromString("Local");

    /**
     * Creates or finds a ExpressRouteCircuitSkuTier from its string representation.
     * @param name a name to look for
     * @return the corresponding ExpressRouteCircuitSkuTier
     */
    @JsonCreator
    public static ExpressRouteCircuitSkuTier fromString(String name) {
        return fromString(name, ExpressRouteCircuitSkuTier.class);
    }

    /**
     * @return known ExpressRouteCircuitSkuTier values
     */
    public static Collection<ExpressRouteCircuitSkuTier> values() {
        return values(ExpressRouteCircuitSkuTier.class);
    }
}
