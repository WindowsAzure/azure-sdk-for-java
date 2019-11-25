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
 * Defines values for ApplicationGatewayTier.
 */
public final class ApplicationGatewayTier extends ExpandableStringEnum<ApplicationGatewayTier> {
    /** Static value Standard for ApplicationGatewayTier. */
    public static final ApplicationGatewayTier STANDARD = fromString("Standard");

    /** Static value WAF for ApplicationGatewayTier. */
    public static final ApplicationGatewayTier WAF = fromString("WAF");

    /** Static value Standard_v2 for ApplicationGatewayTier. */
    public static final ApplicationGatewayTier STANDARD_V2 = fromString("Standard_v2");

    /** Static value WAF_v2 for ApplicationGatewayTier. */
    public static final ApplicationGatewayTier WAF_V2 = fromString("WAF_v2");

    /**
     * Creates or finds a ApplicationGatewayTier from its string representation.
     * @param name a name to look for
     * @return the corresponding ApplicationGatewayTier
     */
    @JsonCreator
    public static ApplicationGatewayTier fromString(String name) {
        return fromString(name, ApplicationGatewayTier.class);
    }

    /**
     * @return known ApplicationGatewayTier values
     */
    public static Collection<ApplicationGatewayTier> values() {
        return values(ApplicationGatewayTier.class);
    }
}
